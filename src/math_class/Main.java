package math_class;

/*
 * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Math.html
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //using math class which is a static class
        //static things (methods and variables) belong to the class rather than
        //objects (instance of the class)
        //we don't need to create an object since Math class is static
        // ClassName.methodName(); e.g. Math.random()
        // ClassName.staticVariableName(); e.g. Math.PI

        // abs
        int num1 = -2;
        System.out.println(Math.abs(num1));

        // pow
        double num2 = Math.pow(3,5);
        System.out.println(num2);

        // sqrt
        double num3 = Math.sqrt(80);
        System.out.println(num3);


        //create a random number in the range [0,1)
        double random1 = Math.random();
        System.out.println(random1);
        //create a random number in the range [0, n)
        // ex: [0,6)
        double random2 = 6 * Math.random();
        System.out.println(random2);

        //For homework

        // create a random number in the range [0,n]
        // ex: [0,6]
        int random3 = (int) (7 * Math.random());
        System.out.println(random3);

        // create a random number in the range [m,n]
        // ex: [1,7]
        int random4 = 1 + (int) (7 * Math.random());
        System.out.println(random4);

        // Creat a random negative integer in the range [-m, 0]
        // ex: [-6,0]
        int random5 =  (int) (-7 * Math.random());
        System.out.println(random5);

        // Creat a random negative integer in the range [-m, -n]
        // ex: [-7,-1]
        int random6 = -1 + (int) (-7 * Math.random());
        System.out.println(random6);

        // Creat a random negative integer in the range [-m, n]
        // ex: [-7,1]
        int random7 = 1 + (int) (-7 * Math.random());
        System.out.println(random7);



        //using the Random Class
        //This is not static so we have to create a Random object

        //create a Random object
        Random randObj = new Random();

        //get int with and without bound
        int randInt = randObj.nextInt();
        System.out.println(randInt);

        //with bound
        int randInt2 = randObj.nextInt(100);
        System.out.println(randInt2);

        // get double
        double randDouble = randObj.nextDouble();
        System.out.println(randDouble);
    }
}
