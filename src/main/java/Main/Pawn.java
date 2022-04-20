/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;


public class Pawn extends Piece{
    public Pawn(String color, int x, int y) {
        super(color,x ,y );
    }
    
    @Override
    public boolean isValidMove(int stepX, int stepY) {
        if ( (stepY == 1) && (stepX == -1 || stepX == 0 || stepX == 1 || stepX == 2) ) {
            return true;
        } else {
            return false;
        }
    }   
    
    @Override
    public String toString() {
        return "Pawn";
    }
}
