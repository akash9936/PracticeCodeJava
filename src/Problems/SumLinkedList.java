package src;
// 2 -> 3 -> 4
public class SumLinkedList {

}

//    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//        You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//  https://leetcode.com/problems/add-two-numbers/description/



//Definition for singly-linked list.


  class Solution {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newList=new ListNode(0);
        ListNode currentNode=newList;
        int carry=0;

        while((l1!=null)||(l2!=null) || carry!=0){
            int l1Value=l1!=null?l1.val:0;
            int l2Value=l2!=null?l2.val:0;
            int sum=l1Value+l2Value+carry;
            carry=sum/10;
            int value=sum%10;
            currentNode.next=new ListNode(value);
            currentNode=currentNode.next;

            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        return newList.next;

    }
}
