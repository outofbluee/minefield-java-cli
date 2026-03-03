package br.com.strand.minesfield.view;

import br.com.strand.minesfield.model.Board;

public class TEmp {
	public static void main(String[] args) {
		Board board = new Board(3, 3, 9);
		board.openField(2, 2);
	}
}
