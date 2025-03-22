public class MinMaxElements {
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
        public void printMinMax() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            int min = head.val, max = head.val;
            ListNode temp = head;
            while (temp != null) {
                min = Math.min(min, temp.val);
                max = Math.max(max, temp.val);
                temp = temp.next;
            }
            System.out.println("Min: " + min + ", Max: " + max);
        }    
    }   
}
