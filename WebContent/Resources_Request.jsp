
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="menu.jsp"></jsp:include>
<div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            Resources Request 
                        </h1>
                        <ol class="breadcrumb">
                            <li class="active">
                                <i class="fa fa-dashboard"></i>  Resources Request 
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
                    <div class="col-lg-6">
                        <div class="panel">
                         <form role="form" action="./Allot_Resources" method="post" >
                            <div class="panel-heading" style="height: 400px">
                                <div class="form-group input-group">
                                <span class="input-group-addon">@</span>
                                <input type="text" class="form-control" name="storage" required="required" placeholder="Storage(MB)">
                            </div>
                            
                           
                          
                          <div class="form-group input-group">
                                <span class="input-group-addon">#</span>
                                <input type="text" class="form-control" name="ram" required="required" placeholder="RAM(MB)">
                            </div>
                           <div class="form-group input-group">
                                <span class="input-group-addon">#</span>
                                <input type="text" class="form-control" name="bw" required="required" placeholder="BW">
                            </div>
                           <div class="form-group">
                              
                                <select class="form-control" name="users">
                                   <option>--No. Of Users--</option>
                                    
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
                                    <option>5</option>
                                     
                                </select>
                            </div>
                            <div class="form-group">
                              
                                <select class="form-control" name="vms">
                                   <option>--No. Of VMs--</option>
                                    
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
                                    <option>5</option>
                                     
                                </select>
                            </div>
                             <div class="form-group">
                              
                                <select class="form-control" name="cpu">
                                   <option>--No. Of CPU--</option>
                                    
                                    <option>Core</option>
                                    <option>Core-Dual</option>
                                    <option>Quard</option>
                                    <option>Octa</option>
                                   
                                     
                                </select>
                            </div>
                              <button type="submit" class="btn btn-default">Submit</button>
                            <button type="reset" class="btn btn-default">Reset</button>
                        </div>
                        </form>
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
