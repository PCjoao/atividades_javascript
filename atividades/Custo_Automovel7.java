function custoAutomovel() {
    const custoFabrica = parseFloat(prompt("Digite o custo de fábrica do automóvel: "));
    const percentualRevendedor = custoFabrica * 0.25;
    const impostos = custoFabrica * 0.45;
    const custoFinal = custoFabrica + percentualRevendedor + impostos;
    console.log(`O custo final ao consumidor é: R$ ${custoFinal.toFixed(2)}`);
}
custoAutomovel();
