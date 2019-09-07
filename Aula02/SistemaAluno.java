import javax.swing.JOptionPane;

/**
 * SistemaAluno
 */
public class SistemaAluno {

    public void adicionar() {
        Aluno aluno = new Aluno();
        aluno.nome = solicitarNome();
        aluno.notaUm = solicitarNotaUm();
        aluno.notaDois = solicitarNotaDois();
        aluno.notaTres = solicitarNotaTres();
        aluno.frequencia = solicitarFrequencia();
        Mostrar
        
    }

    public String solicitarNome() {
        String nome = "";
        boolean valido = false;

        while (valido == false) {
            nome = JOptionPane.showInputDialog("Escreva seu nome").trim();
            if (nome.length() > 3 && nome.length() < 40) {
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "Nome deve conter no minimo 3 e no máximo 40 caracteres");
            }

        }
        return nome;
    }

    public double solicitarNotaUm() {
        boolean valido = false;
        double nota1 = 0;
        while (valido == false) {

            nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Escreva sua primeira nota"));

            if (nota1 >= 0 && nota1 <= 10) {
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "Digite uma nota valida");
            }

        }
        return nota1;
    }

    public double solicitarNotaDois() {
        boolean valido = false;
        double nota2 = 0;
        while (valido == false) {
            nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Escreva sua segunda nota"));

            if (nota2 >= 0 && nota2 <= 10) {
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "Digite uma nota valida");
            }
        }
        return nota2;
    }

    public double solicitarNotaTres() {
        double nota3 = 0;
        boolean valido = false;
        while (valido == false) {
            nota3 = Double.parseDouble(JOptionPane.showInputDialog("Escreva sua terceira nota"));

            if (nota3 >= 0 && nota3 <= 10) {
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "Digite uma nota valida");
            }
        }
        return nota3;
    }

    public double solicitarFrequencia(){
        boolean valido = false;
        int quantidadeFaltas = 0;
        while (valido = false) {
            quantidadeFaltas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua quantidade de faltas"));

            if (quantidadeFaltas >= 0 && quantidadeFaltas <= 100) {
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Seu numero de faltas não é valido! Digite um numero de faltas entre 0 e 100. ");
            }
        }
        
        return quantidadeFaltas;
    }

 
    
}