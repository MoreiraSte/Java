import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        Personagem littleCleber = new Personagem("Programador", 500, 80, 40, true);
        Personagem dona = new Personagem("Chefe", 800, 95, 30, true);

        CampoBatalha campo = new CampoBatalha();

        if(campo.combate(dona, littleCleber) == true){
            JOptionPane.showMessageDialog(null, "Little Cleber está vivo! com " + littleCleber.vida + " de vida", "Combate", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Little Cleber está morto!", "Combate", JOptionPane.WARNING_MESSAGE);
        }
    }
}
