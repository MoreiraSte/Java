import java.util.Date;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private double peso;
    private String document;
    private Date datNasc;

    public Pessoa(){
        System.out.println("Criamos uma pessoa");
    }


    public Pessoa(String nome, int idade, String sexo, double peso,String document, Date datNasc){

    }
    public void correr(){
        System.out.println("Pessoa correndo...");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0){
            throw new IllegalArgumentException("A idade deve ser maior que 0");
        }
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Date getDatNasc() {
        return datNasc;
    }

    public void setDatNasc(Date datNasc) {
        this.datNasc = datNasc;
    }
}
