public class Cliente {
    private String nome;
    private int idade;
    private String sexo;
    private String email;
    private String senha;
    private Livro livro;

    public Cliente(String nome, int idade, String sexo, String email, String senha, Livro livro){
       this.nome= nome;
       this.idade = idade;
       this.sexo= sexo;
       this.email= email;
       this.senha = senha;
       this.livro= livro;
    }
    public Cliente(String nome,int idade, String sexo, String email, String senha){
        this.nome = nome;
        this.idade = idade;
        this.sexo= sexo;
        this.email= email;
        this.senha = senha;
        livro = new Livro("barbie", "naiely", 2005, 200, 40);
    }
    public Cliente(){

    }
    public String getnome(){
        return this.nome;
    }
    public int getidade(){
        return this.idade;
    }
    public String getsexo(){
        return this.sexo;  
    }
    public  String getemail(){
        return this.email;
    }
    public String getsenha(){
        return this.senha;
    }
    public Livro getlivro(){
        return this.livro;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public void setidade(int idade){
        this.idade = idade;
    }
    public void setsexo(String sexo){
        this.sexo = sexo;
    }
    public void setemail(String email){
        this.email = email;
    }
    public void setsenha(String senha){
        this.senha = senha;
    }
    public void setLivro(Livro livro){
        this.livro = livro;
    }
    public void imprimiinfo(){
        System.out.println("---Imformações Do Cliente---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Email: " + this.email);
        System.out.println("Senha: " + this.senha);
        System.out.println("Livro: " + this.livro);
    }
    @Override
    public String toString(){
        return "---informaçoes do cliente---" + "\nnome: "+ getnome() + "\nidade: " + getidade() + "\nsexo: " + getsexo() + 
        "\nemail: " + getemail() + "\nsenha: " + getsenha() + "\n" + getlivro();
    }
}
//nome, idade, sexo, email, senha e um livro (do
//tipo Livro, criado por você anteriormente).