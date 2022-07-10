public class Spruce {

    public static void main(String[] args) {
        // Write code here
        for (int i = 0; i < 4; i++)
        {
            for(int j = 2; j >=i ; j--)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++)
            {
                System.out.print("*");
            }
            for(int l = 0; l < i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("   *");   
    }
}//this legit took me an hour :(, and I did not think of decreasing j ;(
