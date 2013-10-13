<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html lang="en">
<head>
<!------------------------------>
   <tiles:insertAttribute name="head" />
	
	<!------------------------------>
</head>
<body id="page1">
	<div class="main-bg">
        <div class="bg">
            <!--==============================header=================================-->
            <header>
			<!------------------------------>
              <tiles:insertAttribute name="header" />
				
				<!------------------------------>
            </header>
            
            <!--==============================content================================-->
            <section id="content"><div class="ic"></div>
                <div class="main">
				
				<!------------------------------>
                      <tiles:insertAttribute name="body" />
						
						<!--------------end---------------->
                    </div>
                </div>
            </section>
            
            <!--==============================footer=================================-->
            <footer>
			<!------------------------------>
              <tiles:insertAttribute name="footer" />
				<!------------------------------>
            </footer>
        </div>
    </div>
	<script type="text/javascript"> Cufon.now(); </script>
    <script type="text/javascript">
		$(window).load(function() {
			$('.slider')._TMS({
				duration:1000,
				easing:'easeOutQuint',
				preset:'simpleFade',
				slideshow:7000,
				banners:false,
				pauseOnHover:true,
				pagination:false,
				pagNums:false,
				nextBu:'.next',
				prevBu:'.prev'
			});
		});
    </script>
</body>
</html>