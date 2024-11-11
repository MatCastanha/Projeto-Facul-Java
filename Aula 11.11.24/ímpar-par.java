import java.util.Scanner;

public class Main {
  
  public static void Sla(int valor){
    if(valor%2==0){
      System.out.println(valor+" é par");
    }
    else{
      System.out.println(valor+" é ímpar");
    }
  }
  
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int valor=0;
    System.out.println("Informe um valor: ");
    valor = scanner.nextInt();

    Sla(valor);
  }
  
}
