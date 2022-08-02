public class Cone {
    double raio;
    double altura;

    Cone(double raio, double altura){
        this.altura = altura;
        this.raio = raio;
    }
    double voluco(){
        return (Math.PI*Math.pow(raio,2)*altura)/3;
    }
    double areaco(){
        return (Math.PI*Math.pow(raio,2))+(Math.PI*raio*(Math.PI*Math.pow(raio,2)));
    }
}
