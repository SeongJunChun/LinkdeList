
public class Main {
    public static void main(String[] args) {
        Queue list = new Queue();
        list.pull('a');
        list.pull('b');
        list.pull('c');
        list.pop();
        list.pull('f');
        System.out.println(list.get(0));
        for(Queue q : list){

        }

    }
}