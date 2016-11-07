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
public class TypeFourFive extends TypeTwoThree {

    private boolean reinforcedBottom;
    private boolean reinforcedCorner;

    public TypeFourFive() {
    }

    public TypeFourFive(double[] newSize, int newGrade, boolean newSeal, boolean newType, String[] printColour) {
        size = newSize;
        grade = newGrade;
        sealedTop = newSeal;
        type = newType;
        print = 2;
        colourList = printColour;
        if (!type) {
            reinforcedBottom = true;
            reinforcedCorner = false;
        } else {
            reinforcedBottom = true;
            reinforcedCorner = true;
        }
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
}
