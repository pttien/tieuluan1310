var Product = {
	xhrSearchCM : null,
	xhrCreateSerial : null,
	
	getProductById:function(id){
		$.getJSON( "/getProduce", { id:id} )
		.done(function( json ) {
			var image='<img src="/resource/images/'+json.product.image+'" alt="">';
			$( "#imagepr" ).html(""+image+"");
//			var linkct='<a class="button" href="#">Chi tiết</a>';
//			$( "#linkct" ).html(""+linkct+"");
			$( "#namepro" ).html(""+json.product.name+"");
			$( "#infopro" ).html(""+json.product.info+"");
		////
		})
		.fail(function( jqxhr, textStatus, error ) {
		var err = textStatus + ", " + error;
		console.log( "Request Failed: " + err );
		});
	}
		
};
	