"use strict";
document.querySelector("#botao").addEventListener("click", function(){
    let num = parseInt(document.getElementById("txtnum").value);
    let soma =0;
    for (var i =1; i <= num;i++){
         soma = soma + i;
    }
    document.getElementById("txtsoma").value = soma;
});