import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua Cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("Digite a sigla do seu estado: ");
        String estado = scanner.nextLine();
        System.out.println("Carregando...");
        Thread.sleep(3000);
        ConsultaClima consultaClima = new ConsultaClima();
        Info info = consultaClima.consultadorDeClima(cidade, estado);
        GeraArq geraArq = new GeraArq();
        geraArq.geraArquivo(info);
        System.out.println(info.retorna());
        scanner.close();
    }
}
