/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg365days;
import java.util.Scanner;
/**
 *
 * @author Serenna
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scnr = new Scanner(System.in);
           
        System.out.println("----------------------------"
                + "\n         Welcome to  "
                + "      \n       Days of Quotes"
                + "\n----------------------------");

         

        System.out.println("What is the day of the of the month 1-31 or '0' for quit\n");
        int dayNum = scnr.nextInt();
        
        while (dayNum != 0){
            switch (dayNum){
                case 1:
                    System.out.println("Dreams are necessary to life.\nAnais Nin");
                    break;
                case 2:
                    System.out.println("A strong, positive self-image is the best possible preparation for success.\nJoyce Brothers");
                    break;
                case 3:
                    System.out.println("You have to dream before your dreams can come true.\nA. P. J. Abdul Kalam");
                    break;
                case 4:
                    System.out.println("Positive anything is better than negative nothing.\nElbert Hubbard");
                    break;
                case 5:
                    System.out.println("Failure will never overtake me if my determination to succeed is strong enough.\nOg Mandino");
                    break;
                case 6:
                    System.out.println("Hold fast to dreams, for if dreams die, life is a broken-winged bird that cannot fly.\nLangston Hughes");
                    break;
                case 7:
                    System.out.println("With the new day comes new strength and new thoughts.\nEleanor Roosevelt");
                    break;
                case 8:
                    System.out.println("My dear friend, clear your mind of cant.\nSamuel Johnson");
                    break;
                case 9:
                    System.out.println("It does not matter how slowly you go as long as you do not stop.\nConfucius");
                    break;
                case 10:
                    System.out.println("The future belongs to those who believe in the beauty of their dreams.\nEleanor Roosevelt");
                    break;
                case 11:
                    System.out.println("A positive attitude can really make dreams come true - it did for me.\nDavid Bailey");
                    break;            
                case 12:
                    System.out.println("Stay focused, go after your dreams and keep moving toward your goals.\nLL Cool J");
                    break;
                    
                case 13:
                    System.out.println("You can't cross the sea merely by standing and staring at the water.\nRabindranath Tagore");
                    break;
                            
                case 14:
                    System.out.println("Life is 10% what happens to you and 90% how you react to it.\nCharles R. Swindoll");
                    break;    
                case 15:
                    System.out.println("Good, better, best. Never let it rest. 'Til your good is better and your better is best.\nSt. Jerome");
                    break;   
                case 16:
                    System.out.println("It always seems impossible until it's done.\nNelson Mandela");
                    break;
                case 17:
                    System.out.println("Live life to the fullest, and focus on the positive.\nMatt Cameron");
                    break;            
                case 18:
                    System.out.println("Follow your dreams, believe in yourself and don't give up.\nRachel Corrie");
                    break;            
                case 19:
                    System.out.println("Yesterday is not ours to recover, but tomorrow is ours to win or lose.\nLyndon B. Johnson");
                    break;            
                case 20:
                    System.out.println("Each day, I come in with a positive attitude, trying to get better.\nStefon Diggs");
                    break;           
                case 21:
                    System.out.println("Only I can change my life. No one can do it for me.\nCarol Burnett");
                    break;            
                            
                case 22:
                    System.out.println("It's the little details that are vital. Little things make big things happen.\nJohn Wooden");
                    break;            
                            
                 case 23:
                    System.out.println("Your talent is God's gift to you. What you do with it is your gift back to God.\nLeo Buscaglia");
                    break;           
                case 24:
                    System.out.println("Obstacles are those frightful things you see when you take your eyes off your goal.\nHenry Ford");
                    break;            
                case 25:
                    System.out.println("Discipline is the bridge between goals and accomplishment.\nJim Rohn");
                    break;            
                case 26:
                    System.out.println("Set your goals high, and don't stop till you get there.\nBo Jackson");
                    break;            
                case 27:
                    System.out.println("The journey of a thousand miles begins with one step.\nLao Tzu");
                    break;            
                 case 28:
                    System.out.println("Yesterday is but today's memory, and tomorrow is today's dream.\nKhalil Gibran");
                    break;
                case 29:
                    System.out.println("Once you replace negative thoughts with positive ones, you'll start having positive results.\nWillie Nelson");
                    break;            
                case 30:
                    System.out.println("A dream doesn't become reality through magic; it takes sweat, determination and hard work.\nColin Powell");
                    break;
                case 31:
                    System.out.println("Trust in dreams, for in them is hidden the gate to eternity.\nKhalil Gibran");
                    break;
                default:
                    System.out.println("Please enter a valid day!\n");
            }
            System.out.println("\nPlease enter a day 1-31 or 0 to quit\n");
            dayNum = scnr.nextInt();
        }            

    }
    
  
}
