import java.util.Scanner;

public class Creating_array {
    public static void main(String args[]) {
         
    
        int marks[] = new int [100];
        
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt(); 
        marks[1] = sc.nextInt(); 
        marks[2] = sc.nextInt(); 

    
        System.out.println("maths : "+marks[0]);
        System.out.println("chemistry : "+marks[1]);
        System.out.println("phy : "+marks[2]);

        

        marks[2] = marks[2]+1;
        System.out.println(marks[2]);


        
    }
    
}