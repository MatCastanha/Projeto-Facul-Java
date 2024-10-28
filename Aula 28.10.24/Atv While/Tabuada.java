import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int Tabuada = 0, i=1, Resultado = 0;
      
    System.out.println("Escolha uma tabuada de 1 a 10");
    System.out.print("");
    Tabuada = scanner.nextInt();

    while(i<=10){
      Resultado = Tabuada * i;
      System.out.println(i +" x "+ Tabuada + " = "+ Resultado);
      i++;
    }
    
  }
  
}
