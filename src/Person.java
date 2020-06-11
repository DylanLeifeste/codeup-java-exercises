public class Person {

        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name){
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
        p2.setName("Neo");
        p2.sayHello();
    }
}

