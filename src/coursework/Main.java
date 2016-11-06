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
        Box box1 = new Box(5.0, 2, true);
        TypeTwoThree box2 = new TypeTwoThree(9.0, 3, true, false, new String[]{"blue"});
        TypeTwoThree box3 = new TypeTwoThree(10, 5, false, true, new String[]{"blue", "red"});
        TypeFourFive box4 = new TypeFourFive(3.0, 5, true, false, new String[]{"green", "red"});
        TypeFourFive box5 = new TypeFourFive(6.0, 5, true, true, new String[]{"yellow", "pink"});

        System.out.println("Box 1 size is: " + box1.getSize());
        System.out.println("Box 2 size is: " + box2.getSize());
        box2.setSize(1.5);
        System.out.println("Box 2 new size is: " + box2.getSize());
        System.out.println("Box 1 lid type is: " + box1.getTop());
        box5.printColour();
    }

}
