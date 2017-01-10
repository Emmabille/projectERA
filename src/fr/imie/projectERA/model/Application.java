package fr.imie.projectERA.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
* Main point to start app.
* @author Emmanuelle Billard <e.billard@gmail.com>, 
* @author Rahma Barhoumi <rahma.barhoumi@yahoo.fr>, 
* @author Aurelia Delauné <aurelia.delaune@gmail.com>
* @version 1.1.0
*/

public class Application {

	public static void main(String[] args) throws ParseException {

		//Cr�ation utilisateurs
        User user1 = new User ("Albert", "Camus", "aCamus", "acamus21");
		User user2 = new User ("Emile", "Zola", "eZola", "ezola32");
		User user3 = new User ("Victor", "Hugo", "vHugo", "vhugo49");

		System.out.println(user1.toString());
		System.out.println(user2.toString());
		System.out.println(user3.toString());
		
		//Cr�ation des enseignants
		Teacher teacher1 = new Teacher(1, "Honoré", "de Balzac", "hdeBalzac", "hdebalzac64");
		Teacher teacher2 = new Teacher(2, "Georges", "Sand", "gSand", "gsand99");
		Teacher teacher3 = new Teacher(3, "Gérard", "de Nerval", "gdeNerval", "gdenerval92");

		//on veut teacher ou user pour le syst.out.print ? ce qui suit donne user. 
		//pour teacher, faut faire son propre toString, mais compliqué...
		System.out.println(teacher1.toString());
		teacher1.connect();
		teacher1.downloadHomework();
		teacher1.disconnect();
		System.out.println(teacher2.toString());
		System.out.println(teacher3.toString());
		
		Administrator admin1 = new Administrator("Jean-Jacques", "Rousseau", "jjRousseau", "jjrousseau87", 999);
		
		System.out.println(admin1.toString());
		
	   
	    Student student1 = new Student ("Adelie", "Dupas", "aDupas", "aDupas12", "adupas@imie.com", 2, 23, 2016);
	    Student student2 = new Student ("Alice", "Derrien", "aDerrien", "aDerrien15", "aderrien@imie.com", 34, 5, 2016);
	    Student student3= new Student ("Maxime" , "Dujardin", "mDujardin", "mDujardin21", "mdujardin@imie.com", 6, 3, 2016);
	    
	    System.out.println(student1.toString());
	    System.out.println(student2.toString());
	    System.out.println(student3.toString());
	   
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	    //Cr�ation des listes d'autheurs
	    ArrayList<Teacher> authorsS1 = new ArrayList<Teacher>();
	    ArrayList<Teacher> authorsS2 = new ArrayList<Teacher>();
	    ArrayList<Teacher> authorsS3 = new ArrayList<Teacher>();
	    
	    authorsS1.add(teacher1);
	    authorsS2.add(teacher2);
	    authorsS3.add(teacher1);
	    authorsS3.add(teacher2);

	    System.out.println("taille authorsS1:" + authorsS1.size());
	    System.out.println("taille authorsS2:" + authorsS2.size());
	    System.out.println("taille authorsS3:" + authorsS3.size());
	 
	    //Cr�ation des sujets
	    Subject subject1 = new Subject (2, "Sujet Java" ,sdf.parse("31/12/2016"),2, "Realisation du cahier des charges" , 3, "informatique",authorsS1);
	    Subject subject2 = new Subject (3, "Sujet BDD", sdf.parse("02/01/2017") ,2, "Creation de 4 tables",1, "informatique",authorsS2); 
	    Subject subject3 = new Subject (4, "Sujet HTML",sdf.parse("01/02/2017") ,2, "Creation des interfaces", 2, "informatique",authorsS3);

	    //System.out.println("idSubject="+" "+ subject1.getIdSubject()+", "+"Title="+" "+ subject1.getTitle()+", "+ "GroupeSize"+" "+ subject1.getGroupSize()+", "+"Description ="+" "+ subject1.getDescription()+" "+ "Promo" +subject1.getIdPromo()+" "+"specialty="+" " +subject1.getSpecialty());
	    System.out.println(subject1.toString());
	    System.out.println(subject2.toString());
	    System.out.println(subject3.toString());

	    subject3.RetirerAuteur(teacher2);
	    subject3.AjouterAuteur(teacher3);
	    subject3.AjouterAuteur(teacher2);
	    
	    subject2.RetirerAuteur(teacher2);
	    

	    subject1.AjouterAuteur(teacher2);

	    System.out.println("taille authorsS1:" + authorsS1.size());
	    System.out.println("taille authorsS2:" + authorsS2.size());
	    System.out.println("taille authorsS3:" + authorsS3.size());
	    
	    subject1.downloadHomework();
	    
	   
	    
	    Homework task1 = new Homework ( 1, "Devoir Java", "nous souhaitons realiser une plateforme pour deposer les devoirs");
	    Homework task2 = new Homework (2, "Devoir BDD", "realisation de table Student, Professeur, Subject, Task");
	    
	    //System.out.println("TaskId="+" "+ task1.getIdTask()+ ", "+ "title="+" "+task1.getTitle()+" ,"+ "Document:"+" "+task1.getDocument());
	    System.out.println(task1.toString());
	    System.out.println(task2.toString());

}}
