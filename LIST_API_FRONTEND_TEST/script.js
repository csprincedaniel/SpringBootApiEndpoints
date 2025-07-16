let test = document.querySelector("#test")
let note = document.querySelector("#note")
let test2 = document.querySelector("#test2")
let test3 = document.querySelector("#test3")
let count = 0

test.addEventListener('click', async function(){
    const res = await fetch("http://localhost:8080/todos", {
        method: "POST",
        body: JSON.stringify({
            task: note.value,
            id: count++
        }),
        headers: {"Content-Type":"application/json"},
    })

    const text = await res.text();
    alert(text)
})

test2.addEventListener("click", async function(){
    const response = await fetch("http://localhost:8080/todos",{
        method: "GET",
    })

    const todos = await response.json()

    for (let i = 0; i < todos.length; i++){
        let chosen = todos[i]
        alert(`ID: ${chosen.id}, Task: ${chosen.task}, Done: ${chosen.done}`);

    }
})

test3.addEventListener("click", async function(){
    let idget = document.querySelector("#idget")
        const response = await fetch(`http://localhost:8080/todos/${idget.value}`,{
        method: "GET",
    })

    let ans = await response.json()

    alert(`ID: ${ans.id}, Task: ${ans.task}, Done: ${ans.done}`);
})

test4.addEventListener('click', async function(){
    let idupdate = document.querySelector("#idupdate")
    let text = document.querySelector("#update")
    const response = await fetch(`http://localhost:8080/todos/${idupdate.value}`,{
        method:"PUT",
        body: JSON.stringify({
            task: text.value,
            id: idupdate.value
        }),
        headers: {"Content-Type" : "application/json"}
    })

    let ans = await response.json()
    alert(`ID: ${ans.id}, Task: ${ans.task}, Done: ${ans.done}`);

})