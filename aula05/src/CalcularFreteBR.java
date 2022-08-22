public class CalcularFreteBR implements CalcularFrete{
    private double distancia;
    private double valorBR;
    private double custoPneu;

    public CalcularFreteBR(){

    }

    public CalcularFreteBR(double distancia, double valorBR){
        this.distancia = distancia;
        this.valorBR = valorBR;
    }

    public double calc(){
        double total;
        custoPneu = calcularUsoPneu(distancia);
        if (distancia <= 50){
            total = 0;
        }
        else{
            total =  (distancia*valorBR)/10;
        }
        return total + custoPneu;
    }

    @Override
    public double calcICMS() {
        return 0;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public void calcSalario() {

    }

    @Override
    public double calcularUsoPneu(double distancia) {
        return custoPneu = distancia/4;
    }

    @Override
    public void verificarOleo() {

    }
}
