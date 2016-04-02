package com.varun;
import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class JangoApp{
    private static javax.swing.JButton jButton1;
    private static javax.swing.JTextField jTextField1;

	public static void main(String[] args){
	   final String dosCommand = "cmd /c dir /s";
	      final String location = "C:\\WINDOWS";
		
		JFrame mainFrame = new JFrame("Jango App");
		  try {
				mainFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("e:/2.jpg")))));
			} catch (IOException e) {
			}

	        jButton1 = new javax.swing.JButton();
	        
	        
		    jButton1.setBackground(new java.awt.Color(102, 255, 255));
	        jButton1.setFont(new java.awt.Font("Lucida Handwriting", 1, 11)); // NOI18N
	        jButton1.setText("Submit");
	        jButton1.setBounds(158, 163, 93, 33);
	        jTextField1 = new javax.swing.JTextField();
	        jTextField1.setBounds(108, 98, 199, 35);
	     
	     //   final JTextField userText = new JTextField(6);
	        
	        
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	      	  	   String data = jTextField1.getText();
//	    		   String arr[]=data1.split(" ",2);
	//    		   String data = arr[0];
	    
	    		   if(data.equals("eclipse")){
	                	 data="C:/Users/varun/Downloads/eclipse-jee-kepler-SR2-win32/eclipse/eclipse.exe";
	                	 Desktop desktop = Desktop.getDesktop();
	                     
	                	 File   file = new File(data);
	                	
	                	 if(file.exists())
	 						try {
	 							desktop.open(file);
	 						} catch (IOException e1) {
	 							e1.printStackTrace();
	 						}
	    		   }

	    		    else if(data.endsWith("shutdown")){
	    			   Runtime runtime = Runtime.getRuntime();
	    				try {
							Process proc = runtime.exec("shutdown -s -t 0");
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	    				System.exit(0);    			   
	    		   }
	    		   else if(data.equals("google")){
	              	 
	              	try {
	              	  Desktop desktop = java.awt.Desktop.getDesktop();
	              	  URI oURL = new URI("http://www.google.com");
	              	  desktop.browse(oURL);
	              	} catch (Exception e1) {
	              	  e1.printStackTrace();
	              	}
	  		   }
	    		   else if(data.equals("baps")){
		              	 
		              	try {
		              	  Desktop desktop = java.awt.Desktop.getDesktop();
		              	  URI oURL = new URI("http://www.baps.org");
		              	  desktop.browse(oURL);
		              	} catch (Exception e1) {
		              	  e1.printStackTrace();
		              	}
		  		   }
	    		   else if(data.equals("facebook")){
		              	 
		              	try {
		              	  Desktop desktop = java.awt.Desktop.getDesktop();
		              	  URI oURL = new URI("http://www.facebook.com");
		              	  desktop.browse(oURL);
		              	} catch (Exception e1) {
		              	  e1.printStackTrace();
		              	}
		  		   }
	    		   
	    		   else if(data.equals("gmail")){
		              	 
		              	try {
		              	  Desktop desktop = java.awt.Desktop.getDesktop();
		              	  URI oURL = new URI("http://www.gmail.com");
		              	  desktop.browse(oURL);
		              	} catch (Exception e1) {
		              	  e1.printStackTrace();
		              	}
		  		   }

	    		      		                      
	    		   else if(data.equals("paint")){
	                	 data="C:/Windows/System32/mspaint.exe";
	                	 Desktop desktop = Desktop.getDesktop();
	                     
	                	 File   file = new File(data);
	                	
	                	 if(file.exists())
	 						try {
	 							desktop.open(file);
	 						} catch (IOException e1) {
	 							e1.printStackTrace();
	 						}
	    		   }

	    		   else if(data.equals("run")){

	    			   Robot r;
					try {
						r = new Robot();
						   r.keyPress(KeyEvent.VK_WINDOWS);
		    			   r.keyPress(KeyEvent.VK_R);  // VK_WINDOWS key still pressed
		    			   r.keyRelease(KeyEvent.VK_R);
		    			   r.keyRelease(KeyEvent.VK_WINDOWS);
		    		   
					} catch (AWTException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    			}

	    		   else if(data.equals("lock")){

	    			   Robot r;
					try {
						r = new Robot();
						   r.keyPress(KeyEvent.VK_WINDOWS);
		    			   r.keyPress(KeyEvent.VK_L);  // VK_WINDOWS key still pressed
		    			   r.keyRelease(KeyEvent.VK_L);
		    			   r.keyRelease(KeyEvent.VK_WINDOWS);
		    		   
					} catch (AWTException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    			}

	    		   else if(data.equals("taskmanager")){

	    			   Robot r;
					try {
						r = new Robot();
						   r.keyPress(KeyEvent.VK_CONTROL);
		    			   r.keyPress(KeyEvent.VK_SHIFT);
		    			   r.keyPress(KeyEvent.VK_ESCAPE);// VK_WINDOWS key still pressed
		    			   r.keyRelease(KeyEvent.VK_ESCAPE);
		    			   r.keyRelease(KeyEvent.VK_SHIFT);
		    			   r.keyRelease(KeyEvent.VK_CONTROL);
		    		   
					} catch (AWTException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    			}
	    		   else if(data.equals("controlpanel")){

	    		   String[] command = new String[3];
	    		   command[0] = "cmd";
	    		   command[1] = "/c";
	    		   command[2] = "start control";

	    		   try {
					Process p = Runtime.getRuntime().exec (command);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
}
	    		   else if(data.equals("paint")){

		    		   String[] command = new String[3];
		    		   command[0] = "cmd";
		    		   command[1] = "/c";
		    		   command[2] = "start mspaint ";
		    		   
		    		   try {
						Process p = Runtime.getRuntime().exec (command);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    		   }	    		   
	    		   else if(data.equals("notepad")){

		    		   String[] command = new String[3];
		    		   command[0] = "cmd";
		    		   command[1] = "/c";
		    		   command[2] = "start notepad ";
		    		   
		    		   try {
						Process p = Runtime.getRuntime().exec (command);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	}
	    

	    		   else if(data.endsWith("restart")){
	    			   Runtime runtime = Runtime.getRuntime();
	    				try {
							Process proc = runtime.exec("shutdown -r -t 0");
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	    				System.exit(0);    			   
	    		   }
	    		   
	    		   else if(data.endsWith("cmd")){
	    		   try {
	    		        Runtime.getRuntime().exec("cmd.exe /c start");
	    		     
	    		    } catch (IOException ex) {
	    		        ex.printStackTrace();
	    		    }
	    		   }
	    		   else{
	                	 Desktop desktop = Desktop.getDesktop();
	                     
	                	 File   file = new File(data);
	                	
	                	 if(file.exists())
	 						try {
	 							desktop.open(file);
	 						} catch (IOException e1) {
	 							e1.printStackTrace();
	 						}
	    		   }
	    		   
	    		   
	    		   
	            } 
	        });

	        
	        
	        
mainFrame.add(jTextField1);
mainFrame.add(jButton1);
mainFrame.setSize(400,300);
mainFrame.setVisible(true);
	
	}
}

