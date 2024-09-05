package MyApproaches;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
}

public class DelNode {

        public static Node deleteNode(Node head,int nums[])
        {
            if(head==null||head.next==null)
            {
                return head;
            }
            Node previous=null;Node curr=head;
            Node dummy=new Node(-1);
            for(int i=0;i<nums.length;i++)
            {
                while(dummy!=null)
                {
                    if(curr.data!=nums[i])
                    {
                        previous=curr;
                        curr=curr.next;
                    }
                    else {
                        previous.next=previous.next.next;
                    }
                    curr=curr.next;
                    dummy=new Node(curr.data);
                }
            }

            return head;

        }
        public static void printList(Node head)
        {
            Node current=head;
            while(current!=null)
            {
                System.out.print(current.data+"  ");
                current=current.next;
            }
        }
        public static void main(String[] args) {
            Node head=new Node(2);
            head.next=new Node(1);
            head.next.next=new Node(2);
            head.next.next.next=new Node(1);
            head.next.next.next.next = new Node(2);
            head.next.next.next.next.next = new Node(1);

            int nums[]={2};
            head=deleteNode(head,nums);
            printList(head);
        }

    }


