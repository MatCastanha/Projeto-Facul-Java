import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    double Celc=0, Fahr=0;
   
    
    System.out.println("Digite a temperatura:");
    Celc = scanner.nextDouble();

    Fahr = ((Celc * 9) / 5) + 32;

    System.out.print("A Temperatura em Fahrenheit é de: "+Fahr );
  }
  
}
