let lista_tarefas = document.querySelector("#lista");
let tarefas;

if (localStorage.getItem("tarefas") != null){
    tarefas = JSON.parse(localStorage.getItem("tarefas"));
    exibirTarefas();
}else{
    tarefas = [];
}

document.querySelector("#btn").addEventListener("click", function(){
    add();
});

document.querySelector("#tarefa").addEventListener("keypress", function(e){
    if (e.key == "Enter"){
        add();
    }
})

document.querySelector("#tarefa").focus();

function add() {    
   let entrada = document.getElementById("tarefa").value ;
   if(entrada == ""){
       alert("Digite algo!");

   }else{
       let id = (tarefas[0] != null)? tarefas[0].id + 1 : 1;
       tarefas.unshift({id: id, status: 1, titulo: entrada});
       localStorage.setItem("tarefas", JSON.stringify(tarefas));
   }
   document.getElementById("tarefa").value = "";
   document.getElementById("tarefa").focus();
   exibirTarefas();
}

function exibirTarefas(){​
lista_tarefas.innerHTML = "";
for (let tarefa of tarefas){​
let classCheck = (tarefa.status == 1)? "check" : "done";
let classSpan = (tarefa.status == 1)? "" : "done-span";
        lista_tarefas.innerHTML += `<li data-id="${​tarefa.id}​">
                            <i class="fas fa-minus-circle close"></i>
                            <i class="fas fa-check-circle ${​classCheck}​"></i>
                            <span class="${​classSpan}​">
    ${​tarefa.titulo}​
                            </span></li>`;
    }​
    updateCheckButton();
    updateCloseButton();
}​

function updateCloseButton(){​
    let botoes_close = document.querySelectorAll(".close");
    for (let botao of botoes_close){​
            botao.addEventListener("click", function(e){​
    let id = Number(e.target.parentElement.getAttribute("data-id"));
    let index = tarefas.findIndex( (item) => item.id == id); 
                tarefas.splice(index, 1);
                localStorage.setItem("tarefas", JSON.stringify(tarefas));
                exibirTarefas();
            }​);
        }​
    }​ 

    function updateCheckButton(){
        let itens_li = document.querySelectorAll("li span");
        for(let item_li of itens_li){
            item_li.addEventListener("click", function(e){
                let id = Number(e.target.parentElement.getAttribute("data-id"));
                let index = tarefas.findIndex( (item) => item.id == id);
                let tarefa_marcada = tarefas.find( (item) => item.id == id );
                tarefas.splice(index, 1);
                tarefa_marcada.status = 0;
                tarefas.push(tarefa_marcada);
                localStorage.setItem("tarefas", JSON.stringify(tarefas));
                exibirTarefas();
            });
        }
    }