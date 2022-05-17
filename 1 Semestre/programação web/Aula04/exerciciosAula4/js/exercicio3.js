"use strict";
document.querySelector("#botao").addEventListener("click", function(){
   let num1 = Number( document.getElementById("txtvalor1").value);
   let num2 = Number( document.getElementById("txtvalor2").value);


   if(num1 > num2){
       exibirresposta("O valor 1 é maior.");
   }
   else if(num2 > num1){
        exibirresposta("O valor 2 é maior.");
   }
   else{
        exibirresposta("Os valores são iguais");
   }
});


let exibirresposta = (msg) =>{
    document.getElementById("resposta").value = msg;
    document.getElementById("resposta").style.borderColor = "red";
}