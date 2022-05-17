$("#button1").click(gravarDados);
$("#button2").click(carregarDados);
$("#button3").click(apagarDados);

function gravarDados(){
    localStorage.setItem("txtrgm", $("#rgm").val() );
    localStorage.setItem("txtnome", $("#nome").val() );
}

function carregarDados(){
    if (localStorage.length > 0){
        $("#rgm").val( localStorage.getItem("txtrgm") );
        $("#nome").val( localStorage.getItem("txtnome") );
    }else{
        alert("erro")
    }
}

function apagarDados(){
    localStorage.clear();
}