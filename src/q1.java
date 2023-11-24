public class q1 {
    public static void main(String[] args){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.insert_at_beginning(1);
        list.insert_at_beginning(2);
        list.insert_at_beginning(3);
        list.insert_at_beginning(3);
        list.insert_at_beginning(4);
        list.insert_at_beginning(5);
        list.print();
        list.delete(3);
        list.print();
        list.delete(5);
        list.print();
        list.delete(1);
        list.print();
        list.delete(2);
        list.print();
        list.delete(4);
        list.print();
    }
}
