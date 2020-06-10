public class Person {

        private String name;


        public String getName() {
            return name;
        }

        public  Person(String name) {
            this.name = name;
        }

        public void sayHello() {
            System.out.printf("Mr. %s We've been expecting you - Agent Smith.\n", name);
        }

    public static void main(String[] args) {
        Person p1 = new Person("Anderson");
        Person p2 = new Person("Dylan");
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        p1.sayHello();
        p2.sayHello();
    }
}

