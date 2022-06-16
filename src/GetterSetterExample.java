//public class GetterSetterExample {
//    private static int salary;
//    public void storeSalaryDB(int salary){
//        //Code for storing the salary in the database
//    }
//
//    //main method
//    public static void main(String args[]){
//        GetterSetterExample obj = new GetterSetterExample();
//        obj.salary = -50000;
//        //storing salary in database
//        obj.storeSalaryDB(salary);
//    }
//}

public class GetterSetterExample
{
    private int salary;
//    private salary;
    //a setter method that assign a
    //value to the salary variable
    void setSalary(int s)
    {
        if(s<0)
        {
            s= -s;
        }

        this.salary = s;
    }

    //a getter method to retrieve the salary
    int getSalary()
    {
        return this.salary;
    }

    public GetterSetterExample()
    {
        //code for storing the salary in the database
        System.out.println("The salary is 50000");

    }

    //main method
    public static void main(String[] args){
        //creating an object of s the class GetterSetter Example
        GetterSetterExample obj = new GetterSetterExample();
        obj.setSalary(-50000);
        
        int salary = obj.getSalary();
        //storing salary in database
        obj.storeSalaryDB(salary);
        
    }

    private void storeSalaryDB(int salary) {
    }
}
