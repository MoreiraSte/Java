public class RelatorioFrete {
    private  CalcularFrete freteBR;
    private  CalcularFrete freteMX;
    private CalcularFrete frete;

    public RelatorioFrete(){

    }
    public RelatorioFrete(CalcularFreteBR freteBR){
        this.freteBR = freteBR;
    }
    public RelatorioFrete(CalcularFreteMX freteMX){
        this.freteMX = freteMX;
    }
    public RelatorioFrete(CalcularFrete frete){
        this.frete= frete;
    }
    public void exibirfrete() {
        System.out.println("O valor do frete é: R$"+ frete.calc());
    }


    //independente do país,exibir o frete utilizando esse método
//    public void exibirfrete(int paisFrete){
//      if (paisFrete == 1){
//          System.out.println("O valor do frete BR é: R$"+ freteBR.calc());
//      }
//       else if(paisFrete == 2){
//          System.out.println("O valor do frete MX é: R$" + freteMX.calc());
//      }
//       else{
//           //alemanha
//      }
//
//    }

//    public void exibirFrete(CalcularFrete frete){
//        System.out.print("O valor do frete é: R$"+ frete.calc());
//    }

    public void exibirfrete(double distancia, double valorFrete){
        CalcularFreteBR freteBR = new CalcularFreteBR(distancia, valorFrete);
        System.out.print("O valor do frete é: R$"+ freteBR.calc());
    }

    public void exibirfrete(CalcularFrete frete){
        System.out.println("O valor do frete é: R$" + frete.calc());
    }
    public void tempoFrete(){

    }
    public void setFrete(CalcularFrete frete){
        this.frete = frete;
    }




}
