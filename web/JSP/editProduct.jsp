<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
    <head>
        <link rel="stylesheet" href="css/manaprostyle.css"> 
    </head>
    
    <body>
        <div class="col-sm-6">
                            <h2>Edit <b>Product</b></h2>
                        </div>
        <div class="container">
            
            <!-- Edit Modal HTML -->
            <div id="editEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="editProduct" method="post">
                        
                        <div class="modal-body">	
                            <div class="form-group">
                                <label>Product ID</label>
                                <input value="${requestScope.detail.product_id}" name="product_id" type="text" class="form-control" readonly required>
                            </div>
                            <div class="form-group">
                                <label>Product Name</label>
                                <input value="${requestScope.detail.product_name}" name="product_name" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Price</label>
                                <input value="${requestScope.detail.list_price}" name="list_price" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Category Name</label>
                                <input value="${requestScope.detail.category_name}" name="category_name" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Image</label>
                                <input value="${requestScope.detail.img}" name="img" type="text" class="form-control" required>
                            </div>
                            
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-info" value="Save">
                        </div>
                    </form>
                </div>
            </div>
        </div>
            <!-- Delete Modal HTML -->
        </div>
    </body>
</html>                                		                            
