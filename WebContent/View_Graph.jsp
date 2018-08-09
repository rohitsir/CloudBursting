
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="servermenu.jsp"></jsp:include>
<%@ page
	import="java.util.ArrayList,bean.Resources,java.util.Iterator,demo.Allot_Resources"%>
<div id="page-wrapper">

	<div class="container-fluid">

		<!-- Page Heading -->
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">View Resources Request</h1>
				<ol class="breadcrumb">
					<li class="active"><i class="fa fa-dashboard"></i> View
						Resources Request</li>
				</ol>
			</div>
		</div>
		<!-- /.row -->

		<div class="row">
			<div class="col-lg-12"></div>
		</div>
		 
		    <!-- /.row -->

                <div class="row">
                    <div class="col-lg-6">
                        <div class="panel panel-red">
                            <div class="panel-heading">
                                <h3 class="panel-title"><i class="fa fa-long-arrow-right"></i> User-Wise Storage Pie Chart </h3>
                            </div>
                            <div class="panel-body">
                                <div class="flot-chart">
                                   <img src="./getChart_Memory.jsp"/>
                                </div>
                               
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <h3 class="panel-title"><i class="fa fa-long-arrow-right"></i> User-Wise RAM  Pie Chart</h3>
                            </div>
                            <div class="panel-body">
                                <div class="flot-chart">
                                    <img src="./getChart_Memory1.jsp"/>
                                </div>
                                 
                            </div>
                        </div>
                    </div>
                </div>
                <!-- /.row -->
                
                 <!-- /.row -->

                <div class="row">
                    <div class="col-lg-6">
                        <div class="panel panel-red">
                            <div class="panel-heading">
                                <h3 class="panel-title"><i class="fa fa-long-arrow-right"></i> User-Wise Storage Pie Chart </h3>
                            </div>
                            <div class="panel-body">
                                <div class="flot-chart">
                                   <img src="./getChart_RAM.jsp"/>
                                </div>
                               
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <h3 class="panel-title"><i class="fa fa-long-arrow-right"></i> User-Wise RAM  Pie Chart</h3>
                            </div>
                            <div class="panel-body">
                                <div class="flot-chart">
                                    <img src="./getChart_RAM1.jsp"/>
                                </div>
                                 
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-6">
                        <div class="panel panel-red">
                            <div class="panel-heading">
                                <h3 class="panel-title"><i class="fa fa-long-arrow-right"></i> User-Wise Storage Pie Chart </h3>
                            </div>
                            <div class="panel-body">
                                <div class="flot-chart">
                                   <img src="./getChart_Used_RAM.jsp"/>
                                </div>
                               
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <h3 class="panel-title"><i class="fa fa-long-arrow-right"></i> User-Wise RAM  Pie Chart</h3>
                            </div>
                            <div class="panel-body">
                                <div class="flot-chart">
                                    <img src="./getChart_Used_Storage.jsp"/> 
                                </div>
                                 
                            </div>
                        </div>
                    </div>
                </div>
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