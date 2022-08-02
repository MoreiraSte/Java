public class Esfera {
    double raio;

    Esfera(double raio){
        this.raio = raio;
    }
    double esfvol(){
        return (((4/3)*(Math.PI))*(Math.pow(raio,3)));
    }
    double esfarea(){
        return  4*Math.PI*Math.pow(raio,3);
    }
}
