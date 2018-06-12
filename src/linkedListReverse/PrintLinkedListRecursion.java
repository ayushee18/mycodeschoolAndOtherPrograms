package linkedListReverse;

public class PrintLinkedListRecursion {
	
	public void printList(LinkedList.Node node){
		if(node != null) {
			System.out.print(node.getValue()+" ");
			printList(node.next);
		}
	}
	
	public void printListReverse(LinkedList.Node node) {
		if(node != null) {
			printListReverse(node.next);
			System.out.print(node.getValue()+" ");
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		LinkedList.Node head = new LinkedList.Node(5);
		list.addToTheLast(head);
		list.addToTheLast(new LinkedList.Node(6));
		list.addToTheLast(new LinkedList.Node(7));
		list.addToTheLast(new LinkedList.Node(8));
		list.addToTheLast(new LinkedList.Node(9));
		
		PrintLinkedListRecursion printLinkedListRecursion = new PrintLinkedListRecursion();
		System.out.println("List");
		printLinkedListRecursion.printList(head);
		System.out.println();
		System.out.println("List in reverse");
		printLinkedListRecursion.printListReverse(head);
	}

}
