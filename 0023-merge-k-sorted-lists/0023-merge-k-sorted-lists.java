/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
public ListNode mergeKLists(ListNode[] lists) {
    // Min-heap based on node values
    PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

    // Add the head of each list to the heap
    for (ListNode node : lists) {
        if (node != null) {
            pq.add(node);
        }
    }

    // Dummy head to simplify result construction
    ListNode dummy = new ListNode(0);
    ListNode tail = dummy;

    // Extract the smallest node and add its next to the heap
    while (!pq.isEmpty()) {
        ListNode min = pq.poll();
        tail.next = min;
        tail = tail.next;

        if (min.next != null) {
            pq.add(min.next);
        }
    }

    return dummy.next;
}

}