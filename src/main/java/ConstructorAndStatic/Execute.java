package ConstructorAndStatic;

public class Execute {

    public static void main(String[] args){
        Node N1=new Node(2);
        System.out.println(N1.data);
        Node N2= new Node(N1);
        System.out.println(N2.data);


       Math M1= new Math();
      System.out.println( M1.getCircleArea(2));
    }
}
