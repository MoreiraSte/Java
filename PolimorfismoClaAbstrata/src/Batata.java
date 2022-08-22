public class Batata extends Alimento{
    public String nacionalidade;
    public int tempoColheita;
    public int tempoCozimento;
    public boolean comestivel;

    public static int qualidade;
    public static int totalDeBatatas;

    public Batata(){

    }

    @Override
    public void cozinhar() {

    }

    public Batata(String nome, double peso, String cor, String origem, int quantidade, double kcal, String tipo, String nacionalidade, int tempoColheita, int tempoCozimento, boolean comestivel) {
        super(nome, peso, cor, origem, quantidade, kcal, tipo);
        this.nacionalidade = nacionalidade;
        this.tempoColheita = tempoColheita;
        this.tempoCozimento = tempoCozimento;
        this.comestivel = comestivel;
    }

    public Batata(String nome){
        this.nome = nome;
        nome = nome;
    }

    public void calcKcal(){
        this.setKcal(this.getKcal() * 0.3);
    }

    @Override
    public String toString() {
        return "Batata{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", cor='" + cor + '\'' +
                ", origem='" + origem + '\'' +
                ", quantidade=" + quantidade +
                ", kcal=" + getKcal() +
                ", tipo='" + tipo + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", tempoColheita=" + tempoColheita +
                ", tempoCozimento=" + tempoCozimento +
                ", comestivel=" + comestivel +
                '}';
    }
}
