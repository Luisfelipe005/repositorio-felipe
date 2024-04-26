//Sabendo que uma classe chamada Pessoa possui um atributo idade e métodos de acesso, 
//complete o código abaixo para que uma das mensagens a seguir sejam impressas na tela: 
//"Menor de idade" (caso tenha menos que 18 anos) ou "Maior de idade" (caso tenha 18 anos ou mais).
import java.util.Scanner;
public class Pessoa {
    private int idade;

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }
    //TESTEEEEE
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite Sua Idade: ");
    int idade = scanner.nextInt();
    scanner.close();
    Pessoa p = new Pessoa();
     if(idade>=18)
        System.out.println("Você Tem 18 Ou É Maior de 18!");
     else 
     System.out.println("Você Não É Maior De 18!");
     p.setIdade(idade);
    System.out.println("Sua Idade É "+ p.getIdade());
    }
}
