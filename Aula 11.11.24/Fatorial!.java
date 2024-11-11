import java.util.Scanner;

public class Main {

  public static void Soma(int num){

    int fat=1, numS;
    numS = num;
    
    for(int i=num;i>1;i--){
      fat *= numS;
      numS--;
    }
    System.out.println(fat);
  }

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int num;

    System.out.println("Digite um numero: ");
    num = scanner.nextInt();
    
    Soma(num);

  }

}
