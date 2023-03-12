import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deque<Person> queue = new ArrayDeque<>(generateClients());
        while (!queue.isEmpty()){
            for (Person a : queue) {
                System.out.println(a + " прокатился на атракционе");
                if(a.getTickets() == 0){
                    a.poll();
                } else {
                    a.poll();
                    a.offer();
                    return a.getTickets()--;
                }
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
