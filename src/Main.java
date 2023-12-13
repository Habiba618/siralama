import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.print("a = ");
        a=sc.nextDouble();
        System.out.print("b = ");
        b=sc.nextDouble();
        System.out.print("c = ");
        c=sc.nextDouble();
        if(a<c && b<c){
            if(b<c){
                System.out.println(a + " "+ b+" "+c);
            }else {
                System.out.println(a + " "+ c+" "+b);
            }
        } else if (b<c && b<a){
            if(a<c){
                System.out.println(b + " "+ a+" "+c);
            }else {
                System.out.println(b+ " "+ c+" "+b);
            }

            }else{if(a<b){
            System.out.println(c + " "+ a+" "+b);
        }else {
            System.out.println(c+ " "+ b+" "+a);
        }
    }
}}
