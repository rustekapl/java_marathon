package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] chesses = {
                ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK};

        for (ChessPiece chess : chesses) {
            System.out.print(chess.getName() + " ");
        }
    }
}
