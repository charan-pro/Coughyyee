import java.util.*;

class Que {
    public static void main(String[] args) {
        // Fix: Use LinkedList as the concrete implementation of Queue
        Queue<Object> s = new LinkedList<>();
        
        s.add("Romero");
        s.add("zara");
        s.add("hardik");
        s.add("pandya");
        s.add("ronaldo");
        s.add("caliafizer");
        s.add("messi");
        
        System.out.println("Queue : " + s);
        System.out.println(s.add(10)); 
        System.out.println(s.add(20));
        System.out.println(s.add(30));
        System.out.println("Removed element: " + s.poll()); 
        System.out.println("Peek 1: " + s.peek());
        System.out.println("Peek 2: " + s.peek());
    }
}