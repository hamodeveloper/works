package lesson1;

public class ifExample {

    public static void main(String[] args) {

        int x;

        int y;

        x = 10;

        y = 20;

        if(x < y) System.out.println("Переменная х меньше y");

        x = x * 2;
        if(x == y) System.out.println("Переменная x теперь равен y");

        x = x * 2;
        if(x > y) System.out.println("Переменная x теперь больше y");


    }

}