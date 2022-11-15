package day17;

public class Task2 {

    public static void main(String[] args) {
        ChessPiece[][] chessPieces = new ChessPiece[8][8];
        chessPieces[0][0] = ChessPiece.ROOK_BLACK;
        chessPieces[0][1] = ChessPiece.EMPTY;
        chessPieces[0][2] = ChessPiece.EMPTY;
        chessPieces[0][3] = ChessPiece.EMPTY;
        chessPieces[0][4] = ChessPiece.EMPTY;
        chessPieces[0][5] = ChessPiece.ROOK_BLACK;
        chessPieces[0][6] = ChessPiece.KING_BLACK;
        chessPieces[0][7] = ChessPiece.EMPTY;

        chessPieces[1][0] = ChessPiece.EMPTY;
        chessPieces[1][1] = ChessPiece.ROOK_WHITE;
        chessPieces[1][2] = ChessPiece.EMPTY;
        chessPieces[1][3] = ChessPiece.EMPTY;
        chessPieces[1][4] = ChessPiece.PAWN_BLACK;
        chessPieces[1][5] = ChessPiece.PAWN_BLACK;
        chessPieces[1][6] = ChessPiece.EMPTY;
        chessPieces[1][7] = ChessPiece.PAWN_BLACK;

        chessPieces[2][0] = ChessPiece.PAWN_BLACK;
        chessPieces[2][1] = ChessPiece.EMPTY;
        chessPieces[2][2] = ChessPiece.KNIGHT_BLACK;
        chessPieces[2][3] = ChessPiece.EMPTY;
        chessPieces[2][4] = ChessPiece.EMPTY;
        chessPieces[2][5] = ChessPiece.EMPTY;
        chessPieces[2][6] = ChessPiece.PAWN_BLACK;
        chessPieces[2][7] = ChessPiece.EMPTY;

        chessPieces[3][0] = ChessPiece.QUEEN_BLACK;
        chessPieces[3][1] = ChessPiece.EMPTY;
        chessPieces[3][2] = ChessPiece.EMPTY;
        chessPieces[3][3] = ChessPiece.BISHOP_WHITE;
        chessPieces[3][4] = ChessPiece.EMPTY;
        chessPieces[3][5] = ChessPiece.EMPTY;
        chessPieces[3][6] = ChessPiece.EMPTY;
        chessPieces[3][7] = ChessPiece.EMPTY;

        chessPieces[4][0] = ChessPiece.EMPTY;
        chessPieces[4][1] = ChessPiece.EMPTY;
        chessPieces[4][2] = ChessPiece.EMPTY;
        chessPieces[4][3] = ChessPiece.BISHOP_BLACK;
        chessPieces[4][4] = ChessPiece.PAWN_WHITE;
        chessPieces[4][5] = ChessPiece.EMPTY;
        chessPieces[4][6] = ChessPiece.EMPTY;
        chessPieces[4][7] = ChessPiece.EMPTY;

        chessPieces[5][0] = ChessPiece.EMPTY;
        chessPieces[5][1] = ChessPiece.EMPTY;
        chessPieces[5][2] = ChessPiece.EMPTY;
        chessPieces[5][3] = ChessPiece.EMPTY;
        chessPieces[5][4] = ChessPiece.BISHOP_WHITE;
        chessPieces[5][5] = ChessPiece.PAWN_WHITE;
        chessPieces[5][6] = ChessPiece.EMPTY;
        chessPieces[5][7] = ChessPiece.EMPTY;

        chessPieces[6][0] = ChessPiece.PAWN_WHITE;
        chessPieces[6][1] = ChessPiece.EMPTY;
        chessPieces[6][2] = ChessPiece.EMPTY;
        chessPieces[6][3] = ChessPiece.QUEEN_WHITE;
        chessPieces[6][4] = ChessPiece.EMPTY;
        chessPieces[6][5] = ChessPiece.PAWN_WHITE;
        chessPieces[6][6] = ChessPiece.EMPTY;
        chessPieces[6][7] = ChessPiece.PAWN_WHITE;

        chessPieces[7][0] = ChessPiece.EMPTY;
        chessPieces[7][1] = ChessPiece.EMPTY;
        chessPieces[7][2] = ChessPiece.EMPTY;
        chessPieces[7][3] = ChessPiece.EMPTY;
        chessPieces[7][4] = ChessPiece.EMPTY;
        chessPieces[7][5] = ChessPiece.ROOK_WHITE;
        chessPieces[7][6] = ChessPiece.KING_WHITE;
        chessPieces[7][7] = ChessPiece.EMPTY;


        ChessBoard chessBoard = new ChessBoard(chessPieces);
        chessBoard.print();


    }


}
