"use strict";
let num1;
let num2;

let lernumeros = () => {
    num1 = Number(document.getElementById("txtnum1").value);
    num2 = Number(document.getElementById("txtnum2").value);

}

document.getElementById("btnsoma").addEventListener("click", function(){ funcSomar();       });
document.getElementById("btnsub").addEventListener("click", function(){ funcSubtrair();       });
document.getElementById("btnmult").addEventListener("click", function(){ funcMultiplicar();       });
document.getElementById("btndiv").addEventListener("click", function(){ funcDividir();       });

function funcSomar(){
    lernumeros();
    document.getElementById("txtresult").value = num1 + num2;
}

function funcSubtrair(){
    lernumeros();
    document.getElementById("txtresult").value = num1 - num2;
}

function funcMultiplicar(){
    lernumeros();
    document.getElementById("txtresult").value = num1 * num2;
}

function funcDividir(){
    lernumeros();
    document.getElementById("txtresult").value = num1 / num2;
}