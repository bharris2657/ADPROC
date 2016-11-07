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

    public TypeTwoThree(double[] newSize, int newGrade, boolean newSeal, boolean newType, String[] printColour) {
        size = newSize;
        grade = newGrade;
        sealedTop = newSeal;
        type = newType;
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
    
    public void setPrint(int newPrint){
        print = newPrint;
    }

    public int getPrint() {
        return print;
    }
    
    public void newColourList(String[] newColour){
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
}