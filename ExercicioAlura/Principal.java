import java.util.*;

public class Principal {
    public static void main(String[] args) {
        System.out.println("-- Lista de Pessoas --");
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Pessoa a = new Pessoa("Luis", 19);
        Pessoa b = new Pessoa("Felipe", 10);
        Pessoa c = new Pessoa("Naiely", 19);
        pessoas.add(a);
        pessoas.add(b);
        pessoas.add(c);
        System.out.println("Tamanho da lista: " + pessoas.size());
        System.out.println("Primeira pessoa da lista: "+ pessoas.get(0));
        System.out.println(pessoas);
        System.out.println("-- Lista de Produtos --");

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        Produto p1 = new Produto("Desodorante" , 10.90, 10);
        Produto p2 = new Produto("uva" , 15.99, 10);
        Produto p3 = new Produto("laranja" , 10.99, 10);

        listaDeProdutos.add(p1);
        listaDeProdutos.add(p2);
        listaDeProdutos.add(p3);
        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        for (int i = 0; i < listaDeProdutos.size(); i++){
            System.out.println(listaDeProdutos.get(i));
        }

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Nome", 2, 5,"21/02/2000");

        listaDeProdutos.add(produtoPerecivel);
        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Agora ira aparecer o ultimo produto da lista, que é perecivel");

        System.out.println(listaDeProdutos.getLast());

        System.out.println(" ----- Exercicio 1 ----- ");
        ArrayList<String> listaDeString = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listaDeString.add(String.valueOf(i));
        }
        for(String str: listaDeString){
            System.out.println(str);
        }

        System.out.println(" ----- Exercicio 2 ----- ");

        Cachorro dog = new Cachorro("Pandora", 1, "Pinchester");
        Animal animal = dog;
        if (animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
        }
        else {
            System.out.println("Objeto não é um cachorro");
        }

        ArrayList<Produto> listaDeProdutos2 = new ArrayList<>();
        Produto pp1 = new Produto("Desodorante" , 10.90, 10);
        Produto pp2 = new Produto("uva" , 15.99, 10);
        Produto pp3 = new Produto("laranja" , 10.99, 10);

        listaDeProdutos2.add(pp1);
        listaDeProdutos2.add(pp2);
        listaDeProdutos2.add(pp3);
        double soma = 0;
        for (int i = 0; i < listaDeProdutos2.size(); i++) {
            soma += listaDeProdutos2.get(i).getPreco();
        }
        double media = soma/ listaDeString.size();
        System.out.println("Media dos preços: " + media);

        System.out.println(" ----- Exercicio 3 ----- ");
        ArrayList<Forma> listaDeForma = new ArrayList<>();
        Circulo circulo = new Circulo(9);
        Quadrado quadrado = new Quadrado(5);
        listaDeForma.add(circulo);
        listaDeForma.add(quadrado);
        for (Forma i:listaDeForma){
            System.out.println("Área: " + i.calcularArea());
        }
        System.out.println("----- Exercicio 4 -----");
        /*Crie uma lista de números inteiros e utilize o metodo Collections.sort para ordená-la em ordem crescente.
       Em seguida, imprima a lista ordenada.*/
        List<Integer> listaDeInt = new LinkedList<>();
        listaDeInt.add(1);
        listaDeInt.add(3);
        listaDeInt.add(5);
        listaDeInt.add(8);
        listaDeInt.add(2);
        listaDeInt.add(4);
        listaDeInt.add(6);
        listaDeInt.add(7);
        System.out.println(listaDeInt);
        Collections.sort(listaDeInt);
        System.out.print("Lista ordenada: ");
        System.out.println(listaDeInt);

        /*Crie uma classe Titulo com um atributo nome do tipo String.
        Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.*/
        /* crie alguns objetos da classe Titulo e adicione-os a uma lista.
        Utilize o metodo Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.*/
        System.out.println("----- Exercicio 5 -----");
        Titulo t1 = new Titulo("Homem aranha");
        Titulo t2 = new Titulo("O Espetacular Homem aranha");
        Titulo t3 = new Titulo("Homem aranha Sem volta para casa");
        Titulo t4 = new Titulo("Homem aranha Longe de casa");
        List<Titulo> listaDeHomemAranha = new LinkedList<>();
        listaDeHomemAranha.add(t1);
        listaDeHomemAranha.add(t2);
        listaDeHomemAranha.add(t3);
        listaDeHomemAranha.add(t4);
        System.out.println(listaDeHomemAranha);
        System.out.print("Lista ordenada: ");
        Collections.sort(listaDeHomemAranha);
        System.out.println(listaDeHomemAranha);


    }
}
