package javaPrograms;
import java.util.*;

public class marksElseIfStack {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter your marks: ");
    int marks = sc.nextInt();
        if (marks>90){
            System.out.println("Excellent !!!");
        }else if(marks>80){
            System.out.println("v good!!!");

        }else if (marks>70){
            System.out.println("good !!!");

        }else if (marks>60){
            System.out.println("fair!!!");

    }else{
        System.out.println("Below avg");
    }
}
}

    
