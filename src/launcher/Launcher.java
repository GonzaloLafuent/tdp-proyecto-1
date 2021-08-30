package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student gonzalo = new Student(129998,"Lafuente","Gonzalo","lafuentegonzalo1@gmail.com","https://github.com/GonzaloLafuent","s");
            	SimplePresentationScreen window = new SimplePresentationScreen(gonzalo);
            	window.setVisible(true);
            }
        });
    }
}