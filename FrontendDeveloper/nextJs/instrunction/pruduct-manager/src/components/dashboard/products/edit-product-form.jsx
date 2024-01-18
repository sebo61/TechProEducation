"use client";
import CancelButton from "@/components/common/form-controls/cancel-button";
import SubmitButton from "@/components/common/form-controls/submit-button";
import React from "react";
import { Form } from "react-bootstrap";

const EditProductForm = ({ product }) => {
	const { title, description, price, category, image } = product;
console.log(product)
	return (
		<Form>
			<Form.Group className="mb-3">
				<Form.Label>Title</Form.Label>
				<Form.Control name="title" type="text" defaultValue={title} />
				<Form.Control.Feedback type="invalid"></Form.Control.Feedback>
			</Form.Group>
			<Form.Group className="mb-3">
				<Form.Label>Description</Form.Label>
				<Form.Control name="description" as="textarea" rows={3} defaultValue={description}/>
				<Form.Control.Feedback type="invalid"></Form.Control.Feedback>
			</Form.Group>
			<Form.Group className="mb-3">
				<Form.Label>Price</Form.Label>
				<Form.Control name="price" type="number" defaultValue={price}/>
				<Form.Control.Feedback type="invalid"></Form.Control.Feedback>
			</Form.Group>
			<Form.Group className="mb-3">
				<Form.Label>Category</Form.Label>
				<Form.Select name="category" defaultValue={category}>
					<option value="">Select</option>
					<option value="Home">Home</option>
					<option value="Computers">Computers</option>
					<option value="Clothing">Clothing</option>
					<option value="Kids">Kids</option>
					<option value="Grocery">Grocery</option>
				</Form.Select>
				<Form.Control.Feedback type="invalid"></Form.Control.Feedback>
			</Form.Group>
			<Form.Group className="mb-3">
				<Form.Label>Image</Form.Label>
				<Form.Control name="image" type="text" defaultValue={image}/>
				<Form.Control.Feedback type="invalid"></Form.Control.Feedback>
			</Form.Group>

			{/* bu butonu ayrı bir component yapmayınca pending durumunu gösteremiyorum */}

			<SubmitButton title="Update" />
			<CancelButton />
		</Form>
	);
};

export default EditProductForm;
