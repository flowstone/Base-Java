function $id(element) {
	return document.getElementById(element);
}
//切屏--是按钮，_v是内容平台，_h是内容库
function reg(str) {
	var bt = $id(str + "_b").getElementsByTagName("h2");
	for ( var i = 0; i < bt.length; i++) {
		bt[i].subj = str;
		bt[i].pai = i;
		bt[i].style.cursor = "pointer";
		bt[i].onclick = function() {
			$id(this.subj + "_v").innerHTML = $id(this.subj + "_h")
					.getElementsByTagName("blockquote")[this.pai].innerHTML;
			for ( var j = 0; j < $id(this.subj + "_b")
					.getElementsByTagName("h2").length; j++) {
				var _bt = $id(this.subj + "_b").getElementsByTagName("h2")[j];
				var ison = j == this.pai;
				_bt.className = (ison ? "" : "h2bg");
			}
		}
	}
	$id(str + "_h").className = "none";
	$id(str + "_v").innerHTML = $id(str + "_h").getElementsByTagName("blockquote")[0].innerHTML;
}