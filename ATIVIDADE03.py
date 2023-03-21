# Passo 1
lista = [1, 2, 3, 4, 5]

# Passo 2
pilha = []
for i in range(len(lista)):
    pilha.append(lista.pop(0))

# Passo 3
fila = []
for i in range(len(pilha)):
    fila.append(pilha.pop())

# Passo 4
lista += [6, 7, 8, 9, 10]

# Passo 5
pilha = []
for i in range(len(lista)):
    pilha.append(lista.pop(0))

fila2 = []
for i in range(len(pilha)):
    fila2.append(pilha.pop())

fila += fila2

# Passo 6
print(fila)
