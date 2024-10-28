import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    String User = "Matheus"; 
    int Senha = 3112;
    
    System.out.println("Digite o Usuario e Senha");
    System.out.print("User: ");
    String UserN = scanner.nextLine();
    
    System.out.print("Senha: ");
    int SenhaN = scanner.nextInt();

    if(UserN.equals(User) && SenhaN == Senha){
      System.out.println("Login Realizado");
    }
    else{
      System.out.println("Falha no Login");
    }
    
  }
  
}
