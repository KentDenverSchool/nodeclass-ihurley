import java.util.ArrayList;

/**
 * Name: Izzy Hurley
 * Lab Name: NodeDriver
 * Lab Purpose: The goal of NodeDriver is to create a program
 * Date: 8/23/18
 * Collaborators: None
 * ON MY HONOR: IH
 */

public class NodeDriver {
    public static void main(String[] args) {
Integer f = 5;
Integer s = 6;
        ArrayList al = new ArrayList<Object>();
        al.add(f);
        al.add(s);
        Node emptyNode = new Node();
        Node objNode = new Node("alo");
        Node objNode2 = new Node(false);
        Node psNode = new Node("hello",al);


        System.out.println(emptyNode.toString());
        System.out.println("get n:" + psNode.getN());
        System.out.println("get pointers:" + psNode.getPointers());

        ArrayList nal = new ArrayList<Object>();
        String w = "one";
        String e = "next page";
        nal.add(w); nal.add(e);
        System.out.println("RESET");
        objNode.setN("reset n");
        objNode.setPointers(nal);

        System.out.println("get n:" + objNode.getN());
        System.out.println("get pointers:" + psNode.getPointers());
    }
}
