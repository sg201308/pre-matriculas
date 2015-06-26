package epis.unsa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
public class Lector {
	public String regex = "(\\d{4}) (.+)";
	public boolean validarCui(String archivo, String cui){
		ArrayList<String>prerequisitos = new ArrayList<String>();
		boolean rpta = false;
		try {
			Scanner sc = new Scanner(new File(archivo));
			Pattern p = Pattern.compile(regex);
			//TODO remove all courses
			while(sc.hasNext()){
				String line = sc.nextLine();
				Matcher m = p.matcher(line);
				if(m.matches()){
					String cod = m.group(1);
					if(cui.compareTo(cod) == 0){
						rpta = true;;
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rpta;
	}
	public ArrayList<String>procesarCui(String archivo, String cui) {
		ArrayList<String>prerequisitos = new ArrayList<String>();
		try {
			Scanner sc = new Scanner(new File(archivo));
			Pattern p = Pattern.compile(regex);
			//TODO remove all courses
			while(sc.hasNext()){
				String line = sc.nextLine();
				Matcher m = p.matcher(line);
				if(m.matches()){
					String cod = m.group(1);
					if(cui.compareTo(cod) == 0){
						prerequisitos.add(line);
					}
				}
				else{
					System.out.print("Formato Incorrecto intente de nuevo");
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prerequisitos = curso(prerequisitos);
		prerequisitos = quitarCV(prerequisitos);
		//				prerequisitos = generarCurso(archivo2, prerequisitos);
		return prerequisitos;		
	}
	public ArrayList<String> quitarCV(ArrayList<String>arr){
		ArrayList<String>a = new ArrayList<String>();
		for(String s : arr){
			if(s.substring(0,2).compareTo("13") == 0){
				a.add(s);
			}
		}
		return a;
	}
	public ArrayList<String>curso(ArrayList<String>arr){
		ArrayList<String> a = new ArrayList<String>();
		for(String s : arr){
			s = s.substring(s.indexOf(" ")+4,s.length());
			a.add(s);
		}
		return a;
	}
	public ArrayList<String>cursosLibres(String archivo){
		String expreg = "(\\d{7}),(\\d{1,2}),([^,]+|\".+\"),(\\d),(\\d),(\\d)?,(\\d)?,(\\d{7}|\".+\"|.+)?,(.+)";
		Pattern exp = Pattern.compile(expreg);
		ArrayList<String>cursolibre = new ArrayList<String>();
		try{
			Scanner scan = new Scanner(new File(archivo));
			while(scan.hasNext()){
				String line = scan.nextLine();
				Matcher m = exp.matcher(line);
				if(m.matches()){
					if(m.group(8) == null)
						cursolibre.add(m.group(1));
				}
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return cursolibre;
	}
	public ArrayList<String>cursosPre(String archivo){
		String expreg = "(\\d{7}),(\\d{1,2}),([^,]+|\".+\"),(\\d),(\\d),(\\d)?,(\\d)?,(\\d{7}|\".+\"|.+)?,(.+)";
		Pattern exp = Pattern.compile(expreg);
		ArrayList<String>cursopre = new ArrayList<String>();
		try{
			Scanner scan = new Scanner(new File(archivo));
			while(scan.hasNext()){
				String line = scan.nextLine();
				Matcher m = exp.matcher(line);
				if(m.matches()){
					if(m.group(8) != null)
						cursopre.add(m.group(1)+" "+m.group(8));
				}
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return cursopre;
	}
	public ArrayList<String> comparar(ArrayList<String>apro,ArrayList<String>pre){
		ArrayList<String>curso = new ArrayList<String>();
		//		ArrayList<String>aux = cursosPre("hola.csv");
		int count=0;
		int count2 =0;
		int count3 =0;
		for(int i =0;i<apro.size();i++){
			for(int j = 0; j<pre.size();j++){
				//				a = codigo del curso
				String a = pre.get(j);
				a = a.substring(0,a.indexOf(" "));
				//				b = prerequisito del curso
				String b = pre.get(j);
				b = b.substring(b.indexOf(" ")+1,b.length());
				if(b.length()==apro.get(i).length()){
					if(apro.get(i).compareTo(b)==0){
						curso.add(a.substring(b.indexOf(" ")+1,b.length()));
						//						break;
					}
				}
				if(b.length()>apro.get(i).length()){
					String cur = b.substring(1,b.length()-1);
					String[]prere = cur.split(", ");
					for(int k=0;k<prere.length;k++)
						if(apro.get(i).compareTo(prere[k]) == 0)
							count++;
					if(count == 2){
						if(a.equals("1302116"))
							count2++;
						if(count2==1)
							curso.add(a);
					}

					if(count==2){
						if(a.equals("1302223"))
							count3++;
						if(count3==1)
							curso.add(a);
					}
				}
			}
		}
		//		curso = comparar(apro,curso);
		curso = verificar(curso,apro);
		return curso;
	}
	public ArrayList<String>verificar(ArrayList<String>curso,ArrayList<String>apro){
		//		ArrayList<String>arr = new ArrayList<String>();
		for(int i = 0; i<apro.size();i++){
			for(int j = 0;j<curso.size();j++){
				if(curso.get(j).compareTo(apro.get(i))==0)
					curso.remove(j);
			}
		}
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.addAll(curso);
		curso.clear();
		curso.addAll(lhs);
		return curso;
	}
	public ArrayList<String>obtenerNombre(String archivo,ArrayList<String>prerequisitos) {
		String expreg = "(\\d{7}),(\\d{1,2}),([^,]+|\".+\"),(\\d),(\\d),(\\d)?,(\\d)?,(\\d{7}|\".+\"|.+)?,(.+)";
		ArrayList<String>curso = new ArrayList<String>();
		try {
			Scanner sc = new Scanner(new File(archivo));
			Pattern p = Pattern.compile(expreg);
			//TODO remove all courses
			int i=0;
			while(sc.hasNext()){
				String line = sc.nextLine();
				Matcher m = p.matcher(line);
				if(m.matches()){
					String a = m.group(1);
					for(String s : prerequisitos){
						if(s.compareTo(a)==0){
							curso.add(a+" "+m.group(3));
						}
					}
				}
				else{
					System.out.print("Formato Incorrecto intente de nuevo");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return curso;		
	}
	public ArrayList<String>obtenerNombre2(String archivo,ArrayList<String>prerequisitos) {
		String expreg = "(\\d{7}),(\\d{1,2}),([^,]+|\".+\"),(\\d),(\\d),(\\d)?,(\\d)?,(\\d{7}|\".+\"|.+)?,(.+)";
		ArrayList<String>curso = new ArrayList<String>();
		try {
			Scanner sc = new Scanner(new File(archivo));
			Pattern p = Pattern.compile(expreg);
			//TODO remove all courses
			int i=0;
			while(sc.hasNext()){
				String line = sc.nextLine();
				Matcher m = p.matcher(line);
				if(m.matches()){
					String a = m.group(1);
					for(String s : prerequisitos){
						if(s.compareTo(a)==0){
							curso.add(a+" "+m.group(3)+" Semestre: "+m.group(2)+" Creditos: "+m.group(4));
						}
					}
				}
				else{
					System.out.print("Formato Incorrecto intente de nuevo");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return curso;		
	}
	public ArrayList<String> juntar(ArrayList<String>curso) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.addAll(curso);
		curso.clear();
		curso.addAll(lhs);
		Collections.sort(curso);
		return curso;
	}
	
//	public Alumno consulta(String name){
//		PersistenceManager pm = PMF.get().getPersistenceManager();
//		Query q = pm.newQuery(Alumno.class,"name='sergio'");
//		q.setFilter("cui == cuiParam");
//	}
}
