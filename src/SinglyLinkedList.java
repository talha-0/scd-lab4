public class SinglyLinkedList<T> {
    Node<T> head;
    public SinglyLinkedList(){
        this.head = null;
    }
    public void insert_at_beginning(T data){
        Node<T> newNode = new Node<T>(data);
        if(this.head == null){
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }
    public void delete(T data){
        if(this.head == null){
            System.out.println("List is empty");
        } else {
            Node<T> temp = this.head;
            Node<T> prev = null;
            while(temp != null){
                if(temp.data.equals(data)){
                    if(prev == null)
                        this.head = temp.next;
                    else 
                        prev.next = temp.next;
                } else
                    prev = temp;
                temp = temp.next;
            }
        }
    }
    public void print(){
        if(this.head == null){
            System.out.println("List is empty");
        } else {
            Node<T> temp = this.head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public void reverse_iterative(){
        if(this.head == null){
            System.out.println("List is empty");
        } else {
            Node<T> prev = null;
            Node<T> curr = this.head;
            Node<T> next = null;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            this.head = prev;
        }
    }
    public void reverse_recursive(){
        if(this.head == null)
            System.out.println("List is empty");
        else 
            this.head = reverse_recursive_helper(this.head);
    }
    
    private Node<T> reverse_recursive_helper(Node<T> node){
        if(node.next == null){
            return node;
        }
        Node<T> newHead = reverse_recursive_helper(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }
    public SinglyLinkedList<T> merge_sorted_lists(SinglyLinkedList<T> list2){
        SinglyLinkedList<T> merged_list = new SinglyLinkedList<T>();
        Node<T> temp1 = this.head;
        Node<T> temp2 = list2.head;
        while(temp1 != null && temp2 != null){
            if((Integer)temp1.data > (Integer)temp2.data){
                merged_list.insert_at_beginning(temp1.data);
                temp1 = temp1.next;
            } else {
                merged_list.insert_at_beginning(temp2.data);
                temp2 = temp2.next;
            }
        }
        while(temp1 != null){
            merged_list.insert_at_beginning(temp1.data);
            temp1 = temp1.next;
        }
        while(temp2 != null){
            merged_list.insert_at_beginning(temp2.data);
            temp2 = temp2.next;
        }
        merged_list.reverse_recursive();
        return merged_list;
    }
    public Node<T> get_middle_node(){
        if(this.head == null)
            return null;
        Node<T> slow = this.head;
        Node<T> fast = this.head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
