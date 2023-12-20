import HelloWorld from "./components/01-hello-world";
import HelloReact from "./components/02-hello-react";
import { Jsx1, Jsx2, Jsx3, Jsx4, Jsx5, Jsx6, Jsx7 } from "./components/03-jsx";
import Style1 from "./components/04-styles/style1";
import Style2 from "./components/04-styles/style2";
import Style3 from "./components/04-styles/style3";
import Style4 from "./components/04-styles/style4";
import Clock1 from "./components/05-clock/clock1";
import Greetings from "./components/06-props/greetings";
import Products from "./components/08-props/products";
import Clock2 from "./components/09-clock/clock2";

const App = () => {
	return (
		<div>
			{/* <HelloReact/>
			<HelloWorld/>
			<Jsx1/>
			<Jsx2/>
			<Jsx3/>
			<Jsx4/>
			<Jsx5/>
			<Jsx6/>
			<Jsx7/>
			<Style1/>
			<Style2/>
			<Style3 />
			<Style4 />
			<Clock1 />
			<Greetings/>
			<Products />
			 */}

			<Clock2 backgroundColor="blue" color="white"/>
		</div>
	);
};

export default App;
