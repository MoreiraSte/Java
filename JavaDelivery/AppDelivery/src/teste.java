public class teste {
    public static void main(String[] args) {
        Cliente c = new Cliente("Cleber");
        Item i = new Item("Notebook",5000);
        Nota n = new Nota(c,i);
        System.out.println(n.toString());
        Cliente c2 = new Cliente("Leo");
        Item i2 = new Item("Computador",5000);
        Nota n2 = new Nota(c2,i2);
        System.out.println(n2.toString());

    }
}
