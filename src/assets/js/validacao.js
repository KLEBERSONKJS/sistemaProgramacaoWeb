function validar() {

const usuario = document.getElementById("usuario").value;
const senha = document.getElementById("senha").value;

if(usuario == "admin" && senha == "admin") {
    alert('Seja bem-vindo!')
} else {
    alert('Usuario ou senha incorretos!')
}

}