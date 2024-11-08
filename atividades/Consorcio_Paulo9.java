function consorcioPaulo() {
    const valorConsorcio = 280000;
    const entrada = 2500;
    const valorFinanciado = valorConsorcio - entrada;
    const jurosAnual = 0.12;
    const meses = 65;
    const jurosMensal = jurosAnual / 12;
    const valorFinal = valorFinanciado * Math.pow((1 + jurosMensal), meses);
    console.log(`O valor final que Paulo irá pagar é: R$ ${valorFinal.toFixed(2)}`);
}
consorcioPaulo();
