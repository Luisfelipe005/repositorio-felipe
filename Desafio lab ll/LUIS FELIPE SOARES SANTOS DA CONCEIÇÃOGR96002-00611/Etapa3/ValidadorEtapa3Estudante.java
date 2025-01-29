package Etapa3;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ValidadorEtapa3Estudante {
    public static void main(String[] args) {
        // Códigos ANSI para colorir o texto
        String ANSI_RESET = "\u001B[0m";
        String ANSI_VERDE = "\u001B[32m";
        String ANSI_VERMELHO = "\u001B[31m";
        String ANSI_LARANJA = "\u001B[38;5;208m";

        // Impressão do cabeçalho
        System.out.println(ANSI_LARANJA + "+----------------------------------------------------------+");
        System.out.println("|                    Etapa 3 | Validador                   |");
        System.out.println("+----------------------------------------------------------+" + ANSI_RESET);

        // Validação dos componentes
        validaClasse("StaticList");
        validaAtributo("StaticList", "elements");
        validaClasse("PrincipalEtapa3"); // Substitui validação do atributo "size" pela verificação da classe "PrincipalEtapa3"
        validaMetodo("StaticList", "insert", Object.class, int.class);
        validaMetodoPublico("StaticList", "contaElementos", Object.class);
        validaMetodoPrivado("StaticList", "contaElementosRecursivo", Object.class, int.class);

        validaClasse("StaticStack");
        validaMetodo("StaticStack", "isEmpty");
        validaMetodo("StaticStack", "isFull");
        validaMetodo("StaticStack", "numElements");
        validaMetodo("StaticStack", "push", Object.class);
        validaMetodo("StaticStack", "pop");
        validaMetodo("StaticStack", "top");

        validaClasse("Etapa3");
        validaMetodo("Etapa3", "checkBrackets", Stack.class);

        // Impressão da linha de separação
        System.out.println(ANSI_LARANJA + "+----------------------------------------------------------+" + ANSI_RESET);
    }

    // Método para validar a existência de uma classe
    private static void validaClasse(String nomeClasse) {
        try {
            Class.forName("Etapa3." + nomeClasse);
            System.out.println(formatarMensagem("[OK] Classe " + nomeClasse + " encontrada.", true));
        } catch (ClassNotFoundException e) {
            System.out.println(formatarMensagem("[NOK] Classe " + nomeClasse + " não encontrada.", false));
        }
    }

    // Método para validar a existência de um método público
    private static void validaMetodoPublico(String nomeClasse, String nomeMetodo, Class<?>... parametros) {
        try {
            Class<?> classe = Class.forName("Etapa3." + nomeClasse);
            Method metodo = classe.getDeclaredMethod(nomeMetodo, parametros);
            if (Modifier.isPublic(metodo.getModifiers())) {
                System.out.println(formatarMensagem("[OK] Método " + nomeMetodo + " (público) encontrado.", true));
            } else {
                System.out.println(formatarMensagem("[NOK] Método " + nomeMetodo + " não é público.", false));
            }
        } catch (ClassNotFoundException e) {
            System.out.println(formatarMensagem("[NOK] Classe " + nomeClasse + " não encontrada.", false));
        } catch (NoSuchMethodException e) {
            System.out.println(formatarMensagem("[NOK] Método " + nomeMetodo + " não encontrado.", false));
        }
    }

    // Método para validar a existência de um método privado
    private static void validaMetodoPrivado(String nomeClasse, String nomeMetodo, Class<?>... parametros) {
        try {
            Class<?> classe = Class.forName("Etapa3." + nomeClasse);
            Method metodo = classe.getDeclaredMethod(nomeMetodo, parametros);
            if (Modifier.isPrivate(metodo.getModifiers())) {
                System.out.println(formatarMensagem("[OK] Método " + nomeMetodo + " (privado) encontrado", true));
            } else {
                System.out.println(formatarMensagem("[NOK] Método " + nomeMetodo + " não é privado.", false));
            }
        } catch (ClassNotFoundException e) {
            System.out.println(formatarMensagem("[NOK] Classe " + nomeClasse + " não encontrada.", false));
        } catch (NoSuchMethodException e) {
            System.out.println(formatarMensagem("[NOK] Método " + nomeMetodo + " não encontrado.", false));
        }
    }

    // Método para validar a existência de um método
    private static void validaMetodo(String nomeClasse, String nomeMetodo, Class<?>... parametros) {
        try {
            Class<?> classe = Class.forName("Etapa3." + nomeClasse);
            classe.getDeclaredMethod(nomeMetodo, parametros);
            System.out.println(formatarMensagem("[OK] Método " + nomeMetodo + " encontrado.", true));
        } catch (ClassNotFoundException e) {
            System.out.println(formatarMensagem("[NOK] Classe " + nomeClasse + " não encontrada.", false));
        } catch (NoSuchMethodException e) {
            System.out.println(formatarMensagem("[NOK] Método " + nomeMetodo + " não encontrado.", false));
        }
    }

    // Método para validar a existência de um atributo
    private static void validaAtributo(String nomeClasse, String nomeAtributo) {
        try {
            Class<?> classe = Class.forName("Etapa3." + nomeClasse);
            Field campo = classe.getDeclaredField(nomeAtributo);
            System.out.println(formatarMensagem("[OK] Atributo " + nomeAtributo + " encontrado.", true));
        } catch (ClassNotFoundException e) {
            System.out.println(formatarMensagem("[NOK] Classe " + nomeClasse + " não encontrada.", false));
        } catch (NoSuchFieldException e) {
            System.out.println(formatarMensagem("[NOK] Atributo " + nomeAtributo + " não encontrado.", false));
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
 
