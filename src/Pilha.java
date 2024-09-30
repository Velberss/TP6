public class Pilha {
    private No topo;

    public Pilha() {
        this.topo = null;
    }

    public boolean vazia() {
        return (topo == null);
    }

    public void empilhar(No no) {
        no.prox = topo;
        topo = no;
    }

    public No desempilhar() {
        if (vazia()) {
            throw new RuntimeException("Pilha vazia!");
        } else {
            No aux = topo;
            topo = topo.prox;
            aux.prox = null;
            return aux;
        }
    }

    public void emOrdem(No no) {
        if (no == null) {
            return;
        }

        Pilha pilha = new Pilha();
        No aux = no;

        while (aux != null || !pilha.vazia()) {
            while (aux != null) {
                pilha.empilhar(aux);
                aux = aux.esquerda;
            }

            aux = pilha.desempilhar();
            System.out.print(aux.valor + " ");
            aux = aux.direita;
        }
    }

    public void preOrdem(No no) {
        if (no == null) {
            return;
        }

        Pilha pilha = new Pilha();
        pilha.empilhar(no);

        while (!pilha.vazia()) {
            No aux = pilha.desempilhar();
            System.out.print(aux.valor + " ");

            if (aux.direita != null) {
                pilha.empilhar(aux.direita);
            }
            if (aux.esquerda != null) {
                pilha.empilhar(aux.esquerda);
            }
        }
    }

    public void posOrdem(No no) {
        if (no == null) {
            return;
        }

        Pilha pilha1 = new Pilha();
        Pilha pilha2 = new Pilha();
        pilha1.empilhar(no);

        while (!pilha1.vazia()) {
            No aux = pilha1.desempilhar();
            pilha2.empilhar(aux); 
            if (aux.esquerda != null) {
                pilha1.empilhar(aux.esquerda);
            }
            if (aux.direita != null) {
                pilha1.empilhar(aux.direita);
            }
        }
        while (!pilha2.vazia()) {
            No aux = pilha2.desempilhar();
            System.out.print(aux.valor + " ");
        }
    }

}
