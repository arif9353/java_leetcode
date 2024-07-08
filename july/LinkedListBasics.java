import java.util.*;
public class LinkedListBasics{
    //DECLARATION OF LINKEDLIST
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next = null;
        }
    }


    public static Node head;
    public static Node tail;
    public static int size;

    //ADDING ELEMENTS

    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public static void addMiddle(int index, int data){
        if(index==1){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            size++;
            return;
        }
        Node temp = head;
        int count=1;
        while(temp.next!=null && count<index){
            temp=temp.next;
            count++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }

    //PRINTING LINKED LIST

    public static void printll(){
        if(head==null){
            System.out.println("LL is Empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    //DELETING FROM LINKED LIST

    public static int removeFirst(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static int removeLast(){
        if(size==0){
            System.out.println("LL is Empty");
        }
        if(size==1){
            int val = tail.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val = tail.data;
        Node temp = head;
        for(int i=0;i<=size-2;i++){
            temp=temp.next;
        }
        temp.next = null;
        tail=temp;
        size--;
        return val;
    }

    public static int removeMiddle(int index){
        if(index>size){
            System.out.println("This size linkedlits doesnt exist");
            return Integer.MIN_VALUE;
        }
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==index){
            int val = removeLast();
            return val;
        }
        int count =1;
        Node temp = head;
        while(temp.next!=null && count<index){
            temp=temp.next;
            count++;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        return val;
    }

    //SEARCH IN A LINKED LIST

    public static int search(int data){
        if(size==0){
            System.out.println("LL is empty");
        }
        Node temp = head;
        for(int i=0;i<=size;i++){
            if(temp.data == data){
                System.out.println("Found at index "+i);
                return i;
            }
            temp = temp.next;
        }
        System.out.println("Element not found in LL");
        return -1;
    }

    //REVERSE A LINKED LIST

    public static void reversell(){
        Node prev = null;
        Node curr = tail = head;
        Node nextm;
        while(curr!=null){
            nextm = curr.next;
            curr.next = prev;
            prev=curr;
            curr = nextm;
        }
        head=prev;
    }

    //CHECK PALINDROME

    public static int findmid(){
        Node slow = head;
        Node fast = head;
        int count =0;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }
        System.out.println(count);
        return count;
    }

    public static void reverseMidll(){
        int mid = findmid();
        int count =0;
        Node prev = null;
        Node curr=head;
        for(int i=0;i<mid;i++){
            curr=curr.next;
        }
        System.out.println(curr.data);
        Node nextm;
        while(curr!=null){
            nextm=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextm;
        }
    }

    public static boolean checkPalindrome(){
        reverseMidll();
        printll();
        Node start = head;
        Node end = tail;
        while(end!=null){
            System.out.println(start.data+" "+end.data);
            if(start.data != end.data){
                return false;
            }
            start=start.next;
            end=end.next;
        }
        return true;
    }

    //MAIN FUNCTION

    public static void main(String args[]){
        LinkedListBasics ll = new LinkedListBasics();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        // ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printll();
        System.out.println(checkPalindrome());
    }
}