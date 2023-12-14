const API_URL = "https://api.tvmaze.com";
const txtSearch = document.getElementById("txtSearch");
const listShows = document.getElementById("listShows");
const searchShows = async (q) => {
    const resp = await axios.get(`${API_URL}/search/shows?q=${q}`);
    return resp.data;
};
/* const searchShows = (q, cb) => {
    axios.get(`${API_URL}/search/shows?q=${q}`).then((resp) => cb(resp));
}; */
/* searchShows("independent", (data)=>{
    console.log(data)
}) */
const createShowItem = (show) => {
    const {id, image, name} = show;
    return `
    <div class="col">
        <div class="card" style="cursor: pointer" data-showid="${id}">
            <img src="${image?.medium ?? 'img/no-image.jpg'}" alt="${name}" class="card-img-top"/>
            <div class="card-body">
                <h5 class="card-title">${name}</h5>
            </div>
        </div>
    </div>`;
};
txtSearch.addEventListener("input", async (e)=>{
    const q = e.target.value;
    const shows = await searchShows(q) ?? [];
    console.log(shows)
    
    let strShows = "";
    if(shows.length<=0){
        strShows = `<div class="alert alert-danger w-100">No movie was found</div>`
    }
    else{
        shows.forEach( item=> {
            strShows += createShowItem(itemshow) 
        })
    }
    listShows.innerHTML = strShows;
})
