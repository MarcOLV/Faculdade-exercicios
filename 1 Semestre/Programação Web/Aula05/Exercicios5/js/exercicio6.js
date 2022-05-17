"use strict";

let rgms = [];
let nomes = [];
let parciais = [];
let exercicios = [];
let projetos = [];
let regimentais = [];

document.getElementById("btn1").addEventListener("click", function(){
    cadastrarAluno();
});

document.getElementById("btn2").addEventListener("click", function(){
    exibirAlunos();
});

function cadastrarAluno(){
    rgms.push(document.getElementById("rgm").value);
    nomes.push(document.getElementById("nome").value);

    parciais.push(  Number(document.getElementById("nota_parc").value) );
    exercicios.push(  Number(document.getElementById("nota_exer").value) );
    projetos.push(  Number(document.getElementById("nota_proj").value) );
    regimentais.push(  Number(document.getElementById("nota_regi").value) );
}

function exibirAlunos(){
    let saida = "<table border='1'>";
    for(let i=0; i<rgms.length; i++){
        let nf = parciais[i] + exercicios[i] + projetos[i] + regimentais[i];
        saida += `<tr>
                    <td>${rgms[i]}</td>
                    <td>${nomes[i]}</td>
                    <td>${parciais[i]}</td>
                    <td>${exercicios[i]}</td>
                    <td>${projetos[i]}</td>
                    <td>${regimentais[i]}</td>
                    <td>${nf}</td>
                    <td>${calcConceito(nf)}</td>
                    </tr>`;
    }
    saida += "</table>";
    document.getElementById("resposta").innerHTML = saida;
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