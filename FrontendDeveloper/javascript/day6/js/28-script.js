

function changeMode(){

    let buton=document.querySelector(".btn")

    let video=document.querySelector(".background-video")

    let faEl=document.querySelector(".fa")

    if(buton.classList.contains("pause")){
        buton.classList.remove("pause")
        video.play()
        faEl.classList.add("fa-pause")
        faEl.classList.remove("fa-play")

    }else{
        buton.classList.add("pause")
        video.pause()
        faEl.classList.remove("fa-pause")
        faEl.classList.add("fa-play")

    }




}
