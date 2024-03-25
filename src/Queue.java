public class Queue extends LinkedList{

    public void pull(Object data){
        Node node = new Node<>(data);
        if(tail==null){
            tail=node;
            head=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
    }
    public Object pop(){
        Object object = head.getData();
        head=head.next;
        return object;
    }
}
