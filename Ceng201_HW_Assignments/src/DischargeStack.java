public class DischargeStack {
    public class Node{
        DischargeRecord data;
        Node next;

        public Node(DischargeRecord data){
            this.data = data;
            this.next = next;
        }
    }

    public Node top;

    public DischargeStack(){
        this.top= null;
    }

    public void push(DischargeRecord record){

        Node newNode = new Node(record);
        newNode.next = top; // Current top becomes the second element
        top = newNode;  //New node becomes top
    }

    public DischargeRecord pop(){
        if (top == null){
            System.out.println("Stack is empty.");
        }else{
            DischargeRecord poppedRecord = top.data;
            top = top.next; //Move top pointer to the next node
            System.out.println("Treatment request processed and removed from the queue: " + poppedRecord);
            return poppedRecord;
        }
        return null;
    }

    public DischargeRecord peek() {
        if (top == null) {
            System.out.println("Stack boş.");
            return null;
        }
        return top.data;
    }

    public void printStack(){
        Node current = top;
        if (current==null){
            System.out.println("Stack is empty");
        }else{
            System.out.println("-----List-----");
            while (current!=null){
                System.out.println(current.data);
                current = current.next; 
                return poppedRecord;
                //Print the list when current.next = null
            }
            System.out.println("---------------");
        }
    }
}


