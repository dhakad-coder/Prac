public class TestEncapsulation {
    public static void main(String[] args){
        //creating instance of Account class
        Prac10 acc = new Prac10();
        //setting values through setter methods
        acc.setAcc_no(000000000);
        acc.setName("Raman Ranjan");
        acc.setEmail("ramanranjan15.2013@gmail.com");
        acc.getAmount(900000l);
        //getting values through getter methods
        System.out.println(acc.getAcc_no()+""+acc.getName()+""+acc.getEmail()+""+ acc.getAmount(900000l));
    }
}
