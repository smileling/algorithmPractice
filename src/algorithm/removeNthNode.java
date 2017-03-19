package algorithm;

public class removeNthNode {
	
	  //Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode tmp = head;
		int len = 0;
		while (tmp != null){
			len++;
			tmp = tmp.next;
		}
		if (n > len) 
			return head;
		if (len - n == 0) {
			return head.next;
		}
		
		tmp = head;
		int i = 1;
		while (i<len-n){
			tmp = tmp.next;
			i++;
		}
		tmp.next = tmp.next.next;
	    return head;
	}
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
