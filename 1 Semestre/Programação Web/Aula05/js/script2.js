"use strict"
document.getElementById("btn1").addEventListener("click", function(){
    let info = document.getElementById("texto").value;
    if(info.length == 0){
        alert("Preencher o campo corretamente");
    }
    else{
        inverter(info);
        inserirSimbolo(info, "*");
    }
});

function inverter(str){//str recebe info, STRing
    let saida= "";
    for(let i = str.length - 1; i >= 0; i--){//vai diminuir pegando a ultima letra e apagando.
        saida += str[i].toUpperCase(); // saida = saida + str[i]
    }
    console.log(saida);
}


function inserirSimbolo(str, simbolo){
let saida = "";
for(let i=0; i < str.length; i++){
    saida += str[i].toLowerCase() + simbolo;
}
console.log(saida);
}