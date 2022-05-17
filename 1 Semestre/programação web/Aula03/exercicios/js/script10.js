"use strict";
alert("Digite os valores para saber quantos degraus ele devera subir");
let a = Number(prompt("Digite a altura do degrau:"));
let b = Number(prompt("Digite a altura que deseja subir utilizando a escada:"));


let dobro = ((a*100)/b);
alert(`Para subir : ${b} metros, será necessario que você suba: ${dobro} cm de degraus `);