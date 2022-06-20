/**import java.util.*;
class Test2 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Raman");
        list.add("Shiwam");
        //list.add(99);// compile time error

        String s = list.get(1);// type casting is not required
        System.out.println("element is: "+ s);

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
*/

//Using Map
import java.util.*;
class Test2{
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<Integer, String >();
        map.put(1, "Susti");
        map.put(5, "Aman");
        map.put(9, "Shubham");

        //Now use Map.Entry for set and Iterator
        Set<Map.Entry<Integer,String>> set = map.entrySet();

        Iterator<Map.Entry<Integer,String>> itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry e = itr.next();// no need to typecast
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}
