public class Shooping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    
    public Shooping(String nome, Endereco endereco, int quantMax){
        this.nome = nome;
        this.endereco = endereco;
        lojas = new Loja[quantMax];
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public void setLoja(Loja[] lojas){
        this.lojas = lojas;
    }
    public String getNome(){
        return nome;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public Loja[] getLoja(){
        return lojas;
    }
    
    public boolean insereLoja(Loja loja){
     for(int i = 0; i < lojas.length; i++)
       if(lojas[i] == null){
         lojas[i] = loja;
         return true;
       }
        return false;
    }

    public boolean removeLoja(String nomeLoja){
        for(int i = 0; i < lojas.length; i++)
             if(lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)){
               lojas[i] = null;
               return true;
            }
            return false;          
    }

    public void quantidadeLojasPorTipo(String tipoLoja){
        int quantidadeDeloja = 0;
        for(int i = 0; i < lojas.length; i++)
        if(lojas[i] != null){
            if(tipoLoja.equalsIgnoreCase("Cosmetico")){
                if(lojas[i] instanceof Cosmetico){
                   quantidadeDeloja++;
             }
           }
            else if(tipoLoja.equalsIgnoreCase("Vestuario")){
                if(lojas[i] instanceof Vestuario){
                   quantidadeDeloja++;
            }
            }
            else if(tipoLoja.equalsIgnoreCase("Bijuteria")){
                if(lojas[i] instanceof Bijuteria) {
                   quantidadeDeloja++;
                }        
            }
            else if(tipoLoja.equalsIgnoreCase("Alimentacao")){
                if(lojas[i] instanceof Alimentacao){
                   quantidadeDeloja++;
                }
            }
            else if(tipoLoja.equalsIgnoreCase("Informatica")){
                if(lojas[i] instanceof Cosmetico){
                   quantidadeDeloja++;
                }
            }
            else{
                System.out.println("-1");
            }
        }
        if(quantidadeDeloja == 1)
        System.out.println("Existe " + quantidadeDeloja + "Loja Do Tipo " + tipoLoja + "Neste Shooping!");
        else{
            System.out.println("Existem " + quantidadeDeloja + "Loja Do Tipo " + tipoLoja + "Neste Shooping!");
        }
    }
    
    public void lojaSeguroMaisCaro(){
        double seguroMaisCaro = (((Informatica)lojas[0])).getSeguroEletronicos();
        for(int i = 1; i<lojas.length; i++)
        if(lojas[i] instanceof Informatica){
         if((((Informatica)lojas[i])).getSeguroEletronicos() > seguroMaisCaro){
            seguroMaisCaro = ((Informatica)lojas[i]).getSeguroEletronicos();
         }
        }
        else{
            System.out.println("null");
        }
        System.out.println("A Loja Que Paga O Seguro Mais Caro É " + seguroMaisCaro);  
    }


    @Override
    public String toString(){
        return "Nome: " + nome + "\nEndereço: " + endereco.toString() + "\nLojas: " + lojas.toString();
    }
}
/*
lojaSeguroMaisCaro: este método não recebe parâmetros 
e retorna a loja do tipo Informatica que paga o maior valor de seguro de eletrônicos do shopping.
Caso não haja lojas deste tipo, o método retorna null. */