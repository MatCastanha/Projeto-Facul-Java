// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    String nome1 = "Carlos";
    String nome2 = "João";
    String nome3 = "Lucas";

    System.out.println("Digite a idade de "+ nome1+":");
    int idade1 = scanner.nextInt();
    
    System.out.println("Digite a idade de "+ nome2+":");
    int idade2 = scanner.nextInt();
    
    System.out.println("Digite a idade de "+ nome3+":");
    int idade3 = scanner.nextInt();

    System.out.println("Digite a altura de "+ nome1+":");
    double alt1 = scanner.nextDouble();

    System.out.println("Digite a altura de "+ nome2+":");
    double alt2 = scanner.nextDouble();

    System.out.println("Digite a altura de "+ nome3+":");
    double alt3 = scanner.nextDouble();

    System.out.println("A idade de "+nome1+" é "+idade1+" e sua altura é "+ alt1);
    System.out.println("A idade de "+nome2+" é "+idade2+" e sua altura é "+ alt2);
    System.out.println("A idade de "+nome3+" é "+idade3+" e sua altura é "+ alt3);

    

    
  }

  
}
