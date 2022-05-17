"use strict";
document.querySelector("#botao").addEventListener("click", function(){
    verificar();
});

function verificar(){
    const num = Number(document.getElementById("txtvalor").value );
        if(num % 2 == 0){
            exibirsaida(num, "PAR");
        }
        else{
            exibirsaida(num, "IMPAR");
        }

}

let exibirsaida = (n, msg) => {
    document.getElementById("resposta").innerHTML = "<h1> O número " + n + " é " + msg +"<h1>";
}
document.getElementById("resposta").style.backgroundColor = "lightblue";

