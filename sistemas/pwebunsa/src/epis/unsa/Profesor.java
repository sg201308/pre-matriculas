package epis.unsa;

import java.util.ArrayList;

public class Profesor {
	private String name;
	private String departamento;
	private ArrayList<String>cursos;
	public Profesor(String name, String departamento, ArrayList<String> cursos) {
		this.name = name;
		this.departamento = departamento;
		this.cursos = cursos;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public ArrayList<String> getCursos() {
		return cursos;
	}
	public void setCursos(ArrayList<String> cursos) {
		this.cursos = cursos;
	}
	
	
}
