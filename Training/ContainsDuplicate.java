import java.util.HashSet;

public class ContainsDuplicate {
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
        public boolean hasDuplicates() {
            HashSet<Integer> seen = new HashSet<>();
            ListNode temp = head;
            while (temp != null) {
                if (seen.contains(temp.val)) {
                    System.out.println("List contains duplicates");
                    return true;
                }
                seen.add(temp.val);
                temp = temp.next;
            }
            System.out.println("No duplicates");
            return false;
        }
    }
}