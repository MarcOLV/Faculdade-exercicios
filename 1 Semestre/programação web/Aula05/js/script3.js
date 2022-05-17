"use strict";
let div1 = document.getElementById("box1");
let div2 = document.getElementById("box2");

div1.addEventListener("click", tratarEvento);
div1.addEventListener("dblclick", tratarEvento);

div2.addEventListener("mouseover", tratarEvento);//tratar mouse encima
div2.addEventListener("mouseout", tratarEvento);//tirar de cima
div2.addEventListener("mousedown", tratarEvento);//segurar botao esquerdo
div2.addEventListener("mouseup", tratarEvento);//
div2.addEventListener("mousemove", tratarEvento);//

function tratarEvento(evento){
    switch(evento.type){
        case "click": div1.style.backgroundColor = "green"; break;
        case "dblclick": div1.style.backgroundColor = "blue"; break;
        case "mouseover": div2.style.backgroundColor = "red"; break;
        case "mouseout": div2.style.backgroundColor = "yellow"; break;
        case "mousedown": div2.style.backgroundColor = "black"; break;
        case "mouseup": div2.style.backgroundColor = "white"; break;
        case "mousemove": div2.innerText = `${evento.clientX},${evento.clientY}`;
    }
    
}

