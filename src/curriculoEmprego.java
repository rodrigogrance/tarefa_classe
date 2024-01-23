/**
 * @author rodrigo.grance
 */
public class curriculoEmprego {

    /**
     * Esta é uma classe para armazenar dados sobre curriculos de emprego de interressados.
     */

    private String nome;

    private int telefone;

    private String escolaridade;

    private String experiencia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
}
