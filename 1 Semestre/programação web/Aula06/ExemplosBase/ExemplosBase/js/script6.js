"use strict";
document.querySelector("#btn1").addEventListener("click", function () {
    ​
    let art = document.querySelector("#artigo");
    //document.getElementById
    console.log(art);
    let paragrafos = document.querySelectorAll("p");
    //document.getElementsByTagName
    console.log(paragrafos);
    let caixas = document.querySelectorAll(".caixa");
    //document.getElementsByClassName
    console.log(caixas);
}​);