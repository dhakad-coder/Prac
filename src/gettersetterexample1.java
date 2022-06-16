class Employee  {
    //class member variable
    private int eld;
    private String eName;
    private String eDesignation;
    private String eCompany;

    public int getEmpId(){
        return eld;
    }
    public void setEmpId(final int eld){
        this.eld = eld;
    }
    public String getEmpName(){
        return eName;
    }
    public void setEmpName(final String eName){
        //Validating the employee's name and
        //throwing an exception if the name is null or its length is less than or equal to 0.
        if(eName == null || eName.length()<=0){
            throw new IllegalArgumentException();
        }
        this.eName = eName;
        }
        public String getEmpDesignation(){
            return eDesignation;
        }
        public void setEmpDesignation(final String eDesignation)
        {
            this.eDesignation = eDesignation;
        }
        public String getEmpCompany()
        {
            return eCompany;
        }

        public void setEmpCompany(final String eCompany)
        {
            this.eCompany = eCompany;
        }

        //for printing the values
        @Override
        public String toString()
        {
            return "Employee: [id = " + getEmpId() + ", name = " +getEmpName() + ", designation = " + getEmpDesignation() + ", company = " + getEmpCompany() + "]";
        }
    }
    //Main Class.
    public class gettersetterexample1 {
        //Main Method
        public static void main(String[] args){
            //Creating an object of the Employee Class
            final Employee emp = new Employee();
            //The employee details are getting set using the setter methods.

            emp.setEmpId(274293);
            emp.setEmpName("Raman");
            emp.setEmpDesignation("GET(Intern)");
            emp.setEmpCompany("Elektrobit");

            //Displaying the details of the employee details using the
            //'to String()' method, which uses the getter methods
            System.out.println(emp);

        }

    }

