package epis.unsa;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class consultainstruccion {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private String email;
	
	@Persistent
	private String comen;
	
	public consultainstruccion(String correo,String comentario ) {
		super();
		email=correo;
		comen=comentario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String correo) {
		email = correo;
	}
	public String getComen() {
		return comen;
	}
	public void setComen(String comentario) {
		comen = comentario;
	}
	public Key getKey() {
		return key;
	}
	
	@Override
	public String toString() {
		String resp = "<td>"+ email + "</td><td>" + comen  +"</td>";  
		return resp;
	}
	
	
}
