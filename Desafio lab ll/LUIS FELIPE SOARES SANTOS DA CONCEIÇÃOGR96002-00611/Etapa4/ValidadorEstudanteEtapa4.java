package Etapa4;

import java.lang.reflect.Field;

public class ValidadorEstudanteEtapa4 {
    public static void main(String[] args) {
        // Códigos ANSI para colorir o texto
        String ANSI_RESET = "\u001B[0m";
        String ANSI_VERDE = "\u001B[32m";
        String ANSI_VERMELHO = "\u001B[31m";
        String ANSI_LARANJA = "\u001B[38;5;208m";

        // Impressão do cabeçalho
        System.out.println(ANSI_LARANJA + "+----------------------------------------------------------+");
        System.out.println("|                    Etapa 4 | Validador                   |");
        System.out.println("+----------------------------------------------------------+" + ANSI_RESET);

        // Validação das classes e métodos
        validaClasse("LinkedStack");
        validaMetodo("LinkedStack", "isEmpty");
        validaMetodo("LinkedStack", "isFull");
        validaMetodo("LinkedStack", "numElements");
        validaMetodo("LinkedStack", "push", Object.class);
        validaMetodo("LinkedStack", "pop");
        validaMetodo("LinkedStack", "top");

        validaClasse("LinkedQueue");
        validaMetodo("LinkedQueue", "isEmpty");
        validaMetodo("LinkedQueue", "isFull");
        validaMetodo("LinkedQueue", "numElements");
        validaMetodo("LinkedQueue", "enqueue", Object.class);
        validaMetodo("LinkedQueue", "dequeue");
        validaMetodo("LinkedQueue", "front");
        validaMetodo("LinkedQueue", "back");

        // Validação da estrutura encadeada (uso da classe Node)
        validaEncadeamento("LinkedStack");
        validaEncadeamento("LinkedQueue");

        // Validação da classe PrincipalEtapa4
        validaClasse("PrincipalEtapa4");

        // Impressão da linha de separação
        System.out.println(ANSI_LARANJA + "+----------------------------------------------------------+" + ANSI_RESET);
    }

    // Método para validar a existência de uma classe
    private static void validaClasse(String nomeClasse) {
        try {
            Class.forName("Etapa4." + nomeClasse);
            System.out.println(formatarMensagem("[OK] Classe " + nomeClasse + " encontrada.", true));
        } catch (ClassNotFoundException e) {
            System.out.println(formatarMensagem("[NOK] Classe " + nomeClasse + " não encontrada.", false));
        }
    }

    // Método para validar a existência de um método
    private static void validaMetodo(String nomeClasse, String nomeMetodo, Class<?>... parametros) {
        try {
            Class<?> classe = Class.forName("Etapa4." + nomeClasse);
            classe.getDeclaredMethod(nomeMetodo, parametros);
            System.out.println(formatarMensagem("[OK] Método " + nomeMetodo + " encontrado.", true));
        } catch (ClassNotFoundException e) {
            System.out.println(formatarMensagem("[NOK] Classe " + nomeClasse + " não encontrada.", false));
        } catch (NoSuchMethodException e) {
            System.out.println(formatarMensagem("[NOK] Método " + nomeMetodo + " não encontrado.", false));
        }
    }

    // Método para validar a existência de um atributo do tipo Node (encadeamento)
    private static void validaEncadeamento(String nomeClasse) {
        try {
            Class<?> classe = Class.forName("Etapa4." + nomeClasse);
            
            // Verificar se há algum atributo do tipo Node
            boolean usaNode = false;
            for (Field field : classe.getDeclaredFields()) {
                if (field.getType().getSimpleName().equals("Node")) {
                    usaNode = true;
                    break;
                }
            }

            if (usaNode) {
                System.out.println(formatarMensagem("[OK] Classe " + nomeClasse + " usa estrutura encadeada (Node).", true));
            } else {
                System.out.println(formatarMensagem("[NOK] Classe " + nomeClasse + " não usa estrutura encadeada (Node).", false));
            }
        } catch (ClassNotFoundException e) {
            System.out.println(formatarMensagem("[NOK] Classe " + nomeClasse + " não encontrada.", false));
        }
    }

    // Método para formatar mensagens com cores
    private static String formatarMensagem(String mensagem, boolean ok) {
        String ANSI_VERDE = "\u001B[32m";
        String ANSI_VERMELHO = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";
        return String.format((ok ? ANSI_VERDE : ANSI_VERMELHO) + "| %-56s |" + ANSI_RESET, mensagem);
    }
}
