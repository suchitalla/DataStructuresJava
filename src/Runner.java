
public class Runner {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(8);
		list.insert(9);
		list.insert(10);
		list.insert(11);
		list.insert(12);
		list.show();
		list.insertAt(55,4);
		list.show();
		list.insertAtStart(77);
		list.show();
	}

}
