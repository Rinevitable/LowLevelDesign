package model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    PlayingPiece[][] board;
    List<Player>players;
    Board(int size,List<Player> players){
        this.size=size;
        board=new PlayingPiece[size][size];
    }

    public boolean setPiece(int row , int col , PlayingPiece p) {
        if(board[row][col]!=null){
            System.out.println("Can't doo");
            return false;
        }else{
            board[row][col]=p;
            return true;
        }
    }

    public List<model.Pair<Integer, Integer>> getEmptyCells(){
        List<model.Pair<Integer,Integer>>ans=new ArrayList<>();
        for(int i =0 ;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null){
                    ans.add(new Pair<Integer,Integer>(i,j));
                }
            }
        }
        return ans;
    }

    public void printBoard() {
        for(int i =0 ;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]!=null){
                    System.out.print(board[i][j].type + " ");
                    System.out.print(board[i][j].type + "   ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
