# 📘 Versão 3 - Cálculo de Primos (2 Threads)

## 📌 Descrição
Agora, o intervalo é dividido em **duas partes**:  
- Primeira thread → `[início ... metade]`  
- Segunda thread → `[metade+1 ... fim]`

Isso permite paralelizar o cálculo.

## 🖥️ Exemplo de uso
Entrada: `5 a 25`  
- Thread 1 → `5 a 15`  
- Thread 2 → `16 a 25`  

Saída combinada: 5, 7, 11, 13, 17, 19, 23
