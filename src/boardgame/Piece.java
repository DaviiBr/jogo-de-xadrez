package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
        // ja que no xadrez nenhuma peca ja comeca no tabuleiro entao considera-se position como nulo
    }

    protected Board getBoard() {
        return board;
    }

}
