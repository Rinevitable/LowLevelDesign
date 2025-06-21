package model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public int size;
    public PlayingPiece[][] board;
    public Board(int size){
        this.size=size;
        board = new PlayingPiece[size][size];
    }

    public boolean setPiece(Integer row , Integer col , PlayingPiece p) {
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
                    System.out.print(board[i][j].type.name() + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
