salario = float(input("Digite o salário do funcionário: "))
desconto = salario * 0.11
if desconto > 334.29:
    desconto = 334.29

print(f"O valor do desconto previdenciário é: R$ {desconto:.2f}")
