public class Main {
    public static void main (String[]args){
        double valor;
        valor = Console.lerNumero("Digite um numero: ",5,10);
        Aluno aluno = new Aluno("Luciano","M",31,"0000");

        Aluno aluno1 = new Aluno();

        aluno.setInicial("info",10797996);
        System.out.println(aluno.getNome());
        System.out.println(aluno.getCurso()+"  "+aluno.getMatricula());
        aluno.correr();
        System.out.println("Total alunos: " +Aluno.totalAlunos);
        Professor prof = new Professor("Lindomar",10.000,"python");


    }
}
