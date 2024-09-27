public class recusao {
    public static int metodo(int x) {
        if (x <= 1) {
            return 1;
        }
        return x * 2 + metodo(x - 1);
    }

    public static int metodo(int a , int b){
        if (b <= 1){
            return a;
        }
        return metodo(b, a/b);
    }
//A(m, n) = n + 1, se m = 0
//A(m, n) = A(m − 1, 1), se m != 0 e n = 0
//A(m, n) = A(m − 1, A(m, n − 1)), se m != 0 e n != 0
    public static int metodoa(int m, int n){
        if(m == 0){
            return n + 1;
        }
        else if (m != 0 & n == 0){
            return metodoa(m - 1, 1);
        }
        else if (m != 0 & n != 0){
            return metodoa(m - 1, metodoa(m, n - 1));
        }
        return m;
    }
    /*. Crie um metodo recursivo para calcular a soma dos inteiros de 1 a n, sendo n >= 1.*/
    public static int metodo1( int n) throws IllegalArgumentException {
       if(n < 1) throw new IllegalArgumentException();
       return metodo1r(n);
    }
    private static int metodo1r(int n){
        if(n == 0){
            return 1;
        }
        return n + metodo1r(n -1);
    }
    // Escreva um metodo recursivo que retorne a soma dos elementos de um array v contendo t elementos.

    public static int metodo6(int [] v) throws IllegalArgumentException{
        if(v == null) throw new IllegalArgumentException();
        return metodo6rr(v, 0);
    }
    private static int metodo6rr(int [] v, int t){
        if (t >= v.length)
            return 0;
        return v[t] + metodo6rr(v, t + 1);
    }

    public static int metodo7(int x ){
        int res;
        if (x < 4)
            res = 3 * x;
        else{ res = 2 * metodo7(x - 4) + 5;

        }
        return res;
    }
    //Implemente um metodo recursivo que verifica se uma palavra é um palíndromo (Ex.: ana, renner).
    // Para isso considere a seguinte assinatura:
    //
    //public boolean isPalindrome(char word[])
    //A palavra será passada ao metodo como um array de caracteres (parâmetro word),
    // contendo uma letra em cada posição — ex.: {‘a’, ‘n’, ‘a’}.
    public static boolean isPalindrome(char[] word ) throws IllegalArgumentException{
        if (word == null) throw new IllegalArgumentException();
        return isPalindromee(word, 0);
    }
    private static boolean isPalindromee(char [] word, int i){
        if (i >= word.length /2)
            return true;
        return word[i] == word[word.length - 1 -i] ? isPalindromee(word, i + 1) : false;
    }



    public static void main(String[] args) {
        /*System.out.println(metodo(6));
        System.out.println(metodo(5,3));
        System.out.println(metodo(15,3));
        System.out.println(metodo(28,-45));
        //System.out.println(metodoa(5,0));
        System.out.println(metodo1(5));
        int[] v = {1,2,3};
        System.out.println(metodo6(v));
        System.out.println(metodo7(2));
        System.out.println(metodo7(4));
        System.out.println(metodo7(9));*/
        //char[] word = {'r','e', 'n', 'n', 'e', 'r'};
        //System.out.println(isPalindrome(word));

    }
}
