
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


/**
 * MyGUI a my very own Graphical User Interface
 * @author Keny Nystedt 2014
 * Version 0.1
 */
 
 class MyGUI extends JFrame {
 
     private Dimension dimFrame;
     
     private JMenuBar menu;
     private JMenu archive, about;
     private JMenuItem terminate, help, aboutItem;
     
     private JOptionPane aboutInfo, helpInfo;

     public MyGUI(){
         
         this.dimFrame = new Dimension(400, 300);
         
         this.setSize(dimFrame);
         this.initGUI();
 
     }
     private void initGUI(){
         this.setTitle("JFrame");
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         
         this.menu = new JMenuBar();
         this.archive = new JMenu("Arkiv");
         this.about = new JMenu("Om");
         this.terminate = new JMenuItem("Avsluta programmet");
         this.help = new JMenuItem("Hjälp");
         this.aboutItem = new JMenuItem("Om");
         
         this.setJMenuBar( menu );
         this.menu.add( archive );
         this.menu.add( about );
         this.about.add( help );
         this.about.add( aboutItem );
         this.archive.add( terminate );
         
         this.terminate.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e ){
                System.exit( 0 );
            }
        });
         this.aboutItem.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e ){
                JOptionPane.showMessageDialog(rootPane, "Copyright: Kent Nystedt"
                        + "2014");
            }
        });
         
         this.help.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e ){
                JOptionPane.showMessageDialog(rootPane, "Akriv -> Avsluta program");
            }
        });   
         
     }
     public static void main(String[] args) {
       java.awt.EventQueue.invokeLater( new Runnable() {
            public void run() {
                new MyGUI().setVisible(true);
            }   
       });
     
    }
 }
