public class Paralelepipedo {
    double lado;
    double largura;
    double comprimento;

    Paralelepipedo(double lado, double largura, double comprimento){
        this.lado = lado;
        this.largura = largura;
        this.comprimento = comprimento;

    }
    double volp(){
        return largura*lado*comprimento;
    }
    double areap(){
        return 2*((comprimento*lado) + (comprimento* largura) + (largura*lado));
    }
}
