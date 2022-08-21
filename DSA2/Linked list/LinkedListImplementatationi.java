
public class LinkedListImplementatationi {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void prinList() {
        if (head == null) {
            System.out.println("nothing available to print");
            return;
        }
        int count = 0;
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "=>");
            currNode = currNode.next;
            count = count + 1;
        }
        System.out.print("null");
        System.out.println(count);

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("nothing available to delete");
            return;
        }

        head = head.next;
        return;
    }

    public void deleteLast() {
        if (head == null || head.next == null) {
            System.out.println("nothing available to delete");
            return;
        }
        Node lastNode = head;
        Node sLastNode = head.next;
        while (sLastNode.next != null) {
            lastNode = lastNode.next;
            sLastNode = sLastNode.next;
        }
        lastNode.next = null;
    }

    public static void main(String[] args) {
        LinkedListImplementatationi list = new LinkedListImplementatationi();
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);
        list.prinList();
        System.out.println();
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.prinList();
        // System.out.println();
        // list.deleteFirst();
        // list.prinList();
        // System.out.println();
        // list.deleteFirst();
        // list.prinList();
        // System.out.println();
        // list.deleteFirst();
        // list.prinList();
        // System.out.println();
        // list.deleteFirst();
        // list.prinList();
        // System.out.println();
        // list.deleteFirst();
        // list.prinList();
        System.out.println();
        list.deleteLast();
        list.prinList();
        System.out.println();
        list.deleteLast();
        list.prinList();
        System.out.println();
        list.deleteLast();
        list.prinList();
        System.out.println();
        list.deleteLast();
        list.prinList();
    }
}
