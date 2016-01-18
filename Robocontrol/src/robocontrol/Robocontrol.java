
package robocontrol;


import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.UIManager;

public class Robocontrol  extends javax.swing.JFrame implements ActionListener {
    Timer timerSpeed = new Timer(100,this);
     ImageIcon stop3 = new ImageIcon("./cs 70.jpg");
        Image stopimg3 = stop3.getImage();
        Image newStopImg3 = stopimg3.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon newStopIcon3 = new ImageIcon(newStopImg3);
    public Robocontrol() {
     
        initComponents();
       clawstatus.setText("Arm at: 0 ");     //default 
       temp.setIcon(newStopIcon3); // temparature is set
           tempnew.setText("       Partly cloudy 70F");
        }
    double rad=1;                                                                                 //initializing
    double rad1=1;
    int k=0;                                                                                     // all the variables
    int clo=1;
    int clc=0;   
    boolean down,up,left,right,turnrobo,turnroboanti,armuprobo,armdownrobo,leftmotion,rightmotion;
    protected ImageIcon poleImage = new ImageIcon("./robonew.png");
 protected Image img = Toolkit.getDefaultToolkit().getImage("./robonew.png");
  protected ImageIcon poleImage1 = new ImageIcon("./clawopentr.png");
 protected Image img1 = Toolkit.getDefaultToolkit().getImage("./clawopentr.png");
  protected ImageIcon poleImage2 = new ImageIcon("./clawcltr.png");
 protected Image img2 = Toolkit.getDefaultToolkit().getImage("./clawcltr.png");
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        robo = new javax.swing.JPanel();
        robot = new javax.swing.JLabel();
        ImageIcon stop1 = new ImageIcon("./robonew.png");
        Image stopimg = stop1.getImage();
        Image newStopImg = stopimg.getScaledInstance(86, 86,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon newStopIcon = new ImageIcon(newStopImg);
        robot.setIcon(newStopIcon);
        controlspanel = new javax.swing.JPanel();
        stop = new javax.swing.JButton();
        armup = new javax.swing.JButton();
        armdown = new javax.swing.JButton();
        cameraon = new javax.swing.JButton();
        cameraon1 = new javax.swing.JButton();
        robocontrol = new javax.swing.JLabel();
        forward = new javax.swing.JButton();
        backward = new javax.swing.JButton();
        r = new javax.swing.JButton();
        l = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        clawopen = new javax.swing.JRadioButton();
        clawclose = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        camtemp = new javax.swing.JLabel();
        claw = new javax.swing.JLabel();
        ImageIcon stop2 = new ImageIcon("./clawopentr.png");
        Image stopimg2 = stop2.getImage();
        Image newStopImg2 = stopimg2.getScaledInstance(86, 86,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon newStopIcon2 = new ImageIcon(newStopImg2);
        claw.setIcon(newStopIcon2);
        temp = new javax.swing.JLabel();
        tempnew = new javax.swing.JLabel();
        clawstatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        robo.setBackground(new java.awt.Color(255, 255, 255));
        robo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        robo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                roboKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout roboLayout = new javax.swing.GroupLayout(robo);
        robo.setLayout(roboLayout);
        roboLayout.setHorizontalGroup(
            roboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roboLayout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(robot)
                .addContainerGap(294, Short.MAX_VALUE))
        );
        roboLayout.setVerticalGroup(
            roboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roboLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(robot)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        controlspanel.setBackground(new java.awt.Color(255, 255, 255));
        controlspanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        stop.setText("Stop");
        stop.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        armup.setText("Arm Up");
        armup.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        armup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                armupActionPerformed(evt);
            }
        });

        armdown.setText("Arm Down");
        armdown.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        armdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                armdownActionPerformed(evt);
            }
        });

        cameraon.setText("Camera On");
        cameraon.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        cameraon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cameraonActionPerformed(evt);
            }
        });

        cameraon1.setText("temparature");
        cameraon1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        cameraon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cameraon1ActionPerformed(evt);
            }
        });

        robocontrol.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        robocontrol.setText("ROBO CONTROLS");

        forward.setText("Forward");
        forward.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        forward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardActionPerformed(evt);
            }
        });
        forward.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                forwardKeyPressed(evt);
            }
        });

        backward.setText("Backward");
        backward.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        backward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backwardActionPerformed(evt);
            }
        });

        r.setText("Rotate Right");
        r.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rActionPerformed(evt);
            }
        });

        l.setText("Rotate Left");
        l.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lActionPerformed(evt);
            }
        });

        jSlider1.setMaximum(20);
        jSlider1.setValue(10);

        jLabel1.setText("Slow");

        jLabel2.setText("Medium");

        jLabel3.setText("Fast");

        buttonGroup1.add(clawopen);
        clawopen.setSelected(true);
        clawopen.setText("Claw open");
        clawopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clawopenActionPerformed(evt);
            }
        });

        buttonGroup1.add(clawclose);
        clawclose.setText("Claw close");
        clawclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clawcloseActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Use Arrow Keys/Buttons For Motion");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("& Rotation");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("For Arm movement use this buttons");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Robo Features");

        javax.swing.GroupLayout controlspanelLayout = new javax.swing.GroupLayout(controlspanel);
        controlspanel.setLayout(controlspanelLayout);
        controlspanelLayout.setHorizontalGroup(
            controlspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlspanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(controlspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(robocontrol, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(controlspanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(controlspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(controlspanelLayout.createSequentialGroup()
                                .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(controlspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(forward, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(backward, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addGroup(controlspanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(controlspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(controlspanelLayout.createSequentialGroup()
                                        .addComponent(clawopen)
                                        .addGap(61, 61, 61)
                                        .addComponent(clawclose))
                                    .addComponent(jLabel6)
                                    .addGroup(controlspanelLayout.createSequentialGroup()
                                        .addGroup(controlspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(armdown, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cameraon, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(57, 57, 57)
                                        .addGroup(controlspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(armup, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cameraon1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(controlspanelLayout.createSequentialGroup()
                .addGroup(controlspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlspanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(controlspanelLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel2)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlspanelLayout.setVerticalGroup(
            controlspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(robocontrol, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(forward, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backward, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(controlspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(controlspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clawclose)
                    .addComponent(clawopen))
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(controlspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(armup, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(armdown, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(controlspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cameraon1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cameraon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        camtemp.setPreferredSize(new java.awt.Dimension(25, 10));

        tempnew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        clawstatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tempnew, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(temp, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(clawstatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(claw, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(camtemp, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(camtemp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(claw, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tempnew)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(temp, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(clawstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(robo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(controlspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(controlspanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(robo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 public void rotate(double radian, JLabel lb,Image imgnew,ImageIcon iconnew)// rotate function is used to turn the robo
  {
                                                               // this function is called when rotate button or left/right arrow key is pressed
      int height = imgnew.getHeight(lb);
      int width = imgnew.getWidth(lb);
      double cos = Math.abs(Math.cos(radian));
      double sin = Math.abs(Math.sin(radian));
      int w = (int)(width * cos + height * sin);
      int h = (int)(width * sin + height * cos);
      BufferedImage bim = new BufferedImage(h, w, BufferedImage.TYPE_INT_RGB);
      Graphics2D g2 = bim.createGraphics();
     // g2.setTransform(g2.getTransform()); 
        g2.setPaint(UIManager.getColor("white"));
        g2.fillRect(0,0,w,h);
        double x = w/2;
        double y = h/2;
       AffineTransform at = AffineTransform.getRotateInstance(radian, x, y);
        x = (w - width)/2;
        y = (h - height)/2;
        at.translate(x, y);
       g2.drawImage(imgnew, at, robo);
        iconnew = new ImageIcon(bim);
       // lb.setBounds(robot.getX(), robot.getY(), width, height);
        lb.setIcon(iconnew);
        rad++; 
        forward.requestFocus();
     
  }
  
  
  
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed


    }//GEN-LAST:event_formKeyPressed

    private void armupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_armupActionPerformed
        // This function is calle dhwen arm up button is clicked to rotae the arm according to degrees
       down=false;
        up=false;
        left=false;
        right=false;
        turnrobo=false;
        turnroboanti=false;
        armuprobo=true;
        armdownrobo=false;
        
        timerSpeed.start();
        
    }//GEN-LAST:event_armupActionPerformed

    private void armdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_armdownActionPerformed
       // This function is calle dhwen arm down button is clicked to rotae the arm according to degrees
      down=false;
        up=false;
        left=false;
        right=false;
        turnrobo=false;
        turnroboanti=false;
        armuprobo=false;
        armdownrobo=true;
        
        timerSpeed.start();
    }//GEN-LAST:event_armdownActionPerformed

    private void roboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_roboKeyPressed
        
    }//GEN-LAST:event_roboKeyPressed

    private void cameraonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cameraonActionPerformed
     //This function is called when camera button is pressed and displays the camera of the robo
        ImageIcon imagecam=new ImageIcon("./160130.jpg");
        camtemp.setIcon(imagecam);
        forward.requestFocus();
    }//GEN-LAST:event_cameraonActionPerformed
int t=1;
    private void cameraon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cameraon1ActionPerformed
//      This function is used to display the temparature
        ImageIcon stop = new ImageIcon("./cs75.jpg");
        Image stopimg = stop.getImage();
        Image newStopImg = stopimg.getScaledInstance(40, 40,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon newStopIcon = new ImageIcon(newStopImg);
        if(t==1)
        {
           temp.setIcon(newStopIcon); 
           tempnew.setText("        Clear Sky 75F");
           t--;
        }
        else
        {
            temp.setIcon(newStopIcon3); 
           tempnew.setText("       Partly cloudy 70F");
           t++;
        }
     
    }//GEN-LAST:event_cameraon1ActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        //this function is used to stop the moving robot
        timerSpeed.stop();
        forward.requestFocus();
       
    }//GEN-LAST:event_stopActionPerformed
 double inc=0;
    private void forwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardActionPerformed
          
       // this function is used to perform the moving operation of the robot in forward direction
         down=false;
        up=true;
        left=false;
        right=false;
        turnrobo=false;
        armuprobo=false;
        armdownrobo=false;
       
        timerSpeed.start();
        
    }//GEN-LAST:event_forwardActionPerformed

    private void backwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backwardActionPerformed
          // this function is used to perform the moving operation of the robot in backward direction
         down=true;
        up=false;
        left=false;
        right=false;
        turnrobo=false;
        armuprobo=false;
        armdownrobo=false;
        
        timerSpeed.start();
        forward.requestFocus();
    }//GEN-LAST:event_backwardActionPerformed

    private void rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rActionPerformed
         // this function is used to perform the roatae operation of the robot in clockwise direction
        down=false;
        up=false;
        left=false;
        right=true;
        turnrobo=false;
        armuprobo=false;
        armdownrobo=false;
        
        timerSpeed.start();
        forward.requestFocus();
    }//GEN-LAST:event_rActionPerformed

    private void lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lActionPerformed
       // this function is used to perform the roatae operation of the robot in anti clockwise direction
         down=false;
        up=false;
        left=true;
        right=false;
        turnrobo=false;
        armuprobo=false;
        armdownrobo=false;
        
        timerSpeed.start();
        forward.requestFocus();
    }//GEN-LAST:event_lActionPerformed


    private void clawopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clawopenActionPerformed
        // Opens the claw
        claw.setIcon(poleImage1);
        clo=1;
        clc=0;
        forward.requestFocus();
    }//GEN-LAST:event_clawopenActionPerformed

    private void clawcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clawcloseActionPerformed
// Closes the claw
        claw.setIcon(poleImage2);
        clc=1;
        clo=0;
        forward.requestFocus();
    }//GEN-LAST:event_clawcloseActionPerformed

    private void forwardKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_forwardKeyPressed
        // To perform key operations simaltaneasouly when the focus is on the forward button
        // we perform key pressed operations
          int code = evt.getKeyCode();
       // System.out.println(code);
	if (code == KeyEvent.VK_DOWN){
            backward.doClick();
           }
	if (code == KeyEvent.VK_UP){
	forward.doClick();
        }
	if (code == KeyEvent.VK_LEFT){
	l.doClick();
        }
	if (code == KeyEvent.VK_RIGHT){
	r.doClick();
    }//GEN-LAST:event_forwardKeyPressed
     
                
    }
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
            java.util.logging.Logger.getLogger(Robocontrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Robocontrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Robocontrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Robocontrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Robocontrol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton armdown;
    private javax.swing.JButton armup;
    private javax.swing.JButton backward;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cameraon;
    private javax.swing.JButton cameraon1;
    private javax.swing.JLabel camtemp;
    private javax.swing.JLabel claw;
    private javax.swing.JRadioButton clawclose;
    private javax.swing.JRadioButton clawopen;
    private javax.swing.JLabel clawstatus;
    private javax.swing.JPanel controlspanel;
    private javax.swing.JButton forward;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JButton l;
    private javax.swing.JButton r;
    private javax.swing.JPanel robo;
    private javax.swing.JLabel robocontrol;
    private javax.swing.JLabel robot;
    private javax.swing.JButton stop;
    private javax.swing.JLabel temp;
    private javax.swing.JLabel tempnew;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        // All the operations are performed here 
        int x=robot.getX();
    int y=robot.getY();
   
    int s=jSlider1.getValue();
 
    
    
    
    if (left && x > -12  ){//This is to rotate the robot in anti clockwise direction
    
    rad=rad-2;
    double theta= Math.toRadians(rad);
           rotate(theta,robot,img,poleImage);
            forward.requestFocus();
    }
    else if (right  && x< 600  ){//This is to rotate the robot in clockwise direction
       
           double theta= Math.toRadians(rad);
           rotate(theta,robot,img,poleImage);
            forward.requestFocus();
    }
    else if (up  && y> 0 ){// This is to move the robot in forward direction
    robot.setBounds(x, y-s, robot.getWidth(), robot.getHeight());
    }
    else if (down  && y < 391 ){
        robot.setBounds(x, y+s, robot.getWidth(), robot.getHeight()); 
    }
  
    else if(armuprobo && rad1 !=90){// perform robo arm rotation
        double theta= Math.toRadians(rad1);
      if(clo==1)
      {
      rotate(theta,claw,img1,poleImage1); 
      
      rad1++;
      clawstatus.setText("Arm at: "+rad1);
      } 
      else if(clc==1)
      {
        rotate(theta,claw,img2,poleImage1); 
       
        rad1++;
         clawstatus.setText("Arm at: "+rad1);
      }
         
        forward.requestFocus();  
    }
    else if(armdownrobo && rad1 !=0){// perform robo arm rotation
          rad1=rad1-2;
         double theta= Math.toRadians(rad1);
      if(clo==1)
      {
      rotate(theta,claw,img1,poleImage1);
      
      rad1++;
      clawstatus.setText("Claw at: "+ rad1);
      } 
      else if(clc==1)
      {
        rotate(theta,claw,img2,poleImage1); 
        
        rad1++;
        clawstatus.setText("Claw at: "+ rad1);
      }
     forward.requestFocus();
    }
    
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
