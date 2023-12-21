import React from "react";
import "./skill.css";

const Skill = ({title, rate}) => {
	return (
		<div className="skill">
			<h6>
				<label>{title}</label>
				<label>{rate}%</label>
			</h6>
			<div className="progress"></div>
		</div>
	);
};

export default Skill;
