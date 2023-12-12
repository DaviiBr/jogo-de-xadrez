package application;

import boardgame.Board;
import chess.ChessMatch;

public class Main {
    public static void main(String[] args) {

        ChessMatch cm = new ChessMatch();
        UI.printBoard(cm.getPieces());



        }
    }