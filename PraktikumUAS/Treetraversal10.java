package PraktikumUAS;
import java.util.ArrayList;
import java.util.List;

public class Treetraversal10 {
    Node10 root;
    List<String> hasil;

    public Treetraversal10() {
        hasil = new ArrayList<>();

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

    
    public void preOrder(Node10 node) {
        if (node == null) return;
        hasil.add(node.data);
        for (Node10 child : node.children) {
            preOrder(child);
        }
    }

    public void tampilkan() {
        preOrder(root);
        System.out.println(String.join(" -> ", hasil));
    }

    public static void main(String[] args) {
        Treetraversal10 tree = new Treetraversal10();
        tree.tampilkan();
    }
}
