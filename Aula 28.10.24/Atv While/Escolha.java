import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    String Opcao="",RolarD20="RolarD20",Soma="Soma",Sair="Sair";
    int Number = random.nextInt(20) + 1;
    int num1=0, num2=0;
    
    System.out.println("RolarD20\nSoma\nSair");
    
    while(!Opcao.equals(Sair)){
        System.out.println("Escolha Uma das Opções a cima:");
        Opcao = scanner.next();

        if(Opcao.equals(RolarD20)){
        System.out.println(Number);
        }
          
        else if(Opcao.equals(Soma)){
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextInt();
        
        System.out.println("Resultado da soma: " + (num1 + num2));       
        }
        
        else if(!Opcao.equals(Sair)){
          System.out.println("Opção Invalida, Tente novamente");
        }
    }
      
    System.out.println("Programa Fechado");
      
  }

}
