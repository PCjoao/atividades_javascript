function salarioVendedor() {
    const salarioFixo = 1200;
    const vendas = parseFloat(prompt("Digite o valor total das vendas no mês: "));
    const comissao = vendas * 0.15;
    const salarioTotal = salarioFixo + comissao;
    console.log(`O salário total do vendedor é: R$ ${salarioTotal.toFixed(2)}`);
}
salarioVendedor();
