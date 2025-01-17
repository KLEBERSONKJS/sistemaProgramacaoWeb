function obterCorte() {
    const params = new URLSearchParams(window.location.search);
    const corte = params.get('corte');
    if (corte) {
        const selectCortes = document.getElementById('listaCortes');
        if (selectCortes) {
            selectCortes.value = corte;
        }
    }
}

function limparCampos() {
    const formulario = document.querySelector('form');

    if (formulario) {
        formulario.reset();
    }

    alert('Formulário limpo!');
}

window.onload = obterCorte;