public class PiramideQuad {
    double lado;
    double altura;
    double alturat;
    double areab;
    double areaT;
    double areapi;


    PiramideQuad(double lado, double altura){
        this.lado = lado;
        this.altura = altura;

    }
    double areapira(){
        alturat = Math.sqrt(lado/2)+ Math.sqrt(altura);
        alturat = Math.sqrt(alturat);
        areaT = ((lado*alturat)/2)*4;
        areab = lado*lado;
        areapi = areab + areaT;
        return areapi;

    }
    double volpira(){
        return (areab*altura)/3;
    }
}

