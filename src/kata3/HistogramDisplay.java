/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author usuario
 */
public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay(){
        super("Histograma de emails");
        setContentPane(createPanel());
        pack();
        
    }
    
    public void execute(){
        setVisible(true);
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChar", "Dominios email", "Nº de emails", dataSet, PlotOrientation.VERTICAL, false, true, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(15, "1", "ulpgc.es");
        dataSet.addValue(1, "2", "hotmail.com");
        dataSet.addValue(10, "3", "ull.es");
        dataSet.addValue(7, "4", "gmail.com");
        return dataSet;
    }
}
