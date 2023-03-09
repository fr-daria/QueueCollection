import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deque<Person> queue = new ArrayDeque<>(generateClients());
        while (!queue.isEmpty()){
            for (int a = 0; a < queue.size(); a++) {
                System.out.println(queue.peek() + " прокатился на атракционе");
                // if( человек имеет 0 билетов){
                //queue.poll()
                //}else {
                // поставь в конец очереди}
            }

        }

    }

    public static List<Person> generateClients() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Катя", "Каралова", 3));
        people.add(new Person("Илья", "Белый", 2));
        people.add(new Person("Никита", "Котиков", 5));
        people.add(new Person("Саша", "Мамаев", 1));
        people.add(new Person("Лена", "Цветкова", 2));
        return people;
    }
}
