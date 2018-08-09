package demo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 * Servlet implementation class DrawChartServlet
 */
@WebServlet("/DrawChartServlet")
public class DrawChartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DrawChartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	
    	
    	response.setContentType("image/png");

        OutputStream outputStream = response.getOutputStream();

        JFreeChart chart = getChart();
        int width = 500;
        int height = 350;
        ChartUtilities.writeChartAsPNG(outputStream, chart, width, height);
    }

    public JFreeChart getChart() {
        DefaultPieDataset dataset = new DefaultPieDataset();


         


        
        int chickenrice = 20;
        int currychicken = 4;

        dataset.setValue("Chicken Rice", chickenrice);
        dataset.setValue("Curry Chicken", currychicken);

        boolean legend = true;
        boolean tooltips = false;
        boolean urls = false;

        JFreeChart chart = ChartFactory.createPieChart("Orders", dataset, legend, tooltips, urls);

        chart.setBorderPaint(Color.GREEN);
        chart.setBorderStroke(new BasicStroke(5.0f));
        chart.setBorderVisible(true);

        return chart;
    }
}
