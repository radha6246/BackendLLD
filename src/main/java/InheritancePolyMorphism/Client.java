package InheritancePolyMorphism;

import java.util.Stack;
import java.util.Collections;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
 Client.display(st);
 ArrayList<Integer> At= new ArrayList<>();
 At.add(37);
 ArrayList<String> ASt= new ArrayList<>();
 ASt.add("Radha");
 Client.display(At);
 Client.display(ASt);
    }

    // Write the display method as per requirements of question here
    public static void display (String[] A){
        for(String item:A ){
            System.out.println(item);
        }


    }
    public static void display(Integer[] A) {
        for (Integer item : A) {
            System.out.println(item);
        }
    }


    public static void display (Character[] A){
        for(Character item:A ){
            System.out.println(item);
        }


    }
    public static void display (boolean[] A){
        for(boolean item:A ){
            System.out.println(item);
        }


    }
    public static void display (double[] A){
        for(double item:A ){
            System.out.println(item);
        }


    }
    public static <T> void display(Stack<T> stack) {
        for (T item : convertStackToIterable(stack)) {
            System.out.println(item);
        }
    }

    // Improved convertStackToIterable method (from previous discussion)
    public static <T> Iterable<T> convertStackToIterable(Stack<T> stack) {
        return Collections.unmodifiableCollection(stack); // Returns an unmodifiable view as Iterable
    }
    public static <T> void display(ArrayList<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }



}