import model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {
    //because need the 1st and last
    Deque<Player> players;
    Board gameBoard;
    Game(){

    }
    public void initGame(){
        //create a two player game  and 3*3 board
        //objects creations
        PieceX crossPiece = new PieceX();
        Player playerX = new Player("playerOne", crossPiece);
        PieceO ovalPiece = new PieceO();
        Player playerO = new Player("playerTwo", ovalPiece);

//        //added players not working null pointer exception
//        players.add(playerX);
//        players.add(playerO);
        players = new LinkedList<>();
        players.add(playerX);
        players.add(playerO);


        // create board
        gameBoard = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;
        while(noWinner){
            //1st player
            Player playerTurn = players.removeFirst();

            //check for free cell if can somewon win or tie
            gameBoard.printBoard();
            List<Pair<Integer,Integer>>emptyCells = gameBoard.getEmptyCells();
            if(emptyCells.isEmpty()){
                //means  nowhere to play
                noWinner = false;
                continue;
                //here tie
            }

            //now it's not a tie so let's play
            //take input and put it;
            System.out.println("Player : "+playerTurn.getName()+" Enter the row,col");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            Integer row = Integer.valueOf(values[0]);
            Integer col = Integer.valueOf(values[1]);

            boolean  pieceInserted = gameBoard.setPiece(row,col,playerTurn.getPlayingPiece());
            if(!pieceInserted){
                //can't do so repeat and add player again in the front
                System.out.println("Please re enter");
                players.addFirst(playerTurn);
                continue;
            }

            //everything went well put this player in the back
            players.addLast((playerTurn));

            //check for winner
            //pass the row and col so that we can check from that point to the row col diagonal and anti diagonal
            //and pieceType to match
            boolean winner = isThereWinner(row,col,playerTurn.getPlayingPiece().type);
            if(winner){
                return playerTurn.getName();
            }
        }
        return "tie";
    }
    public boolean isThereWinner(Integer row, Integer col, PieceType pieceType){
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<gameBoard.size;i++) {

            if (gameBoard.board[row][i] == null || gameBoard.board[row][i].type != pieceType) {
                rowMatch = false;
                break;
            }
        }

        //need to check in col
        for(int i=0;i<gameBoard.size;i++) {

            if (gameBoard.board[i][col] == null || gameBoard.board[i][col].type != pieceType) {
                columnMatch = false;
                break;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<gameBoard.size;i++,j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].type != pieceType) {
                diagonalMatch = false;
                break;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gameBoard.size-1; i<gameBoard.size;i++,j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].type != pieceType) {
                antiDiagonalMatch = false;
                break;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;

    }
}
