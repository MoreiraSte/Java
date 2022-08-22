public class Chocolate extends Alimento{
    public String marca;
    public double porcentagemCacau;
    public String tipo;
    public boolean diet;

    public Chocolate(){

    }

    @Override
    public void cozinhar() {

    }

    public Chocolate(String nome, double peso, String cor, String origem, int quantidade, double kcal, String tipo, String marca, double porcentagemCacau, String tipo1, boolean diet) {
        super(nome, peso, cor, origem, quantidade, kcal, tipo);
        this.marca = marca;
        this.porcentagemCacau = porcentagemCacau;
        this.tipo = tipo1;
        this.diet = diet;
    }

    public Chocolate(String nome){
        this.nome = nome;
        nome = nome;
    }

    public void calcKcal(){
        this.setKcal(this.getKcal() * 1.5);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", cor='" + cor + '\'' +
                ", origem='" + origem + '\'' +
                ", quantidade=" + quantidade +
                ", kcal=" + getKcal() +
                ", tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", porcentagemCacau=" + porcentagemCacau +
                ", tipo='" + tipo + '\'' +
                ", diet=" + diet +
                '}';
    }
}
