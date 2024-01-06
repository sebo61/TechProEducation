import React, { useState } from 'react'
import { ChildComp } from  "./child";
import { Prev } from 'react-bootstrap/esm/PageItem';

const ParentComp = () => {
    const [counter, setCounter] = useState(0);
    const handleCounter= (val) => {
    setCounter ((prev) => prev + val);

    }
  return (
    <div>Counter: {counter}</div>
    <ChildComp handleCounter={handleCounter}/>
  )
}

export default ParentComp