// Реализуйте очередь с помощью LinkedList со следующими методами: 
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class dz2 {
    public static LinkedList<Integer> enqueue(LinkedList<Integer> linkList) {
        System.out.println("Начальный список: " + linkList);
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите элемент для добавления в конец списка: ");
        int number = iScanner.nextInt();
        linkList.add(number);
        System.out.println("Список после добовления элемента в конец очереди: " + linkList);
        return linkList;
    }

    public static int dequeue(LinkedList<Integer> linkList) {
        System.out.println("Начальный список: " + linkList);
        System.out.println("Удаляемый элемент: " + first(linkList));
        int linkList1 = linkList.getFirst();
        linkList.pollFirst();
        System.out.println("Очередь после удаления элемента: " + linkList);

        return linkList1;
    }


    private static Integer first(LinkedList<Integer> linkList) {
        return linkList.getFirst();
    }


    public static void main(String[] args) {
        LinkedList<Integer> linkList = new LinkedList<>(Arrays.asList(5, 10, 12, 17, 1, 3, 2));
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Выберете метод: конец очереди(1), удалить первый элемент(2): ");
        int num = iScanner.nextInt();
        switch (num) {
            case 1:
                enqueue(linkList);
                break;
            case 2:
                dequeue(linkList);
                break;
            default:
                System.out.print("Нет такой команды");
        }
    }
}