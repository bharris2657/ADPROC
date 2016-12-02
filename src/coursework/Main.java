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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //testing box objects
        TypeOne box1 = new TypeOne(new double[]{0.7, 0.3, 0.4}, 1, false);
        System.out.println(box1.getPrice());
        TypeTwoThree box2 = new TypeTwoThree(new double[] {0.7, 0.3, 0.4}, 3, true, 2, new String[]{"red", "blue"});
        System.out.println(box2.getPrice());
        TypeFourFive box3 = new TypeFourFive(new double[] {0.7, 0.3, 0.4}, 5, false, 2, new String[]{"red", "blue"}, true, true);
        System.out.println(box3.getPrice());
    }
}