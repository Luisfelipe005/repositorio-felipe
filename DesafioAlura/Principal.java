import java.io.IOException;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos consultar seu cep...");
        System.out.print("Digite ele aqui: ");
        String cep = scanner.nextLine();
        ConsultaCep consultaCep = new ConsultaCep();
        Endereco endereco = consultaCep.ConsultarCep(cep);
        GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
        geradorDeArquivo.GeraArquivo(endereco);
        System.out.println();
        System.out.println("CEP consultado!");
    }
}
