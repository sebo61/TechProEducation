import React from "react";
const Jsx6 = () => {
  
    const users = [
		{ id: 1, firstName: "Ali", lastName: "Gel" },
		{ id: 2, firstName: "Veli", lastName: "Gel" },
		{ id: 3, firstName: "Ayşe", lastName: "Gel" },
		{ id: 4, firstName: "Fatma", lastName: "Gel" },
		{ id: 5, firstName: "Kemal", lastName: "Gel" },
	];
    return  (
        <div> 
           
           <ul>
           {users.map((item) => (
					<li key={item.id}>
						<a href="#home">
							{item.firstName} {item.lastName}
						</a>
					</li>
				))}
           </ul>

        </div>
    );
};

export default Jsx6;
