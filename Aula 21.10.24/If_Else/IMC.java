// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    double peso=0, altura=0, imc=0;

    System.out.println("Digite seu peso e sua altura e saiba seu imc");
    
    System.out.println("Peso:");
    peso = scanner.nextDouble();
    
    System.out.println("Altura:");
    altura = scanner.nextDouble();

    imc = peso/(altura*altura);
    
    if(imc<18.5){
      System.out.println("Magreza");
    }
    else if(imc<24.9){
      System.out.println("Normal");
    }
    else if(imc<29.9){
      System.out.println("Sobrepeso");
    }
    else if(imc<39.9){
      System.out.println("Obesidade");
    }
    else{
      System.out.println("Obesidade Grave");
    }

  }
  
}
