public class Produto {

    private String nome;
    private int quantidade;

    public void setNome(String nome)/* <--- PARAMETRO */ {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return quantidade;
    }
}