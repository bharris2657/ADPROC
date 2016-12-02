/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adproc2016;

/**
 *
 * @author Ben
 */
public class TypeOne extends Box {

    public TypeOne(double[] newSize, int newGrade, boolean newSealedTop) {
        size = newSize;
        grade = newGrade;
        sealedTop = newSealedTop;
    }

    //size top grade
    public void setSize(double newSizeX, double newSizeY, double newSizeZ) {
        size[0] = newSizeX;
        size[1] = newSizeY;
        size[2] = newSizeZ;
    }

    public double[] getSize() {
        return size;
    }

    public void setTop(boolean newTop) {
        sealedTop = newTop;
    }

    public boolean getTop() {
        return sealedTop;
    }

    public void setGrade(int newGrade) {
        grade = newGrade;
    }

    public int getGrade() {
        return grade;
    }

    public double getPrice() {
        double basicPrice = 0, price = 0, extraCost = 1;
        double area = (2 * size[2] * size[1]) + (2 * size[2] * size[0]) + (2 * size[0] * size[1]);
        switch (grade) {
            /*Set basic price depending on grade of card selected*/
            case 1:
                basicPrice = 0.5;
                break;
            case 2:
                basicPrice = 0.6;
                break;
            case 3:
                basicPrice = 0.72;
                break;
            case 4:
                basicPrice = 0.9;
                break;
            case 5:
                basicPrice = 1.4;
                break;
        }
        if (sealedTop) {
            extraCost += 0.08;
        }
        price = basicPrice * extraCost;
        return price * area;
    }
}
