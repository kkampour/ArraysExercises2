import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {


    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter some numbers and type done when you're done typing numbers");
        while (in.hasNextInt()){
            list.add(in.nextInt());
        }
        System.out.println("ArrayList with duplicates: "
                + list);
        List<Integer> newList = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("ArrayList with duplicates removed: "
                + newList);
    }
}


