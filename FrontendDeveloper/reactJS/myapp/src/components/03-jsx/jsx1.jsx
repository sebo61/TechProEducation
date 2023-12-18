import React from 'react'

const Jsx1 = () => {
    const  message="Bu bölüm örgürce javascript kullanacağımız bölüm.";
  return (
    <div>
        <div>Tüm elementler tek bir root içinde olmalıdır.</div> 
        <div><b>{message}</b></div>

    </div>
  )
}

export default Jsx1