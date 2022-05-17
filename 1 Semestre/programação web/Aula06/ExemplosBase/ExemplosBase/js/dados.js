export let titulo = "Modulo Es6";

export let user = {
    name: "admin",
    level: 3,
    date: "08/10"
};

export function setTitulo(tit) {
    titulo = tit;

}

export function exibirTitulo() {
    alert(titulo);
}

export function exibirUser() {
    console.log(user);
}