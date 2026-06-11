package PraktikumUAS;

public class Tree10 {
    Node10 root;

    public Tree10() {
        root = new Node10("TOKO ONLINE");

        Node10 elektronik = new Node10("Elektronik");
        Node10 fashion    = new Node10("Fashion");
        Node10 makanan    = new Node10("Makanan");

        elektronik.addChild(new Node10("Smartphone"));
        elektronik.addChild(new Node10("Laptop"));

        fashion.addChild(new Node10("Pria"));
        fashion.addChild(new Node10("Wanita"));

        makanan.addChild(new Node10("Snack"));
        makanan.addChild(new Node10("Minuman"));

        root.addChild(elektronik);
        root.addChild(fashion);
        root.addChild(makanan);
    }

    public void displayLevel1() {
        System.out.println(root.data);
        for (Node10 child : root.children) {
            System.out.println("  - " + child.data);
        }
    }

    public static void main(String[] args) {
        Tree10 tree = new Tree10();
        tree.displayLevel1();
    }
}