/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

/**
 *
 * @author usuario
 */
public class Kata3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Histogram histogram = new Histogram();
        histogram.increment("gmail.com",4);
        histogram.increment("ulpgc.es",8);
        histogram.increment("ull.es",3);
        histogram.increment("hotmail.com",1);
        new HistogramDisplay(histogram).execute();
        
    }
}
