package tutorpoint;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Avishek
 */
public class teacherHome1 extends javax.swing.JFrame {

    /**
     * Creates new form teacherHome1
     */
    public int state;
    public String courseID = "";
    public String courseName = "";
    public String subTopicName = "";
    public String subTopics = "" ;
    public ArrayList<ListEntry> entry = new ArrayList<>() ;
    public user u ;
    teacherHome1 t ;
    videoChooser v ;
    
    public teacherHome1( user u ) {
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("background.jpg")));
        setLayout(new FlowLayout());
        initComponents();
        //getContentPane().setBackground( new Color( 214 , 246 , 250 ) );
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(( screenSize.width - 1280 ) / 2 , ( screenSize.height - 720 ) / 2 ,1280,720);
        this.t = this ; 
        this.u = u ;
        courses( ) ;
        v = new videoChooser( this ) ;
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tutorpoint/Create copy.png"))); // NOI18N
        jButton1.setText("Add course");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("Enter course name here.");

        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(back))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void courses( )
    {
        jLabel2.setText("My courses.") ;
        jButton1.setText( "Add course." ) ;
        jTextField1.setText( "Enter course name here." ) ;
        jLabel1.setText( "" ) ;

        String query = "SELECT * FROM  courses";

        try {
            ArrayList<ArrayList<String>> rs = u.sendQuery(query,2);
            entry.clear();
            for(int i = 0 ; i < rs.size() ; i++ ){
                String content = "";
                content += rs.get(i).get(1) + "\t ( Rating: " + rs.get(i).get(3) + " )";
                String id = rs.get(i).get(0);
                entry.add(new ListEntry(content,"folder.png",id));
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

        DefaultListModel<ListEntry> listModel = new DefaultListModel<>();
        for(int i = 0 ; i < entry.size() ; i ++)
        listModel.addElement(entry.get(i));

        back.setEnabled(false);
        courseName = "";

        jList1.setModel(listModel);
        jList1.setCellRenderer(new courseRenderer());
        jList1.setVisibleRowCount(entry.size());

        state = 0;
    }
    
    public void subtopics( )
    {
        try {
            
            String query = "SELECT * FROM courses WHERE id = \'" + courseID + "\';";
            ArrayList<ArrayList<String> > res = u.sendQuery(query, 2);

            entry.clear();
            subTopics = res.get(0).get(4);
            if( subTopics == null )
                subTopics = "" ;
            courseName = res.get(0).get(1);
            jLabel2.setText("Subtopics for Course : " + courseName ) ;
            int ind = 0;
            for(int i = 0 ; i < subTopics.length() ; i ++){
                if(subTopics.charAt(i) == '#'){
                    entry.add(new ListEntry(subTopics.substring(ind,i),"folder.png",""));
                    ind = i + 1;
                }
            }
            
            DefaultListModel<ListEntry> listModel = new DefaultListModel<>();
            for(int i = 0 ; i < entry.size() ; i ++)
            listModel.addElement(entry.get(i));

            state = 1;

            back.setEnabled(true);
            jButton1.setText( "Add subtopic." ) ;
            jTextField1.setText( "Enter subtopic name here." ) ;
            jLabel1.setText( "" ) ;
            jList1.setModel(listModel);
            jList1.setCellRenderer(new courseRenderer());
            jList1.setVisibleRowCount(entry.size());

            
        }catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public void videoUpload( String filePath )
    {
        System.out.println(filePath); 
        try {
            
            String name = jTextField1.getText() ;
            String query = "INSERT INTO videos(name,cid,subtopic) VALUES('"+name+"','"+courseID+"','" + subTopicName + "')";
            ArrayList<ArrayList<String>> rs ;
            rs = u.sendQuery( query , 1 );
            query = "SELECT * FROM videos WHERE subtopic='" + subTopicName + 
                    "' AND cid=" + courseID + " AND name='" + name + "'";
            ArrayList<ArrayList<String>> videos = u.sendQuery( query , 2 );
            String video = videos.get(0).get(0) ;
            
            System.out.println( "NEW : "  + video );
            u.sendQuery( video , 4 ) ;
            Thread.sleep(2000) ;
            videoSender vi = new videoSender( filePath , u.ip ) ;
            if( vi.startUpload( ) )
            {
                jLabel1.setText("Video Added.") ;
                String content = "New video " + name + " added by " + u.email ;
                query = "SELECT * FROM subscriptions WHERE t_email='" + u.email + "'" ;
                ArrayList<ArrayList<String>> subscriptions = u.sendQuery( query , 2 ) ;
                for( int i = 0 ; i < subscriptions.size( ) ; i++ )
                {
                    String s_email = subscriptions.get(i).get(1) ;
                    query = "INSERT INTO notifications(t_email,s_email,content) VALUES('"+u.email+"','"+s_email+"','" + content + "')";
                    u.sendQuery( query , 1 ) ;
                }
                videos( ) ;
            }    
            else
            {   
                query = "DELETE FROM videos WHERE id=" + video ;
                u.sendQuery( query , 1 ) ;
                jLabel1.setText("Error in adding video.");
            }
        } catch (IOException ex) {
            Logger.getLogger(teacherHome1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(teacherHome1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void videos( )
    {
        try {
            jLabel2.setText("Videos for Course : " + courseName + " , Subtopic : " + subTopicName + " !" ) ;
            
            String query = "SELECT * FROM videos WHERE cid = \'" + courseID + "\' and subtopic = \'" + subTopicName + "\';";

            ArrayList<ArrayList<String> > res = u.sendQuery(query, 2);

            entry.clear();
            for(int i = 0 ; i < res.size() ; i ++){
                entry.add(new ListEntry(res.get(i).get(1),"video.png",res.get(i).get(0)));
            }

            DefaultListModel<ListEntry> listModel = new DefaultListModel<>();
            for(int i = 0 ; i < entry.size() ; i ++)
            listModel.addElement(entry.get(i));

            state = 2;

            jButton1.setText( "Add video." ) ;
            jTextField1.setText( "Enter video name here." ) ;
            jLabel1.setText( "" ) ;

            back.setEnabled(true);

            jList1.setModel(listModel);
            jList1.setCellRenderer(new courseRenderer());
            jList1.setVisibleRowCount(entry.size());

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2){
            ListEntry en = (ListEntry) jList1.getSelectedValue();

            if(state == 0 && en != null){
                // SubTopic State ................
                courseID = en.id;
                subtopics( ) ;
                
            }
            else if(state == 1 && en != null){
                
                subTopicName = en.title;
                videos( ) ;
            }
            else if(state == 2 && en != null){
                // Video Viewing State ...........
                String videoID = en.id;
                try {
                    ArrayList<ArrayList<String>> res = u.sendQuery("$$$$",3);
                    String path = res.get(0).get(0).concat(videoID);
                    new player(u,path,videoID,t,null).setVisible(true);
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }//GEN-LAST:event_jList1MouseClicked

    
    
    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged

    }//GEN-LAST:event_jList1ValueChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        courses( ) ;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        if(state == 2){
            subtopics( ) ;
        }
        else if(state == 1){
            courses( ) ;
        }

    }//GEN-LAST:event_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if( state == 0 )
        {
            //Add course code here.
            try {
                String name = jTextField1.getText() ;
                String query = "INSERT INTO courses(name,email) VALUES('"+name+"', '"+u.email+"')";
                ArrayList<ArrayList<String>> rs ;
                rs = u.sendQuery( query , 1 );
                System.out.println(rs.get(0).get(0));
                if( rs.get(0).get(0).equals("DONE") ) {
                    jLabel1.setText("Course Added.") ;
                    courses( ) ;
                }
                else{
                    jLabel1.setText("Error in adding course.");
                }
            } catch (IOException ex) {
                Logger.getLogger(teacherHome1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if( state == 1 )
        {
            //Add subtopic course here.
            try {
                String name = jTextField1.getText() ;
                subTopics += ( name + "#" ) ; 
                String query = "UPDATE courses SET subtopics='" + subTopics + "' WHERE id=" + courseID ;
                ArrayList<ArrayList<String>> rs ;
                rs = u.sendQuery( query , 1 );
                if( rs.get(0).get(0).equals("DONE") ) {
                    jLabel1.setText("Subtopic Added.") ;
                    subtopics( ) ;
                }
                else{
                    jLabel1.setText("Error in adding subtopic.");
                }
            } catch (IOException ex) {
                Logger.getLogger(teacherHome1.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        else
        {
            //Add video code here.
            v.setVisible( true ) ;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            u.s.close( ) ;
            this.dispose( ) ;
            new Login().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(teacherHome1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(teacherHome1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teacherHome1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teacherHome1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teacherHome1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new teacherHome1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}