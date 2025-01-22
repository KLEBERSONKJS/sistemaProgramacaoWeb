const radios = document.querySelectorAll('input[name="seleção"]');
const botao =document.getElementById('confirmar');
const mensagem =document.getElementById('mensagem');

radios.forEach(radio =>  {
    radio.addEventListener('change', () => {
    botao.disabled = false;
    })
})

botao.addEventListener('click', () => {
    if (document.querySelector('input[name = "seleção"]: checked')) {
    mensagem.style.display = 'block';
    }
})