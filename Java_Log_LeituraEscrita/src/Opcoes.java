public enum Opcoes {
    NAO (0), SIM (1);

    private int op;

    Opcoes(int op) {
        this.op = op;
    }

    public int getValue(){
        return op;
    }
}
