public class AlternateElements {
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
        public void printAlternate() {
            ListNode temp = head;
            boolean toggle = true;
            while (temp != null) {
                if (toggle) {
                    System.out.print(temp.val + " -> ");
                }
                toggle = !toggle;
                temp = temp.next;
            }
            System.out.println("None");
        }    
    }
}
