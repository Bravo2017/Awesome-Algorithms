//Insert Node at Tail of LinkedList. HackerRank DataStructures Java Solution
/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
    if(head !=null){
        Node current = head;
		
        while(current.next != null){
            current = current.next;
        }
        
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }
    return head;
  
}
