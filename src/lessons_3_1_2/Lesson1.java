package lessons_3_1_2;

public class Lesson1 {
    public static void main(String[] args) {
        // booleans are primitives

        // compare them with relational operators
        // < less than    <= less than or equal to
        // > greater than     >= greater than or equal to
        // == equal to     != not equal to

        int x = 7;
        System.out.println(x);
        int y = 8;
        System.out.println(y);

        //

        // is x greater than y? store result in boolean variable
        // boolean xGtY = x > y; False

        //which two rectangles are the same?
        Rectangle rect1 = new Rectangle(1,3);
        Rectangle rect2 = new Rectangle(1,3);
        Rectangle rect3 = new Rectangle(5,7);

        //does this work? why or why not? If not, fix it
        //NO! we need to use .equals() for objects. == compares
        // the references
        boolean oneAndTwo = rect1.equals(rect2);
        boolean oneAndThree = rect1.equals(rect3);
        boolean twoAndThree = rect2.equals(rect3);
        System.out.printf("""
                Rectangles 1 and 2: %b
                Rectangles 1 and 3: \
                %b
                Rectangles 2 and 3: %b""",oneAndTwo,oneAndThree,twoAndThree);
    }
}
