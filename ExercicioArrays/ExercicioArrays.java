import java.util.Random;
import java.util.Scanner;
public class ExercicioArrays {
    Scanner s = new Scanner(System.in);
    public void exercicio1a() {
        int [][] array = new int[3][10];
        for(int l = 0; l < array.length; l++) {
            for (int c = 0; c < array[l].length; c++) { // o [l] no array[l].length é para o array detectar
                System.out.print(array[l][c] = c);       // o tamanho da coluna
                System.out.print(" - ");
            }
            System.out.println(); // precisa desse sout pra que quebre linha a cada linha que for preeenchida, ex:
        }   //a linha 0 preenche pula pra linha de baixo e preenche a linha 1 e assim vai...
    }
    //0 1 4 9 16 25 36 49 64 81
    public void exercicio1b() {
        int[][] matriz =  new int[5][10];
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                System.out.print(matriz[l][c] = c * c);
                System.out.print(" - ");

            }
            System.out.println();
        }
    }
    public void exercicio1c() {
        int [][] matriz = new int[6][6];
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                System.out.print(matriz[l][c] = l);
                System.out.print(" - ");
            }
            System.out.println();
        }
    }
    /*
    * 1 -1 -1 -1 -1 -1
    0 0 0 0 0 0
    -1 -1 -1 -1 -1 -1
    0 0 0 0 0 0
    -1 -1 -1 -1 -1 -1
    0 0 0 0 0 0
    -1 -1 -1 -1 -1 -1
    0 0 0 0 0 0
    -1 -1 -1 -1 -1 -1*/
    public void exercicio1d() {
        int a = 1;
        int [][] matriz = new int[9][6];
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                if (l % 2 == 0) {
                    System.out.print(matriz[l][c] = -1);
                }
                else {
                    System.out.print(matriz[l][c] = 0);
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    //Exercício 2: Crie um metodo que retorna uma matriz de inteiros com números aleatórios positivos
    //menores que 100. O tamanho da matriz deve ser solicitado pelo teclado dentro do metodo.
    public void exercicio2() {
        System.out.print("Digite o numeros de linhas que a matriz vai ter: ");
        int linha = s.nextInt(); s.nextLine();
        System.out.print("Digite quantas colunas a matriz terá: ");
        int coluna = s.nextInt(); s.nextLine();
        int[][] matriz = new int[linha][coluna];
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                System.out.print(matriz[l][c] = (int) (Math.random()* 99 + 1 ));
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    //Exercício 3: Escreva um metodo que leia 10 valores double do teclado e armazene-os em uma
    //matriz de dimensões 2x5. Seu metodo deve retornar esta matriz
    public void exercicio3() {
        double [] array = new double[10];
        double [][] matriz = new double[2][5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite um número com virgula: ");
            double a = s.nextDouble(); s.nextLine();
            array[i] = a;
        }
        int i = 0;
            for (int l = 0; l < matriz.length; l++) {
                for (int c = 0; c < matriz[l].length; c++) {
                    System.out.print(matriz[l][c] = array[i]);
                    System.out.print(" - ");
                    i++;
                }
                System.out.println();
            }

    }
    //Exercício 4: Crie um metodo que recebe um array bidimensional de double e retorna a quantidade
    //de elementos deste array.
    public void exercicio4e5(double [][] matriz) {
        double quantElementos = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                quantElementos++;
            }
        }
        System.out.println(quantElementos);

    }
    //Exercício 6: Crie um metodo que recebe uma matriz de double e retorna um String de saída
    //para ela, com seus valores separados por um hífen, mas mantendo o formato da matriz. Por
    //exemplo, para a matriz de entrada abaixo:
    public String exercicio6(int [][] matriz) {
        String string = "";
        for (int l = 0; l < matriz.length; l++)
            for (int c = 0; c < matriz[l].length; c++)
                string += c == matriz[l].length - 1 ? matriz[l][c] + "\n"  : matriz[l][c] + " - "; /*Operador ternário ? ::

                                                               Este operador é uma forma compacta de if-else em uma linha.
                        Se a condição antes do ? for verdadeira (j == array[i].length-1), o código após o ? é executado.
                                                               Se a condição for falsa, o código após o : é executado.*/
        return string;
    }



    public static void main(String[] args) {
        ExercicioArrays e = new ExercicioArrays();
        //e.exercicio1a();
        //e.exercicio1b();
        //e.exercicio1c();
        //e.exercicio1d();
        //e.exercicio2();
        //e.exercicio3();
        int [][] matriz = new int[2][5];
        //e.exercicio4e5(matriz);
        System.out.println(e.exercicio6(matriz));
    }
}
