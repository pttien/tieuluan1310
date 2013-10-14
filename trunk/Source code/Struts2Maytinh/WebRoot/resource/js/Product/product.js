var Product = {
	xhrSearchCM : null,
	xhrCreateSerial : null,
	
	getProductById:function(id){
		if(Product.xhrSearchCM!=null){
			Product.xhrSearchCM.abort();
			Product.xhrSearchCM=null;
		}
		var data = new Object();	
		data.id = id;
		var kData = $.param(data, true);
		Product.xhrSearchCM=$.ajax({
			type : "GET",
			url : "/getProduce",
			data : (kData),
			dataType: "html",
			success : function(data) {
				$("#gridContent").html(data);
			}
		});
		return false;
	}
		
};
	