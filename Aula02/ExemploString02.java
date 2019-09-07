import javax.swing.JOptionPane;

public class ExemploString02 {

    public static void main(String[] args) {
        String nomeCompleto = "Francisco Lucas Sens";
        String nome = nomeCompleto .substring(0,9);
        String sobrenome = nomeCompleto.substring(10, 15);
        String sobrenome2 = nomeCompleto.substring(16,20);
        nomeCompleto = nomeCompleto.substring(10);
        JOptionPane.showConfirmDialog(null, nomeCompleto);
        JOptionPane.showConfirmDialog(null, nome);
        JOptionPane.showConfirmDialog(null, sobrenome);
        JOptionPane.showConfirmDialog(null, sobrenome2);
        
                     //12345678910
        String data = "01/02/2018";
        String diaTexto = data.substring(0,2);
        String mesTexto = data.substring(3,5);
        String anoTexto = data.substring(6,10);
        JOptionPane.showMessageDialog(null,diaTexto); 
        JOptionPane.showMessageDialog(null,mesTexto);
        JOptionPane.showMessageDialog(null,anoTexto);
    }

}