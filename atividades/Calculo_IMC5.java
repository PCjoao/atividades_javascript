function calcularIMC() {
    const peso = parseFloat(prompt("Digite seu peso (kg): "));
    const altura = parseFloat(prompt("Digite sua altura (m): "));
    const imc = peso / (altura ** 2);
    let classificacao;
    if (imc < 20) {
        classificacao = "Abaixo do peso";
    } else if (imc < 25) {
        classificacao = "Peso normal";
    } else if (imc < 30) {
        classificacao = "Sobrepeso";
    } else if (imc < 40) {
        classificacao = "Obeso";
    } else {
        classificacao = "Obeso Mórbido";
    }
    console.log(`Seu IMC é: ${imc.toFixed(2)} - ${classificacao}`);
}
calcularIMC();
