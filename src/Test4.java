import java.awt.*;
import java.util.*;
import java.util.List;

abstract class Test4 {
    abstract void draw();
}
class Rectangle extends Test4{
    void draw(){
        System.out.println("drawing rectangle");
    }
}
class Circle extends Test4{
    void draw(){
        System.out.println("drawing circle");
    }
}
class GenericTest{
    //creating a method that accepts only child class of shape
    public static void drawShapes(List<? extends Test4> lists){
        for(Test4 s:lists){
            s.draw();// calling method of shape class by child class instance
        }
        }
        public static void main(String[] args){
        List<Rectangle> list1 = new ArrayList<Rectangle>();
        list1.add(new Rectangle());

        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());

        drawShapes(list1);
        drawShapes(list2);
        }
    }

