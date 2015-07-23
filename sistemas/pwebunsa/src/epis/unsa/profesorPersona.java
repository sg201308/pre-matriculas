package epis.unsa;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class profesorPersona {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private String nom;
	
	@Persistent
	private String apep;
	
	@Persistent
	private String apem;
	
	@Persistent
	private String sex;
	
	@Persistent
	private String dni;
	@Persistent
	private String nac;
	
	@Persistent
	private String dia;
	
	@Persistent
	private String mes;
	
	@Persistent
	private String anno;
	
	@Persistent
	private String email;
	
	@Persistent
	private String tel;
	
	@Persistent
	private String dep;
	
	@Persistent
	private String esp;
	

	public profesorPersona(String nombre, String apellidop,String apellidom,String sexo, String carnet,String nacionalidad, String dias,String meses,String annos,String correo,String telefono,String departamento,String especialidad) {
		super();
		nom = nombre;
		apep = apellidop;
		apem = apellidom;
		sex = sexo;
		dni=carnet;	
		nac=nacionalidad;
		dia = dias;
		mes = meses;
		anno = annos;
		email = correo;
		tel=telefono;
		dep=departamento;
		esp=especialidad;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nombre) {
		nom = nombre;
	}
	public String getApep() {
		return apep;
	}
	public void setApep(String apellidop) {
		apep = apellidop;
	}
	public String getApem() {
		return apem;
	}
	public void setApem(String apellidom) {
		apem = apellidom;
	}
	public String getSex() {
		return sex;
	}

	public void setSex(String sexo) {
		sex = sexo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String carnet) {
		dni = carnet;
	}
	public String getNac() {
		return nac;
	}
	public void setNac(String nacionalidad) {
		nac = nacionalidad;
	}
	public String getDia() {
		return dia;
	}

	public void setDia(String dias) {
		dia = dias;
	}
	public String getMes() {
		return mes;
	}

	public void setMes(String meses) {
		mes = meses;
	}
	public String getAnno() {
		return anno;
	}

	public void setAnno(String annos) {
		anno = annos;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String correo) {
		email = correo;
	}
	public String getTel() {
		return tel;
	}
	public void  setTel(String telefono) {
		tel=telefono;
	}
	public String getDep() {
		return dep;
	}
	

	public void setDep(String departamento) {
		dep = departamento;
	}
	public String getEsp() {
		return esp;
	}
	

	public void setEsp(String especialidad) {
		esp = especialidad;
	}
	public Key getKey() {
		return key;
	}
	
	@Override
	public String toString() {
		String resp = "<td>"+apep +" "+apem+ " , " + nom + "</td><td>" + dni + "</td><td>"+ nac+"</td><td>"+ dia + "/" + mes + "/"  + anno + "</td><td>" + email +"</td><td>"+ tel +"</td><td>"+ dep +"</td><td>"+esp+"</td>";  
		return resp;
	}
}