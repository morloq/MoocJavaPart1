public class Spruce {
    public static void main(String[] args){
        for (int i = 1; i <= 5; i++)
        {
            for(int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }
            
            for (int l = 0 ; l < i-1; l++)
            {
                System.out.print("*");
            }
            
            for(int k = 0; k < i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("    *");
    }
}