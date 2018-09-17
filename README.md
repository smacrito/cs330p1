## How to play:

1)	Player X always goes first, feel free to choose who is X
2)	Read the board that is displayed on the screen, and choose the number corresponding to the cell
  a)	This will change the number of the cell to “X” or “O”
3)	Player O’s turn precedes X, repeat step 2.
4)	Play until game finds a winner or a draw

## Building the program:
1.	Build dimension of the game 3x3 (use hashset 3 rows with 3 values in each row)
2.	Print hash set 
3.	Player input position (keyboard input to determine location inside hashset and replace value with a char of x or o) 
4.	pre test method to start the test method ( will test the test method after a total of 5 turns has been counted)
5.	Test the set if the same char is found 3 times in 1 of 8 scenarios (8 sets of if else statements with a set scenario in each that would record 3 in a row) 
NOTE if “hashset fails to work out as planned create 3 list and then print each list in order”

## Things to remember:
-	Create a (count int) to count the measures of turns there are
-	Once count equals 5 test method should run
-	Once count equals 9 and test has found no answer print “DRAW” and end program
-	When test finds a matched scenario determine if it is player 1 or 2 that wins (after print the player who wins)
-	After every turn print the layout of how the table appears

> Appearance 
(what it should look like in command prompt)

1|2|3

4|5|6

7|8|9

> Player X, pick a number that corresponds to the cell: 1

(test)

X|2|3

4|5|6

7|8|9

Player O, pick a number that corresponds to the cell: 4
(test)

X|2|3

O|5|6

7|8|9

> Player X, pick a number that corresponds to the cell: 2
(test)

X|X|3

O|5|6

7|8|9

> Player O, pick a number that corresponds to the cell: 5
(test)

X|X|3

O|O|6

7|8|9

> Player X, pick a number that corresponds to the cell: 3
(test)

X|X|X

O|O|6

7|8|9

> Player 1 wins
(end program)

