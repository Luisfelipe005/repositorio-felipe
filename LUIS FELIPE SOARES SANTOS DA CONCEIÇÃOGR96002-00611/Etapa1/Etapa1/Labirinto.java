package Etapa1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Labirinto {
    private char PAREDE = 'X';
    private char CAMINHO_ABERTO = ' ';
    private char SAIDA = 'D';
    private char CAMINHO_SOLUCAO = '#';
    private static char[][] labirinto;

    public void criaLabirinto(String filename){
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String linha;
            labirinto = new char[7][15];
            int linhaParaOFor = 1;
            int lin = 0;
            while ((linha = br.readLine()) != null ){
                int i = 0;
                char[] ch = linha.toCharArray();
                for (int l = lin; l < linhaParaOFor; l++){
                    for (int c = 0; c < labirinto[l].length; c++){
                        labirinto[l][c] = ch[i++];
                    }
                }
                linhaParaOFor++;
                lin++;
            }
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException();
        }
        catch (IOException e) {
            System.out.println("Erro!");
        }
        finally {
            System.out.println("Processo finalizado");
        }
    }

    public boolean percorreLabirinto(){
        return resolverLabirinto(0,0);
    }

    private boolean resolverLabirinto(int x, int y) {
        if (x != labirinto.length && y != labirinto[x].length && (labirinto[x][y] == CAMINHO_ABERTO || labirinto[x][y] == SAIDA)) {

            if (labirinto[x][y] == SAIDA) {
                return true;
            }
            labirinto[x][y] = CAMINHO_SOLUCAO;
            // pra baixo
            if (resolverLabirinto(x + 1, y)) {
                return true;
            }
            // lado direito
            if (resolverLabirinto(x, y + 1)) {
                return true;
            }
            // lado esquerdo
            if (resolverLabirinto(x, y -1)){
                return true;
            }
            // pra cima
            if (resolverLabirinto(x -1, y)){
                return true;
            }
            labirinto[x][y] = CAMINHO_ABERTO;
        }
        return false;
    }

    public void imprimeLabirinto() {
        for (int l = 0; l < labirinto.length; l++) {
            for (int c = 0; c < labirinto[l].length; c++) {
                System.out.print(labirinto[l][c]);
            }
            System.out.println();
        }

    }
}
