let vetor = [];
for (let i = 0; i < 15; i++) {
    vetor[i] = parseInt(prompt(`Digite o número para a posição ${i + 1}: `));
}
const valor = parseInt(prompt("Digite o valor a ser encontrado no vetor: "));
let contador = 0;
for (let i = 0; i < vetor.length; i++) {
    if (vetor[i] === valor) {
        contador++;
    }
}
console.log(O valor ${valor} ocorre ${contador} vezes no vetor.);
