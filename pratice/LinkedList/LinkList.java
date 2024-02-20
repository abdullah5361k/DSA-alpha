package DSA.pratice.LinkedList;

public class LinkList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node head1;
    public static Node tail1;
    public static int size1;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head1 == null) {
            size1++;
            head1 = tail1 = newNode;
            return;
        }
        size1++;
        newNode.next = head1;
        head1 = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head1 == null) {
            head1 = tail1 = newNode;
            return;
        }
        size1++;
        tail1.next = newNode;
        tail1 = newNode;
    }

    public static void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node prev = head1;
        size1++;
        for (int i = 0; i < idx - 1; i++) {
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
    }

    public static void removeFirst() {
        if (size1 == 0) {
            System.out.println("LL is empety");
            return;
        } else if (size1 == 1) {
            head1 = tail1 = null;
            size1 = 0;
            return;
        }
        size1--;
        head1 = head1.next;
    }

    public static void removeLast() {
        if (size1 == 0) {
            System.out.println("LL is empety");
            return;
        } else if (size1 == 1) {
            head1 = tail1 = null;
            size1 = 0;
            return;
        }
        Node prev = head1;
        for (int i = 0; i < size1 - 2; i++) {
            prev = prev.next;
        }
        size1--;
        prev.next = null;
        tail1 = prev;
    }

    public static int linSearch(int key) {
        Node temp = head1;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static int helper(Node head1, int key) {
        if (head1 == null) {
            return -1;
        }
        if (head1.data == key) {
            return 0;
        }

        int idx = helper(head1.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public static int recSearch(int key) {
        return helper(head1, key);
    }

    public static void reverse() {
        Node prev = null;
        Node curr = tail1 = head1;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head1 = prev;
    }

    public static void nthFromEnd(int n) {
        // Calculate size1
        int sz = 0;
        Node temp = head1;
        while (temp != null) {
            sz++;
            temp = temp.next;
        }
        if (sz == n) {
            head1 = head1.next;
            return;
        }
        Node prev = head1;
        for (int i = 1; i < size1 - n; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }

    public static Node findMid() {
        Node slow = head1;
        Node fast = head1;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean isPalindrome() {
        // Find mid
        Node mid = findMid();
        // Reverse
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Compare
        Node left = head1;
        Node right = prev;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void removeCycle() {
        // First find meat point
        Node slow = head1;
        Node fast = head1;
        Node meat;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                meat = fast;
                break;
            }
        }

        slow = head1;
        Node prev = null;
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        prev.next = null;

    }

    public static void print() {
        Node temp = head1;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void zigZag() {
        // Find mid
        Node slow = head1;
        Node fast = head1.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse 2nd half
        Node mid = slow;
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Zig-Zag traversal
        Node left = head1;
        Node right = prev;
        Node nextL, nextR;
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            left = nextL;
            right = nextR;
        }

    }

    public static void removeMid() {
        Node slow = head1;
        Node fast = head1;
        Node prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        // System.out.println(prev.data);
    }

    /**
     * * Merge Sort
     */

    public static Node getMid(Node head1) {
        Node slow = head1;
        Node fast = head1.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node head11, Node head12) {
        Node mergeL = new Node(-1);
        Node temp = mergeL;

        while (head11 != null && head12 != null) {
            if (head11.data <= head12.data) {
                temp.next = head11;
                head11 = head11.next;
                temp = temp.next;
            } else {
                temp.next = head12;
                head12 = head12.next;
                temp = temp.next;
            }
        }

        while (head11 != null) {
            temp.next = head11;
            head11 = head11.next;
            temp = temp.next;
        }

        while (head12 != null) {
            temp.next = head12;
            head12 = head12.next;
            temp = temp.next;
        }

        head1 = mergeL.next;

        return mergeL.next;

    }

    public static Node mergeSort(Node head1) {

        if (head1 == null || head1.next == null) {
            return head1;
        }

        // Get mid
        Node mid = getMid(head1);
        Node righthead1 = mid.next;
        mid.next = null;
        Node left = mergeSort(head1);
        Node right = mergeSort(righthead1);
        return merge(left, right);
    }

    public static void deleteNNodes(int m, int n) {
        Node temp = head1;
        while (temp != null) {
            // Find current
            Node curr = temp;
            for (int i = 1; i < m; i++) {
                if (temp == null) {
                    return;
                }
                curr = temp.next;
                temp = temp.next;
            }
            Node nxt = temp;
            for (int i = 0; i < n; i++) {
                if (temp == null) {
                    return;
                }
                nxt = temp.next;
                temp = temp.next;
            }
            nxt = nxt.next;
            curr.next = nxt;
            temp = nxt;
        }
    }

    public static void swapNodes(int x, int y) {
        Node temp1 = head1;
        Node prev1 = temp1;
        for (int i = 1; i < x; i++) {
            prev1 = temp1;
            temp1 = temp1.next;
        }

        Node temp2 = head1;
        Node prev2 = temp2;
        for (int i = 1; i < y; i++) {
            prev2 = temp2;
            temp2 = temp2.next;
        }
        // prev1.next = prev2;
        Node next1 = prev1.next.next;
        Node next2 = prev2.next == null ? null : prev2.next.next;
        Node curr1 = prev1.next;
        Node curr2 = prev2.next;
        prev1.next = curr2;
        curr2.next = next1;
        prev2.next = curr1;
        curr1.next = next2;
    }

    public static void swap(int x, int y) {

        if (x == y) {
            return;
        }

        Node prevX = null;
        Node currX = head1;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null;
        Node currY = head1;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null) {
            return;
        }

        if (prevX != null) {
            prevX.next = currY;
        } else {
            head1 = currY;
        }

        if (prevY != null) {
            prevY.next = currX;
        } else {
            head1 = currX;
        }
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public static void evenOrOdd() {
        Node temp = head1;
        while (temp != null) {
            if (temp.data % 2 != 0) {
                Node tem = temp.next;
                while (tem != null) {
                    if (tem.data % 2 == 0) {
                        int id = tem.data;
                        tem.data = temp.data;
                        temp.data = id;
                        break;
                    }
                    tem = tem.next;
                }
            }

            temp = temp.next;
        }
    }

    public static void evOdd() {
        Node list = head1;
        Node odd = new Node(-1);
        Node temp = odd;
        Node even = new Node(-2);
        Node temp2 = even;
        while (list != null) {
            if (list.data % 2 != 0) {
                temp2.next = null;
                temp.next = list;
                list = list.next;
                temp = temp.next;
            } else {
                temp.next = null;
                temp2.next = list;
                list = list.next;
                temp2 = temp2.next;
            }
        }
        temp2.next = odd.next;
        head1 = even.next;
        print();
    }

    public static void removeDuplicates() {
        Node list = head1;
        Node dp = new Node(-1);
        Node temp = dp;
        while (list.next != null) {
            if (list.data != list.next.data) {
                temp.next = list;
                list = list.next;
                temp = temp.next;
            } else {
                if (list.next.next == null) {
                    temp.next = list;
                    list.next = null;
                } else {
                    temp.next = null;
                    list = list.next;
                }
            }
        }
        head1 = dp.next;
        print();
    }

    public static void twinSum() {
        // Get mid
        Node slow = head1;
        Node fast = head1.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        Node mid = slow;
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head1;
        Node right = prev;
        int sum = Integer.MIN_VALUE;
        while (left != null && right != null) {
            sum = Math.max(sum, left.data + right.data);
            left = left.next;
            right = right.next;
        }

        System.out.println(sum);

    }

    public static void oddEvenList() {
        Node odd = head1;
        Node even = head1.next;
        Node evenHead = head1.next;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            even = even.next;
            odd = odd.next;
        }

        odd.next = evenHead;
        print();
    }

    public static void main(String[] args) {
        // Node arr[] = new Node[2];
        // arr[0] = new Node(1);
        // arr[0].next = new Node(3);
        // arr[0].next.next = new Node(5);
        // arr[0].next.next.next = new Node(7);

        // arr[1] = new Node(2);
        // arr[1].next = new Node(4);
        // arr[1].next.next = new Node(6);
        // arr[1].next.next.next = new Node(8);

        // mergeTwoLL(arr[0], arr[1]);
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);
        oddEvenList();
    }
}
