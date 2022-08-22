public class RelatorioFrete {
    private  CalcularFreteBR freteBR;
    private CalcularFreteMX freteMX;
    private CalcularFrete frete;

    //PASSAR A CLASSE DO PAÍS AO INSTANCIAR
    public RelatorioFrete() {

    }

    public RelatorioFrete(CalcularFrete frete){
        this.frete = frete;
    }

//    public RelatorioFrete(CalcularFreteBR freteBR) {
//        this.freteBR = freteBR;
//    }
//
//    public RelatorioFrete(CalcularFreteMX freteMX) {
//        this.freteMX = freteMX;
//    }

    //VOU CHAMAR ESSE MÉTODO
    //COMO ELE VAI SABER QUAL PAÍS ESTÁ CHAMANDO ELE
    public void exibirFrete(){
        System.out.println("O valor do frete é: R$"+ frete.calc());
    }

//    public RelatorioFrete(CalcularFrete frete){
//        this.frete = frete;
//    }

    //INDEPENDENTE DO PAÍS, EU QUERO EXIBIR
    // O FRETE UTILIZANDO ESSE MÉTODO

    //NÃO FAÇA ISSO NUNCA!!!
//    public void exibirFrete(int paisFrete){
//        //FRETEBRASIL = TRUE
//        if(paisFrete == 1){
//            //ENTROU NO IF
//            System.out.println("O valor do frete BR é: R$"+ freteBR.calc());
//        }
//        else if(paisFrete == 2){
//            System.out.println("O valor do frete MX é: R$"+ freteMX.calc());
//        }
    
//        else{
//            //alemanha
//        }
//    }


//    public void exbirFrete(CalcularFreteBR freteBR){
//        this.freteBR = freteBR;
//        System.out.println("O valor do frete BR é: R$"+ freteBR.calc());
//    }

//    public void exbirFrete(CalcularFrete frete){
//        System.out.println("O valor do frete é: R$"+ frete.calc());
//    }

    public void  exibirFrete(double distancia, double valorFrete){
        CalcularFreteBR freteBR = new CalcularFreteBR(distancia, valorFrete);
        System.out.print("O valor do frete é: R$"+ freteBR.calc());
    }

    public void exibirFrete(CalcularFrete frete){
        System.out.println("O valor do frete é: R$"+ frete.calc());
    }

    public void tempoFrete(){

    }

    public void setFrete(CalcularFrete frete) {
        this.frete = frete;
    }


}
