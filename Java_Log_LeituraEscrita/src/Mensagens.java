public enum Mensagens {
    BemVindo("Bom dia o sol esta lindo"),
    Saida("Até nunca mais");

    private String msg;

    Mensagens(String msg) {
        this.msg = msg;
    }

    public String getMsg(){
        return msg;
    }
}
