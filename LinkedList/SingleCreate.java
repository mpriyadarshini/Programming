public class SingleCreate {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;

        } else {
            tail.next = newNode;
            tail = newNode;

        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        while (current != null) {
            System.out.println(current.data + "");
            current = current.next;
        }
    }

    public int countNodes() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void reverse(Node current) {
        if (head == null) {
            System.out.println("empty");
            return;
        } else {
            if (current.next == null) {
                System.out.println(current.data + "");
                return;
            }
            reverse(current.next);
            System.out.println(current.data + "");
        }
    }

    public static void main(String[] args) {
        SingleCreate s = new SingleCreate();
        s.addNode(1);
        s.addNode(3);
        s.display();
        System.out.println("Count:" + s.countNodes());
        s.reverse(s.head);
    }
}