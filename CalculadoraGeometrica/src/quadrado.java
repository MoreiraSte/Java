public class quadrado {
    double lado;

    quadrado(double lado){
        this.lado = lado;
    }
    double quadArea(){
        return lado*lado;
    }
    double quadPeri(){
        return 4*lado;
    }
}
