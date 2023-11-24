public class q2 {
    public static void main(String[] args){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.insert_at_beginning(1);
        list.insert_at_beginning(2);
        list.insert_at_beginning(3);
        System.out.println("Original list");
        list.print();
        list.reverse_iterative();
        System.out.println("Reversed list");
        list.print();
        list.reverse_recursive();
        System.out.println("Reversed list again");
        list.print();
    }
}
