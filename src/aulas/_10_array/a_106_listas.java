package aulas._10_array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import utils.Clear;

public class a_106_listas {
    public static void main(String[] args) {
        Clear.clearScreen();
        List<Integer> listN = new ArrayList<>();
        listN.add(null);
        listN.add(12);
        System.out.println(listN);
        listN.add(12);
        listN.add(1,7);
        listN.add(15);
        listN.addLast(25);
        listN.addLast(152);
        listN.addLast(1000);
        System.out.println(listN);
        listN.remove(2);
        System.out.println(listN);
        listN.removeIf(x -> String.valueOf(x).startsWith("1"));
        // listN.removeIf(x -> !(String.valueOf(x).startsWith("1")));
        System.out.println(listN);

        List<String> listS = new ArrayList<>();
        listS.add("Maria");
        listS.add("Fabrício");
        listS.add("Amy");
        listS.add("João");
        listS.add("Nicolly");
        listS.add("Ana Maria");
        System.out.println(listS.size());
        System.out.println(listS);
        System.out.println("Index of Amy: " + listS.indexOf("Amy"));
        List<String> result = listS.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println(result);
    }
}
