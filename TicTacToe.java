import java.util.*;
import java.io.*;

public class TicTacToe{

    boolean checkWinner = false;

    HashSet checkDupes = new HashSet();

    public static void main(String argsp[]){
        draw();
        
        }

        public void checkWin(){
            if(one.equals(two) && two.equals(three));
        }

        public static String draw(){
            return System.out.println(one + "|" + two + "|" + three + "\n" + four + "|" + five +"|" + six + "\n" + seven + "|" + eight + "|" + nine +"\n");
        }

        public static void playerX(){
            int turnCount = 0;
            int choice = 0;
            Scanner sc = new Scanner(System.in);

            while(turnCount < 9 && checkWinner == false){

                System.out.println("Player X, enter the number that corresponds to the cell: ");
                choice = sc.nextChar();
                checkDupes.add(choice);

                if(one.equals(choice) && !checkDupes.contains(choice)){
                    one ='x';
                }
                else if(two.equals(choice) && !checkDupes.contains(choice)){
                    two ='x';
                }
                else if(three.equals(choice) && !checkDupes.contains(choice)){
                    two ='x';
                }
                else if(four.equals(choice) && !checkDupes.contains(choice)){
                    two ='x';
                }
                else if(five.equals(choice) && !checkDupes.contains(choice)){
                    two ='x';
                }
                else if(six.equals(choice) && !checkDupes.contains(choice)){
                    two ='x';
                }
                else if(seven.equals(choice) && !checkDupes.contains(choice)){
                    two ='x';
                }
                else if(eight.equals(choice) && !checkDupes.contains(choice)){
                    two ='x';
                }
                else if(nine.equals(choice) && !checkDupes.contains(choice)){
                    two ='x';
                }
        }


        
    }
}