package src;

 class LinkedList {

     private Node head;
     private int size;
     LinkedList(){
         this.size=0;
     }

     class Node {
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public int getSize(){
         System.out.println("size is "+size);
         return size;
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        //Create new node with data value and assign new value next to head of existing LinkedList so new data will become head and
        //next will be previous Head
            newNode.next=head;
            head=newNode;
    }

    public void addLast(String data){
         Node newNode= new Node(data);
         if(head==null){
             head=newNode;
             return;
         }
         Node currentNode=head;

         //Traverse through linkedList
        while(currentNode.next!=null){
            currentNode=currentNode.next;
//            System.out.print("currentNode is "+currentNode.data + " -> ");
        }
        currentNode.next=newNode;
    }

     public void printLL(){
         Node currentNode = head;
         //Traverse through linkedList
         while (currentNode != null) {
             System.out.print(currentNode.data + " -> ");
             currentNode = currentNode.next;
         }
         System.out.println("null");
     }

     //delete first

     public void deleteFirst(){
         if(head==null){
             System.out.println("LinkedList is null");
             return;
         }
         size--;
         head=head.next;
     }

     public void deleteLast(){
         if(head==null){
             System.out.println("LinkedList is null");
             return;
         }
         size--;
         //If 1 value only means there is no next than remove the single value
         if(head.next==null){
             head=null;
             return;
         }
         Node lastNode=head.next;
         Node secondLast=head;

         while(lastNode.next!=null){
             lastNode=lastNode.next;
             secondLast=secondLast.next;
         }
         secondLast.next=null;

     }


    public static void main(String[] args){
        LinkedList ll =new LinkedList();
        ll.addFirst("Akash");
        ll.addFirst("Singh");
        ll.addLast("Kumar");
        ll.printLL();
        ll.deleteFirst();
        ll.printLL();
        ll.getSize();

    }
}
