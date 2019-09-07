/**
 * ExemploString4
 */
public class ExemploString4 {

    public static void main(String[] args) {
        String texto = "21/03/2019";
        String[] numeros = new texto.split("/");
        int dia = Integer.parseInt(numeros[0]);
        int mes = Integer.parseInt(numeros[1]);
        int ano = Integer.parseInt(numeros[2]);
        System.out.println(dia);
        System.out.println(mes);
        System.out.println(ano);

    }
}