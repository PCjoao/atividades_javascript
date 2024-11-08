caractere = input("Digite um caractere: ")
if caractere.lower() in 'aeiou':
    print("O caractere é uma vogal.")
elif caractere.isalpha():
    print("O caractere é uma consoante.")
elif caractere.isdigit():
    print("O caractere é um número.")
else:
    print("O caractere é um símbolo.")
