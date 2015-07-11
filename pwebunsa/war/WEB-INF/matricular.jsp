

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src ="script/script.js"></script>
    <script src ="script/script2.js"></script>    
    <link rel="stylesheet" type="text/css" href="estilos/Style.css">
    <title>Matriculas EPISUNSA</title>
</head>
<body>
<br><br><br><br>
    <div id="content">
    <div class="separatorbox">
    <img src="estilos/logo.png" style="margin-left:-100px; margin-top=:-100px">
    <center><h3 style="margin-left:100px; margin-top:-42px">Escuela Profesional de Ingenieria de Sistemas</h3></center>
    <p> llene todos los campos del formulario</p>
    <table width="822"width="822" border="0" style="width: 500px; height: 270px;">
    <tbody>
    <tr>
    <td colspan="2" rowspan="6" style="height: 170px">            
    <table width="677">
    <tbody>
        <tr>
            <td width="210" style="height: 25px; width: 138px;">Nombres:</td> 
            <td width="210" style="height: 25px; width: 138px;">
            <input type="text" id="name" size ="100" name = "name" placeholder="Ingrese su nombre" style="width: 170px"></td>
            <td width="40" style="height: 25px">
                <span style="color: #ff0000">(*)</span>
            </td>
        </tr>
        <tr>
            <td width="210" style="height: 25px; width: 138px;">Apellidos:</td> 
            <td width="210" style="height: 25px; width: 138px;">
            <input type="text" id="lastname" name ="lastname"size ="100" placeholder="Ingrese sus Apellidos" style="width: 170px"></td>
            <td width="40" style="height: 25px">
                <span style="color: #ff0000">(*)</span>
            </td>
        </tr>
          <tr>
            <td width="210" style="height: 25px; width: 138px;">Ciudad:</td> 
            <td width="210" style="height: 25px; width: 138px;">
            <input type="text" id="ciudad" size ="100" name = "ciudad" placeholder="Ciudad" style="width: 170px"></td>
            <td width="40" style="height: 25px">
                <span style="color: #ff0000">(*)</span>
            </td>
        </tr>
        <tr>
            <td width="210" style="height: 25px; width: 138px;">Direccion:</td> 
            <td width="210" style="height: 25px; width: 138px;">
            <input type="text" id="direccion" name ="direccion"size ="100" placeholder="Ingrese sus Apellidos" style="width: 170px"></td>
            <td width="40" style="height: 25px">
                <span style="color: #ff0000">(*)</span>
            </td>
        </tr>
        <tr>
            <td width="210" style="height: 25px; width: 138px;">DNI:</td> 
            <td width="210" style="height: 25px; width: 138px;">
            <input type="text" id="dni" name ="dni"size ="100" placeholder="Ingrese su DNI" style="width: 170px"></td>
            <td width="40" style="height: 25px">
                <span style="color: #ff0000">(*)</span>
            </td>
        </tr>

        <tr>
            <td style="height: 26px; width: 138px;">CUI:</td>
            <td style="height: 26px">
              <input type="text" id="cui" name = "cui" placeholder="Ingrese su CUI">
            </td>
                <td style="height: 26px;">
                    <span style="color: #ff0000">(*)</span></td>
        </tr>
        <tr>
            <td>
            <br>
            <input type="button" id="boton" value="Enviar" onClick="status()">
            </td>
        </tr>        
    </table>
    <br>
    <div id="myDiv">
    </div>
    <div id="myDiv2"></div>
    </div>
    </div>
</body>
</html>