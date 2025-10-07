## 🚗 Carro – Aplicando o Padrão Composite

📖 **Descrição**  
Projeto de exemplo para aplicar o padrão **Composite**.  
O sistema simula a estrutura de um carro, composto por partes simples e compostas. Cada parte possui nome e peso, e o programa calcula o peso total do carro, exibindo mensagens detalhadas durante o processo de soma.

---

🎯 **Objetivo**  
Aplicar o padrão Composite para representar a hierarquia de componentes de um carro.  
Permitir que partes simples (como motor, portas) e partes compostas (como carroceria, chassi) sejam tratadas de forma uniforme.  
Exibir mensagens durante o cálculo do peso total, conforme exigido no enunciado.

---

🧠 **Padrão Composite aplicado**
- **CarPart (interface)** → componente base com métodos `getName()` e `getWeight()`.
- **SimplePart** → representa partes individuais com nome e peso.
- **CompositePart** → representa partes compostas que agregam outras `CarPart`.
- **Main** → instancia toda a estrutura do carro e calcula o peso total.

Esse padrão foi **crucial** para resolver a questão porque:
- Permite montar uma **estrutura hierárquica** flexível e escalável.
- Evita duplicação de lógica ao tratar partes simples e compostas com a mesma interface.
- Facilita a **recursividade** no cálculo do peso total.
- Garante que cada parte imprima sua contribuição com a mensagem exigida.

---

🧠 **Lógica para resolver a questão**
1. Criar interface `CarPart` com métodos para nome e peso.
2. Implementar `SimplePart` com impressão da mensagem de soma parcial.
3. Implementar `CompositePart` que agrega outras partes e soma seus pesos.
4. Montar a estrutura do carro com carroceria, chassi e trem de força.
5. Calcular o peso total chamando `getWeight()` no objeto `Carro`.

---

🛠️ **Estrutura**

```
src/
├─ Main.java
├─ CarPart.java
├─ SimplePart.java
├─ CompositePart.java
PROMPTS.md
AJUSTES.md
```

---

**Saída Esperada:**
```
Somando agora o peso de Para-lamas: 15. Total parcial: 15
Somando agora o peso de Portas: 40. Total parcial: 55
Somando agora o peso de Painéis: 25. Total parcial: 80
Somando agora o peso de Porta-malas: 30. Total parcial: 110
Somando agora o peso de Capô: 20. Total parcial: 130
Somando agora o peso de Motor: 150. Total parcial: 280
Somando agora o peso de Transmissão: 80. Total parcial: 360
Somando agora o peso de Diferencial: 60. Total parcial: 420
Somando agora o peso de Rodas: 50. Total parcial: 470
Somando agora o peso de Suspensão: 70. Total parcial: 540

Peso total do carro: 540 kg
```

---

📑 **Documentação da IA**
- `PROMPTS.md` → prompts usados e respostas resumidas.
- `AJUSTES.md` → ajustes feitos sobre as respostas da IA.

---

📌 **Histórico de commits**

- adicionar interface CarPart
- implementar SimplePart com nome e peso
- implementar CompositePart para partes compostas
- compor carroceria com partes simples
- compor trem de força com motor e transmissão
- compor chassi com trem de força e suspensão
- compor carro completo com carroceria e chassi
- adicionar Main com simulação e cálculo do peso
- documentar prompts e ajustes da IA
- adicionar README com explicações e instruções

---

👨‍💻 **Autores**  
Pedro Victor da Silva Pereira  
Valéria Cristina

---

📚 **About**  
Disciplina de padrões de projetos

---

💻 **Languages**  
Java — 100%

---
