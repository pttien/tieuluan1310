<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- ------------Head -->
   <tiles:insertAttribute name="head" />
</head>
<body id="page5">
	<div class="main-bg">
        <div class="bg">
            <!--==============================header=================================-->
            <header>
                <div class="main">
                    <div class="wrapper">
                        <h1><a href="index.html">logo</a></h1>
                        <div class="fright">
                            <div class="indent">
                                 <span class="address">LỚP SƯ PHẠM CNTT 109100</span>
                                <span class="phone">Tel: 0121 7180 778</span>
                            </div>
                        </div>
                    </div>
                    <nav>
                        <ul class="menu">
                           <li><a class="active" href="/home">Trang chủ</a></li>
                            <li><a href="about.html">Giới thiệu</a></li>
                            <li><a href="maintenance.html">Sản phẩm </a></li>
                            <li><a href="repair.html">Sản phẩm yêu thích</a></li>
                            <li><a href="price.html">Gởi phản hồi</a></li>
                            <li><a href="locations.html">Đăng ký</a></li>
                        </ul>
                    </nav>
                </div>
            </header>
            
            <!--==============================content================================-->
            <section id="content"><div class="ic"></div>
                <div class="main">
                <!-- --------------------------body -->
                 <tiles:insertAttribute name="body" />
                </div>
            </section>
            
            <!--==============================footer=================================-->
            <footer>
                 <tiles:insertAttribute name="footer" />
            </footer>
        </div>
    </div>
	<script type="text/javascript"> Cufon.now(); </script>
</body>
</html>