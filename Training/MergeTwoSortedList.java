class ListNode
{
    int val;
    ListNode next;

    ListNode(int val)
    {
        this.val = val;
        this.next = null;
    }
}

public class MergeTwoSortedList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;

        while (list1 != null && list2 != null)
        {
            if (list1.val < list2.val)
            {
                node.next = list1;
                list1 = list1.next;
            }
            else
            {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }

        if (list1 != null)
        {
            node.next = list1;
        }
        else
        {
            node.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args)
    {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(1);
        list2.next.next = new ListNode(2);
        list2.next.next.next = new ListNode(2);
        list2.next.next.next.next = new ListNode(4);

        ListNode mergedList = mergeTwoLists(list1, list2);

        while (mergedList != null)
        {
            System.out.print(mergedList.val + " -> ");
            mergedList = mergedList.next;
        }
        System.out.println("null");
    }
}