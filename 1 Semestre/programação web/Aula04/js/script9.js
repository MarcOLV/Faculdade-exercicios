"use strict";
let a = Number(prompt("Digite A"));
let b = Number(prompt("Digite B"));
let c = Number(prompt("Digite C"));

let delta = b**2 - 4 *a * c

let r1 = (-b + Math.sqrt(delta)) / (2*a);
let r2 = (-b - Math.sqrt(delta)) / (2*a);


console.log(`R1 = ${r1}`);
console.log(`R2 = ${r2}`);