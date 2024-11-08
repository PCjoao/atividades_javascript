function idadeEmDias() {
    const anos = parseInt(prompt("Digite a idade em anos: "));
    const meses = parseInt(prompt("Digite a idade em meses: "));
    const dias = parseInt(prompt("Digite a idade em dias: "));
    const idadeTotalDias = (anos * 365) + (meses * 30) + dias;
    console.log(`A idade total em dias é: ${idadeTotalDias}`);
}
idadeEmDias();
