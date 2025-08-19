
public class Main {
    public static void main(String[] args) {
int n=3;
for(int i=1;i<=n;i++){
    for(int j=1;j<=2;j++){
        System.out.print(" ");
    }
    for(int k=1;k<=i;k++){
        System.out.print("*");
    }        System.out.println("");

}
for(int i=1;i<=n;i++){
    System.out.print("*");

}    System.out.println("");

        for(int i=n;i>=0;i--){
            for(int j=1;j<=2;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }        System.out.println("");

        }
    }
}