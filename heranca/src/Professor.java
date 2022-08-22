public class Professor extends Pessoa{
    private String nome;
    private double salario;
    private String materia;

    public Professor(String nome,double salario,String materia){
        this.materia = materia;
        this.nome = nome;
        this.salario =salario;
        System.out.println("Lindomar, informatica, 10.000");

    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
