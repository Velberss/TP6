public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Pilha pilha = new Pilha();
        No c1 = new No(9);
        No c2 = new No(2);
        No c3 = new No(11);
        No c4 = new No(1);

        
        arvore.inserir(c1);
        arvore.inserir(c2);
        arvore.inserir(c3);
        arvore.inserir(c4);
        pilha.emOrdem(c1);
    }
}
