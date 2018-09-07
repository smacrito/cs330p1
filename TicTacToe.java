import java.util.*;
import java.io.*;
public class TicTacToe{
    static boolean checkWinner = false;
    static HashSet checkDupes = new HashSet();
    static char one = '1';
    static char two = '2';
    static char three= '3';
    static char four = '4';
    static char five = '5';
    static char six = '6';
    static char seven = '7';
    static char eight= '8';
    static char nine = '9';
    public static void main(String argsp[]){
        draw();
        
        }
        public static void checkWin(){
            if(one==(two) && two==(three));
        }
        public static void draw(){
            System.out.println(one + "|" + two + "|" + three + "\n" + four + "|" + five +"|" + six + "\n" + seven + "|" + eight + "|" + nine +"\n");
        }
        public static void playerX(){
            int turnCount = 0;
            char choice = '0';
            Scanner sc = new Scanner(System.in);

            while(turnCount < 9 && checkWinner == false){

                System.out.println("Player X, enter the number that corresponds to the cell: ");
                choice = sc.next().charAt(0);
                checkDupes.add(choice);

                if(one==(choice) && !checkDupes.contains(choice)){
                    one ='x';
                }
                else if(two==(choice) && !checkDupes.contains(choice)){
                    two ='x';
                }
                else if(three==(choice) && !checkDupes.contains(choice)){
                    two ='x';
                }
                else if(four==(choice) && !checkDupes.contains(choice)){
                    two ='x';
                }
                else if(five==(choice) && !checkDupes.contains(choice)){
                    two ='x';
                }
                else if(six==(choice) && !checkDupes.contains(choice)){
                    two ='x';
                }
                else if(seven==(choice) && !checkDupes.contains(choice)){
                    two ='x';
                }
                else if(eight==(choice) && !checkDupes.contains(choice)){
                    two ='x';
                }
                else if(nine==(choice) && !checkDupes.contains(choice)){
                    two ='x';
                }
        }
    }
}
