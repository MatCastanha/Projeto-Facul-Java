import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int media=0;

    System.out.print("Digite sua média: ");
    media = scanner.nextInt();

    if(media<6){
      System.out.print("Você está reprovado");
    }
    else{
      System.out.print("Você está Aprovado");
    }

  }
  
}
