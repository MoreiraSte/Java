import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distância: ");
        double dist = scanner.nextDouble();
        System.out.print("Digite o valor da ta base: ");
        double taxa = scanner.nextDouble();


        //O QUE EU PRECISO
        CalcularFreteBR freteBR = new CalcularFreteBR(dist,taxa);
        CalcularFreteMX freteMX = new CalcularFreteMX(dist, taxa);
        CalcularFreteDE freteDE = new CalcularFreteDE(dist, taxa);

        //UNIFICAR OS RELATÓRIOS EM UM SÓ
        //OU SEJA, INSTANCIAR O RELATÓRIO APENAS 1 VEZ
        RelatorioFrete relatorio = new RelatorioFrete();
        //relatorio.set...

        //BLOCO BRASIL
        relatorio.setFrete(freteBR);
        relatorio.exibirFrete();
        relatorio.tempoFrete();
        relatorio.setFrete(freteMX);
        relatorio.exibirFrete();
        relatorio.tempoFrete();

        //ALEMANHA
        relatorio.setFrete(freteDE);
        relatorio.exibirFrete();
        relatorio.tempoFrete();


        //AO INVÉS DE PAÍS, PODERIA TER OS MODAIS
        //SE O FRETE RODOVIÁRIO FICASSE + DE 2.000
        //A GENTE PODERIA CALCULAR O FRETE DE OUTRO MODAL PRA VERIFICAR O VALOR
        //INFORMANDO AO USUÁRIO O MENOR FRETE POSSÍVEL

        //relatorio.exibirFrete(freteMX);





//        RelatorioFrete relatorioBR = new RelatorioFrete(freteBR);
//        relatorioBR.exibirFrete(freteBR);
//
//        RelatorioFrete relatorioMX = new RelatorioFrete(freteMX);
//        relatorioMX.exibirFrete();






//        CalcularFreteBR freteBR = new CalcularFreteBR(dist, taxa);
//       System.out.println("R$"+freteBR.calc());
//     RelatorioFrete.exibirFrete(freteBR.calc());

        //relatorio.exbirFrete(frete1);



    }
}
