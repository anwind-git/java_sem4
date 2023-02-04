// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class dz1 {

    public static LinkedList<Integer> ListArray(LinkedList<Integer> linkList) {

        System.out.println("Начальный список: " + linkList);
        Collections.reverse(linkList);
        System.out.println("Перевернутый список: " + linkList);
        return linkList;
    }
    public static void main(String[] args) {
        LinkedList<Integer> linkList = new LinkedList<>(Arrays.asList(5, 10, 12, 17, 1, 3, 2));
        ListArray(linkList);
    }
}
