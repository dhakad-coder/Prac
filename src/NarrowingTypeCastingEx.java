public class NarrowingTypeCastingEx {
    public static void main(String[] args){
        double d = 198.88;
        //converting double data type into long data type
        long l = (long)d;
        //converting long data type into int data type
        int i = (int)l;
        System.out.println("Before Conversion: "+d);
        //fractional part lost
        System.out.println("After conversion into long type: "+l);
        //fractional part lost
        System.out.println("After conversion into int type: "+i);
   }
}
