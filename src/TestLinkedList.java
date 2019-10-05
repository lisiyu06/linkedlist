/**
 * Author: lisiyu
 * Created: 2019/9/25
 */
public class TestLinkedList {
    public static void main(String[] args) {
        testAddFirst();
        testAddLast();
        testAddIndex();
        testContains();
        testRemove();
    }

    public static void testAddFirst() {
        System.out.println("测试头插");
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.display();
    }
    public static void testAddLast() {
        System.out.println("测试尾插");
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.display();
    }
    public static void testAddIndex() {
        System.out.println("测试插入任意位置");
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.display();

        list.addIndex(2,5);
        list.display();
    }
    public static void testContains() {
        System.out.println("测试链表中是否包含某个元素");
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        boolean result = list.contains(4);
        System.out.println("预期结果：true, 实际结果：" + result);
    }

    public static void testRemove() {
        System.out.println("测试删除元素");
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        list.remove(3);
        list.display();
    }

}
