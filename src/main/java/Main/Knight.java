/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;


public class Knight extends Piece{
    public Knight(String color, int x, int y) {
        super(color,x ,y );
    }
    
    @Override
    public boolean isValidMove(int stepx, int stepy) {
        if ((stepx == 2 || stepx == -2) && (stepy == 1 || stepy == -1)) {
            return true;
        } else if ((stepy == 2 || stepy == -2) && (stepx == 1 || stepx == -1)) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "Knight";
    }
    
}
