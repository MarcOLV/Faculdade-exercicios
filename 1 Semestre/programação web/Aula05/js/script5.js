"use strict"
let frutas = [];
frutas[0] = "Morango";
frutas [1] = "Uva";
frutas [2] = "Manga";

console.log(frutas);
console.log(frutas[2] + " com leite");

let meses = ["JAN", "FEV","MAR", "ABR","MAI", "JUN","JUL", "AGO","SET", "OUT","NOV", "DEZ"];
let data_hora = new Date();
console.log(meses[data_hora.getMonth()]);

for (let i=0; i < meses.length; i++){
    console.log(meses[i]);
}

for(let mes of meses){
    console.log(mes);
}

meses.forEach(function(mes, i){
    console.log(`${i+1} - ${mes}`);
});