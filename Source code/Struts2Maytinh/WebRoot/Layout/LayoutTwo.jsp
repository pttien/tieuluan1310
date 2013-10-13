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
                                <span class="address">8901 Marmora Road, Glasgow, D04 89GR</span>
                                <span class="phone">Tel: +1 959 552 5963</span>
                            </div>
                        </div>
                    </div>
                    <nav>
                        <ul class="menu">
                            <li><a href="index.html">Home</a></li>
                            <li><a href="about.html">About Us</a></li>
                            <li><a href="maintenance.html">Maintenance </a></li>
                            <li><a href="repair.html">Repair</a></li>
                            <li><a class="active" href="price.html">Price List</a></li>
                            <li><a href="locations.html">Locations</a></li>
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