<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/views/layouts/admin/tablib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thống Kê</title>
</head>
<body>
	 <div class="row">
    <div class="container-fluid container-fluid__content-top">
        <!-- Small boxes (Stat box) -->
        <div class="row">
          <div class="col-lg-3 col-6">
            <!-- small box -->
            <div class="small-box bg-info">
              <div class="inner">
                <h3></h3>
                <p>Orders</p>
              </div>
              <div class="icon">
                <i class="ion ion-bag"></i>
              </div>
              <a href="../order" class="small-box-footer">More info <i class="fas fa-arrow-circle-right"></i></a>
            </div>
          </div>
          <!-- ./col -->
          <div class="col-lg-3 col-6">
            <!-- small box -->
            <div class="small-box bg-success">
              <div class="inner">
                <h3>53<sup style="font-size: 20px">%</sup></h3>

                <p>Bounce Rate</p>
              </div>
              <div class="icon">
                <i class="ion ion-stats-bars"></i>
              </div>
              <a href="#" class="small-box-footer">More info <i class="fas fa-arrow-circle-right"></i></a>
            </div>
          </div>
          <!-- ./col -->
          <div class="col-lg-3 col-6">
            <!-- small box -->
            <div class="small-box bg-warning">
              <div class="inner">
                <h3></h3>

                <p>User Registrations</p>
              </div>
              <div class="icon">
                <i class="ion ion-person-add"></i>
              </div>
              <a href="#" class="small-box-footer">More info <i class="fas fa-arrow-circle-right"></i></a>
            </div>
          </div>
          <!-- ./col -->
          <div class="col-lg-3 col-6">
            <!-- small box -->
            <div class="small-box bg-danger">
              <div class="inner">
                <h3>65</h3>

                <p>Unique Visitors</p>
              </div>
              <div class="icon">
                <i class="ion ion-pie-graph"></i>
              </div>
              <a href="#" class="small-box-footer">More info <i class="fas fa-arrow-circle-right"></i></a>
            </div>
          </div>
        </div>
		<div class="span-2c">  
		     <h3 class="tlt">Thống Kê</h3>
		     <canvas id="bar" height="300" width="400" style="width: 400px; height: 300px;"></canvas>
		     <script type="text/javascript">
					var barChartData = {
					     labels: [<c:forEach var="item" items="${chartNow}">'${item.month}',</c:forEach>],
					     datasets: [
					          {

									backgroundColor:'#228bd1',
									fillColor: "#228bd1",
									data: [<c:forEach var="item" items="${chartNow}">${item.sumMoney},</c:forEach>]
					          }
					     ]
					};
					var ctx = document.getElementById("bar").getContext("2d")
					var myBarChart = new Chart(ctx,{
						type:'bar',
						data: barChartData
					});
			</script>
		</div>
      </div>
    </div>
</body>
</html>