package oops.lec2;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human(20,"Priyanshu", 300000, false);
        Human h2 = new Human(19,"Keshav", 200000, false);

        System.out.println(Human.population);
        System.out.println(h1.population);
        System.out.println(h2.population);
    }
}