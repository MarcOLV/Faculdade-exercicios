"use strict";
let i;
if( localStorage.getItem("qtd") != null){
    i = Number(localStorage.getItem("qtd")) + 1;
}
else{
    i=1;

}

$("#button1").click(gravarDados);
$("#button2").click(exibirDados);

function gravarDados(){
    localStorage.setItem("rgm_"+i,      $("#rgm").val()    );
    localStorage.setItem("nome_"+i,     $("#nome").val()    );
    localStorage.setItem("media_"+i,    $("#media").val()    );
    localStorage.setItem("qtd",i);
    i++;
}

function  exibirDados(){
    $("#lista").empty();
    if(localStorage.length > 0){
        for(let j = 1; j <= Number(localStorage.getItem("qtd"));j++){
            $("#lista").append(`Nome=${localStorage.getItem("nome_"+j)},`);
            let media = Number(localStorage.getItem("media_"+j));
            $("#lista").append(`Media=${media}, `);
            $("#lista").append(`Conceito=${calcConceito(media)}<br><br>`);
        }
    }else{
        alert("ERRO");
    }
    }

    function calcConceito(nf){
        if(nf > 6){
            return "<span class='aprovado'>APROVADO </span>";
        }
        else if(nf < 1){
            return "<span class='reprovado'>REPROVADO </span>";
        }
        else{
            return "<span class='exame'>EXAME </span>";
        }
    }

