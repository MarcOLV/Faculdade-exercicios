"use strict";
document.querySelector("#botao").addEventListener("click", function(){
    let num = parseInt(document.getElementById("txtnum").value);
    let fat = 1;
    for(let i= 1; i <= num; i++){
        fat = fat* i
    }
    document.getElementById("txtfat").value = fat;
});