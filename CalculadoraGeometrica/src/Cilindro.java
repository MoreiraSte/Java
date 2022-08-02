public class Cilindro {
    double raio;
    double altura;

    Cilindro(double raio, double altura){
        this.altura = altura;
        this.raio = raio;
    }
    double volcil(){
        return Math.PI*Math.pow(raio,2)*altura;
    }
    double areacil(){
        return (altura*(2*Math.PI*raio)) + (2*Math.PI*(Math.pow(raio,2)));
    }
}
