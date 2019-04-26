package application;

import chess.ChessMatch;

public class Program {
	public static void main(String[] args) {
		
		ChessMatch chessmMatch = new ChessMatch();
		UI.printBoard(chessmMatch.getPieces());

	}
	
}
