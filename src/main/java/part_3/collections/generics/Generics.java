package part_3.collections.generics;

import part_3.collections.generics.classes.BaseObject;
import part_3.collections.generics.classes.ChildObject;
import part_3.collections.generics.classes.User;
import part_3.collections.generics.examples.Example1;
import part_3.collections.generics.examples.Example2;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {

        Example1<User> example1 = new Example1<>();
        System.out.println("example1.getInstance() = " + example1.getInstance());
        example1.setInstance(new User("Alex", 32));
        System.out.println("example1.getInstance() = " + example1.getInstance());

        Example2.simpleInit(new User());

        Example2<User> example2 = Example2.init(new User());
        example2.setInstance(new User("Alex" , 25));
        System.out.println("example2.getInstance() = " + example2.getInstance());

        List<BaseObject> listOfBaseObject = new ArrayList<>();
        List<User> listOfUsers = new ArrayList<>();
        List<ChildObject> childObjectList = new ArrayList<>();

        // WildCard lets getting of any Generic
        example1(listOfBaseObject);
        example1(listOfUsers);
        example1(childObjectList);

        //WildCard lets getting of any User Generic and extended
        /*example2(listOfBaseObject); <-- error */
        example2(listOfUsers);
        example2(childObjectList);

        //WildCard lets getting of any User Generic and Father(super) class
        example3(listOfBaseObject);
        example3(listOfUsers);
        /*example3(childObjectList); <-- error*/



    }

    public static void example1(List<?> list){}
    public static void example2(List<? extends User> list){}
    public static void example3(List<? super User> list){}
}
