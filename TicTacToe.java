import java.util.*;
import java.io.*;
public class TicTacToe{
    static HashSet checkDupes = new HashSet();
    static String one = "1";
    static String two = "2";
    static String three= "3";
    static String four = "4";
    static String five = "5";
    static String six = "6";
    static String seven = "7";
    static String eight= "8";
    static String nine = "9";
    static int turnCount = 0;
    static String choice = "";
    static Scanner sc = new Scanner(System.in);
        public static void main(String args[]){
            draw();
            while(turnCount<=8){
                playerX();
                checkWin();
                playerO();
            }
    }
        public static void clearBoard(){
            one = "1";
            two = "2";
            three= "3";
            four = "4";
            five = "5";
            six = "6";
            seven = "7";
            eight= "8";
            nine = "9";
            turnCount = 0;
        }
        public static void checkWin(){
            if(one.equals(two) && two.equals(three)){
                System.out.println("player "+one+" Wins!");
                clearBoard();
                draw();
                /*while(turnCount<=8){
                    playerX();
                    playerO();
                }*/
                //System.exit(0);
                }
            else if(one.equals(four) && four.equals(seven)){
            System.out.println("player "+one+" Wins! Enter 1 to play again, or 0 to exit: ");
            choice = sc.next();
            if(choice.equals("1")){
                clearBoard();
                draw();
                while(turnCount<=8){
                    playerX();
                    checkWin();
                    playerO();
                }
            }
            else
                System.exit(0);
            }
            else if(one.equals(five) && five.equals(nine)){
            System.out.println("player "+one+" Wins! Enter 1 to play again, or 0 to exit: ");
            choice = sc.next();
            if(choice.equals("1")){
                clearBoard();
                draw();
                while(turnCount<=8){
                    playerX();
                    checkWin();
                    playerO();
                }
            }
            else
                System.exit(0);
            }
            else if(two.equals(five) && five.equals(eight)){
            System.out.println("player "+two+" Wins! Enter 1 to play again, or 0 to exit: ");
            choice = sc.next();
            if(choice.equals("1")){
                clearBoard();
                draw();
                while(turnCount<=8){
                    playerX();
                    checkWin();
                    playerO();
                }
            }
            else
                System.exit(0);
            }
            else if(three.equals(six) && six.equals(nine)){
            System.out.println("player "+one+" Wins! Enter 1 to play again, or 0 to exit: !");
            choice = sc.next();
            if(choice.equals("1")){
                clearBoard();
                draw();
                while(turnCount<=8){
                    playerX();
                    checkWin();
                    playerO();
                }
            }
            else
                System.exit(0);
            }
            else if(seven.equals(five) && five.equals(three)){
            System.out.println("player "+one+" Wins! Enter 1 to play again, or 0 to exit: !");
            choice = sc.next();
            if(choice.equals("1")){
                clearBoard();
                draw();
                while(turnCount<=8){
                    playerX();
                    checkWin();
                    playerO();
                }
            }
            else
                System.exit(0);
            }
            else if(four.equals(five) && four.equals(six)){
            System.out.println("player "+four+" Wins! Enter 1 to play again, or 0 to exit: !");
            choice = sc.next();
            if(choice.equals("1")){
                clearBoard();
                draw();
                while(turnCount<=8){
                    playerX();
                    checkWin();
                    playerO();
                }
            }
            else
                System.exit(0);
            }
            
            else if(seven.equals(eight) && eight.equals(nine)){
            System.out.println("player "+seven+" Wins! Enter 1 to play again, or 0 to exit: !");
            choice = sc.next();
            if(choice.equals("1")){
                clearBoard();
                draw();
                while(turnCount<=8){
                    playerX();
                    checkWin();
                    playerO();
                }
            }
            else
                System.exit(0);
            }
            else if(turnCount==9){
            System.out.println("No Winner. Enter 1 to play again, or 0 to exit: ");
            
            }
        }
        public static void draw(){
            //System.out.println(" " + one + " | " + two + " | " + three + "\n __|___|__" + four + "|" + five +"|" + six + "\n──┼───┼──" + seven + "|" + eight + "|" + nine +"\n");
            System.out.println(one + "|" + two + "|" + three + "\n" + four + "|" + five +"|" + six + "\n" + seven + "|" + eight + "|" + nine +"\n");
        }
        public static void playerX(){
        //Scanner sc = new Scanner(System.in);
        turnCount= turnCount+1;
        System.out.println("Player X, enter the number that corresponds to the cell: ");
        choice = sc.next();
        if(turnCount>=4){
        checkWin();
                }
        if(one.equals(choice) && !checkDupes.contains(choice)){
        one ="x";
        checkDupes.add(choice);
        draw();
        }
                else if(two.equals(choice) && !checkDupes.contains(choice)){
                    two ="x";
                    checkDupes.add(choice);
                    draw();
                }
                else if(three.equals(choice) && !checkDupes.contains(choice)){
                    three ="x";
                    checkDupes.add(choice);
                    draw();
                }
                else if(four.equals(choice) /*&& !checkDupes.contains(choice)*/){
                    four ="x";
                    checkDupes.add(choice);
                    draw();
                }
                else if(five.equals(choice) /*&& !checkDupes.contains(choice)*/){
                    five ="x";
                    checkDupes.add(choice);
                    draw();
                }
                else if(six.equals(choice) /*&& !checkDupes.contains(choice)*/){
                    six ="x";
                    checkDupes.add(choice);
                    draw();
                }
                else if(seven.equals(choice) /*&& !checkDupes.contains(choice)*/){
                    seven ="x";
                    checkDupes.add(choice);
                    draw();
                }
                else if(eight.equals(choice) /*&& !checkDupes.contains(choice)*/){
                    eight ="x";
                    checkDupes.add(choice);
                    draw();
                }
                else if(nine.equals(choice) /*&& !checkDupes.contains(choice)*/){
                    nine ="x";
                    checkDupes.add(choice);
                    draw();
                }
    }
    public static void playerO(){
        Scanner sc = new Scanner(System.in);
        turnCount= turnCount+1;
        System.out.println("Player O, enter the number that corresponds to the cell: ");
        choice = sc.next();
        if(turnCount>=5){
        checkWin();
                }
        if(one.equals(choice) && !checkDupes.contains(choice)){
        one ="o";
        checkDupes.add(choice);
        draw();
        }
                else if(two.equals(choice) && !checkDupes.contains(choice)){
                    two ="o";
                    checkDupes.add(choice);
                    draw();
                }
                else if(three.equals(choice) && !checkDupes.contains(choice)){
                    three ="o";
                    checkDupes.add(choice);
                    draw();
                }
                else if(four.equals(choice) /*&& !checkDupes.contains(choice)*/){
                    four ="o";
                    checkDupes.add(choice);
                    draw();
                }
                else if(five.equals(choice) /*&& !checkDupes.contains(choice)*/){
                    five ="o";
                    checkDupes.add(choice);
                    draw();
                }
                else if(six.equals(choice) /*&& !checkDupes.contains(choice)*/){
                    six ="o";
                    checkDupes.add(choice);
                    draw();
                }
                else if(seven.equals(choice) /*&& !checkDupes.contains(choice)*/){
                    seven ="o";
                    checkDupes.add(choice);
                    draw();
                }
                else if(eight.equals(choice) /*&& !checkDupes.contains(choice)*/){
                    eight ="o";
                    checkDupes.add(choice);
                    draw();
                }
                else if(nine.equals(choice) /*&& !checkDupes.contains(choice)*/){
                    nine ="o";
                    checkDupes.add(choice);
                    draw();
                }
    }
}
