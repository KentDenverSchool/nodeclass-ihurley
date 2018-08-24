
import java.util.ArrayList;

/**
 * Name: Izzy Hurley
 * Lab Name: Node
 * Lab Purpose: The goal of Node is to create a program
 * Date: 8/23/18
 * Collaborators: None
 * ON MY HONOR: IH
 */

public class Node {
    private Object n;
    private ArrayList pointers;

    public Node() {n=null;  pointers = new ArrayList<>();}
    public Node(Object obj){n=obj; pointers = new ArrayList<>();}
    public Node(Object obj,ArrayList pointers){n=obj; this.pointers = pointers;}


    public ArrayList getPointers() {
        return pointers;
    }

    public Object getN() {
        return n;
    }

    public void setN(Object n) {
        this.n = n;
    }
////FIX THIS ????
    public void setPointers(ArrayList pointers) { this.pointers = pointers;
    }

    public String toString() {
        if (n==(null)|| pointers.size()==0){return "null object or no pointers";}
        return n.toString() + "\n" + pointers.toString();
    }
}
