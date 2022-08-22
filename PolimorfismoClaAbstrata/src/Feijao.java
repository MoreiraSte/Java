public class Feijao extends Alimento {

    private String tipo;
    private String origem;


    public Feijao()
    {

    }

    @Override
    public void cozinhar() {

    }

    @Override
    public void calcKcal() {

    }

    public Feijao(String nome, double peso, String cor, String origem, int quantidade, double kcal, String tipo, String tipo1, String origem1) {
        super(nome, peso, cor, origem, quantidade, kcal, tipo);
        this.tipo = tipo1;
        this.origem = origem1;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public Feijao(String nome){
        this.nome = nome;
        nome = nome;
    }




    @Override
    public String toString() {
        return "Feijao{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", Kcal='" + getKcal() + '\'' +
                ", origem='" + origem + '\'' +
                ", quantidade=" + quantidade +
                ", tipo='" + tipo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", origem='" + origem + '\'' +
                '}';
    }
}
