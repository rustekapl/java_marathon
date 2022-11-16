package day17;

public class Task2 {

    public static void main(String[] args) {
        ChessPiece[][] chessPieces = new ChessPiece[8][8];
        ChessBoard chessBoard = new ChessBoard(chessPieces);
        chessBoard.clearChessBoard();
        chessBoard.initChessBoard();
        chessBoard.print();


    }


}
