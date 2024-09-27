public class TimeCampeonato {
   private String nome;
   private int saldoDeGols;

    public TimeCampeonato(String saldoDeGols, String nome) {
        this.saldoDeGols = Integer.parseInt(saldoDeGols);
        this.nome = nome;
    }

    public int getSaldoDeGols() {
        return saldoDeGols;
    }

    public void setSaldoDeGols(String saldoDeGols) {
        this.saldoDeGols = Integer.parseInt(saldoDeGols);
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "TimeCampeonato : " +
                "nome =  " + nome +
                " | saldoDeGols =  " + saldoDeGols;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
