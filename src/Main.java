public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Pilha pilha = new Pilha();
        No c1 = new No(9);
        No c2 = new No(2);
        No c3 = new No(11);
        No c4 = new No(1);
        No c5 = new No(3);
        No c6 = new No(12);
        
        arvore.inserir(c4);
        arvore.inserir(c5);
        arvore.inserir(c6);
        arvore.preOrdem(c4);
        
        pilha.empilhar(c1);
        pilha.empilhar(c2);
        pilha.empilhar(c3);
        pilha.posOrdem(c1);
    }
}
