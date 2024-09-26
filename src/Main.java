public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        No c1 = new No(9);
        No c2 = new No(2);
        No c3 = new No(11);
        No c4 = new No(1);
        No c5 = new No(3);
        No c6 = new No(12);
        No c7 = new No(7);
        
        arvore.inserir(c1);
        arvore.inserir(c2);
        arvore.inserir(c3);
        arvore.inserir(c4);
        arvore.inserir(c5);
        arvore.inserir(c6);
        arvore.inserir(c7);
         
        arvore.removerPar(c1);
        arvore.preOrdem(c1);

    }
}
