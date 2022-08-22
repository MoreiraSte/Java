public class main {
    public static void main(String[] args) {
        Figura quad = new Figura();

//        quad.setMedidas(20,20);
//        System.out.println(quad);

        quad.criarFigura(40);
        System.out.println(quad.getArea());
        System.out.println(Figura.areaTotal());
    }
}
