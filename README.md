# Árvore Binária - Implementação em Java

Este projeto é uma implementação de uma árvore binária em Java, com várias operações comuns, como inserção, remoção e contagem de nós. O código inclui métodos adicionais para manipulação da árvore, como inverter a árvore e remover nós com valores pares.

## Funcionalidades

- **Inserção de Nós:** Insere novos nós na árvore binária de acordo com seu valor.
- **Remoção de Nós:** Remove nós da árvore. A remoção é ajustada para três cenários: nós sem filhos, nós com um filho e nós com dois filhos.
- **Contagem de Nós:** Calcula o número total de nós, nós folhas e nós não-folhas.
- **Cálculo da Altura:** Determina a altura da árvore binária.
- **Inversão da Árvore:** Inverte a árvore binária, trocando os filhos à esquerda e à direita de todos os nós.
- **Remoção de Nós Pares:** Remove todos os nós com valores pares.
- **Percurso Pré-Ordem:** Percorre a árvore em pré-ordem, imprimindo o valor de cada nó.

## Estrutura do Código

### Classe `ArvoreBinaria`
A classe principal que contém a raiz da árvore e os métodos de manipulação de nós.

- **`inserir(No novo)`**: Insere um novo nó na árvore.
- **`removerCelula(int valor)`**: Remove um nó com o valor fornecido.
- **`preOrdem(No elemento)`**: Percorre a árvore em pré-ordem.
- **`contarNumerosDeNo(No atual)`**: Retorna o número total de nós.
- **`contarNosNãoFolhas(No atual)`**: Retorna o número de nós que não são folhas.
- **`contarNosFolhas(No atual)`**: Retorna o número de nós folha.
- **`contarAltura(No atual)`**: Calcula a altura da árvore.
- **`inverterÁrvore(No atual)`**: Inverte a árvore binária.
- **`removerPar(No atual)`**: Remove todos os nós pares.

### Classe `No`
Representa um nó individual na árvore.

- **`valor`**: O valor numérico do nó.
- **`esquerda`** e **`direita`**: Referências para os filhos esquerdo e direito do nó.
