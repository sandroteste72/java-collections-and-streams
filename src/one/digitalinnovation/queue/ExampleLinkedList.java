package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class ExampleLinkedList {
    public static void main(String[] args) {
        Queue<String> bankQueue = new LinkedList<>();
        bankQueue.add("Pamela");
        bankQueue.add("Patricia");
        bankQueue.add("Roberto");
        bankQueue.add("Flavia");
        bankQueue.add("Anderson");

        System.out.println(bankQueue);

        String customerToBeServed = bankQueue.poll();
        System.out.println(customerToBeServed);
        System.out.println(bankQueue);

        String firstInTheBankQueue = bankQueue.peek();
        System.out.println(firstInTheBankQueue);
        System.out.println(bankQueue);

//        bankQueue.clear();

        try {
            String firstElementOrError = bankQueue.element();
            System.out.println(firstElementOrError);
            System.out.println(bankQueue);
        } catch (NoSuchElementException e) {
            System.out.println("Empty Queue: " + e.getMessage());
        }

        System.out.println("===============");

        for (String name : bankQueue) {
            System.out.println(name);
        }

        System.out.println("===============");

        Iterator<String> iteratorBankQueue = bankQueue.iterator();

        while (iteratorBankQueue.hasNext()) {
            System.out.println(">>> " + iteratorBankQueue.next());
        }

        System.out.println(bankQueue.size());

        System.out.println(bankQueue.isEmpty());
    }
}
