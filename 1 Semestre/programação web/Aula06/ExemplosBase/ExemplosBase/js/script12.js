"use strict";

$("#somar").click(function(){
    let n1 = Number($("#valor1").val());
    let n2 = Number($("#valor2").val());
    $("#resul").html(`<h2>Resultado: ${somarValores(n1,n2)}</h2>`);
})

let somarValores = (v1, v2) => v1+v2;