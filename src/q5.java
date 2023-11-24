public class q5 {
    public static void main(String[] args){
        SinglyLinkedList<Integer> list,list2;
        list = new SinglyLinkedList<Integer>();
        list2 = new SinglyLinkedList<Integer>();
        list.insert_at_beginning(1);
        list.insert_at_beginning(3);
        list.insert_at_beginning(5);
        list2.insert_at_beginning(2);
        list2.insert_at_beginning(4);
        list2.insert_at_beginning(6);
        System.out.println("List 1");
        list.print();
        System.out.println("List 2");
        list2.print();
        System.out.println("Merged list");
        list.merge_sorted_lists(list2).print();
    }
}
