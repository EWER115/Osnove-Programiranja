import java.util.Scanner;

public class PiramidaStevil{
    static int x;
    static Scanner sc = new Scanner(System.in);
    static int y=1;
    
    public static void main(){
        System.out.print("Vnesite višino piramide: ");
        x = sc.nextInt();
        Piramida();
    }
    
    public static void Piramida(){
        for(int i=0; i<x; i++){
            for(int j=x-i-1;j>0;j--){
                System.out.printf(" ");
            }for(int k=0; k<1+2*i; k++){
                System.out.printf("%d", (y<10)?y:(y=0));
                y++;
            }
            System.out.print("\n");
        }
    }
}
