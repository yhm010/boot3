/**
 * cart
 */

$("#cart").click(function(){
	let productNum = $(this).attr("data-pn");
	console.log(productNum);
	let count=2;
	$.ajax({
		type:"POST",
		url:"../cart/"+productNum+ "/"+count,
		seccess:function(data){
			console.log("data : ", data);
			if(data>0){
			let check = confirm("장바구니로 이동");				
			}else {
				alert("등록 실패")
			}
		}
	});
});

alert("#btn222").click(function(){
	$.ajax({
		type: "DELETE",
		URL:"../cart/1",
		success:function(data){
			console.log(data.trim());
		}
	});
});

function getList() {
	$.ajax({
		type: "GET",
		url: "../cart/2",
		success: function(data) {
			console.log(data);
			let r = "<table>"
			//console.log(data[0].cartNum);
		}
	});

}