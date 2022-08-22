import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distância: ");
        double dist = scanner.nextDouble();
        System.out.print("Digite o valor da ta base: ");
        double taxa = scanner.nextDouble();
//        CalcularFreteBR freteBR = new CalcularFreteBR(dist, taxa);
//       System.out.println("R$"+freteBR.calc());
//     RelatorioFrete.exibirFrete(freteBR.calc());
        CalcularFreteBR freteBR = new CalcularFreteBR(dist,taxa);
        CalcularFreteMX freteMX = new CalcularFreteMX(dist, taxa);
        CalcularFreteDE freteDE = new CalcularFreteDE(dist,taxa);

        RelatorioFrete relatorio = new RelatorioFrete();

        relatorio.setFrete(freteBR);
        relatorio.exibirfrete();
        relatorio.tempoFrete();

        relatorio.setFrete(freteMX);
        relatorio.exibirfrete();
        relatorio.tempoFrete();
        
        relatorio.setFrete(freteDE);
        relatorio.exibirfrete();
        relatorio.tempoFrete();

        //alemanha






//        RelatorioFrete relatorioBR = new RelatorioFrete(freteBR);
//        relatorioBR.exibirfrete();
//
//        RelatorioFrete relatorioMX = new RelatorioFrete(freteMX);
//        relatorioMX.exibirfrete();
    }
}
