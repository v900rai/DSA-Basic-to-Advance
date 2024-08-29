package LinkedList2024;



    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class CycleflodsAlgoriths {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) {
                return false;
            }

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;         // move slow pointer by one step
                fast = fast.next.next;    // move fast pointer by two steps

                if (slow == fast) {       // cycle detected
                    return true;
                }
            }

            return false; // no cycle found
        }
        public static void main(String[] args) {
            // Create nodes
            ListNode node1 = new ListNode(3);
            ListNode node2 = new ListNode(2);
            ListNode node3 = new ListNode(0);
            ListNode node4 = new ListNode(-4);

            // Link nodes to form a cycle: 3 -> 2 -> 0 -> -4 -> 2
            node1.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node2; // Cycle here

            // Instantiate the CycleflodsAlgoriths class
            CycleflodsAlgoriths cycleDetector = new CycleflodsAlgoriths();

            // Test the hasCycle method
            boolean result = cycleDetector.hasCycle(node1);

            // Print the result
            if (result) {
                System.out.println("Cycle detected.");
            } else {
                System.out.println("No cycle detected.");
            }
        }
    }
