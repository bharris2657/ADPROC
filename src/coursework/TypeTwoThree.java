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
public class TypeTwoThree extends TypeOne {

    protected boolean type;
    protected int print;
    protected String[] colourList;

    public TypeTwoThree(double[] newSize, int newGrade, boolean newSealedTop, int newPrint, String[] newColourList) {
        super(newSize, newGrade, newSealedTop);
        size = newSize;
        grade = newGrade;
        sealedTop = newSealedTop;
        print = newPrint;
        colourList = newColourList;
    }

    public void setPrint(int newPrint) {
        print = newPrint;
    }

    public int getPrint() {
        return print;
    }

    public void newColourList(String[] newColour) {
        colourList = newColour;
    }

    public void setSingleColour(int index, String newColour) {
        colourList[index] = newColour;
    }

    public String[] getColour() {
        return colourList;
    }

    public void printColour() {
        for (int i = 0; i < colourList.length; i++) {
            System.out.println(colourList[i]);
        }
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
                extraCost += 0.13;
                break;
            case 2:
                extraCost += 0.16;
                break;
        }
        if (sealedTop) {
            extraCost += 0.08;
        }
        price = basicPrice * extraCost;
        return price * area;
    }
}
