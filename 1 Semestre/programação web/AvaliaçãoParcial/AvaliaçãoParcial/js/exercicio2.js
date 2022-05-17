"use strict"

let results = new Array()

document.querySelector("#btn").addEventListener("click", function(){
    let countH =0;
    let countM = 0;
    let countGeral = 0;
   
	fetch("json/dados.json")
	.then((resp) => resp.json())
	.then(function(data) {
        let m = 0;
        let h = 0;
       for(let i = 0; i < data['results'].length; i++){
            let pessoa = data['results'][i]
            results.push(pessoa)
            
           if(pessoa['dob']['age'] > 40){

               countGeral++
               if(pessoa['gender'] == 'male'){
                   countH++
                   h = h + pessoa['dob']['age'];
               } else{
                   countM++
                   m = m + pessoa['dob']['age'];
               }
           }
       }
       let media = (m+h) / countGeral;

       document.querySelector("#estatisticas").innerHTML = `Estatísticas<br>
       A média de idade é = ${(media).toFixed(2)}<br>
       A quantidade de mulheres com idade acima de 40 anos é = ${countM}<br>
       A quantidade de homens com idade acima de 40 anos é = ${(countH)}`;
       
       
	
    mostrartabela();
})
})
function mostrartabela(){
    let conteudo = `<table>
                <tr>
                    <th class="th">Nome Completo</th>
                    <th class="th">Gênero</th>
                    <th class="th">Idade</th>
                    <th class="th">Rua/Número</th>
                    <th class="th">Cidade</th>
                    <th class="th">País</th>
                </tr>`;

for(let i = 0; i < results.length; i++){
    conteudo += `<tr>
                    <td class="td">${results[i].name['first']}
                        ${results[i].name['last']}</td>
                    <td class="td">${results[i].gender}</td>
                    <td class="td">${results[i].dob['age']}</td>
                    <td class="td">${results[i].location['street']['name']},
                        ${results[i].location['street']['number']}</td>
                    <td class="td">${results[i].location['city']}</td>
                    <td class="td">${results[i].location['country']}</td>`;
    }
    conteudo += "</tr>"
	
	conteudo += "</table>";
	document.querySelector("#tab").innerHTML = conteudo;
}