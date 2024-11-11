import java.util.Scanner;

public class Main {
  
  public static void Soma(int num, int numS, int soma, int i){

    
    for(i=1;i<=num;i++){
      soma += numS;
      numS--;
    }
    System.out.println(soma);
    
  }
  
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int num, numS, i=1, soma=0;
    
    System.out.println("Digite um numero: ");
    num = scanner.nextInt();

    numS = num;

    
    Soma(num, numS, soma, i);
  
  }
  
}
