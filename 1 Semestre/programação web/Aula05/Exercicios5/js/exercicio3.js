"use strict"
document.getElementById("b1").addEventListener("click", function(){
    let texto = document.getElementById("txt_texto").value;
    document.getElementById("saida").innerText = texto.toUpperCase();
});

document.getElementById("b2").addEventListener("click", function(){
    separarTexto();
});

function separarTexto(){
    let texto = document.getElementById("txt_texto").value;
    let palavras = texto.split(" ");
    let conteudo = "";
    for (let i = 0 ; i < palavras.length; i++){
        conteudo += palavras[i] + "<br>";
    }
    document.getElementById("saida").innerHTML = conteudo;
}