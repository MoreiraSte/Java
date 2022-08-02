public class Nota {
    Cliente cliente;
    Item item;

    public Nota(Cliente cliente, Item item) {
        this.cliente = cliente;
        this.item = item;
    }

    @Override
    public String toString() {
        return "O cliente " + this.cliente.nome + "comprou o produto " + this.item.nome + "custando " + this.item.preco;
    }
}