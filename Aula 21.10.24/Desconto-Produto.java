import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    double Valor=0, Desconto=0;
   
    
    System.out.println("Digite o Valor do produto e quanto de desconto ele tem:");
    Valor = scanner.nextDouble();
    Desconto = scanner.nextDouble();

    Desconto = Desconto / 100;

    Valor = Valor - (Valor * Desconto);
      
    System.out.print("O valor final do produto é de: "+Valor);
  }
  
}
