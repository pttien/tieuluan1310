<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
    <div class="container_12">
             <div class="wrapper p4">
             
            
             <!-- --------------------------------------------------------------------------------------- -->
              <s:iterator value="lisproduct" var="ls">
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
                 </s:iterator>      
                 <!-- --------------------------------------------------------- -->
                                 
             </div>
             <div class="container-bot">
                 <div class="container-top">
                     <div class="container">
                         <div class="wrapper">
                             <article class="grid_8new">
                                 <div class="indent-left">
<div class="wrapper margin-bot">
                                         <figure class="img-indent3"><img src="/resource/images/<s:property value='product.image'/>" alt=""></figure>
                                         <!-- <a id="idimage" href="/resource/images/<s:property value='product.image'/>"> <img src="/resource/images/<s:property value='product.image'/>" alt=""></a>-->
                                         <div class="extra-wrap">
		 							<form id="contact-form" method="post" enctype="multipart/form-data">                    
                                         <fieldset>
                                         		
                                               	<label><span class="text-form">Tên sản phẩm : </span><s:property value="product.name"/></label>
			                                    <label><span class="text-form">Giá Bán : </span><s:property value="pice_product"/> &nbsp;&nbsp;VND</label>                              
			                                    <label><span class="text-form">Nhà sản xuất:</span><s:property value="name_factory"/></label>           
			                                    <label><span class="text-form">Thời gian bảo hành:</span><s:property value="product.warranty"/>&nbsp;&nbsp;tháng</label>   
			                                    <label><span class="text-form">Tên danh mục:</span><s:property value="name_catalogy"/></label>   
			                                    <label><span class="text-form">Thông tin sản phẩm:</span></label><span><s:property value="product.info"/></span>                    
                                    <div class="wrapper">
                    
                                      <div class="extra-wrap">                                     
                                          <div class="clear"></div>
                                          <div class="buttons">
                                              <a class="button" href="#">Đặt mua</a>
                                              <a class="button" href="#">Thêm vào sản phẩm yêu thích</a>
                                          </div> 
                                      </div>
                                    </div>                            
                              </fieldset>						
                          </form>
                              </div>
                          </div>

                         
                      </div>
                  </article>
<!-----------------------------Hien danh sach binh luan--------------------------------------------->

<div>Bình luận</div>

		
		
<!---------------------------------------------------------------------------------------->
<article class="grid_8">
                                 <div class="indent-left2">
                                     
                                     <div class="wrapper img-indent-bot">                                                   
                                         <div class="extra-wrap">
                                             <p class="p1">Trần Văn Long</p>                                                      
                                             Nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est. 
                                         </div>
                                     </div>
	<div class="wrapper img-indent-bot">                                                   
                                         <div class="extra-wrap">
                                             <p class="p1">Trần Văn Long</p>                                                      
                                             Nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est. 
                                         </div>
                                     </div>
	<div class="wrapper img-indent-bot">                                                   
                                         <div class="extra-wrap">
                                             <p class="p1">Trần Văn Long</p>                                                      
                                             Nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est. 
                                         </div>
                                     </div>
	<div class="wrapper img-indent-bot">                                                   
                                         <div class="extra-wrap">
                                             <p class="p1">Trần Văn Long</p>                                                      
                                             Nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est. 
                                         </div>
                                     </div>
                                 </div>
                             </article>
<!------------Form Binh luânk-------------------------------------->
<article class="grid_8">
                                  <div class="indent-left">
                                      <h3 class="p1">Comment</h3>
                                      <form id="comment-form" method="post" enctype="multipart/form-data">                    
                                          <fieldset>                                                                                 
                                                <div class="wrapper">
                                                  <div class="text-form">Nội dung:</div>
                                                  <div class="extra-wrap">
                                                      <textarea></textarea>
                                                      <div class="clear"></div>
                                                      <div class="buttons">
                                                          <a class="button" href="#">Nhập lại</a>
                                                          <a class="button" href="#" >Gởi bình luận</a>
                                                      </div> 
                                                  </div>
                                                </div>                            
                                          </fieldset>						
                                      </form>
                                  </div>
                              </article>

<!------------------------------------------------------------------------------>


             
                </div>
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
			
			})
			.mouseleave(function() {
			
			});
});
</script>