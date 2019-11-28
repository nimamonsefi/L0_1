/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author nimamonsefi
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double age;
        String bloodType;
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter Your Age : ");
        age=scanner.nextDouble();
        
        if(age<18){
            System.out.println("You Are Too Young !!!");
        }
        else if(age>=70){
            System.out.println("You Are Too Old !!!");
        }
        else{
            System.out.println("That's It !!!");
        }
        
        System.out.print("\nEnter Your Blood Type : ");
        bloodType=scanner.next();
        
        switch (bloodType){
            case "A":
                System.out.println("Your Blood Type Is : "+bloodType);
                break;
            case "B":
                System.out.println("Your Blood Type Is : "+bloodType);
                break;
            case "AB":
                System.out.println("Your Blood Type Is : "+bloodType);
                break;
            case "O":
                System.out.println("Your Blood Type Is : "+bloodType);
                break;
            case "a":
                System.out.println("Your Blood Type Is : "+bloodType);
                break;
            case "b":
                System.out.println("Your Blood Type Is : "+bloodType);
                break;
            case "ab":
                System.out.println("Your Blood Type Is : "+bloodType);
                break;
            case "o":
                System.out.println("Your Blood Type Is : "+bloodType);
                break;
            default:
                System.out.println("Your Blood Type Is Not True !");
        }
    }
    
}
