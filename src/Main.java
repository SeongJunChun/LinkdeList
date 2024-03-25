
public class Main {
	public static void main(String[] args) {
		System.out.println("큐 구현 ----------------------------");
		Queue Q = new Queue();
		Q.pull('a');
		Q.pull('b');
		Q.pull('c');
		Q.pop();
		Q.pull('d');
		for (Object q : Q) {
			System.out.println(q);
		}

		System.out.println("스택 구현 ----------------------------");

		Stack stack = new Stack();
		stack.pull(1);
		stack.pull(2);
		stack.pop();
		stack.pull(3);
		stack.pull(4);
		for (Object s : stack) {
			System.out.println(s);
		}

		System.out.println("리스트 구현 ----------------------------");
		LinkedList list = new LinkedList();
		list.add("Red");
		list.add("Orange");
		list.add("Yellow");
		list.add("Black");
		list.delete(1);
		list.get(2);
		for (Object l : list) {
			System.out.println(l);
		}

	}
}
