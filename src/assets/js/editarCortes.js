function editarOuExcluirCorte() {
    const tabela = document.querySelector('table tbody');

    tabela.addEventListener('click', (event) => {
        if (event.target.classList.contains('btnEditar')) {
            event.preventDefault();
            const row = event.target.closest('tr');
            const nomeCell = row.querySelector('[data-label="Nome"]');
            const novoNome = prompt("Insira o novo nome do corte:", nomeCell.textContent);

            if (novoNome) {
                nomeCell.textContent = novoNome;
                alert("Nome alterado com sucesso!");
            }
        }

        if (event.target.classList.contains('btnExcluir')) {
            event.preventDefault();
            const row = event.target.closest('tr');
            if (confirm("Deseja realmente excluir este corte?")) {
                row.remove();
                alert("Corte excluído com sucesso!");
            }
        }
    });
}

function addCorte() {
    const botaoAdicionar = document.querySelector('.btnAdd');

    botaoAdicionar.addEventListener('click', (event) => {
        event.preventDefault();

        const tbody = document.querySelector('table tbody');
        const novoNome = prompt("Nome do novo corte:");
        const novoPreco = prompt("Preço do novo corte:");

        if (novoNome && novoPreco) {
            const novaLinha = `
            <tr>
                <td data-label="Foto">SEM FOTO</td>
                <td data-label="Nome">${novoNome}</td>
                <td data-label="Preço">${novoPreco}</td>
                <td data-label="Ações" class="acoes">
                    <button class="btnEditar">Editar</button>
                    <button class="btnExcluir">Excluir</button>
                </td>
            </tr>
        `;
            tbody.insertAdjacentHTML('beforeend', novaLinha);
            alert("Novo corte adicionado com sucesso!");
        }
    });
}

document.addEventListener('DOMContentLoaded', () => {
    editarOuExcluirCorte();
    addCorte();
});
