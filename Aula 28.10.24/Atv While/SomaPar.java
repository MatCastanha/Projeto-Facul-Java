import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    int i=1, soma = 0 ;
    
    while(i<=100){
      if(i%2==0){
        soma+=i;
      }
      i++;
    }
    System.out.println(soma);
  }
  
}
