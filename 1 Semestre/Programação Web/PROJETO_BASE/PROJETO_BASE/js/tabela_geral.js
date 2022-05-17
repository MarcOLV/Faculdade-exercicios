let fii_user = [];
let fii_table = [];

async function carregarDadosUser(url){
    await fetch(url)
            .then(resp => resp.json())
            .then(json => fii_user = json);
    carregarDadosFundos();
}

async function carregarDadosFundos(){
    for(let fii of fii_user) {
        let json = await fetch(`https://api-simple-flask.herokuapp.com/api/${fii.nome}`)
        .then(resp => resp.json());
    fii_table.push(json);
}

if (fii_table.length > 0) {
    document.querySelector('#loading').style.display = 'none'; 
}


    exibirTabela(fii_table,fii_user);
}

carregarDadosUser("json/fii.json");

function exibirTabela(fii_table, fii_user){ 
    let dadosdosfundos = []; 
    let table = "";
    let QtdCotas = 0;
    let ProventosS = 0;
    let InvestimTOTAL = 0;

    for(let i=0; i < fii_user.length;i++){
      dadosdosfundos.push(fii_table.find( (item) => item.fundo.indexOf(fii_user[i].nome.toUpperCase()) >= 0))
    }

    console.log(dadosdosfundos);

    for(let i =0; i<dadosdosfundos.length;i++){
        QtdCotas += fii_user[i].qtde;
        ProventosS += dadosdosfundos[i].pvp;
        InvestimTOTAL += fii_user[i].totalgasto;

        let percrendimentoFII = ((dadosdosfundos[i].pvp * 100)/dadosdosfundos[i].valorAtual).toFixed(2);
        
        let classTr = (percrendimentoFII < 0.60) ? "negativo" : "positivo";
       table += `
            <tr class=${classTr}>
                <td>${dadosdosfundos[i].fundo}</td>
                <td>${dadosdosfundos[i].setor}</td>
                <td>${dadosdosfundos[i].proximoRendimento.dataBase === "-" ? dadosdosfundos[i].ultimoRendimento.dataBase : dadosdosfundos[i].proximoRendimento.dataBase}</td>
                <td>${dadosdosfundos[i].proximoRendimento.dataPag === "-" ? dadosdosfundos[i].ultimoRendimento.dataPag : dadosdosfundos[i].proximoRendimento.dataPag}</td>
                <td>R$ ${dadosdosfundos[i].pvp}</td>
                <td>R$ ${dadosdosfundos[i].valorAtual}</td>
                <td>${fii_user[i].qtde}</td>
                <td>R$ ${fii_user[i].totalgasto}</td>
                <td>R$${(fii_user[i].totalgasto / fii_user[i].qtde).toFixed(2)}</td>
                <td>${percrendimentoFII} % </td>
                <td>${dadosdosfundos[i].dividendYield} % </td>
                <td>R$ ${dadosdosfundos[i].rendimentoMedio24M.toFixed(2)} </td>
            </tr>
            `
    }
    table += `
    <tr class="TotalGeral">
        <td colspan="4" >Total Geral</td>
        <td>R$ ${ProventosS.toFixed(2)}</td>
        <td>${QtdCotas}</td>
        <td> - </td>
        <td>R$ ${InvestimTOTAL.toFixed(2)}</td>
        <td> - </td>
        <td> - </td>
        <td> - </td>
        <td> - </td>
    </tr>`

    document.querySelector('#tabelas').innerHTML += table;
}