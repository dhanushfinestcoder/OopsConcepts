package JAVA8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foreach
{
    public static void main(String[] args) {
        List<Integer> al=Arrays.asList(1,2,3,5,6);
        al.forEach((i)->System.out.println(i));
    }
}
