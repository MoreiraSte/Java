public class Retangulo {
    double lado1;
    double lado2;

    Retangulo(double lado1,double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    double retarea(){
        return lado1*lado2;
    }
    double retperi(){
        return lado1+lado2+lado1+lado2;
    }
}
