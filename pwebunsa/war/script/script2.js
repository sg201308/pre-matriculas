function call(url, cfunc){
	if (window.XMLHttpRequest){
		http = new XMLHttpRequest();
	}else{
		http = new ActiveXObject("Microsoft.XMLHTTP");
	}
	http.onreadystatechange = cfunc;
	http.open("GET",url,true);
	http.send();
}
function action(){
	if (http.readyState == 4 && http.status == 200){
		document.getElementById("myDiv2").innerHTML = http.responseText;
	}
}

function showList(){
	var url = "/getList";
	call(url,action);
}
function execute(){
	var name= document.getElementById("name").value;
	var lastname= document.getElementById("lastname").value;
	var ciudad= document.getElementById("ciudad").value;
	var direccion= document.getElementById("direccion").value;
	var dni= document.getElementById("dni").value;
	var cui = document.getElementById("cui").value;
	var checkboxes = document.getElementById("form1").curso;
	var curso="";
	for (var x=0; x < checkboxes.length; x++) {
		 if (checkboxes[x].checked) {
			 curso+="&curso="+checkboxes[x].value;
		 }
	}
	var url = "matriculado?name=" + name + "&lastname="+lastname + "&ciudad="+ciudad+
				"&direccion="+direccion+"&dni="+dni+"&cui="+cui+"&curso="+curso;
	call(url,action);
}
function execute2(){
	var cui = document.getElementById("cui").value;
	var url="/getList?cui="+cui;
	call(url,action)
}
function showCursos(){
	execute();
	showList();
	execute2();
}