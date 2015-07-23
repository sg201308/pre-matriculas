package epis.unsa;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;


@PersistenceCapable
public class Departamentos {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private String name;
	
//	@Persistent
//	private String lastname;
//	
//	@Persistent
//	private String ciudad;
//	
//	@Persistent
//	private String direccion;
//	
//	@Persistent
//	private String cui;
//
//	
//	@Persistent
//	private String dni;
//
//	@Persistent
//	private String [] cursos;
//
	public Departamentos(String name) {
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//
//	public String getLastname() {
//		return lastname;
//	}
//
//	public void setLastname(String lastname) {
//		this.lastname = lastname;
//	}
//
//	public String getCiudad() {
//		return ciudad;
//	}
//
//	public void setCiudad(String ciudad) {
//		this.ciudad = ciudad;
//	}
//
//	public String getDireccion() {
//		return direccion;
//	}
//
//	public void setDireccion(String direccion) {
//		this.direccion = direccion;
//	}
//
//	public String getCui() {
//		return cui;
//	}
//
//	public void setCui(String cui) {
//		this.cui = cui;
//	}
//
//	public String getDni() {
//		return dni;
//	}
//
//	public void setDni(String dni) {
//		this.dni = dni;
//	}
//
//	public String[] getCursos() {
//		return cursos;
//	}
//
//	public void setCursos(String[] cursos) {
//		this.cursos = cursos;
//	}

	public Key getKey() {
		return key;
	}
}