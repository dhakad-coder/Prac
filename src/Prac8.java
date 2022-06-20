public class Prac8 {
    void run(){
        System.out.println("running");
    }
    class Splender extends Prac8{
        void run(){
            System.out.println("runnign safely with 60 km");
        }
        public void main(String[] args){
            Prac8 pr = new Splender();
            pr.run();
        }
    }

}


class Bank{
    float getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    float getRateOfInterest(){
        return 8.4f;
    }
}
class ICICI extends Bank{
    float getRateOfInterest(){
        return 7.3f;
    }
}
class AXIS extends Bank{
    float getRateOfInterest(){
        return 9.7f;
    }
}
class TestPoly{
    public static void main(String[] args){
        Bank b;
        b= new SBI();
        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());

        b= new ICICI();
        System.out.println("ICICI Rate of Interest:" + b.getRateOfInterest());

        b=new AXIS();
        System.out.println("AXIS RAte of Interest: " + b.getRateOfInterest());
    }
}


