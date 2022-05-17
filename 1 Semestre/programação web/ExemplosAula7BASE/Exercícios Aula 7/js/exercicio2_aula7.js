"use strict";
let livros = [];

function lerDados(url){
    fetch(url)
    .then ( (resp)=> resp.json())
    .then ( (json)=> livros = json.registros)
    .catch ( (erro)=> console.log(erro))
}

lerDados("dados/biblioteca.json");

$("#btn1").click(function(){
    let str_pesq = $("#pesq").val();
    let tipo = $("#tipo").val();
    pesquisar(str_pesq, tipo);
});

function pesquisar(str, tipo){
    $("#resultado").html("");
    for(let livro of livros){
        switch(tipo){
            case "1" : if(livro.titulo.toLowerCase().indexOf(str.toLowerCase()) >= 0){
                montaLivro(livro);
            }
            break;
            case "2" : if(livro.classificacao.toLowerCase() == str.toLowerCase()){
                montaLivro(livro);
            }
            break;
        }
    }
  

}
function montaLivro(livro){
     let autores = "";
     for(let autor of livro.autores){
         autores += autor.nome + "<br>";
     }
     $("#resultado").append(`<article>
                            <div>
                            <img src = "${livro.capa}">
                            Titulo: ${livro.titulo}<br>
                            Autor(es): ${autores}<br>
                            Edição: ${livro.edicao}<br>
                            </div>
                            Assunto: ${livro.assunto}
                            </article>`);

}