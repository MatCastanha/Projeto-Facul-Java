import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args){
      
      Scanner scanner = new Scanner(System.in);
      Random gerador = new Random();

      int numAdivinha = gerador.nextInt(100) + 1;
      int i=1, Adivinhador=0, Tentativas=0;

      System.out.println("Adivinhe qual o numero");

      while(!(Adivinhador==numAdivinha)){
          System.out.print("N"+i+": ");
          Adivinhador = scanner.nextInt();

          if(Adivinhador>numAdivinha){
              System.out.println("Menor");
          }
          else if(Adivinhador<numAdivinha){
              System.out.println("Maior");
          }
          i++;
          Tentativas++;
      }

      System.out.println("Acertou!!!");
      System.out.println("Tentativas: "+Tentativas);
  }

}
