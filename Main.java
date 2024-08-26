import java.sql.SQLOutput;

public class Main {
   public static void main(String[] args) {
       Arvore arvore = new Arvore();
       No novo1 = new No(10);
       No novo2 = new No(20);
       No novo3 = new No(30);
       No novo4 = new No(40);
       No novo5 = new No(50);
       No novo6 = new No(60);


       arvore.inserir(novo1);
       arvore.inserir(novo2);
       arvore.inserir(novo3);
       arvore.inserir(novo4);
       arvore.inserir(novo5);
       arvore.inserir(novo6);


       System.out.println("========================================");
       arvore.preordem();
       System.out.println("========================================");
       arvore.posordem();
       System.out.println("========================================");
       arvore.emordem();






   }
}

