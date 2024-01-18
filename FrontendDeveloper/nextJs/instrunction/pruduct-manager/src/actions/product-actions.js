"use server";

import { config } from "@/utils/config";
import { revalidatePath } from "next/cache";
import { redirect } from "next/navigation";
import * as Yup from "yup";

const FormSchema = Yup.object({
	title: Yup.string().required("Required"),
	description: Yup.string().required("Required"),
	category: Yup.string().required("Required"),
	price: Yup.number().typeError("Invalid number").required("Required"),
	image: Yup.string().required("Required"),
});

export const createProductAction = async (formData) => {
	// Form data turunde  gelen form bilgilerini javascript object ine cevirdik
	const fields = Object.fromEntries(formData.entries());

	try {
		FormSchema.validateSync(fields, { abortEarly: false });

		const resp = await fetch(`${config.apiURL}/products`, {
			method: "post",
			body: JSON.stringify(fields),
			headers: {
				"Content-Type": "application/json",
			},
		});

		if (!resp.ok) {
		}
	} catch (err) {
		if (err instanceof Yup.ValidationError) {
			err.inner.forEach((error) => console.log(error.path, error.message));
		}
	}

	revalidatePath("/products");
	revalidatePath("/dashboard/products");
	redirect("/dashboard/products");
};
