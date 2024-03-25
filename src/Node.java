public class Node<T> {
    private T data;
    public Node next;
    public Node(T t){
        data=t;
        next=null;
    }
    public T getData(){
        return data;
    }
}
