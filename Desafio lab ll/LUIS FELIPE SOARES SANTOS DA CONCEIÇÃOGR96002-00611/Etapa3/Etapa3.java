package Etapa3;


public class Etapa3 {
    public boolean checkBrackets(Stack<Character> s1) {
        int fim = s1.numElements();
        int contadorAberto = 0;
        int contadorFechado = 0;
        for (int i = 0; i <= fim; i++) {
            if (s1.top().equals('(')) {
                contadorAberto++;
                s1.pop();
            } else if (s1.top().equals(')')) {
                contadorFechado++;
                s1.pop();
            } else {
              s1.pop();
            }

        }
        if (contadorFechado == contadorAberto)
            return true;
        return false;
    }
}
/*for (int i = 0; i < s1.numElements(); i++) {
            if (s1.top().equals('(')) {
                s2.push(s1.top());

            } else if (s1.top().equals(')')) {
                if (s2.isEmpty()) {
                    return false;
                }
                s2.pop();
            }
        }
        return s2.isEmpty();
    }*/