
import java.io.*;

// Definition of singly linked list:
class ListNode {

    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}

class Solution {

    // Function to find length
    public int findLengthOfLoop(ListNode head) {
        // HashMap to store visited nodes and their timer values
        HashMap<ListNode, Integer> visitedNodes = new HashMap<>();

        // Initialize pointer to traverse the linked list
        ListNode temp = head;

        // Initialize timer 
        // to track visited nodes
        int timer = 0;

        // Traverse the linked list 
        // till temp reaches null
        while (temp != null) {
            // If revisiting a node return difference of timer values
            if (visitedNodes.containsKey(temp)) {
                // Calculate the length of the loop
                int loopLength = timer - visitedNodes.get(temp);

                // Return length of loop
                return loopLength;
            }
            /* Store the current node 
            and its timer value in 
            the HashMap */
            visitedNodes.put(temp, timer);

            // Move to the next node
            temp = temp.next;

            // Increment the timer
            timer++;
        }

        /**
         * If traversal is completed and we reach the end of the list (null)
         * means there is no loop
         */
        return 0;
    }

    public static void main(String[] args) {
        // Create a sample linked list with a loop
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        // Create a loop from fifth to second
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // This creates a loop
        fifth.next = second;

        Solution solution = new Solution();
        int loopLength = solution.findLengthOfLoop(head);
        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}
