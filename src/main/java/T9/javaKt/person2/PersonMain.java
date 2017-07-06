package T9.javaKt.person2;

import JavaKt.person.Person;

/**
 * Created by apple on 17/4/21.
 * java与kotlin 共生2:
 */
public class PersonMain {
    public static void main(String... args) {
        Person person = new Person("cici", 17);
        System.out.println(person.getName() + " is " + person.age);
        person.setName("尔康");
        person.age = 18;
        System.out.println(person.getName() + " is " + person.age);
    }
}
