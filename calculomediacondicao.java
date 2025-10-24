public class calculomediacondicao {

public static void main(String[] args) {
        double nota1 = 6.5;
        double nota2 = 8.0;
        double nota3 = 7.5;

        double media = (nota1 + nota2 + nota3) / 3;
    
        System.out.println("Média final: " + media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
}
  }