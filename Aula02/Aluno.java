import javax.swing.JOptionPane;

/**
 * Aluno
 */
public class Aluno {
    public String nome;
    public double notaUm;
    public double notaDois;
    public double notaTres;
    public int frequencia;

    public double calcularMedia() {
        double media = 0;
        media = (notaUm + notaDois + notaTres / 3;
        if(media > 7){
            JOptionPane.showMessageDialog(null, "Aprovado");
            
        }else{
            JOptionPane.showMessageDialog(null, "Reprovado por média");
        }

        
        return media;
    }

    public void calculoFrequencia(){

        if ( > 75) {
            JOptionPane.showMessageDialog(null, "Aluno reprovado por frequência");
        } else {
            JOptionPane.showMessageDialog(null, "Aluno está aprovado em frequência");
        }

    }
    public String Mostrar(){
        JOptionPane.showMessageDialog(null, "Nome: " + aluno.nome + "/n" + "Media: " + media + "/n" + "Frequencia: " + frequencia + "/n" + calculoFrequencia);
    }
}
