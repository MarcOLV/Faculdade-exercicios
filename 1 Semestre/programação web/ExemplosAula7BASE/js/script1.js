// JavaScript Document
let xhrDoc;
let xhr;

function criaObjetoXHR(){
    if (window.XMLHttpRequest) { 
        xhr = new XMLHttpRequest();
     }
     else {
        alert('A solicitação HTTP não poderá ser efetuada!');     
     }	
}

function carregaXML(){	
   let url = "xml/menu.xml";
    xhr.open('GET', url, true); //assincrona
    xhr.onreadystatechange = processaRetorno; 
    xhr.responseType = 'document';//xml
    xhr.withCredentials = true;
    xhr.send(null); 
}

function processaRetorno(){
	if (xhr.readyState == 4) {
    	if (xhr.status == 200) {			
            xhrDoc = xhr.response; 
			exibirMenu();
		}
	}
}

function exibirMenu() {
	let opc = xhrDoc.querySelectorAll("opcao");
    console.log(opc);
    let conteudo = "";
    for(let i = 0; i< opc.length;i++){
        conteudo += opc[i].getAttribute("id") + " - " +
                    opc[i].childNodes[0].nodeValue + "<br>";
    }
    document.querySelector("#menu").innerHTML = conteudo;
}

criaObjetoXHR();
carregaXML();