package edu.ucsb.cs56.projects.discretemath.towers_sierpinski.SVGraphics;

import java.awt.Point;
import java.util.LinkedHashMap;
import java.util.Map;
import org.w3c.dom.Element;

/**
 * SVUse class extends SVGraphics basic element that holds previously defined 
 * content
 *
 * @author Martin Wolfenbarger
 * @version 2013/05/31 
 */
public class SVUse extends SVGraphics{
    /** no-arg constructor calls super and sets tag to g
     */
    public SVUse(String href) {
        super();
        setTag("use");
        this.setXLink(href);
    }
    
    /** no-arg constructor calls super, sets tag to g, and sets location
     */
    public SVUse(String href, Point location) {
        super();
        setLocation(location);
        setTag("use");
        this.setXLink(href);
    }
    
    /** Returns xlink:href value
        @return String 
     */
    public String getXLink() {
        return this.getAttribute("xlink:href");
    }
    
    /** sets xlink:href value
        @param link String 
     */
    public void setXLink(String link) {
        this.setAttribute("xlink:href", "#" + link);
    }
    
    /** Returns rectangle height
     @return height of rectangle
     */
    public int getHeight() {
        String s = this.getAttribute("height");
        if(s == null) return 0; else return Integer.parseInt(s);
    }
    
    /** Sets rectangle height
     @param height
     */
    public void setHeight(int height) {
        this.setAttribute("height", height + "");
    }
    
    /** Returns rectangle height
     @return height of rectangle
     */
    public int getWidth() {
        String s = this.getAttribute("width");
        if(s == null) return 0; else return Integer.parseInt(s);
    }
    
    /** Sets rectangle height
     @param height
     */
    public void setWidth(int width) {
        this.setAttribute("width", width + "");
    }
}
