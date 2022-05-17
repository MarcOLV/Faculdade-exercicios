"use strict";
document.querySelector("#botao").addEventListener("click", function(){
    let peso = Number(document.getElementById("txtpeso").value);
    let altura = Number(document.getElementById("txtaltura").value);
    let sexo = 0;
    let imc = peso / (altura *altura);
    if(document.getElementById("sexM").checked){
        sexo =1;

    }else if(document.getElementById("sexF").checked){
        sexo = 2;
    }
    if(sexo == 1){
        if(imc < 20.7){
            document.getElementById("txtimc").value = "Voce é de sexo Masculino, e seu imc é de:" + imc;
            document.getElementById("txtcondicao").value = "Abaixo do peso";
        }
        else if(imc >= 20.7 && imc<26.4){
            document.getElementById("txtimc").value = "Voce é de sexo Masculino, e seu imc é de:" + imc;
            document.getElementById("txtcondicao").value = "No peso normal";
        }
        else if(imc >=26.4 && imc<27.8){
            document.getElementById("txtimc").value = "Voce é de sexo Masculino, e seu imc é de:" + imc;
            document.getElementById("txtcondicao").value = "Marginalmente acima do peso";
        }
        else if(imc>=27.8 && imc<31.1){
            document.getElementById("txtimc").value = "Voce é de sexo Masculino, e seu imc é de:" + imc;
            document.getElementById("txtcondicao").value = "Acima do peso ideial";
        }
        else{
            document.getElementById("txtimc").value = "Voce é de sexo Masculino, e seu imc é de:" + imc;
            document.getElementById("txtcondicao").value = "Obeso";
        }
    }else if(sexo == 2){
        if(imc < 19.1){
            document.getElementById("txtimc").value = "Voce é de sexo feminino e seu imc é de:" + imc;
            document.getElementById("txtcondicao").value = "Abaixo do peso";
        }
        else if(imc >= 19.1 && imc<25.8){
            document.getElementById("txtimc").value = "Voce é de sexo feminino e seu imc é de:" + imc;
            document.getElementById("txtcondicao").value = "No peso normal";
        }
        else if(imc >=25.8 && imc<27.3){
            document.getElementById("txtimc").value = "Voce é de sexo feminino e seu imc é de:" + imc;
            document.getElementById("txtcondicao").value = "Marginalmente acima do peso";
        }
        else if(imc>=27.3 && imc<32.3){
            document.getElementById("txtimc").value = "Voce é de sexo feminino e seu imc é de:" + imc;
            document.getElementById("txtcondicao").value = "Acima do peso ideial";
        }
        else{
            document.getElementById("txtimc").value = "Voce é de sexo feminino e seu imc é de:" + imc;
            document.getElementById("txtcondicao").value = "Obeso";
        }
    }
    
});