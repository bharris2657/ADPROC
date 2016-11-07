/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

/**
 *
 * @author benha
 */
public class Box {

    protected double[] size;
    protected int grade;
    protected boolean sealedTop;
    
    public Box(){}
    
    public Box(double[] newSize, int newGrade, boolean newSeal){
        size = newSize;
        grade = newGrade;
        sealedTop = newSeal;
    }

    public void setSize(double newSizeX, double newSizeY, double newSizeZ) {
        size[0] = newSizeX;
        size[1] = newSizeY;
        size[2] = newSizeZ;
    }

    public double[] getSize() {
        return size;
    }

    public void setGrade(int newGrade) {
        grade = newGrade;
    }

    public int getGrade() {
        return grade;
    }

    public void setTop(boolean newTop) {
        sealedTop = newTop;
    }

    public boolean getTop() {
        return sealedTop;
    }
}
