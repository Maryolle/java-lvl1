
/**
*Java1. HW7
*
*@author Maryana Lapina
*@version 29/11/21
*/
import java.util.Scanner;

public class CatFood {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int action;
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Рыжик", 5, false);
        allCats[1] = new Cat("Снежок", 30, false);
        allCats[2] = new Cat("Муся", 10, false);
        allCats[3] = new Cat("Черныш", 45, false);


        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].fullness == false && allCats[i].appetite < plate.food){
                allCats[i].eat(plate);
                allCats[i].fullness = true;
                System.out.println("Кот " + allCats[i].name + " поeл");
            } else {
                System.out.println("Кот " + allCats[i].name + " не поел");
            }
        }
        plate.info();
        System.out.println("Сколько грамм корма добавить еще в миску?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}

class Cat {
    public String name;
    public int appetite;
    public boolean fullness;

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}

class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void increaseFood(int x) {
        food += x;
    }
    public void info() {
        System.out.println("Всего еды: " + food);
    }
}