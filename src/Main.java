public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        No c1 = new No(1);
        No c2 = new No(2);
        No c3 = new No(3);
      
        arvore.inserir(c1);
        arvore.inserir(c2);
        arvore.inserir(c3);

        
        arvore.contarNo(c1);

    }
}
