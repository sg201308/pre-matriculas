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
	//getlist2 muestra toda la lista de cursos
	var url = "mostrarCurso2";
	call(url,action);
}
function showList2(){
	//getlist2 muestra toda la lista de cursos
	var sem = document.getElementById("sem").value;
	var url = "mostrarCurso?sem="+sem;
	call(url,action);
	document.getElementById("myForm").reset();
}
function remove(){
	var cod = document.getElementById("cod").value;
	var url = "remove?cod="+cod;
	call(url,action);
	alert("El curso fue correctamente eliminado");
	document.getElementById("myForm").reset();
}
function status(){
	//recibe todos los datos del formulario y los manda al save sevlets para guardarlos
	
	var cod = document.getElementById("cod").value;
	var sem = document.getElementById("sem").value;
	var name = document.getElementById("name").value;
	var cred = document.getElementById("cred").value;
	var depAca = document.getElementById("depAca").value;
	var url = "save?cod=" + cod + "&sem=" + sem + "&name=" + name + "&cred=" + cred + "&depAca=" + depAca;
	call(url,action);
	alert("Curso Correctamente guardado");
	}
function local(){
	status();
	showList();
}
function local2(){
	remove();
	showList();
}