/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;


public class Rook extends Piece {
    public Rook(String color, int x, int y) {
        super(color,x ,y );
    }
    
    @Override
    public boolean isValidMove(int stepx, int stepy) {
        if (stepx == 0 || stepy == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "Rook";
    }
}
