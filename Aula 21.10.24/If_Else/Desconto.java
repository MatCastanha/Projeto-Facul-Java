import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    double Preco=0, Desconto=0;
      
    System.out.print("Digite O valor do produto: ");
    Preco = scanner.nextDouble();

    if(Preco<50){
      System.out.print("O preço final do produto é de: "+Preco);
    }
    else if(Preco<100){
      Desconto = Preco * 0.1;
      Preco = Preco - Desconto;
      System.out.print("O preço final do produto com 10% de desconto é de: "+Preco);
    }
    else{
      Desconto = Preco * 0.2;
      Preco = Preco - Desconto;
      System.out.print("O preço final do produto com 20% de desconto é de: "+ Preco);
    }

  }
  
}
