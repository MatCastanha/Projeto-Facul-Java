// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int N1=0,N2=0,N3=0;
      
    System.out.println("Digite 3 numeros:");
    N1 = scanner.nextInt();
    N2 = scanner.nextInt();
    N3 = scanner.nextInt();

    if(N1>N2 && N1>N3){
      System.out.println(N1 + " é o maior numero");
    }
    else if(N2>N1 && N2>N3){
       System.out.println(N2 + " é o maior numero");
    }
    else{
       System.out.println(N3 + " é o maior numero");
    }

  }
  
}
