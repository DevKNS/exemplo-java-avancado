/**
 * Computador
 */
public class Computador {

    public String nome;
    public double preco;
    public int quantidade;
    
    public double calcularTotal(){
        return quantidade * preco;
    }
    

}