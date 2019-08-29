import java.io.File;
import java.util.Scanner;

public class RPNCalculator {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(new File("input.txt"));

        ArrayStack<Double> numStack = new ArrayStack<>();

        int numInput = Integer.parseInt(input.nextLine());


        for (int i = 0; i < numInput; i++) {
            String[] arrInput = input.nextLine().split(" ");
            for (int j = 0; j < arrInput.length; j++) {

                if(!arrInput[j].equals("+") && !arrInput[j].equals("*")
                && !arrInput[j].equals("-") && !arrInput[j].equals("/")){
                    numStack.push(Double.parseDouble(arrInput[j]));
                }
                else {
                    if(numStack.size() < 2) {
                        numStack.clear();
                        break;
                    }

                    try {
                        double a = numStack.pop();
                        double b = numStack.pop();

                        switch (arrInput[j]) {
                            case "+":
                                numStack.push(b + a);
                                break;
                            case "-":
                                numStack.push(b - a);
                                break;
                            case "/":
                                numStack.push(b / a);
                                break;
                            case "*":
                                numStack.push(b * a);
                        }
                    }
                    catch(Exception e){
                        System.out.println("Invalid");
                        break;
                    }

                }

            }
            if(numStack.size() != 1) {
                System.out.println("Invalid");
            }
            else {
                System.out.println(numStack.pop());
            }

            numStack.clear();
        }

        input.close();
    }

}
