import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        String month;
        int day;
          
        System.out.print("Month :  ");
        month = sc.nextLine();
            
        System.out.print("Day : ");
        day = sc.nextInt();
        sc.close();
            
        if(month.equals("January")) {
            if(day >= 22) {
                System.out.println("You are Aquarius!");
            } 
            else {
                System.out.println("You are Capricorn!");
            }
                
        }
        else if(month.equals("February")) {
            if(day >= 20) {
                System.out.println("You are Pisces!.");
            } 
            else {
                System.out.println("You are Aquarius!");
            }
        }
        else if(month.equals("March")) {
            if(day <= 20) {
                System.out.println("You are Pisces!");
            }
            else {
                System.out.println("You are Aries!");
            }
        } 
        else if(month.equals("April")) {
            if(day <= 20) {
                System.out.println("You are Aries!");
            } 
            else {
                System.out.println("You are Taurus!");
            }
        } 
        else if(month.equals("May")) {
            if(day < 22) {
                System.out.println("You are Taurus!");
            } 
            else {
                System.out.println("You are Gemini!");
            }
        }
        else if(month.equals("June")) {
            if(day < 23) {
                System.out.println("You are Gemini!");
            } 
            else {
                System.out.println("You are Cancer!");
            }			
        } 
        else if (month.equals("July")) {
            if(day < 23) {
                System.out.println("You are Cancer!");
            } 
            else {
                System.out.println("You are Leo!");
            }
        } 
        else if(month.equals("August")) {
            if(day < 23) {
                System.out.println("You are Leo!");
            } 
            else {
                System.out.println("You are Virgo!");
            }
        } 
        else if(month.equals("September")) {
            if(day < 23) {
                System.out.println("You are Virgo!");
            } 
            else {
                System.out.println("You are Libra!");
            }
        } 
        else if(month.equals("October")) {
            if(day <=23) {
                System.out.println("You are Libra!");
            } 
            else {
                System.out.println("You are Scorpio!");
            }
        }
        else if(month.equals("November")) {
            if(day < 22) {
                System.out.println("You are Scorpio!");
            } 
            else {
                System.out.println("You are Sagittarius!");
            }
        }
        else if(month.equals("December")) {
            if(day < 22) {
                System.out.println("You are Sagittarius!");
            } 
            else {
                System.out.println("You are Capricorn!");
            }
        }    
    }
}
