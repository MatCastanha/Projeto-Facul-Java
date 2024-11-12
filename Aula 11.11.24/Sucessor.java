import java.util.Scanner;

public class Main {

  public static void Soma(int num, int numS){


    for(int i=num;i>=1;i--){
      System.out.print(numS+" ");
      numS++;
    }
    
  }

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int num, numS=1;

    System.out.println("Digite um numero: ");
    num = scanner.nextInt();

    Soma(num, numS);

  }

}
