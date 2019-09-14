import javax.swing.JOptionPane;

/**
 * SistemaAluno
 */
public class SistemaAluno {

    public void adicionar(){
        Aluno aluno = new Aluno();
        boolean valido = false;
        do{
            try{
                aluno.setNome(JOptionPane.showInputDialog(null,"Digite o nome do aluno"));
                valido = true;
            }catch(IllegalArgumentException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }while(valido == false);
        valido = false;
        do{
            try{
                aluno.setNota(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota do aluno")));
                valido = true;
            }catch(IllegalArgumentException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }while(valido == false);
        valido = false;
        do{
            try{
                aluno.setSobreNome(JOptionPane.showInputDialog(null,"Digite a sobre nome do aluno"));
                valido = true;
            }catch(IllegalArgumentException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }while(valido == false);
        System.out.println("Nome: " + aluno.getNome() + "\nNota: " + aluno.getNota() + "\nSobre nome: " + 
        aluno.getSobreNome()
        );
    }
}
