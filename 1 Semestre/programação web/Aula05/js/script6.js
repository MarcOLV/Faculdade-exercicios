"use strict";

function anima(){
    let posx = Math.round(Math.random() * 1000);
    let posy = Math.round(Math.random() * 800);
    document.getElementById("personagem").style.left = posx + "px";
    document.getElementById("personagem").style.top = posy + "px";

}

let tempo = setInterval(anima, 10);
setTimeout(function(){
    clearInterval(tempo);
},5000);