package Classes;
import Classes.Paciente;
import java.io.FileNotFoundException;
import java.io.IOException;


import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		
		Paciente dig1 = new Paciente(1.80,70.00);
		Paciente dig2 = new Paciente(1.70,40.00);
		Paciente dig3 = new Paciente(1.50,90.00);
		
//		System.out.println("Paciente 1: IMC: " + dig1.calcularIMC() + " Diagnůstico: " + dig1.diagnostico());
//		System.out.println("Paciente 2: IMC: " + dig2.calcularIMC() + " Diagnůstico: " + dig2.diagnostico());
//		System.out.println("Paciente 3: IMC: " + dig3.calcularIMC() + " Diagnůstico: " + dig3.diagnostico());

		JOptionPane.showMessageDialog(null, "\nPaciente 1: IMC: "+dig1.calcularIMC() +
		"\n Diagnůstico: " + dig1.diagnostico() + "\nPaciente 2: IMC: "+dig2.calcularIMC()+ " \nDiagnůstico: " +dig2.diagnostico()+
		"\nPaciente 3: IMC: " + dig3.calcularIMC() + "\n Diagnůstico: " + dig3.diagnostico());

	}

}
