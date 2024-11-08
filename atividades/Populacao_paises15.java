let populacaoA = 5000000;
let populacaoB = 7000000;
const taxaA = 0.03;
const taxaB = 0.02;
let anos = 0;
while (populacaoA <= populacaoB) {
    populacaoA += populacaoA * taxaA;
    populacaoB += populacaoB * taxaB;
    anos++;
}
console.log(Serão necessários ${anos} anos para que a população do país A ultrapasse a do país B.);
