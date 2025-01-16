function obterCorte() {
    const params = new URLSearchParams(window.location.search);
    const corte = params.get('corte');
    if (corte) {
        const seletorCorte = document.createElement('p');
        seletorCorte.textContent = `Corte Selecionado: ${corte}`;

        const selectCortes = document.getElementById('listaCortes');
        if (selectCortes) {
            selectCortes.value = corte;
        }
    }
}

window.onload = obterCorte;