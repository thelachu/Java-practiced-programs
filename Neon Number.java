import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number :");
        int n=sc.nextInt();
int square=n*n;

int sum=0;
System.out.println("Total  :"+square);
while(square>0){
    sum+=square%10;
    square=square/10;

}
if(sum==n){
    System.out.println("Neon number");
}else{
    System.out.println("Not a Neon number");

}
    }
}
