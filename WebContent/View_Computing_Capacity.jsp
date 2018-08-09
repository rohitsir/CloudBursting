
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="servermenu.jsp"></jsp:include>
<%@ page import="java.util.ArrayList,bean.Resources,java.util.Iterator,java.sql.*" %>
<div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            Computing Capacity
                        </h1>
                        <ol class="breadcrumb">
                            <li class="active">
                                <i class="fa fa-dashboard"></i>   Computing Capacity
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-12">
                        
                    </div>
                </div>
                <!-- /.row -->

                
                <!-- /.row -->

               <div class="row">
                    <div class="col-lg-12">
                        <div class="panel">
                         <h2>Server Computing Capacity </h2>
                        <div class="table-responsive">
                            <table class="table table-bordered table-hover table-striped">
                                <thead>
                                    <tr>
                                        <th>Resources Id</th>
                                        <th>Users</th>
                                        <th>VMs</th>
                                        <th>Storages(MB)</th>
                                        <th>RAM(MB)</th>
                                        <th>BW</th>
                                        <th>CPU</th>
                                        <th>Server Name</th>
                                    </tr>
                                </thead>
                                <tbody>
                                <%
                              /*   String servername=(String)session.getAttribute("user");
                                ArrayList <Resources> list=null;
                        		list=dao.DataDAO.serverDetails();
                        		Iterator<Resources> it=list.iterator();
                        		  while(it.hasNext()) */
                        		  java.sql.Connection con = db.DemoConnection.DB();
                      			
                      			
                      			String query = "select * from  Resources_Table";
                      			PreparedStatement pst = con.prepareStatement(query);
                      			
                      			
                      			 
                      			ResultSet r=pst.executeQuery();
                      		   while (r.next()) {
                        		  
                        			 // Resources resources2=it.next();
                        			  
                        			  
                                %>
                                   <tr>
                                        <td><%=r.getString(1) %></td>
                                        <td><%=r.getString(2) %></td>
                                         <td><%=r.getString(3) %></td>
                                          <td><%=r.getString(4) %></td>
                                           <td><%=r.getString(5) %></td>
                                            <td><%=r.getString(6) %></td>
                                             <td><%=r.getString(7) %></td>
                                              <td><%=r.getString(8) %></td>
                                               </tr>
                                    
                                    <%
                        			  
                        		  }
                                    %>
                                       </tbody>
                            </table>
                    </div>
                </div>
                <!-- /.row -->

                
                <!-- /.row -->

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="js/plugins/morris/raphael.min.js"></script>
    <script src="js/plugins/morris/morris.min.js"></script>
    <script src="js/plugins/morris/morris-data.js"></script>

</body>

</html>
