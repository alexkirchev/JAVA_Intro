package queue;

import qa.course.Human;

import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Human> queue = null; //we cannot create instance of Interface in Queue
        Human person = new Human();
        person.setName("Joe");
        person.setAge(12);
        queue.add(person);
        System.out.println(queue);

    }
}
