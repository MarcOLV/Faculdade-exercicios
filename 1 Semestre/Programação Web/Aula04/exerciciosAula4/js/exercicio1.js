"use strict";
document.querySelector("#botao").addEventListener("click", function(){
    calcular();
});

function calcular(){
    const elemento_valor =       document.querySelector("#txtvalor");//precisa de #
    const elemento_parcelas =  document.getElementById("txtparcelas");//n precisa de #
    const elemento_result =    document.querySelector("#txtresult");

    let valor_compra = parseFloat( elemento_valor.value );
    let qtnd_parcela = Number(elemento_parcelas.value);

    let msg = "";
    let resultado = 0;
    let cor = "";
    let font = "";

    if(qtnd_parcela == 1){
        resultado = valor_compra;
        msg = `1x ${resultado}`;
        cor = "#16c4f8";
        font = "bold 15px arial,serif";
    } else if(qtnd_parcela == 2){
        resultado = valor_compra + (valor_compra * 0.03);
        msg = "2x " + resultado / 2;
        cor = "#f87504";
        font = " bold 15px arial,serif";
    }
    else {
        resultado = valor_compra + (valor_compra * 0.07);
        msg = "4x " + resultado / 4;
        cor = "#d93c3c";
        font = " bold 15px arial,serif";
    }
    elemento_result.value = msg;
    elemento_result.style.backgroundColor = cor;
    elemento_result.style.font = font
}