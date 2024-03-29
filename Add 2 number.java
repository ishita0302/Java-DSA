/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0;
        int carry=0;
        ListNode h1=null;
        ListNode h2=null;
        while(l1!=null || l2!=null){
            sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            ListNode n=new ListNode(sum%10);
            if(h1==null){
                h1=n;
                h2=n;
            }
            else{
                h2.next=n;
                h2=h2.next;
            }
            carry=sum/10;
        }
        if(carry==1){
            h2.next=new ListNode(1);
        }
        if(h1!=null){
            return h1;
        }
        else{
            return new ListNode(0);
        }
    }
}
