package stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> drawer = new Stack<String>();
        drawer.push("Pan"); //push (add) Pan
        drawer.push("Plate"); // push Plate
        drawer.push("Fork"); //push Fork
        System.out.println(drawer); // prints drawer
        System.out.println(drawer.size()); // prints drawer size (3)
        System.out.println(drawer.pop()); // prints last element Fork and pops it (removes) from drawer
        System.out.println(drawer);  //prints drawer without removed Fork
        System.out.println(drawer.size()); // prints new size of drawer (2)
        drawer.add("Spoon"); //add (not normal) Spoon in drawer. add is operator for List
        drawer.add("Cup");
        drawer.add("Glass");
        System.out.println(drawer);//prints drawer
        drawer.remove(3); // removes (not normal) object wit index 3. remove is operator for List
        System.out.println(drawer);// prints drawer without object 3 (Cup)
        System.out.println(drawer.toArray());
    }
}
