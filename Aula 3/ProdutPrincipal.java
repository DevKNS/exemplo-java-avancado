import javax.swing.JOptionPane;

public class ProdutPrincipal {

    public static void main(String[] args) {
        Produto xbox = new Produto();
        xbox.setNome("Xbox");
         xbox.setQuantidade(10);

        JOptionPane.showMessageDialog(null, "Nome: " + xbox.getNome()
         + "Quantidade: " + xbox.getQuantidade()
        );
    }
}