public class stackTester {

    public static void main(String[] args) {

        ArrayStack<Double> stack1 = new ArrayStack<>();
        stack1.push(1.1);
        stack1.push(1.3);
        stack1.push(1.3);
        System.out.println(stack1.ArrayToString());
        System.out.println(stack1.toString());
        System.out.println(stack1.pop());
        stack1.push(1.4);
        System.out.println(stack1);
        System.out.println(stack1.peek());
        System.out.println(stack1.isFull());
        stack1.clear();
        stack1.push(0.5);
        System.out.println(stack1);
        System.out.println(stack1.ArrayToString());


        //String arraystack tester
        System.out.println("\n");
        ArrayStack<String> stringArrayStack = new ArrayStack<>();
        stringArrayStack.push("A");
        stringArrayStack.push("B");
        stringArrayStack.push("C");
        System.out.println(stringArrayStack);

        System.out.println("stringArrayStack.pop() = " + stringArrayStack.pop());
        System.out.println(stringArrayStack);

        stringArrayStack.push("Z");
        System.out.println("stringArrayStack.peek() = " + stringArrayStack.peek());
        System.out.println("stringArrayStack.isEmpty() = " + stringArrayStack.isEmpty());
        System.out.println("stringArrayStack.isFull() = " + stringArrayStack.isFull());

        stringArrayStack.clear();
        System.out.println("stringArrayStack = " + stringArrayStack);
        System.out.println("stringArrayStack.isEmpty() = " + stringArrayStack.isEmpty());





    }

}
