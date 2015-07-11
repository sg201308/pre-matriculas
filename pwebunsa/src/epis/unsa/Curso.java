package epis.unsa;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Curso {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	@Persistent
	private int sem;
	@Persistent
	private String name;
	@Persistent
	private String cod;
	@Persistent
	private int cred;
	@Persistent
	private String depAca;
	
	public Curso(String name, int sem, String cod, int cred, String depAca) {
		this.name = name;
		this.sem = sem;
		this.cod = cod;
		this.cred = cred;
		this.depAca = depAca;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public int getCred() {
		return cred;
	}
	public void setCred(int cred) {
		this.cred = cred;
	}
	public String getDepAca() {
		return depAca;
	}
	public void setDepAca(String depAca) {
		this.depAca = depAca;
	}
	public Key getKey(){
		return key;
	}
	@Override
	public String toString() {
		String resp = cod + "\t" + sem + "\t" + name + "\t" + cred + "\t" + depAca;  
		return resp;
	}
}