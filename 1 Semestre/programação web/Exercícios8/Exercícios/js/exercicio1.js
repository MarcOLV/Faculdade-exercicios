"use strict";

let saida = `<table>
                <tr>
                    <th>RGM</th>
                    <th>NOME</th>
                    <th>CURSO</th>
                    <th>PW</th>
                    <th>BD</th>
                    <th>CG</th>
                    <th>ED</th>
                    <th>IA</th>
                </tr>`;

for(let i=0; i <alunos.length; i++){
    saida += `<tr>
                <td>${alunos[i].rgm}</td>
                <td>${alunos[i].nome}</td>
                <td>${alunos[i].curso}</td>`;

        for(let j=0; j < alunos[i].notas.length; j++){
            saida += `<td>${alunos[i].notas[j].nf}</td>`;
        }
        saida += "</tr>";
}

saida += "</table>";
document.getElementById("tabela").innerHTML = saida;