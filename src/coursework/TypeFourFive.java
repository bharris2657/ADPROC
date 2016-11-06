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

    public TypeFourFive(double cardSize, int cardGrade, boolean lidSeal, boolean cardType, String[] printColour) {
        size = cardSize;
        grade = cardGrade;
        sealedTop = lidSeal;
        type = cardType;
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
}
