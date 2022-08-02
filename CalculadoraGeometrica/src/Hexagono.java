public class Hexagono {
    double lado;

    Hexagono(double lado){
        this.lado = lado;
    }
    double HexArea(){
        return (6*(((Math.pow(lado,2))*Math.sqrt(3))/(4.0)));
}
    double Hexperi(){
        return lado*6;
    }
}

