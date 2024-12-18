package Etapa2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
public class PrincipalCandidatos {
    public static void main(String[] args) {
        try{
            Random random = new Random();
            Candidato[] candidatos = new Candidato[random.nextInt(100)+1];
            BufferedReader leitor1 = new BufferedReader(new FileReader("Etapa2/nomes.txt"));
            int posicao1 = 0;
            int tamanhoProArrayDeNomes = 0;
            String linha;
            while ((linha = leitor1.readLine()) != null){
                tamanhoProArrayDeNomes++;
            }
            BufferedReader leitor2 = new BufferedReader(new FileReader("Etapa2/nomes.txt"));
            String[] arrayDeNomes = new String[tamanhoProArrayDeNomes];
            while ((linha = leitor2.readLine()) != null){
                arrayDeNomes[posicao1++] = linha.toUpperCase();
            }
            BufferedReader leitor3 = new BufferedReader(new FileReader("Etapa2/partidos.txt"));
            String linha2;
            int posicao2 = 0;
            int tamanhoProArrayDePartido = 0;
            while ((linha2 = leitor3.readLine()) != null){
                tamanhoProArrayDePartido++;
            }
            BufferedReader leitor4 = new BufferedReader(new FileReader("Etapa2/partidos.txt"));
            String[] arrayDePartido = new String[tamanhoProArrayDePartido];
            while ((linha2 = leitor4.readLine()) != null){
                arrayDePartido[posicao2++] = linha2.toUpperCase();
            }
            for (int j = 0; j< candidatos.length; j++){
                int posicaoAleatoriaProNome = random.nextInt(posicao1 -1) + 1;
                int posicaoAleatoriaProPartido = random.nextInt(posicao2 -1 ) + 1;
                int intencoesVotos = random.nextInt(999) +1;
                candidatos[j] = new Candidato(arrayDeNomes[posicaoAleatoriaProNome],
                        arrayDePartido[posicaoAleatoriaProPartido], intencoesVotos);
            }
            Scanner scanner = new Scanner(System.in);
            OrdenarCandidatos.ordenaCandidatosPorVotos(candidatos);
            OrdenarCandidatos.ordenaCandidatosPorPartido(candidatos);
            OrdenarCandidatos.ordenaCandidatosPorNome(candidatos);

            // Imprime os candidatos na tela
            System.out.println("Lista de Candidatos: ");
            for (Candidato candidato : candidatos) {
                System.out.println(candidato);
            }

            System.out.print("Digite um nome de um candidato para procurar: ");
            String nome = scanner.nextLine().toUpperCase();
            if (OrdenarCandidatos.pesquisaBinariaCandidatos(candidatos, nome) == -1){
                System.out.println("Candidato não esta na lista!");
            }
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Processo finalizado!");
        }
    }
}
