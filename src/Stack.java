public class Stack extends LinkedList {
	public void pull(Object data) {
		Node node = new Node<>(data);
		if (tail == null) {
			tail = node;
			head = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}

	public Object pop() {
		Node node = head;
		while (node.next.next != null) {
			node = node.next;
		}
		Object object = node.next.getData();
		node.next = null;
		tail = node;
		return object;
	}
}
