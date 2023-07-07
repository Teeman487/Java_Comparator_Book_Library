public class Person implements Comparable<Person> {
    private String name;
   private int status;
   private  int age;

//   private StatusType designation;


    public Person(String name, int status, int age) {
        this.name = name;
        this.status = status;
        this.age = age;
       // this.designation = designation;
    }
    //


    public String getName() {
        return name;
    }

    public int getStatus() {
        return status;
    }
    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age,other.age);
    }

//    public StatusType getDesignation() {
//        return designation;
   // }
}
