let url = "https://randomuser.me/api/?format=json&results=200";

fetch(url)
    .then( (resp) => resp.json())
    .then( function(json){
        let div = document.querySelector("#lista");
        div.innerHTML = "";
        let usuarios = json.results;
        for(let usuario of usuarios){
            div.innerHTML += `<p><img src="${usuario.picture.large}"><br>
                                Nome: ${usuario.name.first}</p>`
        }
    })
