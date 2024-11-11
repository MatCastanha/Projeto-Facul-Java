import java.util.Scanner;

public class Main {
  
  public static void Dobro(int valor){
    int dobro;
    dobro = valor * 2;

    System.out.println("O dobro de "+valor+" é: "+ dobro);

    
  }
  
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int valor=0;
    System.out.println("Informe um valor: ");
    valor = scanner.nextInt();

    Dobro(valor);
  }
  
}
