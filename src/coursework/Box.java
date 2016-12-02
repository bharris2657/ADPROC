/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adproc2016;

public abstract class Box {

    protected double[] size;
    protected int grade;
    protected boolean sealedTop;

    public Box() {
    }

    public Box(double[] newSize, int newGrade, boolean newSeal) {
        size = newSize;
        grade = newGrade;
        sealedTop = newSeal;
    }

    public abstract void setSize(double newSizeX, double newSizeY, double newSizeZ);

    public abstract double[] getSize();

    public abstract void setGrade(int newGrade);

    public abstract int getGrade();

    public abstract void setTop(boolean newTop);

    public abstract boolean getTop();

    public abstract double getPrice();
}
