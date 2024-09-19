public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        No c1 = new No(1);
        No c2 = new No(2);
        No c3 = new No(3);
        No c4 = new No(4);
        No c5 = new No(5);
        No c6 = new No(6);
        No c7 = new No(7);
        No c8 = new No(8);
        No c9 = new No(9);
        No c10 = new No(10);
        
        arvore.inserir(c1);
        arvore.inserir(c2);
        arvore.inserir(c3);
        arvore.inserir(c4);
        arvore.inserir(c5);
        arvore.inserir(c6);  
        arvore.inserir(c7);
        arvore.inserir(c8);
        arvore.inserir(c9);  
        arvore.inserir(c10);    

        int a = arvore.contarNosFolhas(c1);
        System.out.println(a);

    }
}
