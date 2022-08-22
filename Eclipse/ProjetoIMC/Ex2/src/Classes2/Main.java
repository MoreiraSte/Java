package Classes2;

import Classes2.Paciente;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Paciente dig1 = new Paciente();
		Paciente dig2 = new Paciente();
		Paciente dig3 = new Paciente();
		
		dig1.getValoresPaciente();
		dig1.calcularIMC();
		dig1.diagnostico();
		
		dig2.getValoresPaciente();
		dig2.calcularIMC();
		dig2.diagnostico();
		
		dig3.getValoresPaciente();
		dig3.calcularIMC();
		dig3.diagnostico();
		
		JOptionPane.showMessageDialog(null, "\nPaciente 1: IMC: "+dig1.calcularIMC() +
				"\n Diagnóstico: " + dig1.diagnostico() + "\nPaciente 2: IMC: "+dig2.calcularIMC()+ " \nDiagnóstico: " +dig2.diagnostico()+
				"\nPaciente 3: IMC: " + dig3.calcularIMC() + "\n Diagnóstico: " + dig3.diagnostico());
		
		
		
	}

}
