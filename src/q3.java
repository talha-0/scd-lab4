import java.util.HashSet;

public class q3 {
    static <T> Node<T> detect_loop(Node<T> h){
        HashSet<Node<T>> set = new HashSet<>();
        Node<T> temp = h;
        while(temp != null){
            if(set.contains(temp))
                return temp;
            set.add(temp);
            temp = temp.next;
        }
        return null;
    }
    public static void main(String[] args){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.insert_at_beginning(5);
        list.insert_at_beginning(4);
        list.insert_at_beginning(3);
        list.insert_at_beginning(2);
        list.insert_at_beginning(1);
        list.print(); // 1->2->3->4->5
        // Add a loop
        /*
        1->2->3
           ^  |
           |  v
           5<-4
         */
        list.head.next.next.next.next.next = list.head.next;
        Node<Integer> loop_node = detect_loop(list.head);
        if(loop_node != null)
            System.out.println("Loop detected at node with data: " + loop_node.data);
        else
            System.out.println("No loop detected");
    }
}

