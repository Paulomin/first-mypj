function userIdCheck() {
	var user = document.getElementById('user_id');
	$.ajax({
		url: "./sign/check",
		type: "GET",
		data: {
			userid: user.value
		},
		dataType: "json",
		success: function(data) {
			if(data.state === "possible") {
				document.getElementById('id_check').innerText = "사용 가능한 아이디 입니다.";
			} else {
				document.getElementById('id_check').innerText = "이미 사용중인 아이디 입니다.";
			}
		}
	})
}
