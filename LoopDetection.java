import java.util.*;

class Node {
    int data;
    Node next;

    Node (int data) {
        this.data = data;
        this.next = null;
    }

}

class LinkedList {
    Node head_node;
    
    public void create_ll (List<Integer> nodes_val) {
        this.head_node = new Node(nodes_val.get(0));
        
        Node curr_node = head_node;
        
        for(int index = 1; index < nodes_val.size(); index ++){
            Node new_node = new Node(nodes_val.get(index));
            curr_node.next = new_node;
            curr_node = new_node;
        }
    }

    public void traverse() {
        Node curr_node = head_node;
        System.out.println(curr_node.data);

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(curr_node.data, curr_node.data);

        while(curr_node.next != null){
            curr_node = curr_node.next;
            if(map.containsKey(curr_node.data)){
                System.out.println("Loop detected");
                break;
            }
            System.out.println(curr_node.data);
        }
    }
}

public class LoopDetection {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.create_ll(Arrays.asList(1, 2, 3, 4 , 5, 4 , 2, 1));
        ll.traverse();
    }
}