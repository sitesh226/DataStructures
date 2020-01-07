package stack;

public class StackUsingArray {

    int size;
    int arr[];
    int top;

    StackUsingArray(int size){
        this.size=size;
        this.arr=new int[size];
        this.top=-1;
    }

    public boolean isFull(){
        return (size-1==top);
    }

    public boolean isEmpty(){
        return (top==-1);
    }
    public void push(int pushedElement){
        if(!isFull()){
            top++;
            arr[top]=pushedElement;
            System.out.println("Pushed Element: "+arr[top]);
        }else
            System.out.println("Stack is full");

    }

    public int pop() {
        if (!isEmpty()) {
            int returnedTop = top;
            top--;
            System.out.println("Popped element: " + arr[returnedTop]);
            return arr[returnedTop];
        } else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }


    public int peek(){
            if(!isEmpty()){
                return arr[top];
            }
            else{
                System.out.println("Stack empty");
                return -1;
            }

    }

    public static void main(String[] args){
        StackUsingArray stackUsingArray=new StackUsingArray(5);
        stackUsingArray.peek();
        stackUsingArray.pop();
        stackUsingArray.push(2);
        stackUsingArray.push(4);
        stackUsingArray.push(5);
        stackUsingArray.push(7);
        stackUsingArray.push(28);
        System.out.println("----------------------------------------");
        stackUsingArray.pop();
        stackUsingArray.pop();
        stackUsingArray.push(15);
        stackUsingArray.push(17);
        stackUsingArray.push(20);
    }



}
