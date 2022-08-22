public class CampoBatalha{
    public boolean combate(Personagem atacante, Personagem atacado){
        if(atacante.PontosAtaque > atacado.CapacidadeDefesa){
            atacado.vida -= atacante.PontosAtaque;
        } else {
            atacado.CapacidadeDefesa -= (atacante.PontosAtaque / 2);
        }
        if(atacado.vida > 0){
            return true;
        } else {
            return false;
        }
    }
}