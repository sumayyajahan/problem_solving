import java.util.LinkedList;

public class Poll {

    public static void main(String args[]){

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");

        System.out.println(list1);
        System.out.println(list1.peek());
    }
}
