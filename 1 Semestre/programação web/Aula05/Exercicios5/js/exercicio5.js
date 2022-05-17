"use strict";
let contador = 0;
let timer = 0
document.getElementById("btn1").addEventListener("click", function(){
    exibirDiv("divCronometro");
    if(timer == 0 ){
        timer = setInterval(funcCronometro, 500);
    }
});

function funcCronometro(){
    contador++
    document.getElementById("txtNum").innerHTML = contador;
}

document.getElementById("btn2").addEventListener("click", function(){
    exibirDiv("divSlide");
});

document.getElementById("btn3").addEventListener("click", function(){
    exibirDiv("divTabuada");
});

function exibirDiv(div){
    let tagsDiv = document.querySelectorAll("div");
    for (let i=0; i< tagsDiv.length; i++){
        if (tagsDiv[i].id.indexOf("div") >= 0){
            if (tagsDiv[i].id == div){
                tagsDiv[i].style.display = "block";
            }else{
                tagsDiv[i].style.display = "none";
            }
        }
    }
}



let contImagem = 0;
let imagens = ["img1.jpg","img2.jpg","img3.jpg","img4.jpg","img5.jpg"];

document.querySelector("#ant").addEventListener("click", function(){
    if (contImagem > 0){
        contImagem--;
    }else{
        contImagem = imagens.length-1;
    }
    exibirImagem();
});

document.querySelector("#prox").addEventListener("click", function(){
    if (contImagem < imagens.length-1){
        contImagem++;
    }else{
        contImagem = 0;
    }
    exibirImagem();
});

function exibirImagem(){
    document.querySelector("#imagens").src = `imagens/${imagens[contImagem]}`;
}

document.getElementById("btntab").addEventListener("click", function(){
    let valorTab = Number(document.getElementById("txtNumTab").value );
    let div = document.getElementById("restab");
    div.innerHTML = "";
    for(let i = 0; i <=10; i++){
        div.innerHTML += `${valorTab} X ${i} = ${valorTab * i}<br>`;
    }
});