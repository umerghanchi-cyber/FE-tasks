package Lab06_ArrayListTasks;

import java.util.ArrayList;

public class Task1_RemoveNegative {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(-3);
        numbers.add(8);
        numbers.add(-1);
        numbers.add(12);
        numbers.add(-7);
        numbers.add(4);

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) < 0) {
                numbers.remove(i);
                i--; // Move one step back after removing
            }
        }

        System.out.println("ArrayList: " + numbers);
    }
}
