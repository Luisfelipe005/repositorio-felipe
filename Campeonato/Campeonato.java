import  java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Campeonato {
    private TimeCampeonato[] arrayDeTimes;

    public Campeonato(TimeCampeonato[] arrayDeTimes) {
        this.arrayDeTimes = arrayDeTimes;
    }

    public void leArquivo(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String linha;
            arrayDeTimes = new TimeCampeonato[8];
            int j = 1;
            int i = 0;
                while ((linha = br.readLine()) != null) {
                   String nova = linha.replaceAll("[x]", "").replaceAll("  ", ",").replaceAll(",", " ").replaceAll(" ", ",");
                    System.out.println(nova);
                    String[] partes = nova.split(",");
                    String time = partes[0].trim();
                    String gol = partes[1].trim();
                    String gol2 = partes[2].trim();
                    String time2 = partes[3].trim();
                    if (arrayDeTimes[i] == null) {
                        arrayDeTimes[i] = new TimeCampeonato(gol, time);
                        i++;
                        if (arrayDeTimes[i] == null){
                            arrayDeTimes[i] = new TimeCampeonato(gol2, time2);
                            i++;
                        }
                    }
                }
                int indice = 1;
                for(int a = 0; a < arrayDeTimes.length; a++){

                    System.out.println("=== TIME " +a+" ===");
                    System.out.println("Nome Do time: " + arrayDeTimes[a].getNome());
                    System.out.println("Saldo De Gol: " + arrayDeTimes[a].getSaldoDeGols());
                }
                //System.out.println(linha);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public TimeCampeonato timeMaiorSaldoGols() throws IllegalArgumentException{
           if (arrayDeTimes == null) throw new IllegalArgumentException();
           return timeMaiorSaldoGolsr(arrayDeTimes, 1, 0);
        }
        private TimeCampeonato timeMaiorSaldoGolsr(TimeCampeonato[] array, int i, int posicaoDoMaior){
        if (array[i].getNome().equalsIgnoreCase(array[posicaoDoMaior].getNome())) {
            int gol = array[posicaoDoMaior].getSaldoDeGols() + array[i].getSaldoDeGols();
            String golAtt = String.valueOf(gol);
            array[posicaoDoMaior].setSaldoDeGols(golAtt);
        }

        int maior = array[posicaoDoMaior].getSaldoDeGols();
        if (i == array.length - 1) return array[posicaoDoMaior];
        if (array[i] != null && array[i].getSaldoDeGols() > array[posicaoDoMaior].getSaldoDeGols()) { // array[i] maior
                maior = array[i].getSaldoDeGols();
                posicaoDoMaior = i;
                return timeMaiorSaldoGolsr(array, i + 1, posicaoDoMaior);
            }
        if (array[i] != null && array[i].getSaldoDeGols() < array[posicaoDoMaior].getSaldoDeGols()) {
                return timeMaiorSaldoGolsr(array, i + 1, posicaoDoMaior);
            }

            return timeMaiorSaldoGolsr(array, i + 1, posicaoDoMaior);
        }





















    }


