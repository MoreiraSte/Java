public class circulo {
    double raio;

    circulo(double raio){
        this.raio = raio;
    }
    double cirPeri() {
       return 2*3.14*raio;
    }
    double circArea(){
        return 3.14*raio*raio;
    }

}
