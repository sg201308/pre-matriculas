
$(document).ready(function(){
	$("#matricular").click(function(){
		var checkboxes = document.getElementById("form1").curso;
		var curso="";
		for (var x=0; x < checkboxes.length; x++) {
			 if (checkboxes[x].checked) {
				 curso+="&curso="+checkboxes[x].value;
			 }
		}
		var codigo = $("#cui").val();
		alert(codigo+" "+curso);
		$.get("matriculado?cui="+codigo,"&curso="+curso,function(data){
			$("#myDiv2").html(data);
		});
	});
});