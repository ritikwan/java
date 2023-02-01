// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class addn {
    
   int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!\n Enter a number:"); 
        Scanner sc = new Scanner(System.in);        
        
        int n1,n2;
        
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        
        
        addn obj = new addn();
        int sum = obj.add(n1,n2);
        
        
        System.out.println("sum is: "+ sum);
        // System.out.println("Entered number " + addn.add(n1,n2));
        
        
        
    }
}