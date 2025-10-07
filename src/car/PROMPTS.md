Registro de uso de IA Copilot
Ferramenta utilizada: Copilot Pro 
Datas: 07/10/2025 – 08/10/2025  
Disciplina: Padrões de Projeto

---

**Prompt 1**  
**Pergunta:** 

"Faça a seguinte questão usando o padrão de projeto Composite"

"Um carro é composto por uma carroceria e um chassi. A carroceria é composta por para-lamas, portas, painéis, porta-malas e capô. Já o chassi é composto por um trem de força e suspensão. Por fim, o trem de força é composto por um motor, transmissão, diferencial e rodas. [...] Usando o padrão Composite, desenhe um diagrama de classes e codifique um programa que calcula o peso total de um carro. Sempre que o peso de uma parte do carro estiver sendo contabilizada, você deverá imprimir na tela: 'Somando agora o peso de NOME_DA_PARTE: PESO_DA_PARTE. Total parcial: SOMA_PARCIAL'"

**Resposta (resumo da IA):**  
Criar interface `CarPart` com métodos `getName()` e `getWeight()`.  
Criar classe `SimplePart` para partes individuais com nome e peso.  
Criar classe `CompositePart` para partes compostas que agregam outras `CarPart`.  
Implementar lógica de soma com impressão da mensagem exigida.  
Criar estrutura hierárquica:
- `Carro` → `Carroceria` + `Chassi`
- `Carroceria` → para-lamas, portas, painéis, porta-malas, capô
- `Chassi` → trem de força + suspensão
- `Trem de força` → motor, transmissão, diferencial, rodas  
  Criar classe `Main` que instancia tudo e imprime o peso total.

---
**Prompt 3**  
**Pergunta:**  
"Quero que gere os commits de acordo com as professoras pediram."

**Resposta (resumo da IA):**  
IA gerou plano de commits progressivos:
1. Criação da interface `CarPart`.
2. Implementação de `SimplePart`.
3. Implementação de `CompositePart`.
4. Composição da carroceria.
5. Composição do trem de força.
6. Composição do chassi.
7. Composição do carro completo.
8. Criação da classe `Main` com simulação.
9. Documentação dos prompts.
10. Adição do `README.md` com explicações e instruções de execução.
