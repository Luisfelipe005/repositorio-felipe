public class ErroCepInexistente extends RuntimeException{
    private String menssagem;
    public ErroCepInexistente(String menssagem) {
        this.menssagem = menssagem;
    }

    public String getMenssagem() {
        return menssagem;
    }
}
