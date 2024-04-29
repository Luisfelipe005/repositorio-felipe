import java.util.Scanner;
public class Teste {
    public static void main(String[] args){
        Calculadora c1 = new Calculadora(null);
        Calculadora c2 = new Calculadora(null);
        FuncionarioCaixa funcionario = new FuncionarioCaixa(c1, null, null, null);
        FuncionarioCaixa funcionario1 = new FuncionarioCaixa(c2, null, null, null);
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while(i<3){
        System.out.print("Digite Seu Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite Seu Sexo: ");
        String sexo = scanner.nextLine();
        System.out.print("Digite Seu Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Digite A Cor Da Sua Calculadora: ");
        String cor = scanner.nextLine();
        switch (i) {
            case 1:
             funcionario.setnome(nome); funcionario.setsexo(sexo); funcionario.setendereco(endereco);
             c1.setcor(cor); c1.soma(2, 2); c1.subtrai(5, 4); c1.multiplica(2, 3); c1.divide(6, 3);
             c1.elevaAoCubo(83); c1.elevaAoQuadrado(72);
             i+=1;
             continue;
            case 2:
             funcionario1.setnome(nome); funcionario1.setsexo(sexo); funcionario1.setendereco(endereco); 
             i+=1;
             break;
            }
        }
        Empresa empresa1 = new Empresa(null);
        empresa1.setfuncionario1(funcionario1);
        empresa1.setfuncionario2(funcionario); 
        System.out.print("Digite O Nome Da Empresa: ");
        String nomeEmpresa = scanner.nextLine();
        empresa1.setnome(nomeEmpresa);
        empresa1.imprimeInfo();
        scanner.close();
    }
}
//- Esta classe possui apenas o método “public static void main(String args[])”;
//- Neste método, crie um objeto do tipo FuncionarioCaixa, chamado funcionario. Tudo que for necessário para criar
//este objeto, deve ser solicitado pelo Teclado.
//- Imprima o resultado das operações: 2+2, 5-4, 2x3, 6/3, 72, 83. As operações devem ser feitas através da
//calculadora do objeto funcionário criado.
//- Neste método, crie um objeto do tipo Empresa chamado empresa1, com nome solicitado pelo usuário via
//Teclado, com o funcionário criado anteriormente e um novo funcionário que deve ser criado. Tudo que for
//necessário para criar esta empresa (que já não tenha sido criado) deve ser solicitado pelo Teclado.
//- Imprima as informações desta empresa.