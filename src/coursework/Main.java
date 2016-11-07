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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //testing box objects
        Box box1 = new Box(new double[]{2.0, 2.0, 2.0}, 1, true);
        TypeTwoThree box2 = new TypeTwoThree(new double[]{4.0, 4.0, 4.0}, 3, true, false, new String[]{"Red"});
        TypeTwoThree box3 = new TypeTwoThree(new double[]{5.0, 5.0, 5.0}, 4, true, true, new String[]{"Red", "Blue"});
        TypeFourFive box4 = new TypeFourFive(new double[]{6.0, 6.0, 6.0}, 5, true, false, new String[]{"Red", "Blue"});
        TypeFourFive box5 = new TypeFourFive(new double[]{7.0, 7.0, 7.0}, 6, true, true, new String[]{"Red", "Blue"});
    }

}
