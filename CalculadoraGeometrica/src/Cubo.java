public class Cubo {
    double lado;

    Cubo(double lado){
        this.lado = lado;
    }
    double cubovolume(){
        return lado*3;
    }
    double areacubo(){
        return 6*(lado*lado);
    }
}
