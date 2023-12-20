import React from 'react'
import Welcome from './welcome'

const Greetings = () => {
  return (
    <div>
        <h1>Props</h1>
        <Welcome firstName="John " lastName="Doe"/>
        <Welcome firstName="Sebahattin " lastName="Köse"/>

    </div>
  )
}

export default Greetings