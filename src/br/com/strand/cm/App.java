package br.com.strand.cm;

import br.com.strand.cm.model.Board;
import br.com.strand.cm.view.ConsoleBoard;

public class App {
	public static void main(String[] args) {
		Board board = new Board(6, 6, 6);
		new ConsoleBoard(board);
	}
}
