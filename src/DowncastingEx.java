import java.sql.SQLOutput;

public class DowncastingEx {
    String name;

    //A method which prints the data of the parent class
    void showMessage()
    {
        System.out.println("Parent method is called");
    }
}

//child class
class Child extends DowncastingEx{
    int age;


    //performing overriding
    @Override
    void showMessage(){
        System.out.println("Child method is called");
    }
}

