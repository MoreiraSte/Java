import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        try {
            while (true) {
                int forma = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção: " +
                        "\n 1-Circulo\n2-Quadrado\n3-Triangulo\n4-Hexagono\n5-Retangulo\n6-cubo\n7-Esfera\n8-Piramide" +
                        "\n9-paralelepipedo\n10-cilindro\n11-cone"));

                switch (forma) {
                    case 1:
                        circulo cir = new circulo(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do raio: ")));
                        if(cir.raio <0){
                            JOptionPane.showMessageDialog(null,"Digite apenas numeros positivos");
                            break;
                        }

                        JOptionPane.showMessageDialog (null, "Circulo\n" + "Area:\n" + cir.circArea() + "\nVolume:\n" + cir.cirPeri() );


                        continue;
                    case 2:
                        quadrado quad = new quadrado(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do lado: ")));
                        if(quad.lado <0){
                            JOptionPane.showMessageDialog(null,"Digite apenas numeros positivos");
                            break;

                        }

                        JOptionPane.showMessageDialog (null, "Quadrado\n" + "Area:\n" + quad.quadArea() + "\nVolume:\n" + quad.quadPeri());

                        continue;
                    case 3:
                        triangulo tri = new triangulo(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do lado: ")));
                        if(tri.lado <0){
                            JOptionPane.showMessageDialog(null,"Digite apenas numeros positivos");
                            break;
                        }

                        JOptionPane.showMessageDialog (null, "Triangulo\n" + "Area:\n" + tri.triArea() + "\nVolume:\n" + tri.triPeri());

                        continue;
                    case 4:
                        Hexagono hex = new Hexagono(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do lado: ")));
                        if(hex.lado <0){
                            JOptionPane.showMessageDialog(null,"Digite apenas numeros positivos");
                            break;

                        }
                        JOptionPane.showMessageDialog (null, "Hexagono\n" + "Area:\n" + hex.HexArea() + "\nVolume:\n" + hex.Hexperi() );

                        continue;
                    case 5:
                        Retangulo ret = new Retangulo(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do lado1: ")), Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do lado2: ")));
                        if(ret.lado1 <0 && ret.lado2 <0){
                            JOptionPane.showMessageDialog(null,"Digite apenas numeros positivos");
                            break;

                        }
                        JOptionPane.showMessageDialog (null, "Retangulo\n" + "Area:\n" + ret.retarea() + "\nVolume:\n" + ret.retperi());

                        continue;
                    case 6:
                        Cubo cub = new Cubo(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do lado: ")));
                        if(cub.lado <0){
                            JOptionPane.showMessageDialog(null,"Digite apenas numeros positivos");
                            break;
                        }
                        JOptionPane.showMessageDialog (null, "Cubo\n" + "Area:\n" + cub.cubovolume() + "\nVolume:\n" + cub.areacubo() );

                        continue;
                    case 7:
                        Esfera esf = new Esfera(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do lado: ")));
                        if(esf.raio <0){
                            JOptionPane.showMessageDialog(null,"Digite apenas numeros positivos");
                            break;
                        }
                        JOptionPane.showMessageDialog (null, "Esfera\n" + "Area:\n" + esf.esfarea() + "\nVolume:\n" + esf.esfvol() );

                        continue;
                    case 8:
                        PiramideQuad pira = new PiramideQuad(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do lado: ")), Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do altura: ")));
                        if(pira.lado <0 && pira.altura <0 && pira.alturat <0 && pira.areab <0 && pira.areaT <0 && pira.areapi <0){
                            JOptionPane.showMessageDialog(null,"Digite apenas numeros positivos");
                            break;
                        }
                        JOptionPane.showMessageDialog (null, "Piramide de Base Quadrada\n" + "Area:\n" + pira.areapira() + "\nVolume:\n" + pira.volpira() );


                        continue;
                    case 9:
                        Paralelepipedo para = new Paralelepipedo(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do lado: ")), Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do largura: ")), Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do comprimento")));
                        if(para.lado <0 && para.largura < 0 && para.comprimento <0){
                            JOptionPane.showMessageDialog(null,"Digite apenas numeros positivos");
                            break;
                        }
                        JOptionPane.showMessageDialog (null, "Paralelepipedo\n" + "Area:\n" + para.areap() + "\nVolume:\n" + para.volp() );

                        continue;
                    case 10:
                        Cilindro cili = new Cilindro(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do raio: ")), Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do altura: ")));
                        if(cili.raio <0 && cili.altura < 0){
                            JOptionPane.showMessageDialog(null,"Digite apenas numeros positivos");
                            break;
                        }
                        JOptionPane.showMessageDialog (null, "Cilindro\n" + "Area:\n" + cili.areacil() + "\nVolume:\n" + cili.volcil() );

                        continue;
                    case 11:
                        Cone con = new Cone(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do raio: ")), Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do altura: ")));
                        if(con.raio <0 && con.altura < 0){
                            JOptionPane.showMessageDialog(null,"Digite apenas numeros positivos");
                            break;
                        }
                        JOptionPane.showMessageDialog (null, "Cone\n" + "Area:\n" + con.areaco() + "\nVolume:\n" + con.voluco() );

                }
            }
        }catch (NumberFormatException e){

            JOptionPane.showMessageDialog(null, "Valor Inválido!!", "Atenção!",JOptionPane.WARNING_MESSAGE);

        }

    }
}
