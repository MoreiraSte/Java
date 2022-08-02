package Main;

public class Main {

    public static void main(String[] args) {

        // concat -> soma string com string
        // ex: System.out.println(minhaString.concat("!!");

        // startsWith -> pergunta sobre a String
        // ex: System.out.println(minhaString.startsWith("L"); > Começa com a letra L ? (retorna booleano)

        // endsWith -> se encerra com determinada letra
        // ex: System.out.println(minhaString.endsWith("ch"); > Começa com a letra L ? (retorna booleano)

        // toUpperCase -> letra maiuscula
        // ex: System.out.println(minhaString.toUpperCase()); > Deixa a frase maiuscula

        // equals -> compara se a String é igusl a que voce quer comparar
        // ex: System.out.println(minhaString.equals("Like a Bosch")); > Deixa a frase maiuscula
//---------------------------------------------------------------------------------------------------
        // Condição:

//        boolean conducao1 = true;
//        boolean condicao2 = 15<12;
//        String resultado;
//        double media = 4.9;
//        resultado = media>=5 ? "Aprovado":"Reprovado";
//        System.out.println(resultado);
    // System.out.println(conducao1);
    // System.out.println(condicao2);
    // (&& || !)
//----------------------------------------------------------------------------------------------------

        // if/else

   double media = 7.1;
   int faltas =20;
   boolean postura= true;
   String situacao;
   if (media>=5.0 && faltas<25 && postura){
       situacao = "Aprovado";
   }
   else if(media<5.0 && faltas<25 && postura){
       situacao = "Recuperação";
   }
   else if(media>5.0 && faltas>=25 && postura){
       situacao = "Sem férias";
   }
   else if(media>=5.0 && faltas<25 && postura==false){
       situacao="Chamar para conversar";
   }
   else{
       situacao="Reprovado";
   }
        System.out.println(situacao);
    }
}
