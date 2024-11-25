package ca.nl.cna.java1.inheritance.shapes;

import java.util.ArrayList;
import java.util.Random;

public class FunWithRandomShapes {

    public static void main(String[] args) {
        System.out.println("Fun with Random Shapes");

        ArrayList<Shape> shapeArrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            shapeArrayList.add(getRandomShape());
        }
        shapeArrayList.forEach(shape -> System.out.println(shape.getDescription()));
    }

    public static Shape getRandomShape(){
        Random random = new Random();

        //Flip a coin
        if(random.nextInt() % 3 == 0){
            return new Circle(random.nextInt(10)+1);
        } else if (random.nextInt() % 3 == 1){
            return new Rectangle(random.nextInt(10)+1, random.nextInt(10)+1);
        } else {
            return new Shape() {
                @Override
                public double getArea() {
                    return 12;
                }

                @Override
                public String getDescription() {
                    return "Fake Shape I just made up " + this.getArea();
                }
            };
        }

    }

}
