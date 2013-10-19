<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
  <div class="container_12">
                        <div class="wrapper p5">
                        
                         <s:iterator value="lisproduct" var="ls">
					  
  <!-- ------------------------------- -->
  							 <div class="gridcontent">
                            <article class="grid_4">
                                <div class="wrapper">
                                    <figure class="img-indent">
                                    <div id="newimage">
                                  	 <a id="idimage" href="/resource/images/<s:property value='#ls.image'/>"> <img src="/resource/images/<s:property value='#ls.image'/>" alt=""></a>
                                    </div>
                                    </figure>
                                    <div class="extra-wrap">
                                        <h4><s:property value='#ls.name'/></h4>
                                        <p class="p2"><s:property value='#ls.info' escapeHtml="false"/></p>
                                        <a class="button" href="/detailProduct?id=<s:property value='#ls.id'/>">Chi tiết</a>
                                        <input type='hidden' id='id' value='<s:property value='#ls.id'/>' />
                                    </div>
                                </div>
                            </article>
                            </div>
  <!-- --------------------------- -->
 						 </s:iterator>
                          
                        </div>
                        <div class="container-bot">
                            <div class="container-top">
                                <div class="container">
								<!------>
								
                       
                        <div class="container-bot">
                            <div class="container-top">
                                <div class="container">
                                    <div class="wrapper">
                                        <article class="grid_8new">
                                            <div class="indent-left">
                                           
                                            <span>
											<div class="wrapper margin-bot">
                                                    <figure class="img-indent3">
                                                    <div id="twoimage"><div id="imagepr"></div>
                                                    
                                                    </div>
                                                    </figure>
                                                    <div class="extra-wrap">
                                                        <h6><strong><div id="namepro"></div> </strong></h6>
                                                        <p><div id="infopro"></div></p>
<!--                                                         <div id="linkct"></div> -->
                                                        
                                                    </div>
                                                </div>
                                             </span>
                                               
                                            </div>
                                        </article>
                                 
                                    </div>
                                </div>
                            </div>
                        </div>
								<!---->
                                    </div>
                                </div>
                            </div>
                        </div>
<script type="text/javascript">
$(document).ready( function() {
			
			$( "div.gridcontent" )
			.mouseenter(function() {
				$( this ).find("#idimage").fancybox({
					'overlayShow'	: false,
					'transitionIn'	: 'elastic',
					'transitionOut'	: 'elastic'
				});
			var id=$( this ).find("#id").val();
				Product.getProductById(id);
			})
			.mouseleave(function() {
				$( "#imagepr" ).html("");
// 				$( "#linkct" ).html("");
				$( "#namepro" ).html("");
				$( "#infopro" ).html("");
			
			});
});
</script>