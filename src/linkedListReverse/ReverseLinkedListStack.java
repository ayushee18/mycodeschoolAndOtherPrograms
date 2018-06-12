package linkedListReverse;

import java.util.Stack;

public class ReverseLinkedListStack {
	
	public LinkedList.Node reverseUsingExplicitStack(LinkedList.Node head){
		Stack<LinkedList.Node> stack = new Stack<LinkedList.Node>();
		LinkedList.Node temp = head;
		LinkedList list = new LinkedList();
		while(temp != null) {
			stack.push(temp);
			temp = temp.next;
		}
		
		LinkedList.Node temp2 = stack.pop();
		head = temp2;
		while(!stack.isEmpty()) {
			temp2.next = stack.pop();
			temp2 = temp2.next;
		}
		temp2.next = null;
		
		return head;
	}
	
	public static void main(String[] args) {
		ReverseLinkedListStack reverseLinkedListStack = new ReverseLinkedListStack();
		LinkedList list = new LinkedList();
		LinkedList.Node head = new LinkedList.Node(5);
		list.addToTheLast(head);
		list.addToTheLast(new LinkedList.Node(6));
		list.addToTheLast(new LinkedList.Node(7));
		list.addToTheLast(new LinkedList.Node(8));
		list.addToTheLast(new LinkedList.Node(9));
		
		System.out.println("Before Reversing");
		list.printList(head);
		LinkedList.Node reverseHead = reverseLinkedListStack.reverseUsingExplicitStack(head);
		System.out.println();
		System.out.println("After Reversing");
		list.printList(reverseHead);
	}
}
