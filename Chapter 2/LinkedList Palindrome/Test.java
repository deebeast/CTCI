class Node{
	int data;
	Node next;
	public Node(int d){
		this.data = d;
		this.next = null;
	}
}

class LinkedList{
  Node head;
  Node current;
  public LinkedList(){
    head = null;
  }
  void add(int data){
    if(head == null){
      head = new Node(data);
      current = head;
    } else{
      Node temp = new Node(data);
      current.next = temp;
      current = current.next;
    }
  }
  void print(){
    print(this.head);
  }
  void print(Node node){
    Node n = node;
    while (n != null){
            System.out.print(n.data + "->");
            n = n.next;
    }
    System.out.println("null");
  }
  class Result{
    Node node;
    boolean result;
  }
  boolean isPalindrome(){
    if(this.head == null || this.head.next == null){
        return true;
    }
    Result p = isPalindrome(this.head, this.head.next);
    return p.result;
  }
  Result isPalindrome(Node slow, Node fast){
      Result res = new Result();
      if(fast != null && fast.next != null){
        res = isPalindrome(slow.next, fast.next.next);
        if(res.result == false || res.node == null) return res;
        res.result = (slow.data == res.node.data);
        res.node = res.node.next;
      }
      else{
        res.node = slow.next;
        res.result = true;
      }
      return res;
  }

}

class Test{
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(2);
		ll.add(1);
    System.out.println(ll.isPalindrome());
	}
}
