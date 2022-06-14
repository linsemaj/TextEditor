package com.example.text.editor;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;

public class TextEditor {
	//window 
	JFrame frame= new JFrame("TextEditor");
	//typing
	JTextArea textArea= new JTextArea();

	public TextEditor(){
		//MenuBar which is like frame but for menus
		JMenuBar menuBar = new JMenuBar();
		//menu of bar
		JMenu fileMenu = new JMenu("File");
		
		menuBar.add(fileMenu);
		frame.setSize(600, 500);
		frame.add(textArea);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextEditor t = new TextEditor();
		System.out.println("HI");
	}

}
