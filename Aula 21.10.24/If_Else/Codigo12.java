// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int Num=0;

    System.out.print("Digite um numero: ");
    Num = scanner.nextInt();

    if(Num%2==0){
      System.out.print(Num + " é par");
    }
    else{
      System.out.print(Num +" é impar");
    }

  }
  
}
