//package MyApproaches;
//
//
////class Node{
////    int data;
////    Node next;
////    Node(int data)
////    {
////        this.data=data;
////        this.next=null;
////    }
////    Node(int data,Node next)
////    {
////        this.data=data;
////        this.next=next;
////    }
////}
//public class RemovefrEnd {
//    public static Node convertArray2Ll(int[]arr)//does not delete the first node
//    {
//        Node head=new Node(arr[0]);
//        Node current=head;
//        for(int i=1;i<arr.length;i++)
//        {
//            Node temp=new Node(arr[i]);
//            current.next=temp;
//            current=temp;
//        }
//        return head;
//    }
//    public static Node removeNthNodefromEnd(Node head,int n)
//    {
//        Node currentOne=head;int cnt=0;
//        while(currentOne!=null)
//        {
//            cnt++;
//            currentOne=currentOne.next;
//        }
//        if(cnt==n)
//        {
//            Node newhead=head.next;
//            head=null;
//            return newhead;
//        }
//
//        int result=cnt-n;
//        currentOne=head;
//        while(result>1)
//        {
//
//
//                currentOne=currentOne.next;
//                result--;
//
//        }
//
//        Node deleteOne=currentOne.next;
//        currentOne.next=currentOne.next.next;
//        deleteOne=null;
//
//        return head;
//    }
//    public static void printList(Node head)
//    {
//        Node curr=head;
//        while(curr!=null)
//        {
//            System.out.print(curr.data+" ");
//            curr=curr.next;
//        }
//
//    }
//    public static void main(String[] args) {
//        int arr[]={12,5,8,7,6};
//        Node head=convertArray2Ll(arr);
//        printList(head);
//        System.out.println();
//        int N=5;
//        removeNthNodefromEnd(head,N);
//        printList(head);
//    }
//
//}

//class Node {
//    public int data;
//    public Node next;
//
//    // Constructor for Node with data and next node
//    public Node(int data1, Node next1) {
//        data = data1;
//        next = next1;
//    }
//
//    // Constructor for Node with only data (next set to null)
//    public Node(int data1) {
//        data = data1;
//        next = null;
//    }
//}
package MyApproaches;
public class RemovefrEnd {
    // Function to print the linked list
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Function to delete the Nth node
    //from the end of the linked list
    public static Node DeleteNthNodefromEnd(Node head, int N) {
        if (head == null) {
            return null;
        }
        int cnt = 0;
        Node temp = head;

        // Count the number of nodes in the linked list
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        // If N equals the total number of nodes, delete the head
        if (cnt == N) {
            Node newhead = head.next;
            head = null;
            return newhead;
        }

        // Calculate the position of the node to delete (res)
        int res = cnt - N;
        temp = head;

        // Traverse to the node just before the one to delete
        while (temp != null) {
            res--;
            if (res == 0) {
                break;
            }
            temp = temp.next;
        }

        // Delete the Nth node from the end
        Node delNode = temp.next;
        temp.next = temp.next.next;
        delNode = null;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {12,5,8,7,6};
        int N = 5;
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);

        // Delete the Nth node from
        // the end and print the modified linked list
        head = DeleteNthNodefromEnd(head, N);
        printLL(head);
    }
}

