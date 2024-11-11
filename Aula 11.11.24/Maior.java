import java.util.Scanner;

public class Main {
  
  public static void Maior(int num1, int num2){
    
    if(num1>num2){
      System.out.println("N1("+num1+") é maior que N2("+ num2+")");
    }
    else if(num2>num1) {
      System.out.println("N2("+num2+") é maior que N1("+ num1+")");
    }
  }
  
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int num1, num2;
    
    System.out.println("Digite um numero: ");
    num1 = scanner.nextInt();
    
    System.out.println("Digite outro numero: ");
    num2 = scanner.nextInt();

    Maior(num1, num2);
    
  }
  
}
