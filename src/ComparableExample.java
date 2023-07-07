public class ComparableExample {
    public static void main(String[] args) {

        Person ade = new Person("ade",2,30);
        Person  toheeb= new Person("toheeb",5,20);
        Person shade = new Person("shade",4,25);
        Person wale = new Person("wale",3,25);

        int result = wale.compareTo(shade);
        System.out.println(result);
        if(result<0) {
            System.out.println(ade.getName() + " is younger than " + shade.getName());
        }
        else if(result >0) {
            System.out.println(ade.getName() + " is older than " + shade.getName());

        }
        else {
            System.out.println(ade.getName() + " age is equal to " + shade.getName());
        }


    }

}
