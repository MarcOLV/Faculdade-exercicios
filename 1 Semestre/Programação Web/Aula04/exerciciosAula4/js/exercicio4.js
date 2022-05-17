"use strict";
document.querySelector("#botao").addEventListener("click", function(){
    calcular();
}); 
    
function calcular(){
    let base = Number(document.getElementById("txtbase").value);
    let altura = Number(document.getElementById("txtaltura").value);

    document.getElementById("txtarea").value = "A area é igual á " + base * altura;
}
