package oops;

//import java.awt.*;

public class Rectangle {
    // write the code of rectangle class here

    Point topLeft ;



    int height;
    int width;
    int getArea(){
        return this.height * this.width;
    }
    int getPerimeter(){
        return 2 * (this.height+this.width);
    }
    Point getBottomright(){
        int brx= topLeft.getX()+width ;
        int  bry=topLeft.getY()-height;
        return new Point(brx,  bry);
    }

}
