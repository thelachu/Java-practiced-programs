import java.util.Scanner;
class calculator{

public static void main(String args[]){
login();
}
static void login(){
String userId="lachu";
String password="lachu@123";	
Scanner sc=new Scanner(System.in);
System.out.print("Enter ID ");

String enterdId=sc.nextLine();
System.out.print("Enter Password ");
	
String enterdPass=sc.nextLine();	

if(userId.equals(enterdId)){
if(password.equals(enterdPass)){
System.out.print("Welcome ");
calc();
}
else{
System.out.println("Enter correct User Id or Password");
login();
}
}else {
System.out.println("Enter correct User Id or Password");
login();

}
}
static void calc(){
Scanner sc=new Scanner(System.in);

System.out.print("Enter Operand a");
String a=sc.nextInt();
System.out.print("Enter Operand a");

String b=sc.nextInt();
System.out.print("Enter Operation 1 for + 2 for - 3 for * 4 for /");

String operation=sc.nextInt();
Switch(operation){
    case 1:{System.out.print(a+b);};
    break;
    case 2:{System.out.print(a-b);};
    break;    
    case 3:{System.out.print(a*b);};
    break;
    case 4:{System.out.print(a/b);};
    break;
}
}
}