import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    double area=0, raio=0;
   
    
    System.out.println("Digite o raio do circulo");
    raio = scanner.nextDouble();

    area = 3.14 * (raio*raio);

    System.out.print("A área do circulo é de: "+ area);
  }
  
}
