public class Aluno extends Pessoa {
    private String curso;
    private int matricula;
    private double[] notas;
    private int faltas;

    public static int totalAlunos;

    public Aluno(){
        totalAlunos++;

    }
    public Aluno (String nome,String sexo,int idade,String document){
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);
        this.setDocument(document);
        totalAlunos++;

    }
    public void correr(){
        System.out.println("Aluno correndo... ");
    }

    public void setInicial(String curso, int matricula){
        if(String.valueOf(matricula).length() < 7) {
            throw new IllegalArgumentException("Numero da matricula incorreta ");
        }
        this.matricula = matricula;
        this.curso = curso;
        }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
}
