import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int fat=1, valor=0, valorS=0;
      
    System.out.println("Digite um valor inteiro:");
    valor = scanner.nextInt();

    valorS = valor;
    
    for(int i=valor; i>1; i--){
      fat *= valorS;
      valorS--;
    }

    System.out.println(valor+"! = "+ fat);
    
  }
}
