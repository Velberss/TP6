public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        No c1 = new No(10);
        No c2 = new No(5);
        No c3 = new No(20);
        No c4 = new No(3);
        No c5 = new No(7);
        No c6 = new No(30);
    
        
        arvore.inserir(c1);
        arvore.inserir(c2);
        arvore.inserir(c3);
        arvore.inserir(c4);
        arvore.inserir(c5);
        arvore.inserir(c6);
         

        int a = arvore.contarNosFolhas(c1);
        System.out.println(a);

    }
}
