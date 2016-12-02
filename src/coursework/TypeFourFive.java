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
public class TypeFourFive extends TypeTwoThree {

    private boolean reinforcedBottom;
    private boolean reinforcedCorner;

    public TypeFourFive(double[] newSize, int newGrade, boolean newSealedTop, int newPrint, String[] newColourList, boolean newCorner, boolean newBottom) {
        super(newSize, newGrade, newSealedTop, newPrint, newColourList);
        size = newSize;
        grade = newGrade;
        sealedTop = newSealedTop;
        print = newPrint;
        colourList = newColourList;
        reinforcedCorner = newCorner;
        reinforcedBottom = newBottom;
    }

    public void setBottom(boolean newBottom) {
        reinforcedBottom = newBottom;
    }

    public boolean getBottom() {
        return reinforcedBottom;
    }

    public void setCorner(boolean newCorner) {
        reinforcedCorner = newCorner;
    }

    public boolean getCorner() {
        return reinforcedCorner;
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
        switch (print) {
            case 1:
                extraCost += 1.13;
                break;
            case 2:
                extraCost += 1.16;
                break;
        }
        if (reinforcedCorner) {
            extraCost +=  1.24;
        } else if (!reinforcedCorner) {
            extraCost += 1.14;
        }
        if (sealedTop) {
            extraCost += 0.08;
        }
        price = basicPrice * extraCost;
        return price * area;
    }
}