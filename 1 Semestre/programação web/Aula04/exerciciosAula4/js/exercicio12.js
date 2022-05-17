"use strict";

let num_secreto;
let tentativa = 0;
let sorteio = () => Math.round(Math.random() * 100);


num_secreto = sorteio();

document.getElementById("txtchute").focus();
document.getElementById("txtchute").addEventListener("keypress", function(event){
   if(event.keyCode == 13){
        verificarjogada();
   }
});

function verificarjogada(){
        let div = document.getElementById("msg");
        let dica = document.getElementById("txtdica");
    tentativa++;

    let num_chute = Number(document.getElementById("txtchute").value);
    if(num_chute < num_secreto){
        dica.value = "O numero sorteado é maior";
    }
    else if(num_chute> num_secreto){
        dica.value = "O numer5o sorteado é menor";
    }
    else{
        dica.value ="";
        div.innerHTML = "<h1>Parabéns. Você acertou em "+ tentativa + " tentativas";

        setTimeout(function(){
            document.location.reload(true);
        },2000);
    }
    document.getElementById("txtchute").value = "";

}