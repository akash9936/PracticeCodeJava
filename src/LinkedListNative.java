package src;
import java.util.LinkedList;

public class LinkedListNative {

    public static void main(String args[]){
        LinkedList<String> list =new LinkedList<String>();
        list.addFirst("Akash");
        list.addFirst("Singh");
        list.addLast("kumar");
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        //by default is add at last
        list.add("New");
        list.remove(0);

        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }
}
