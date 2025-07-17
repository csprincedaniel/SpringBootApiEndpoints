let sbm1 = document.getElementById("sbm1")
let cont = document.getElementById("contents")
let text = document.getElementById("p")

let indiv = document.getElementById("indiv")
let sbm2 = document.getElementById("sbm2")


sbm1.addEventListener("click", async function(){
    let request = await fetch("http://localhost:8080/view_all", {
        method: "GET",
    })
    let response = await request.json()

    text.textContent = JSON.stringify(response, null, 2);
})

sbm2.addEventListener("click", async function(){
    let request = await fetch(`http://localhost:8080/view_all/month/${indiv.value}`, {
        method: "GET",
    })
    let response = await request.json()

    text.textContent = JSON.stringify(response, null, 2);
})