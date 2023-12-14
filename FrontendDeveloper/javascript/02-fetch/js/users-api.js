const API_BASE_URL = "https://65775f19197926adf62e1c85.mockapi.io/api/v1";

const getUsers = async () => {
	const res = await fetch(`${API_BASE_URL}/users`);
	if (!res.ok) throw new Error(res.statusText);
	const data = await res.json();
	return data;
};

const getUser = async (id) => {
	const res = await fetch(`${API_BASE_URL}/users/${id}`);
	if (!res.ok) throw new Error(res.statusText);
	const data = await res.json();
	return data;
};

const deleteUser = async (id) => {
	const res = await fetch(`${API_BASE_URL}/users/${id}`, {
		method: "DELETE",
	});
	if (!res.ok) throw new Error(res.statusText);
	const data = await res.json();
	return data;
};

const createUser = async (user) => {
	const res = await fetch(`${API_BASE_URL}/users`, {
		method: "POST",
		body: JSON.stringify(user),
		headers: {
			"Content-Type": "application/json",
		},
	});
	if (!res.ok) throw new Error(res.statusText);
	const data = await res.json();
	return data;
};

const updateUser = async (id, user) => {
	const res = await fetch(`${API_BASE_URL}/users/${id}`, {
		method: "PUT",
		body: JSON.stringify(user),
		headers: {
			"Content-Type": "application/json",
		},
	});
	if (!res.ok) throw new Error(res.statusText);
	const data = await res.json();
	return data;
};

export { getUsers, deleteUser, createUser, getUser, updateUser };
