import java.util.Scanner;

public class area {
int len,breadth;
public int getarea(int len)
{
    return len*len;
}
    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello enter the length of square:\n");
        int length ;
        Scanner sc = new Scanner(System.in);

        length = sc.nextInt();

        area a = new area();
        int result = a.getarea(length);

        System.out.println(result);



//        int result = a.getarea(length);

//        System.out.println(a.getarea(length));



    }
}
