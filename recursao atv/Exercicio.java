public static class Exercicio {
    public void metodo1(int[] array) throws IllegalArgumentException{
        if(array == null) throw new IllegalArgumentException();
        metodo1r(array, array.length);
    }
    private void metodo1r(int[] array, int i){
        if( i < array[0])
            System.out.println();
        else {
            System.out.println(array[i - 1]);
            metodo1r(array, i - 1);
        }

    }

    /*Crie um metodo recursivo que recebe um array bidimensional de double e
retorna a soma dos elementos deste array*/
    public double metodo2(double[][] matrix)throws IllegalArgumentException{
        if (matrix == null) throw new IllegalArgumentException();
        return metodo2r(matrix, 0, 0);
    }
    private double metodo2r(double[][] matrix, int linha, int coluna){
        if (linha >= matrix.length)// só vai retornar 0 quando a linha for a mesma linha que a final
            return 0;
        if (coluna >= matrix[linha].length)// como se fosse um for, só vai entrar aqui quando a coluna for maior que a
            // coluna final
            return metodo2r(matrix, linha + 1, 0);
        return matrix[linha][coluna] + metodo2r(matrix, linha , coluna + 1);
    }

    /*Crie um metodo chamado encontraPosicaoMenorValor. Este metodo deve
encontrar a posição do menor valor de um array de inteiros V (recebido por
parâmetro). Por exemplo, digamos que o array abaixo seja passado por
parâmetro:
{23, 35, 16, 8, 13, 11, 10, 20, 9, 12}
O metodo, neste caso, retornaria o valor 3*/

    public void encontraPosicaoMenorValor(int[] v) throws IllegalArgumentException{
        if (v == null) throw new IllegalArgumentException();
        encontraPosicaoMenorValor(v , 1, 0);
    }
    private void encontraPosicaoMenorValor(int [] v, int i, int posicaoMenor) {
        if (i == v.length) {
            System.out.println(posicaoMenor);
        }
        else if (v[posicaoMenor] > v[i]) {
            posicaoMenor = i;
            encontraPosicaoMenorValor(v, i + 1, posicaoMenor);
        } else {
            encontraPosicaoMenorValor(v, i + 1, posicaoMenor);
        }
    }

    /*Crie um metodo recursivo chamado printPrimaryDiagonal, que imprime a
diagonal primária de uma matriz qualquer. No metodo público, apenas a matriz
deve ser passada por parâmetro.
Não esqueça de que uma matriz só possui diagonal secundária caso ela seja uma
matriz quadrada.
Caso contrário, seu metodo deve lançar uma exceção do tipo
MatrixNotPossibleException, que deve ser criada por você.*/

    public void printPrimaryDiagonal(int[][] matriz)throws IllegalArgumentException {
        if (matriz == null) throw new IllegalArgumentException();
        if (matriz.length != matriz[0].length){
            System.out.println("não é uma matriz quadrada!!");
        }
        printPrimaryDiagonal(matriz, 0);
    }
    private void printPrimaryDiagonal(int [][] matriz, int i){
        if (i < matriz.length){
            System.out.println(matriz[i][i]);
            printPrimaryDiagonal(matriz, i +1);
        }
    }

    /*Crie um mtodo recursivo chamado binaryToDecimal, que recebe uma String
que contém um número em base 2 e retorna um número em base 10. Para isto,
você deve utilizar o mtodo de conversão abaixo:*/
    /*O valor de entrada deve ter exatamente 8 dígitos, caso contrário a conversão
não poderá ser realizada. Para converter o número de binário para decimal,
basta somar as potências de 2 das posições que estão em 1. No exemplo acima,
teríamos: 27 + 26 + 24 + 20 = 209.*/
    public int binaryToDecimal(String s)throws IllegalArgumentException{
        if (s == null || s.length() != 8)throw new IllegalArgumentException();
         return binaryToDecimal(s, 0);
    }

    private int binaryToDecimal(String s, int i){
        if (i >= s.length())
            return 0;
        char digito = s.charAt(s.length()-1-i);
        if (digito == '1') {
            return (int) (Math.pow(2, i) + binaryToDecimal(s, i + 1));
        }
        return binaryToDecimal(s , i + 1);
    }
}

public static void main(String[] args) {
   Exercicio e = new Exercicio();
   int[] array = {1,2,3,4,5,6,7,8,9,10};
    e.metodo1(array);
    int[][] matrix = new int[2][2];
    for (int l = 0; l < matrix.length; l++) {
        for (int c = 0; c < matrix[l].length; c++) {
            matrix[l][c] = 2;
            //System.out.println(matrix[l][c]);
        }
    }
    //System.out.println(e.metodo2(matrix));
    int[] v = {2,3,1,4,5,6,7,8,9,10};
    e.encontraPosicaoMenorValor(v);
    System.out.println();
    e.printPrimaryDiagonal(matrix);
    System.out.println(e.binaryToDecimal("11111111"));
}
