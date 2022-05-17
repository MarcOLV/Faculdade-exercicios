let pessoas = []

function lerDados(url) {
  fetch(url)
    .then(resp => resp.json())
    .then(json => (pessoas = json.results))
}

lerDados('json/dados.json')

document.querySelector('#btn').addEventListener('click', function () {
  let str = document.querySelector('#pesq').value
  pesquisar(str)
})

function pesquisar(str) {
  $('#info').html('')
  for (let pessoa of pessoas) {
    if (str == pessoa.location.state) {
      montaCard(pessoa)
    }
  }
}

function montaCard(pessoa) {
  let cor
  if (pessoa.gender == 'male') {
    cor = '#884c4a'
  } else {
    cor = '#faa5a2'
  }
  $('#info').append(`
                            <div class = card style="background:${cor}">
                                <img src = "${pessoa.picture['large']}"><br>
                                <h3>${pessoa.name['first']} ${pessoa.name['last']}</h3><br>
                                <p>${pessoa.location['city']}</p><br>
                                <p>${pessoa.location['state']}</p><br>
                                <p>${pessoa.location['country']}</p><br>
                                <div class = contato>${pessoa.email}
                                </div>
                            </div>`)
}