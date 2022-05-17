"use strict";
let botoes_numericos = document.querySelectorAll(".calc_botao");
let botoes_op = document.querySelectorAll(".calc_botao_op");
 let op = "";

for (let botao of botoes_numericos){
    botao.addEventListener("click", function(){
        addVisor(botao);
        op = "";
    });
}

for (let botao of botoes_op){
    botao.addEventListener("click", function(){
        if(op == ""){
            addVisor(botao);
            op = botao.innerText;
        }
    });
}


function addVisor(botao){
    document.getElementById("res").value += botao.innerText;
}

document.getElementById("limpar").addEventListener("click", function(){
    document.getElementById("res").value = "";
});

document.getElementById("resp").addEventListener("click", function(){
    document.getElementById("res").value = eval(document.getElementById("res").value );
});

document.getElementById("round").addEventListener("click", function(){
    document.getElementById("res").value = Math.round(document.getElementById("res").value );
});

document.getElementById("sqrt").addEventListener("click", function(){
    document.getElementById("res").value = Math.sqrt(document.getElementById("res").value );
});

document.getElementById("pow").addEventListener("click", function(){
    document.getElementById("res").value += "**";
});

