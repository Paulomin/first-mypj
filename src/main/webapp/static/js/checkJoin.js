function userIdCheck() {
	var userid = document.getElementById('user_id');
	$.ajax({
		url:"./sign/check",
		type: "GET",
		data: {
			userId: userid.value
		},
		dataType: "json",
		success: function(data) {
			if(data.able === "possible"){
				alert('사용 가능 합니다.');
			}else{
				alert('이 아이디는 사용이 불가능 합니다');
			}
		}
	});
}
