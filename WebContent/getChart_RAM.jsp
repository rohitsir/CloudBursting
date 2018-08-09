<%@page import="chartdemo.DEmoChart"%>
<%@ page import="java.io.*" %>
<%@ page import="org.jfree.chart.JFreeChart" %>
<%@ page import="org.jfree.chart.ChartUtilities" %>
 
<%

 try
 {
 File image = File.createTempFile("image", "tmp");
 JFreeChart chart = DEmoChart.getChart_RAM();
 // Assume that we have the chart
 ChartUtilities.saveChartAsPNG(image, chart, 300, 300);
 
 FileInputStream fileInStream = new FileInputStream(image);
 OutputStream outStream = response.getOutputStream();   
 
 long fileLength;
 byte[] byteStream;
 
 fileLength = image.length();
 byteStream = new byte[(int)fileLength];
 fileInStream.read(byteStream, 0, (int)fileLength);
 
 response.setContentType("image/png");
 response.setContentLength((int)fileLength);
 response.setHeader("Cache-Control", 
     "no-store,no-cache, must-revalidate, post-check=0, pre-check=0");
 response.setHeader("Pragma", "no-cache");
 
 fileInStream.close();
 outStream.write(byteStream);
 outStream.flush();
 outStream.close();
 
 }
 catch (IOException e)
 {
 System.err.println("Problem occurred creating chart.");
 }
 

%>