/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mosaicos;

public class Point {
    private int px;
    private int py;

    /*
    public Point() {
    }
*/

    public Point(int coordx, int coordy) {
        this.px = coordx;
        this.py = coordy;
    }

    public int getPx() {
        return px;
    }

    public void setPx(int px) {
        this.px = px;
    }

    public int getPy() {
        return py;
    }

    public void setPy(int py) {
        this.py = py;
    }
    
    
}
