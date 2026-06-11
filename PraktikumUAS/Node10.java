package PraktikumUAS;
import java.util.ArrayList;
import java.util.List;

public class Node10 {
    String data;
    List<Node10> children;
 
    public Node10(String data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
 
    public void addChild(Node10 child) {
        this.children.add(child);
    }
}
