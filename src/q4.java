public class q4 {
    public static void main(String[] args){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.insert_at_beginning(1);
        list.insert_at_beginning(2);
        list.insert_at_beginning(3);
        list.insert_at_beginning(4);
        list.print();
        System.out.println("Middle node(even): " + list.get_middle_node().data);
        list.delete(4);
        list.print();
        System.out.println("Middle node(odd): " + list.get_middle_node().data);
    }
}
