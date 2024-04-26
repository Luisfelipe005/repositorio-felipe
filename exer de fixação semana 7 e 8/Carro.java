public class Carro {
    private String marca;

    public Carro(String marca){
        this.marca=marca;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    //TESTEEEEE
    public static void main(String[] args){
        Carro c = new Carro("Fiat");
        System.out.println("Marca Do Carro: "+c.getMarca());
    }
}
