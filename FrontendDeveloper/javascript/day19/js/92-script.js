document.getElementById("formLogin").addEventListener("submit",(e)=>{

    e.preventDefault();
const txtEmail=document.getElementById("txtEmail")
const txtPassword=document.getElementById("txtPassword")

try {
    const emailEl=txtEmailvalue
    const passwordEl=txtPassword.value

} catch (error) {
    
}
})
const isEmailValid= (mail) => {
let regexMail=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/
return regexMail;

}
console.log(isEmailValid("ali@gmail.com"))