import java.util.Scanner;

public class Main {
  public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

    int Nota=0, i=0, S=1, media=0;

    System.out.print("Digite Sua nota: ");
    Nota = scanner.nextInt();
    i+=Nota;

    while(Nota>0){
      System.out.print("Digite Sua nota: ");
      Nota = scanner.nextInt();
      if(Nota>0){
        i+=Nota;
        S++;
      }
    }
    
    media = i/S;
    System.out.print("Sua média é: "+ media);
  }
  
}
