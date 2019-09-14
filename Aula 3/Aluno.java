import javax.swing.JOptionPane;

/**
 * Aluno
 */
public class Aluno {
    private String nome;
    private double nota;
    private String sobrenome;

    public void setNome(String nome) {
        if (nome.trim().length() < 5){
            JOptionPane.showMessageDialog(null, "Nome deve ter mais de 3 caracteres");
        }
        
        if (nome.trim().length() > 50){
            JOptionPane.showMessageDialog(null, " deve ter menos de 15 caracteres");
        }
            this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNota(double nota) {
        
        if (nota < 0){
            JOptionPane.showMessageDialog(null, "Nota deve ser maior que 0");
        }    
        if (nota > 10){
            JOptionPane.showMessageDialog(null, "Nota deve ser menor que 11 ");
        }
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setSobreNome(String sobrenome) {
        if (sobrenome.trim().length() < 5){
            JOptionPane.showMessageDialog(null, "Sobre nome deve ter mais de 3 caracteres");
        }
        
        if (sobrenome.trim().length() > 50){
            JOptionPane.showMessageDialog(null, "Sobre nome deve ter menos de 15 caracteres");
        }
    
        this.sobrenome = sobrenome;
    }

    public String getSobreNome() {
        return sobrenome;
    }

}