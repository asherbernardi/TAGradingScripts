public class IListTest {
	private static String listString(IList list) {
		String ret = "[ ";
		int l = list.length();
		for (int i = 0; i < l; i++)
			ret += list.elementAt(i);
		return ret;
	}

	public static void main(String args[]) {
		IList list = new IList();
		System.out.println("Testing deleteAt()");
		list.insertAtFront(1);
		list.insertAtFront(2);
		list.insertAtFront(3);
		System.out.println("deleteAt(1) from ");
		list.printList();
		System.out.println("gives:");
		list.deleteAt(1);
		list.printList();

		list = new IList();
		list.insertAtFront(1);
		list.insertAtFront(2);
		list.insertAtFront(3);
		System.out.println("deleteAt(0) from ");
		list.printList();
		System.out.println("gives:");
		list.deleteAt(0);
		list.printList();

		list = new IList();
		list.insertAtFront(1);
		list.insertAtFront(2);
		list.insertAtFront(3);
		System.out.println("deleteAt(2) from ");
		list.printList();
		System.out.println("gives:");
		list.deleteAt(2);
		list.printList();
		
		System.out.println("Testing insertSorted()");
		list = new IList();
		list.insertAtFront(5);
		list.insertAtFront(4);
		list.insertAtFront(2);
		list.insertAtFront(1);
		System.out.println("insertSorted(3) on ");
		list.printList();
		System.out.println("gives:");
		list.insertSorted(3);
		list.printList();

		list = new IList();
		list.insertAtFront(5);
		list.insertAtFront(4);
		list.insertAtFront(2);
		list.insertAtFront(1);
		System.out.println("insertSorted(-1) on ");
		list.printList();
		System.out.println("gives:");
		list.insertSorted(-1);
		list.printList();
		
		list = new IList();
		list.insertAtFront(5);
		list.insertAtFront(3);
		list.insertAtFront(2);
		list.insertAtFront(1);
		System.out.println("insertSorted(7) on ");
		list.printList();
		System.out.println("gives:");
		list.insertSorted(7);
		list.printList();

		System.out.println("Testing FindSmallest()()");
		list = new IList();
		list.insertAtFront(5);
		list.insertAtFront(3);
		list.insertAtFront(2);
		list.insertAtFront(1);
		System.out.println("findSmallest() on ");
		list.printList();
		System.out.println("gives:");
		System.out.println(list.removeSmallest());

		list = new IList();
		list.insertAtFront(-5);
		list.insertAtFront(3);
		list.insertAtFront(2);
		list.insertAtFront(1);
		System.out.println("findSmallest() on ");
		list.printList();
		System.out.println("gives:");
		System.out.println(list.removeSmallest());

		list = new IList();
		list.insertAtFront(5);
		list.insertAtFront(3);
		list.insertAtFront(2);
		list.insertAtFront(9);
		System.out.println("findSmallest() on ");
		list.printList();
		System.out.println("gives:");
		System.out.println(list.removeSmallest());

		System.out.println("Testing deleteFirstOccurrence()");
		list = new IList();
		list.insertAtFront(5);
		list.insertAtFront(4);
		list.insertAtFront(8);
		list.insertAtFront(1);
		System.out.println("deleteFirstOccurence(5) on ");
		list.printList();
		System.out.println("gives:");
		list.deleteFirstOccurrence(5);
		list.printList();

		list = new IList();
		list.insertAtFront(5);
		list.insertAtFront(5);
		list.insertAtFront(1);
		list.insertAtFront(1);
		System.out.println("deleteFirstOccurence(1) on ");
		list.printList();
		System.out.println("gives:");
		list.deleteFirstOccurrence(1);
		list.printList();

		list = new IList();
		list.insertAtFront(5);
		list.insertAtFront(2);
		list.insertAtFront(2);
		list.insertAtFront(4);
		System.out.println("deleteFirstOccurence(2) on ");
		list.printList();
		System.out.println("gives:");
		list.deleteFirstOccurrence(2);
		list.printList();

		System.out.println("Testing insertAtBack()");
		list = new IList();
		list.insertAtFront(5);
		list.insertAtFront(2);
		list.insertAtFront(9);
		list.insertAtFront(4);
		System.out.println("insertAtBack(-24) on ");
		list.printList();
		System.out.println("gives:");
		list.insertAtBack(-24);
		list.printList();

		list = new IList();
		System.out.println("insertAtBack(15) on ");
		list.printList();
		System.out.println("gives:");
		list.insertAtBack(15);
		list.printList();
	}
}
