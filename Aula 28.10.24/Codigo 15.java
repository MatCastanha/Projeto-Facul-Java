import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int N1=0;
    
    System.out.println("Digite um numero positivo ou negativo");
    System.out.print("N1: ");
    N1 = scanner.nextInt();

    if(N1>0){
      System.out.println("O numero é positivo");
    }
    else if(N1<0){
      System.out.println("O numero é negativo");
    }
    else{
      System.out.println("O numero nulo");
    }
    
  }
  
}
