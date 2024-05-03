public class Produto {
    private String nome;
    private float preco;

    public Produto(){
    }
    public Produto(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }
     public String getNome(){
        return this.nome;
    }
    public float getPreco(){
        return this.preco;
    }
    public void setNome(String nome){
        this.nome= nome;
    }
    public void setPreco(float preco){
        this.preco= preco;
    }
    @Override
    public String toString(){
        return "Nome Do Produto: " + nome + "\nPreço: R$" + preco;
    }
public void main(String[] args){
    Produto produto = new Produto("tenis ous", 300);
    System.out.println(produto);
}
}    

