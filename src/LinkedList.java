import java.util.Iterator;

public class LinkedList{
    protected Node tail=null;
    protected Node head=null;

    public void add(Object data){
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
    public Object get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node.getData();
    }
    public void delete(int index){
        if(index==0){
            head=head.next;
        }
        else{
            Node node=head;
            for(int i=0;i<index-1;i++){
                node=node.next;
            }
            if(node.next.next==null){
                node.next=null;
                tail=node;
            }
            else{
                node.next=node.next.next;
            }

        }

    }





}
