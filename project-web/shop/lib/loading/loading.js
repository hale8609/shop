function maskShow(){
	if ($(".mask").length==0){
		$("body").append('<div class="mask"><div class="loading"><div class="k-line k-line11-1"></div><div class="k-line k-line11-2"></div><div class="k-line k-line11-3"></div><div class="k-line k-line11-4"></div><div class="k-line k-line11-5"></div></div></div>');
	}
}

function maskHide(){
	$(".mask").remove();
}
