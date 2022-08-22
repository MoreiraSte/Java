import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		
	     
		Double raio = Double.parseDouble(JOptionPane.showInputDialog(null,"Raio: "));

		
		Double dia = Double.parseDouble(JOptionPane.showInputDialog(null,"Diametro: "));
		
		double circ = 2 * Math.PI * raio;
		double area = Math.PI * raio* raio;

		DecimalFormat deci = new DecimalFormat("#.00");
		
	
		JOptionPane.showMessageDialog(null, "\nDiametro: "+ dia +
				"\n Circunferencia: " + circ + "\nArea: "+area);
		

	}
}
