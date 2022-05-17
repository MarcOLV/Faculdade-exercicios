"use strict";
let url = "dados/receita_federal.xml";
let div = document.getElementById("cards");

fetch(url)
    .then((resp)=>resp.text())
    .then((str) => (new DOMParser().parseFromString(str, "text/html")))
    .then((xml) => {
        console.log(xml);
        let pessoas = xml.querySelectorAll("contribuinte");
        for(let pessoa of pessoas){
            montaCarta(pessoa);
        }
    })
    .catch( (erro) => console.log(erro));

function montaCarta(pessoa){
    div.innerHTML += `<div class = "card">
                        <img src="${pessoa.childNodes[7].childNodes[0].nodeValue}">
                        <h3>${pessoa.childNodes[2].childNodes[0].nodeValue}</h3>
                        <p>
                        CPF: ${pessoa.childNodes[0].childNodes[0].nodeValue}<br>
                        ${pessoa.childNodes[4].childNodes[4].childNodes[0].nodeValue}</p>
                        <div class = "contato">
                        cel:${pessoa.childNodes[5].childNodes[1].childNodes[0].nodeValue}
                        <br>
                        email.:${pessoa.childNodes[5].childNodes[2].childNodes[0].nodeValue}
                        </div>
                        </div>`;
}