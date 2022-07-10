public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        
        for(int i = 0; i < amount; i++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        for(int i = 1; i <= amount; i++)
        {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        for(int i = 1; i <= size; i++)
        {
            printWhitespaces(size -i);
            printStars(i);
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        for(int i = 0; i < height; i++)
        {
            printWhitespaces(height -i -1);
            printStars(i * 2 +1);
        }
        printWhitespaces(height-2);
        printStars(3);
        printWhitespaces(height-2);
        printStars(3);

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(4);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}