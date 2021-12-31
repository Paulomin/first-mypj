function userIdCheck() {
	var userid = document.getElementById('user_id');
	var msg = document.getElementById('id_check');
   var ckid = /^[a-z0-9_-]{4,20}$/;
   var redCss = 'font-size: 13px; color:red; margin-left: 5px;';
	
   $.ajax({
		url:"./sign/check",
		type: "GET",
		data: {
			userId: userid.value
		},
		dataType: "json",
		success: function(data) {
			if(data.able === "possible" && ckid.test(userid)){
				msg.innerText = "사용 가능한 아이디 입니다.";
				msg.style.cssText = 'font-size: 13px; margin-left: 5px;';
           $('#user_id').focusout(function() {
              msg.innerText = "";
           });
			} else if(!ckid.test(userid)){
            msg.innerText = "최소 4 ~ 20자를 입력해주세요.";
            msg.style.cssText = 'font-size: 13px; color:red; margin-left: 5px;';
         } else if(data.able === "used" && ckid.test(userid)) {
            msg.innerText = "이미 사용중인 아이디 입니다.";
            msg.style.cssText = 'font-size: 13px; color:red; margin-left: 5px;';
         }
	}});
}