import sun.security.util.Length;

/**
 * Empresa
 */
public class Empresa {
    private String razaoSocial;
    private String cnpj;
    private String faturamento;

    public void setFaturamento(double faturamento) {
        if (faturamento < 0) {
            throw new IllegalArgumentException("Faturamento deve ser maior que 0");
        }
        this.faturamento = faturamento;
    }

    public double Faturamento() {
        return faturamento;
    }

    public void setRazaoSocial(String razaoSocial) {
        if (razaoSocial == null) {
            throw new IllegalArgumentException("Razão Social não pode ser nula");
        }
        if (razaoSocial.trim().equals("")) {
            throw new IllegalArgumentException("Razão Social deve ser preenchida");
        }
        if (razaoSocial.trim().length() < 3) {
            throw new IllegalArgumentException("Razão Social deve conter no mínimo 3 caracteres");
        }
        if (razaoSocial.trim().length() > 40) {
            throw new IllegalArgumentException("Razão social deve conter no máximo 40 caracteres");
        }
        this.razaoSocial = razaoSocial;

    }

    public String getRazaoSocial() {

        return razaoSocial;
    }

    public void setCNPJ(String cnpj) {
        if (cnpj == null) {
            throw new IllegalArgumentException("CNPJ não pode ser nulo");
        }
        if (cnpj.trim().length() < 18) {
            throw new IllegalArgumentException("CNPJ deve conter no minimo 18 caracteres");
        }
        if (cnpj.trim().length() > 18) {
            throw new IllegalArgumentException("CNPJ deve conter no maximo 18 caracteres");
        }
        this.cnpj = cnpj;
    }

    public String getCNPJ() {
        return cnpj;
    }

}