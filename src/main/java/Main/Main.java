/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;


public class Main {

    public static void main(String[] args) {
        
        Game papan = new Game();
        
        Piece pion = new Pawn("White", 4,1);
        Piece benteng = new Rook("Black",7,2);
        Piece kuda = new Knight("White",3,3);
        
        papan.addPiece(pion);
        papan.addPiece(benteng);
        papan.addPiece(kuda);
        
        papan.printBoard();
        System.out.println();
        
        papan.movePiece(pion, 4, 2);
        papan.printBoard();
        System.out.println();
        
        papan.movePiece(pion, 4, 7); // board tidak akan berubah karena perserakan pion tidak valid
        papan.printBoard();
        System.out.println();
        
        papan.movePiece(benteng, 7, 6);
        papan.printBoard();
        System.out.println();
        
        papan.movePiece(kuda, 5, 4);
        papan.printBoard();
    }
    
}
