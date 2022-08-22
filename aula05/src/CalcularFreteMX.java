public class CalcularFreteMX implements CalcularFrete{
    private double distancia;
    private double valorMX;
    private double custoPneu;

    public CalcularFreteMX(double dist, double taxa){
        this.distancia = dist;
        this.valorMX = taxa;
    }

    @Override
    public double calc() {
        double total;
        custoPneu = calcularUsoPneu(distancia);
        if (distancia <= 100){
            total = 0;
        }
        else{
            total =  (distancia*valorMX)/5;
        }
        return total + custoPneu;
    }

    @Override
    public double calcICMS() {
        return 0;
    }


    @Override
    public void verificarOleo() {

    }

    @Override
    public double calcularUsoPneu(double distancia) {
        return distancia/4;
    }

    @Override
    public void calcSalario() {

    }
}
