import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        Person ade = new Person("ade",2,30);
        Person  toheeb= new Person("toheeb",5,20);
        Person shade = new Person("shade",4,25);
        Person wale = new Person("wale",3,25);

        PriorityQueue<Person> queue = new PriorityQueue<>();
        queue.add(ade);
        queue.add(shade);
        queue.add(toheeb);
        queue.add(wale);
        while (!queue.isEmpty()) {
            Person result = queue.poll();
            System.out.println("Person rank: " + result.getName() + result.getAge());
        }

    }
}
