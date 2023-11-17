let nameEl=document.querySelector(".name");
console.log(nameEl);

let name=nameEl.innerText
console.log(name);

let mesaj=`Hello ${name}`
console.log(mesaj)

let mesalEl=document.querySelector(".mesaj").innerText=mesaj