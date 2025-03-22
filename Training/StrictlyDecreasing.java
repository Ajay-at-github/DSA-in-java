public class StrictlyDecreasing {
    class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    
    class LinkedList {
        ListNode head;
    
        public void append(int val) {
            if (head == null) {
                head = new ListNode(val);
                return;
            }
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ListNode(val);
        }
    
        public void printList() {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("None");
        }
        public boolean isStrictlyDecreasing() {
            ListNode temp = head;
            while (temp != null && temp.next != null) {
                if (temp.val <= temp.next.val) {
                    System.out.println("List is NOT strictly decreasing");
                    return false;
                }
                temp = temp.next;
            }
            System.out.println("List is strictly decreasing");
            return true;
        }    
    }
}
