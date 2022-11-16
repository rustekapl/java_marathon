package day17;

import java.util.Scanner;

public class ChessBoard {
    private ChessPiece[][] chessPieces;

    public ChessBoard(ChessPiece[][] chessPieces) {
        this.chessPieces = chessPieces;
    }

    public void print() {
        for (int i = 0; i < chessPieces.length; i++) {
            for (int j = 0; j < chessPieces[i].length; j++) {
                System.out.print(chessPieces[i][j].getName());
            }
            System.out.println();
        }
    }

    public void clearChessBoard() {
        for (int i = 0; i < chessPieces.length; i++) {
            for (int j = 0; j < chessPieces[i].length; j++) {
                chessPieces[i][j] = ChessPiece.EMPTY;
            }
        }
    }

    public void initChessBoard() {
        boolean exit = false;

        while (!exit) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите горизонтальные координаты ячейки (a,b,c,d,e,f,g,h)");
            String xCoordinate = scanner.nextLine();
            int x = 0;
            switch (xCoordinate) {
                case "h":
                    x = 7;
                    break;
                case "g":
                    x = 6;
                    break;
                case "f":
                    x = 5;
                    break;
                case "e":
                    x = 4;
                    break;
                case "d":
                    x = 3;
                    break;
                case "c":
                    x = 2;
                    break;
                case "b":
                    x = 1;
                    break;
                case "a":
                    x = 0;
                    break;


            }
            System.out.println("введите вертикальные координаты (1,2,3,4,5,6,7,8)");
            int yCoordinate = Integer.parseInt(scanner.nextLine());
            int y = 8 - yCoordinate;

            System.out.println("введите название фигуры (king, queen, rook, bishop, knight, pawn)");
            String name = scanner.nextLine();
            System.out.println("введите цвет фигуры (w, b)");
            String color = scanner.nextLine();
            if ("white".equalsIgnoreCase(color)) {
                switch (name) {
                    case "king":
                        chessPieces[x][y] = ChessPiece.KING_WHITE;
                        break;
                    case "queen":
                        chessPieces[x][y] = ChessPiece.QUEEN_WHITE;
                        break;
                    case "rook":
                        chessPieces[x][y] = ChessPiece.ROOK_WHITE;
                        break;
                    case "bishop":
                        chessPieces[x][y] = ChessPiece.BISHOP_WHITE;
                        break;
                    case "knight":
                        chessPieces[x][y] = ChessPiece.KNIGHT_WHITE;
                        break;
                    case "pawn":
                        chessPieces[x][y] = ChessPiece.PAWN_WHITE;
                        break;

                }
            } else {
                switch (name) {
                    case "king":
                        chessPieces[y][x] = ChessPiece.KING_BLACK;
                        break;
                    case "queen":
                        chessPieces[y][x] = ChessPiece.QUEEN_BLACK;
                        break;
                    case "rook":
                        chessPieces[y][x] = ChessPiece.ROOK_BLACK;
                        break;
                    case "bishop":
                        chessPieces[y][x] = ChessPiece.BISHOP_BLACK;
                        break;
                    case "knight":
                        chessPieces[y][x] = ChessPiece.KNIGHT_BLACK;
                        break;
                    case "pawn":
                        chessPieces[y][x] = ChessPiece.PAWN_BLACK;
                        break;

                }
                System.out.println("Если Вы хотите выйти - введите EXIT. Если хотите продолжить нажмите ENTER");
                if ("exit".equalsIgnoreCase(scanner.nextLine())) {
                    exit = true;
                }
            }
        }

    }
}
