public class Personagem {
    String raca;
    double vida;
    int PontosAtaque;
    int CapacidadeDefesa;
    boolean isPremium;

    public Personagem(String raca, double vida, int PontosAtaque, int CapacidadeDefesa, boolean isPremium){
        this.raca = raca;
        this.vida = vida;
        this.PontosAtaque = PontosAtaque;
        this.CapacidadeDefesa = CapacidadeDefesa;
        this.isPremium = isPremium;
    }
}
