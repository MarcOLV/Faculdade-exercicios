"use strict";
$("#btn").click(function(){
    buscar($("#crgm").val() );//pegou os dados digitados pesquisados
});
 
function buscar(rgm){
    let aluno = "";
    for(let i=0; i< alunos.length; i++){
        if(alunos[i].rgm == rgm){
            aluno = `ID: ${alunos[i].id}<br>
                    Nome: ${alunos[i].nome} <br>
                    Curso: ${alunos[i].curso} <br>
                    <ul>`;
        for(let j=0; j <alunos[i].notas.length; j++){
           aluno += `${alunos[i].notas[j].disciplina} = 
           ${alunos[i].notas[j].nf} 
            -   ${conceito(alunos[i].notas[j].nf)}</li> `;
        }
        ` </ul> `;
        break
    }
}
    if(aluno == ""){
        $("#info").html("RGM invalido");
    }else{
        $("#info").html(aluno);
    }
}
 
function conceito(nf){
    if (nf >= 6)   {
    return"<span class='blue'>APROVADO</span>";
        }else if (nf < 1){
    return"<span class='red'>REPROVADO</span>";
        }else{
    return"<span class='orange'>EXAME</span>";
        }
}