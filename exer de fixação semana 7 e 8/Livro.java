public class Livro{
    private String titulo;
    private String autor; 
    private int anodepublicacao;
    private double preco;
    private int quantpagina;
    
    public Livro(String titulo, String autor, int anodepublicação, double preco, int quantpagina){
        this.titulo = titulo;
        this.autor = autor;
        this.anodepublicacao = anodepublicação;
        this.preco = preco;
        this.quantpagina = quantpagina;
    }
    public Livro(){

    }
    public String gettitulo(){
        return this.titulo;
    }
    public String getautor(){
        return this.autor;
    }
    public int getanodepublicacao(){
        return this.anodepublicacao;
    }
    public double getpreco(){
        return this.preco;
    }
    public int getquantpagina(){
        return this.quantpagina;
    }
    public void settitulo(String titulo){
        this.titulo = titulo;
    }
    public void setautor(String autor){
        this.autor = autor;
    }
    public void setanodepublicacao(int anodepublicacao){
        this.anodepublicacao = anodepublicacao;
    }
    public void setpreco(double preco){
        this.preco = preco;
    }
    public void setquantpagina(int quantpagina){
        this.quantpagina = quantpagina;
    }
    public double calcularprecoporpagina(){
        return  getpreco() * getquantpagina();
    }
    @Override
    public String toString(){
        return "---Informaçoes Do Livro---"+"\nTítulo: "+ gettitulo() + "\nAutor: " + getautor() + "\nAno De Publicação: "
        + getanodepublicacao() + "\nPreço: " + getpreco() + "\nQuantidade De Páginas: " + getquantpagina();
    }
}



//private String titulo;
//private String autor; 
//private int anodepublicacao;
//private double preco;
//private int quantpagina;