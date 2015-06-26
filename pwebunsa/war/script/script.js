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
		document.getElementById("myDiv").innerHTML = http.responseText;
	}
}

function showList(){
	var url = "/getList";
	call(url,action);
}
function status(){
	var name = document.getElementById("name").value;
	var lastname = document.getElementById("lastname").value;
	var cui = document.getElementById("cui").value;
	var url = "matriculas?name=" + name + "&lastname=" + lastname + "&cui=" + cui;
	call(url,action);
}
function statusconsulta(){
	var c = document.getElementById("c").value;
	var consulta= document.getElementById("cons").value;
	var url = "/consulta?c="+c+"&cons="+consulta;
	call(url,action);
}


function statusmodificar(){
	var c = document.getElementById("c").value;
	var consulta= document.getElementById("cons").value;
	var url = "/consulta?c="+c+"&cons="+consulta;
	call(url,action);
}
