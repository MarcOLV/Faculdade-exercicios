"use strict";
document.querySelector("#botao").addEventListener("click", function(){
    calcularmedia();

});

let calcularmedia = () => {
    let nota1 = Number(document.getElementById("txtnota1").value);
    let nota2 = Number(document.getElementById("txtnota2").value);
    let nota3 = Number(document.getElementById("txtnota3").value);
    let media = (nota1 + nota2 + nota3)/3;
    exibirdados(media , verificarconceito(media));
}

let verificarconceito = (m) =>{
    if (m >= 6){
        return "Aprovado";
    }else if (m >= 3 && m < 6){
        return "Exame"
    }
    else{
        return "Reprovado"
    }
}

let exibirdados = (media, conceito) =>{
    document.getElementById("txtmedia").value = media.toFixed(2);
    document.getElementById("txtconceito").value = conceito;
}