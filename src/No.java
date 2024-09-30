public class No {
    int valor;
    No direita;
    No esquerda;
    No prox;

    public No(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
        this.prox = null;
    }
}