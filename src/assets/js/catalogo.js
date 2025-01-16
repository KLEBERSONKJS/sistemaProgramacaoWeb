function agendar(tipoCorte) {
    const url = `AgendServico.html?corte=${encodeURIComponent(tipoCorte)}`;
    window.location.href = url;
}