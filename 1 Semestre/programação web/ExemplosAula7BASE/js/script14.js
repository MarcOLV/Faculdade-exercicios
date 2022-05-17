let div = document.querySelector("#cards");

function montaCard(pessoa){
    div.innerHTML += `<div class="card">
                        <img src="${pessoa.foto}">
                        <h3>${pessoa.nome}</h3>
                        <p>${pessoa.data_nasc}</p>
                        <div class ="salario">${pessoa.salario}</div>
                    </div>`;
}

for(let pessoa of pessoas){
        montaCard(pessoa);
}

let p = document.querySelector("#pesq");
p.addEventListener("keyup", function(){
    pesquisa(p.value.toLowerCase()); // marco == marco tamanho n importa

});

function pesquisa(str){
    div.innerHTML="";
    for(let pessoa of pessoas){
        if(pessoa.nome.toLowerCase().indexOf(str)>=0){
            montaCard(pessoa);
        }
    }
}