let url = "../xml/alunos.xml";

fetch(url)
    .then ( ( resp) => resp.text())
    .then ( ( str) => (new DOMParser().parseFromString(str, "text/xml")))
    .then ( function(xml){
        let div = document.querySelector("#lista");
        div.innerHTML = "";
        let alunos = xml.querySelectorAll("aluno");
        for(let aluno of alunos){
                div.innerHTML += `RGM: ${aluno.getAttribute("rgm")}
                                 Nome: ${aluno.childNodes[0].childNodes[0].nodeValue}<br>`;
        }
    })