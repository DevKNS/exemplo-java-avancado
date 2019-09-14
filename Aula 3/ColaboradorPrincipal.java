import javax.swing.JOptionPane;

import org.omg.CORBA.SystemException;

/**
 * colaboradorPrincipal
 */
public class ColaboradorPrincipal {

    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador();
        colaborador.setCodigo(1);
        colaborador.setNome("Kelvin");
        colaborador.setValorHora(100);
        colaborador.setQuantidadeHora(40);
        
        JOptionPane.showMessageDialog(null,
        "Código: " +  colaborador.getCodigo() + "Nome: " + colaborador.getNome() + "Quantidade de Horas: " + colaborador.getQuantidadeHora() + "Valor das Horas: " + colaborador.getValorHora() + "Salario: " + colaborador.getCodigo()
        );
        System.out.println(colaborador.getSalario());

    }
}    