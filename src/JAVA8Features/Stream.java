package JAVA8Features;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream
{
    public static void main(String[] args) {
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
