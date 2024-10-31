import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    double area=0, altura=0, base=0;
   
    
    System.out.println("A bese e a altura do retangulo");
    base = scanner.nextDouble();
    altura = scanner.nextDouble();

    area = base * altura;

    System.out.print("A área do retangulo é de: "+ area);
  }
  
}
