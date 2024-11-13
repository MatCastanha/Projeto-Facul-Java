import java.util.Scanner;

public class Main {

  public static void S(int num, int numS){

    int i=1;
    
    while(i<=num){
      System.out.print(numS+" ");
      numS++;
      i++;
    }
    
  }

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int num, numS=1;

    System.out.println("Digite um numero: ");
    num = scanner.nextInt();

    S(num, numS);

  }

}
