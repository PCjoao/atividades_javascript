const diasJunho = 30;
let pluviometria = [];
let somaPrimeiraQuinzena = 0;
let somaSegundaQuinzena = 0;

for (let i = 0; i < diasJunho; i++) {
    pluviometria[i] = parseFloat(prompt(`Digite o índice pluviométrico do dia ${i + 1}: `));
}

const diaMaisChuva = pluviometria.indexOf(Math.max(...pluviometria)) + 1;
const diaMenosChuva = pluviometria.indexOf(Math.min(...pluviometria)) + 1;

for (let i = 0; i < 15; i++) {
    somaPrimeiraQuinzena += pluviometria[i];
}
for (let i = 15; i < diasJunho; i++) {
    somaSegundaQuinzena += pluviometria[i];
}

console.log(Dia com mais chuva: ${diaMaisChuva});
console.log(Dia com menos chuva: ${diaMenosChuva});
console.log(Média da primeira quinzena: ${(somaPrimeiraQuinzena / 15).toFixed(2)});
console.log(Média da segunda quinzena: ${(somaSegundaQuinzena / 15).toFixed(2)});
