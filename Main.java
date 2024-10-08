import java.util.Scanner;
public class Main{
public static Scanner sc = new Scanner(System.in);
public static void main (String[] args){
    
    System.out.println("DFA accepting string ending with '01'");
    System.out.println("\nInitial state: q0");
    System.out.println("Final state: q2\n");

    System.out.print("Enter String to test: ");
    String input = sc.nextLine();

    System.out.println();

    String state = "q0";

    for(int i = 0; i < input.length(); i++){
        if(state.equals("q0") && input.charAt(i) == '0'){
            System.out.println("q0 - q1");
            state = "q1";
        }
        else if(state.equals("q0") && input.charAt(i) == '1'){
            System.out.println("q0 - q0");
            state = "q0";
        }
        else if(state.equals("q1") && input.charAt(i) == '0'){
            System.out.println("q1 - q1");
            state = "q1";
        }
        else if(state.equals("q1") && input.charAt(i) == '1'){
            System.out.println("q1 - q2");
            state = "q2";
        }
        else if(state.equals("q2") && input.charAt(i) == '0'){
            System.out.println("q2 - q1");
            state = "q1";
        }
        else if(state.equals("q2") && input.charAt(i) == '1'){
            System.out.println("q2 - q0");
            state = "q0";
        }
        else{
            System.out.println("Invalid input.. Exiting automaton");
            break;
        }
    }

    if(state.equals("q2")){
        System.out.println("\nString " + input + " accepted");
    }
    else{
        System.out.println("\nString " + input + " not accepted");
    }
    
    }
}
