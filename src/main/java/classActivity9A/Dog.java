package classActivity9A;

public class Dog extends Animal{

    String color = "Black";

    void printColor(){
        System.out.println(color);
    }

    void printParentColor(){
        System.out.println(super.color);
    }
}
