"use strict";

let pessoa1 = {
    nome    : "Alcides",
    altura  : 1.69,
    idade   : 41
};

let pessoa2 = {
    nome    : "Gustavo",
    altura  : 1.8,
    idade   : 26
};

let pessoas = [ pessoa1, pessoa2 ];
let div = document.querySelector("#rel_pessoas");
for (let pessoa of pessoas){
    div.innerHTML += `<h1>Nome: ${pessoa.nome}, Idade:  ${pessoa.idade}, Altura:  ${pessoa.nome}</h1>`;
}