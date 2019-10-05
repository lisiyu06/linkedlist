/**
 * Author: lisiyu
 * Created: 2019/9/25
 */

class LinkedNode {
    public int data = 0;
    public LinkedNode next = null;

    public LinkedNode(int data) {
        this.data = data;
    }
}

public class LinkedList {
    public LinkedNode head = null;

    public void addFirst(int elem) {
        LinkedNode node = new LinkedNode(elem);
        if (this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
        return;
    }

    public void addLast(int elem) {
        LinkedNode node = new LinkedNode(elem);
        if (this.head == null) {
            this.head = node;
            return;
        }
        LinkedNode cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
        return;
    }

    public void addIndex(int index, int elem) {
        LinkedNode node = new LinkedNode(elem);
        int len = size();
        System.out.println(len);
        if (index < 0 || index > len) {
            return;
        }
        if (index == 0) {
            addFirst(elem);
            return;
        }
        if (index == len) {
            addLast(elem);
            return;
        }
        LinkedNode prev = getIndexPos(index - 1);
        node.next = prev.next;
        prev.next = node;
    }

    public int size() {
        int size = 0;
        for (LinkedNode node = this.head;
                node != null;
                node = node.next) {
            size++;
        }
        return size;
    }

    public LinkedNode getIndexPos(int index) {
        LinkedNode cur = this.head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public boolean contains(int toFind) {
        for (LinkedNode node = this.head;
                node != null;
                node = node.next) {
            if (node.data == toFind) {
                return true;
            }
        }
        return false;
    }

    public void remove(int toRemove) {
        if (this.head == null) {
            return;
        }
        if (head.data == toRemove) {
            this.head = this.head.next;
            return;
        }
        LinkedNode prev = searchPrev(toRemove);
        prev.next = prev.next.next;
    }

    public LinkedNode searchPrev(int toRemove) {
        if (this.head == null) {
            return null;
        }
        LinkedNode prev = this.head;
        while(prev.next != null) {
            if (prev.next.data == toRemove) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }

    public void display() {
        System.out.print("[");
        for (LinkedNode node = this.head;
                node != null;
                node = node.next) {
            System.out.print(node.data);
            if (node.next != null) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
