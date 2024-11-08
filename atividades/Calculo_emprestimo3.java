function emprestimo() {
    const salario = parseFloat(prompt("Digite seu salário: "));
    const prestacao = parseFloat(prompt("Digite o valor da prestação: "));
    if (prestacao > salario * 0.2) {
        console.log("Empréstimo não pode ser concedido");
    } else {
        console.log("Empréstimo pode ser concedido");
    }
}
emprestimo();
