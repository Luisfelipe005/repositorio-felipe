//Escreva um trecho de código que solicita que o usuário digite 1 valor inteiro positivo. 
//O trecho de código deve solicitar que ele digite um novo valor sempre que digitar um valor 0 ou negativo.
import java.util.Scanner;
public class Usuario {
    private int valor;

    public int getvalor(){
        return valor;
    }
    public void setvalor(int valor){
      this.valor= valor;
    }
    //TESTEEEEE
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.print("Digite Um Valor Positivo ou Diferente De 0: ");
      int valor = scanner.nextInt(); scanner.nextLine();
      
      while(valor < 1){
          System.out.print("digite um valor que seja positivo e não pode ser 0!: ");
          valor = scanner.nextInt(); scanner.nextLine();
      }
        System.out.println("seu valor é um postivo e diferente de 0");
      }  
 } 

