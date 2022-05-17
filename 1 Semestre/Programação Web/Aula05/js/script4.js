"use strict";

let elemento1 = document.getElementById("txt1");
let elemento2 = document.getElementById("txt2");

elemento1.addEventListener("keypress", validarValor);
elemento2.addEventListener("keypress", validarValor);

function validarValor(e){
    return ((e.keycode >= 48 && e.keycode <=57 || e.keycode == 46 )? true : e.preventDefault());
}

document.getElementById("btn1").addEventListener("click", function(){
    if(elemento1.value.length == 0 || elemento2.value.length == 0){
        alert("informe os valores");
    }else{
        let v1 = Number(elemento1.value);
        let v2 = Number(elemento1.value);
        document.getElementById("resultado").value = v1+v2;
    }
});