"use strict";
document.getElementById("btn1").addEventListener("click", function(){
    let linhas = Number(document.getElementById("qtdlinhas").value );
    let colunas = Number(document.getElementById("qtdcolunas").value );

    let conteudo = "<table>";
    let classe="";
    for(let i = 1;i <= linhas; i++){
        conteudo += "<tr>";
        for(let j = 1; j<= colunas;j++){
            classe = (j % 2 == 0 )? "par" : "impar";
            conteudo += `<td class='${classe}'>${i},${j}</td>`;
        }
        conteudo += "</tr>";
    }
    conteudo += "</table>";
    document.getElementById("saida").innerHTML = conteudo;
});

