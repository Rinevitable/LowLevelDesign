package model;

public class Player {
    String name;
    PieceType playingPiece;
    Player(String name, PieceType playingPiece){
        this.name=name;
        this.playingPiece=playingPiece;
    }

    public String getName() {
        return name;
    }

    public PieceType getPlayingPiece() {
        return playingPiece;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayingPiece(PieceType playingPiece) {
        this.playingPiece = playingPiece;
    }
}
