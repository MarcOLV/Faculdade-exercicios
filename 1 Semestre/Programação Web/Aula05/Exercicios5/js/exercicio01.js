"use strict"; 

let vet_nomes = [];

document.querySelector("#btn1").addEventListener("click", function(){
    let nome = document.querySelector("#texto").value;
    if(nome.length > 0 ){
        cadastrarNome(nome);
    }else{
        alert("Preencha os campos");
    }
});

function cadastrarNome(nome){
     vet_nomes.push(nome);
}

document.querySelector("#btn2").addEventListener("click", function(){
    exibirDados();
});

function exibirDados(){
    let conteudo = "<table>";
    conteudo += "<tr class='cab'><td>Indice</td><td>Nome</td></tr>";
    for(let i=0; i < vet_nomes.length; i++){
        conteudo += "<tr>";
        conteudo += `<td>${i+1}</td> <td>${vet_nomes[i]}</td>`;
        conteudo += "</tr>";
    }
    conteudo += "</table>";
    document.querySelector("#saida").innerHTML = conteudo;
}