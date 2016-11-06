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
public class TypeTwoThree extends Box {

    protected boolean type;
    protected int print;
    protected String[] colourList;

    public TypeTwoThree() {
    }

    public TypeTwoThree(double cardSize, int cardGrade, boolean lidSeal, boolean cardType, String[] printColour) {
        size = cardSize;
        grade = cardGrade;
        sealedTop = lidSeal;
        type = cardType;
        if (!type) {
            print = 1;
        } else {
            print = 2;
        }
        colourList = printColour;
    }

    public void setType(boolean newType) {
        type = newType;
    }

    public boolean getType() {
        return type;
    }

    public int getPrint() {
        return print;
    }

    public void setColour(int index, String newColour) {
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
}
