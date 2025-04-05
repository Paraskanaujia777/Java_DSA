public class Linkedlist{

   static class LL {

        Node head;

        class Node{
            int data;
            Node next;

            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        

        public void addFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }

            newNode.next =head;
            head = newNode;
            
        }

        public void addLast(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
                return;
            }

            Node lastNode = head;
            while(lastNode.next != null){
                lastNode = lastNode.next;

            }
            lastNode.next = newNode;

        }

        public void deleteFirst(){
            if(head == null){
                System.out.println("list is empty");
                return;
            }
            head = head.next;
        }

        public void deleteLast(){
            if(head == null){
                System.out.println("list is empty");
                return;
            }

            Node currNode = head;
            Node lastNode = head.next;

            while(lastNode.next != null){
                currNode= currNode.next;
                lastNode= lastNode.next;
            }
            currNode.next = null;
        }

        public void printList(){
            Node currNode = head;
            while(currNode != null){
                System.out.print(currNode.data+" => ");
                currNode =currNode.next;
                
            }
            System.out.print("null " +"\n");
        }





    }

    public static void main(String args[]){
        System.out.println("Hello World");
        LL obj = new LL();
        obj.addFirst(4);
        obj.addFirst(3);
        obj.addFirst(2);
        obj.addFirst(1);
        obj.addFirst(7);
        obj.addFirst(8);
        obj.addLast(9);
        obj.addLast(10);

        obj.printList();
        obj.deleteFirst();
        obj.deleteLast();
        obj.printList();



    }

}