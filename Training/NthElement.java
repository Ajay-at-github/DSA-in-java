public class NthElement {
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
        public void printNthElement(int n) {
            ListNode temp = head;
            int count = 0;
            while (temp != null) {
                if (count == n) {
                    System.out.println("Nth Element (" + n + "): " + temp.val);
                    return;
                }
                count++;
                temp = temp.next;
            }
            System.out.println("Index out of range");
        }    
    }
}
