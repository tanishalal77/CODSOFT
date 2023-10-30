import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int mynumber=(int)(Math.random()*100);
int usernumber;
do {
    System.out.println("guess my number");
    usernumber = sc.nextInt();
    if(usernumber==mynumber){
        System.out.println("congratulations");
        break;
    }
    else if(usernumber>mynumber){
        System.out.println("your number is too large");
    }
    else{
        System.out.println("your number is too small");
    }
} while(usernumber>=0);
System.out.println("my number was"+ mynumber);
}
}