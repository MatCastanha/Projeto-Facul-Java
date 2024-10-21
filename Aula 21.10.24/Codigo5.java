// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    String nome;
    int idade;
    double salario;
    
    System.out.println("Digite seu Nome, Idade e seu Sálario:");
    nome = scanner.next();
    idade = scanner.nextInt();
    salario = scanner.nextDouble();

    salario = salario + (salario * 0.3);

    System.out.println("Seu nome é "+nome );
    System.out.println("Sua altura é de "+idade );
    System.out.println("Seu salario é de "+salario );
    
  }
  
}
