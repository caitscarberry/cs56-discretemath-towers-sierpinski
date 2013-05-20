/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SierpinskiTriangle;

import SVGraphics.*;
import SVGraphics.SVRectangle;
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author martinwolfenbarger
 */
public class Peg extends SVCustom{
    public Peg(ArrayList<Integer> a, int total) {
        super();
        SVRectangle r = new SVRectangle(new Point(-3,20),6,60);
        r.setBorderRadius(3);
        r.setColor(Color.black);
        addContent(r, "a");
        if(total > 0) this.addDisks(a, total);
    }
    private void addDisks(ArrayList<Integer> a, int total) {
        for(int i = 0; a.size() > i; i++) {
            SVEllipse e = new SVEllipse(new Point(0,-1*i*12+69),30-i*3,13);
            SVText t = new SVText(new Point(0,-1*i*12+74),""+a.get(i));
            e.setColor(Color.CYAN);
            addContent(e, "e"+i);
            addContent(t,"t"+i);
        }
    }
}
