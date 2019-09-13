function createXMLHttpRequest() {//创建XMLHttpRequest的对象的方法
		try {
			return new XMLHttpRequest();//大多数浏览器
		} catch (e) {
			try {
				return ActvieXObject("Msxml2.XMLHTTP");//IE6.0
			} catch (e) {
				try {
					return ActvieXObject("Microsoft.XMLHTTP");//IE5.5及更早版本	
				} catch (e) {
					alert("哥们儿，您用的是什么浏览器啊？");
					throw e;
				}
			}
		}
	}

	window.onload = function() {//文档加载事件
	
		var btn = document.getElementById("btn");

		btn.onclick = function() {
			
			var xmlHttp = createXMLHttpRequest();//获得XMLHttpRequest的对象
			
			xmlHttp.open("GET", "/day23_1/AServlet", true);//建立服务器连接

			xmlHttp.send(null);//发送信息，因为get方法，所以为null

			xmlHttp.onreadystatechange = function() {
				if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {//双重判定
					var text = xmlHttp.responseText;               //得到text
					var h1 = document.getElementById("h1");
					h1.innerHTML = text;
					
				}
			};
		};
	};