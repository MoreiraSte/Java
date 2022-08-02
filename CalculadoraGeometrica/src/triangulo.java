public class triangulo {
    double lado;

    triangulo(double lado){
        this.lado = lado;
    }
    double triArea(){
        return (((Math.pow(lado,2))*Math.sqrt(3))/(4.0));
    }
    double triPeri(){
        return lado*3;
    }
}
