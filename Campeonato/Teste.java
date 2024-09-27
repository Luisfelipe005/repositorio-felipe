
public class Teste {
    public static void main(String[] args) {
        TimeCampeonato times = new TimeCampeonato("5", "gremio");
        TimeCampeonato time = new TimeCampeonato("2", "inter");
        TimeCampeonato[] tm = new TimeCampeonato[2];
        tm[0] = times;
        tm[1] = time;
        Campeonato cp = new Campeonato(tm);
        cp.leArquivo("timesDoCamp.txt");
        System.out.println(cp.timeMaiorSaldoGols());
    }
}
