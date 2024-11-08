function classeEleitoral() {
    const idade = parseInt(prompt("Digite sua idade: "));
    if (idade < 16) {
        console.log("Não eleitor");
    } else if ((idade >= 16 && idade < 18) || idade >= 65) {
        console.log("Eleitor facultativo");
    } else {
        console.log("Eleitor obrigatório");
    }
}
classeEleitoral();
