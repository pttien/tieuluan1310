<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
  <div class="container_12">
                        <div class="wrapper p5">
                        
                         <s:iterator value="lisproduct" var="ls">
					  
  <!-- ------------------------------- -->
  							
                            <article class="grid_4">
                                <div class="wrapper">
                                    <figure class="img-indent">
                                    <div id="newimage">
                                    <img src="/resource/images/<s:property value='#ls.image'/>" alt="">
                                    </div>
                                    </figure>
                                    <div class="extra-wrap">
                                        <h4><s:property value='#ls.name'/></h4>
                                        <p class="p2"><s:property value='#ls.info'/></p>
                                        <a class="button" href="#">Chi tiết</a>
                                    </div>
                                </div>
                            </article>
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
											<div class="wrapper margin-bot">
                                                    <figure class="img-indent3"><img src="/resource/images/page4-img1.png" alt=""></figure>
                                                    <div class="extra-wrap">
                                                        <h6><strong>At vero eos et accusam et justo duo dolores </strong></h6>
                                                        <p>Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna.</p>
                                                        <a class="button" href="#">Read More</a>
                                                    </div>
                                                </div>
                                             
                                               
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