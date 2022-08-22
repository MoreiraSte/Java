public class Figura {
    private float altura;
    private float largura;
    private float area;
    public static float areaTotal;


public Figura(){

}

    public void setMedidas( float altura, float largura) {
        if(largura < 0){
            throw new IllegalArgumentException("A largura nao pode ser inferior a 0");

        }
        if(altura < 0){
            throw new IllegalArgumentException("A altura nao pode ser inferior a 0");

        }
        this.altura = altura;
        this.largura = largura;
    }

    public void criarFigura (float altura){
        this.altura=altura;
        this.largura=altura;
    }
    public void criarFigura (float altura, float largura){
        this.largura=largura;
        this.altura=altura;
    }
    public float getArea() {
        areaTotal = altura*largura;
        return area = altura*largura;

    }

    public void setArea(float area) {
        this.area = area;
    }
}

