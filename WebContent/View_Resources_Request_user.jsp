
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="menu.jsp"></jsp:include>
<%@ page import="java.util.ArrayList,bean.Resources,java.util.Iterator,demo.Allot_Resources" %>
<div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                           View Resources Request 
                        </h1>
                        <ol class="breadcrumb">
                            <li class="active">
                                <i class="fa fa-dashboard"></i>    View Resources Request 
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
                         <h2> View Resources Request </h2>
                        <div class="table-responsive">
                            <table class="table table-bordered table-hover table-striped">
                                <thead>
                                    <tr>
                                        
                                        <th>Users</th>
                                        <th>VMs</th>
                                        <th>Storages(MB)</th>
                                        <th>RAM(MB)</th>
                                        <th>BW</th>
                                        <th>CPU</th>
                                        <th>User Name</th>
                                    </tr>
                                </thead>
                                <tbody>
                                <%
                                String servername=(String)session.getAttribute("user");
                               
                        		Iterator<Resources> it=Allot_Resources.al.iterator();
                        		  while(it.hasNext())
                        		  {
                        			  Resources resources2=it.next();
                        			  
                        			  if((resources2.getServername().equals(servername)))
                        			  {
                                %>
                                    <tr>
                                    
                                        <th><%=resources2.getUsers() %></th>
                                      <th><%=resources2.getVms() %></th>
                                         <th><%=resources2.getStorage() %></th>
                                          <th><%=resources2.getRam() %></th>
                                         <th><%=resources2.getBw() %></th>
                                          <th><%=resources2.getCpu() %></th>
                                        
                                          <th><%=resources2.getServername() %></th>
                                    </tr>
                                    
                                    <%
                        			  }
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
