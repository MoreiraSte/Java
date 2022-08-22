public class BatataBK extends Batata{
    public boolean promocao;
    public char tamanho;
    public String molho;

    public BatataBK(){

    }
    public BatataBK(String nome, double peso, String cor, String origem, int quantidade, double kcal, String tipo, String nacionalidade, int tempoColheita, int tempoCozimento, boolean comestivel, boolean promocao, char tamanho, String molho) {
        super(nome, peso, cor, origem, quantidade, kcal, tipo, nacionalidade, tempoColheita, tempoCozimento, comestivel);
        Batata.totalDeBatatas++;
        this.promocao = promocao;
        this.tamanho = tamanho;
        this.molho = molho;
    }
}
