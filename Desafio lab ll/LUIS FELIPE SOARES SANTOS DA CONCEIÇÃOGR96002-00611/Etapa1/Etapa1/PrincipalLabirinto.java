package Etapa1;

public class PrincipalLabirinto {
    public static void main(String[] args) {
        Labirinto labirinto = new Labirinto();
        labirinto.criaLabirinto("Etapa1/labirinto.txt");
        System.out.println("--- Imprime labirinto inicial ---");
        labirinto.imprimeLabirinto();
        System.out.println("--- Executando a busca pela saída ---");
        System.out.println("Carregando...");
        if (labirinto.percorreLabirinto()) {
            System.out.println("--- Imprime labirinto final com destaque ---");
            System.out.println("   - Solução - ");
            labirinto.imprimeLabirinto();
            System.out.println("Solução encontrada");
        }else {
            System.out.println("Sem solução!");
        }
    }
}
