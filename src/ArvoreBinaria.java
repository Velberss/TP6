public class ArvoreBinaria {
    No raiz;

    ArvoreBinaria() {
        raiz = null;
    }

    private No InserirNovo(No novo, No atual) {
        if (atual == null)
            return novo;
        if (atual.valor > novo.valor) {
            atual.esquerda = InserirNovo(novo, atual.esquerda);
        } else
            atual.direita = InserirNovo(novo, atual.direita);
        return atual;
    }

    public void inserir(No novo) {
        raiz = InserirNovo(novo, raiz);
    }

    public void preOrdem(No elemento) {
        if (elemento != null) {
            System.out.println(elemento.valor + "\n");
            preOrdem(elemento.esquerda);
            preOrdem(elemento.direita);
        }
    }

    public No encontrarElemento(No atual, int valor) {
        if (atual == null) {
            return null;
        }
        if (valor > atual.valor) {
            if (atual.direita != null) {
                if (atual.direita.valor == valor) {
                    return atual;
                }
            }
        } else {
            if (atual.esquerda != null) {
                if (atual.esquerda.valor == valor) {
                    return atual;
                }
            }
        }
        if (atual.valor > valor) {
            return encontrarElemento(atual.direita, valor);
        }
        if (atual.valor < valor) {
            return encontrarElemento(atual.esquerda, valor);
        }
        return atual;
    }

    public void removerCelula(int valor) {
        if (raiz == null) {
            System.out.println("Árvore vazia!");
        } else {
            No pai = null;
            No noX = raiz;

            while (noX != null && noX.valor != valor) {
                pai = noX;
                if (valor < noX.valor) {
                    noX = noX.esquerda;
                } else {
                    noX = noX.direita;
                }
            }

            if (noX == null) {
                System.out.println("Valor não encontrado na árvore!");
                return;
            }

            if (noX.esquerda == null && noX.direita == null) {
                if (noX == raiz) {
                    raiz = null;
                } else if (pai.esquerda == noX) {
                    pai.esquerda = null;
                } else {
                    pai.direita = null;
                }
            }

            else if (noX.esquerda == null || noX.direita == null) {
                No filho = (noX.esquerda != null) ? noX.esquerda : noX.direita;
                if (noX == raiz) {
                    raiz = filho;
                } else if (pai.esquerda == noX) {
                    pai.esquerda = filho;
                } else {
                    pai.direita = filho;
                }
            }

            else {
                No noPaiDireitaEsquerda = maisEsquerdaPossivel(noX, noX.direita);
                No substituto = noPaiDireitaEsquerda.esquerda;
                noPaiDireitaEsquerda.esquerda = substituto.direita;

                substituto.esquerda = noX.esquerda;
                substituto.direita = noX.direita;

                if (noX == raiz) {
                    raiz = substituto;
                } else if (pai.esquerda == noX) {
                    pai.esquerda = substituto;
                } else {
                    pai.direita = substituto;
                }
            }
            noX.esquerda = null;
            noX.direita = null;
        }
    }

    private No maisEsquerdaPossivel(No pai, No filhoAtual) {
        if (filhoAtual.esquerda == null)
            return pai;
        return maisEsquerdaPossivel(filhoAtual, filhoAtual.esquerda);
    }

    public int contarNumerosDeNo(No atual) {
        if (atual == null) {
            return (0);
        } else {
            return 1 + (contarNumerosDeNo(atual.esquerda) + contarNumerosDeNo(atual.direita));
        }
    }

    public int contarNosNãoFolhas(No atual) {
        if (atual == null) {
            return 0;
        }
        if (atual.esquerda == null && atual.direita == null) {
            return 0;
        }
        return 1 + contarNosNãoFolhas(atual.esquerda) + contarNosNãoFolhas(atual.direita);
    }

    public int contarNosFolhas(No atual) {
        if (atual == null) {
            return 0;
        }
        if (atual.esquerda == null && atual.direita == null) {
            return 1;
        }
        return contarNosFolhas(atual.esquerda) + contarNosFolhas(atual.direita);
    }

    public int contarAltura(No atual) {
        if (atual == null) {
            return -0;
        } else {
            int altEsquerda = contarAltura(atual.esquerda);
            int altDireita = contarAltura(atual.direita);

            return 1 + Math.max(altEsquerda, altDireita);
        }
    }

    public void inverterÁrvore(No atual) {
        No aux;
        if (atual == null) {
            return;
        }

        aux = atual.esquerda;
        atual.esquerda = atual.direita;
        atual.direita = aux;

        inverterÁrvore(atual.esquerda);
        inverterÁrvore(atual.direita);
    }
}
