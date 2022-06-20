public class WideningTypeCastingEx {
    public static void main(String[] args){
        int x = 7;
        //automatically converts the integer type into long type
        long y=x;
        //automatically converts the long type into float type
        float z=y;
        System.out.println("Before coanversion, int value"+x);
        System.out.println("After Conversion, long value"+y);
        System.out.println("After conversion, float value"+z);
    }
}
