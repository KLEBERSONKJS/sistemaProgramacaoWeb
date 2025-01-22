function fazGet(url) {
    let request = new XMLHttpRequest()
    request.open("GET", url, false)
    request.send()
    return request.responseText
}

function criaLinha(cliente) {
    let linha = document.createElement("tr");

    let tdNome = document.createElement("td");
    let tdEmail = document.createElement("td");
    let tdStatus = document.createElement("td");
    let tdAcoes = document.createElement("td");

    tdNome.setAttribute("data-label", "Nome");
    tdEmail.setAttribute("data-label", "Email");
    tdStatus.setAttribute("data-label", "Status");
    tdAcoes.setAttribute("data-label", "Ações");

    tdNome.innerHTML = cliente.nome;  
    tdEmail.innerHTML = cliente.email;
    tdStatus.innerHTML = cliente.status; 


    let btnAtualizar = document.createElement("button");
    btnAtualizar.classList.add("btnAtualizar");
    btnAtualizar.innerHTML = "Atualizar"
    
    let btnRemover = document.createElement("button");
    btnRemover.classList.add("btnRemover");
    btnRemover.innerText = "Remover";
    btnRemover.onclick = function () {
        alert('CLIENTE REMOVIDO');
    };

    tdAcoes.classList.add("acoes")
    tdAcoes.appendChild(btnAtualizar);
    tdAcoes.appendChild(btnRemover);

    linha.appendChild(tdNome);
    linha.appendChild(tdEmail);
    linha.appendChild(tdStatus);
    linha.appendChild(tdAcoes);

    return linha;
}


function main() {
    let data = fazGet("http://localhost:8080/usuarios")
    let clientes = JSON.parse(data);
    let tabela = document.getElementById("tabela")

    clientes.forEach(element => {
        let linha = criaLinha(element);
        tabela.appendChild(linha);
    });
}

main()