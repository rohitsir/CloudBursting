package chartdemo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import bean.Resources;
import demo.Allot_Resources;

public class DEmoChart {

	
	 
	 public static JFreeChart getChart_Storage() {
	        DefaultPieDataset dataset = new DefaultPieDataset();


	        Iterator<Resources> it = Allot_Resources.al.iterator();
			while (it.hasNext()) {
				Resources resources2 = it.next();
	
				 dataset.setValue(resources2.getServername(), resources2.getStorage());
			       
			}
	        
	        

	        boolean legend = true;
	        boolean tooltips = false;
	        boolean urls = false;

	        JFreeChart chart = ChartFactory.createPieChart("Existing System Storage", dataset, legend, tooltips, urls);

	        chart.setBorderPaint(Color.GREEN);
	        chart.setBorderStroke(new BasicStroke(5.0f));
	        chart.setBorderVisible(true);

	        return chart;
	    }
	 public static JFreeChart getChart_Storage1() {
	        DefaultPieDataset dataset = new DefaultPieDataset();


	        Iterator<Resources> it = Allot_Resources.alloted.iterator();
			while (it.hasNext()) {
				Resources resources2 = it.next();
	
				 dataset.setValue(resources2.getServername(), resources2.getStorage());
			       
			}
	        
	        

	        boolean legend = true;
	        boolean tooltips = false;
	        boolean urls = false;

	        JFreeChart chart = ChartFactory.createPieChart("Proposed System (Storage)", dataset, legend, tooltips, urls);

	        chart.setBorderPaint(Color.GREEN);
	        chart.setBorderStroke(new BasicStroke(5.0f));
	        chart.setBorderVisible(true);

	        return chart;
	    }
	 
	 
	 public static JFreeChart getChart_RAM() {
	        DefaultPieDataset dataset = new DefaultPieDataset();


	        Iterator<Resources> it = Allot_Resources.al.iterator();
			while (it.hasNext()) {
				Resources resources2 = it.next();
	
				 dataset.setValue(resources2.getServername(), resources2.getRam());
			       
			}
	        
	        

	        boolean legend = true;
	        boolean tooltips = false;
	        boolean urls = false;

	        JFreeChart chart = ChartFactory.createPieChart("Existing System(RAM)", dataset, legend, tooltips, urls);

	        chart.setBorderPaint(Color.GREEN);
	        chart.setBorderStroke(new BasicStroke(5.0f));
	        chart.setBorderVisible(true);

	        return chart;
	    }
	 public static JFreeChart getChart_RAM1() {
	        DefaultPieDataset dataset = new DefaultPieDataset();


	        Iterator<Resources> it = Allot_Resources.alloted.iterator();
			while (it.hasNext()) {
				Resources resources2 = it.next();
	
				 dataset.setValue(resources2.getServername(), resources2.getRam());
			       
			}
	        
	        

	        boolean legend = true;
	        boolean tooltips = false;
	        boolean urls = false;

	        JFreeChart chart = ChartFactory.createPieChart("Proposed System(RAM)", dataset, legend, tooltips, urls);

	        chart.setBorderPaint(Color.GREEN);
	        chart.setBorderStroke(new BasicStroke(5.0f));
	        chart.setBorderVisible(true);

	        return chart;
	    }
	 public static JFreeChart getChart_UsedMemory() {
	        DefaultPieDataset dataset = new DefaultPieDataset();

	        int total=0;
	        Iterator<Resources> it = Allot_Resources.alloted.iterator();
			while (it.hasNext()) {
				Resources resources2 = it.next();
				total+=resources2.getStorage();
				
			       
			}
			 dataset.setValue("Used Memory", total );
			ArrayList <Resources> list=null;
			list=dao.DataDAO.serverDetails();
			  it = list.iterator();
			while (it.hasNext()) {
				Resources resources2 = it.next();
				total+=resources2.getStorage();
				
			       
			}

			
			 dataset.setValue("Available Memory", total );
	        

	        boolean legend = true;
	        boolean tooltips = false;
	        boolean urls = false;

	        JFreeChart chart = ChartFactory.createPieChart("Used/Available Memory", dataset, legend, tooltips, urls);

	        chart.setBorderPaint(Color.GREEN);
	        chart.setBorderStroke(new BasicStroke(5.0f));
	        chart.setBorderVisible(true);

	        return chart;
	    }
	 public static JFreeChart getChart_UsedRam() {
	        DefaultPieDataset dataset = new DefaultPieDataset();

	        int total=0;
	        Iterator<Resources> it = Allot_Resources.alloted.iterator();
			while (it.hasNext()) {
				Resources resources2 = it.next();
				total+=resources2.getRam();
				
			       
			}
			 dataset.setValue("Used RAM", total );
			ArrayList <Resources> list=null;
			list=dao.DataDAO.serverDetails();
			  it = list.iterator();
			while (it.hasNext()) {
				Resources resources2 = it.next();
				total+=resources2.getRam();
				
			       
			}

			
			 dataset.setValue("Available RAM", total );
	        

	        boolean legend = true;
	        boolean tooltips = false;
	        boolean urls = false;

	        JFreeChart chart = ChartFactory.createPieChart("Used/Available RAM", dataset, legend, tooltips, urls);

	        chart.setBorderPaint(Color.GREEN);
	        chart.setBorderStroke(new BasicStroke(5.0f));
	        chart.setBorderVisible(true);

	        return chart;
	    }
	 
	
}
