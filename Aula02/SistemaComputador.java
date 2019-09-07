import javax.swing.JOptionPane;

public class SistemaComputador {

    public void adcionar() {
        Computador computador = new Computador();
        computador.nome = solicitarNome();
        computador.quantidade = solicitarQuantidade();
        computador.preco = solicitarPreco();
        double total = computador.calcularTotal();
        System.out.println("Total " + total);
    }

    public String solicitarNome() {

        // min: 6, MAx:26
        boolean valido = false;
        String nome = "";
        while (valido == false) {

            nome = JOptionPane.showInputDialog("Digite o nome").trim();
            if (nome.length() >= 6 && nome.length() < 25) {
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "Nome deve conter no minimo 6 e no maximo 25 caracteres");
            }
        }
        return nome;
    }

    public int solicitarQuantidade() {
        boolean valido = false;
        int quantidade  = 0;
        do {
            try {
                quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade").trim());
                if (quantidade > 0) {
                    valido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Quantidade  deve ser positiva");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Quantidade deve ser do tipo inteiro");
            }
        } while (valido == false);

        return quantidade;
    }

    public double solicitarPreco() {
        double preco = 0;
        do {
            try {
                preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço").replace("R$", "")
                        .replace(".", ",").replace(" ", "").trim());
                if (preco <= 0) {
                    JOptionPane.showMessageDialog(null, "preço deve ser positivo");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Preço deve conter numeros reais");
            }
        } while (preco <= 0);

        return preco;
    }

}
