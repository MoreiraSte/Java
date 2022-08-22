public class CalcularFreteDE implements  CalcularFrete{

    private double distancia;
    private double valor;
    private double custoPneu;

    public CalcularFreteDE(double distancia, double valor){
        this.distancia =distancia;
        this.valor = valor;

    }


    @Override
    public void calcSalario() {

    }

    @Override
    public double calc() {
        double total;
        custoPneu = calcularUsoPneu(distancia);
        if (distancia <= 50){
            total = 0;
        }
        else{
            total =  (distancia*valor)/10;
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
}
