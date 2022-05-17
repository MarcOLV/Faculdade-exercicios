"use strict"
let x = 20.5;
let y = 20;

let resultado = x / y;
console.log(resultado);

console.log(Math.ceil(resultado)); //arrendonda pra cima
console.log(Math.floor(resultado)); //arrendonda pra baixo

console.log(Math.round(resultado)); //0,4 baixo; 0,5 cima

let z = Math.random()*100;//numeros aleatorio de 0 a 100
console.log(z);
console.log(Math.round(z));

let raiz = Math.sqrt(80);
console.log(raiz);
console.log(Number(raiz.toFixed(2)));//2 casas decimais vao aparecer somente,mas transforma o valor em STRING,coloca
//Number.
