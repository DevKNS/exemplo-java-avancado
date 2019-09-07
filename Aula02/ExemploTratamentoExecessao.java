import javax.swing.JOptionPane;

public class ExemploTratamentoExecessao {

    public void solicitarIdade() {

        try {

            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));

            JOptionPane.showMessageDialog(null, "Idade " + idade);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mensagem invalida");
        }
        JOptionPane.showMessageDialog(null, "Hello");
    }

    public double solicitarSalario() {
        boolean informacaoCorreta = false;
        double salario = 0;
        while (informacaoCorreta == false) {

            try {
                String salarioTexto = JOptionPane.showInputDialog(null, "Digite o salario").replace("R$", "")
                        .replace(",", ".").replace(" ", "");
                salario = Double.parseDouble(salarioTexto);
                if (salario > 0) {
                    informacaoCorreta = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Salario deve ser positivo");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Salario deve conter numeros reais");
            }
        }
        return salario;
    }

    public void menu() {
        double salario = solicitarSalario();

    }

}