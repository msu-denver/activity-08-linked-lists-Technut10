/*
 * CS2050 - Computer Science II
 * Instructor: Thyago Mota
 * Description: Activity 08 - LinkedListDriver
 */

public class LinkedListDriver {
    public static void main(String[] args) {
        LinkedList<String>  list = new LinkedList<>();
        list.add("Anthony");
        list.append("Joe");
        list.append("Mary");
        list.append("Anna");
        System.out.println(list);
        list.set(1, "Bob");
        System.out.println(list);
        list.set(2, "Jane");
        System.out.println(list);
        System.out.println(list.get(2));
    }
}
