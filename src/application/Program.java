package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		
		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.err.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
	
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
	
				ChessPiece capturedPiece = chessMatch.perfomChessMove(source, target);
			}
			catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.hasNextLine();
			}
			catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.hasNextLine();
			}
		}
		
	}

}
