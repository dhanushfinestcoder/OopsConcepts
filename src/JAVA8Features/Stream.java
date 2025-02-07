package JAVA8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


// STREAMS
//streams are normally pipeline in java works in manner in which it complete intermediate operations and terminal operations

public class Stream
{
    public static void main(String[] args) {
        int a[]={3,2,9,10,19,0,1};
        Arrays.stream(a).filter(i->i%2==0).forEach(System.out::println);
       // Arrays.stream(a).sorted(Comparator.comparingInt(a,b).reversed()).forEach(System.out::println);
        List<String> l= Arrays.asList("faf","kohli","salt","bethel","hello","hello");
        List<String>s=l.stream().
                        filter(str->str.startsWith("k")).
                        collect(Collectors.toList());
        List<String>dup=l.stream().distinct().collect(Collectors.toList());
//        System.out.println(l.stream().count());
//        System.out.println(dup);
//        System.out.println(s);
        Iterator<String>st= l.iterator();
        while(!(st.hasNext()))
        {
            System.out.println(st.toString());
        }
    }
}
