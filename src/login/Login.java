package login;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        UES_FMO = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        INICIAR_SESION = new javax.swing.JLabel();
        USUARIO = new javax.swing.JLabel();
        CONTRASEÑA = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        passTxt = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JPanel();
        loginTxt = new javax.swing.JLabel();
        HEADER = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UES_FMO.setBackground(new java.awt.Color(255, 255, 255));
        UES_FMO.setForeground(new java.awt.Color(255, 255, 255));
        UES_FMO.setText("UES FMO");
        jPanel2.add(UES_FMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 70, 40));

        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/favicon.png"))); // NOI18N
        jPanel2.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 60, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tienda.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 730, 570));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("FMOcc");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        INICIAR_SESION.setFont(new java.awt.Font("Arial Black", 0, 21)); // NOI18N
        INICIAR_SESION.setText("INICIAR SESIÓN");
        jPanel2.add(INICIAR_SESION, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        USUARIO.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        USUARIO.setText("CONTRASEÑA");
        jPanel2.add(USUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        CONTRASEÑA.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        CONTRASEÑA.setText("USUARIO");
        jPanel2.add(CONTRASEÑA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        userTxt.setForeground(new java.awt.Color(204, 204, 204));
        userTxt.setText("Ingrese su nombre de usuario:");
        userTxt.setBorder(null);
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        jPanel2.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 260, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 300, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 300, 30));

        passTxt.setForeground(new java.awt.Color(204, 204, 204));
        passTxt.setText("*******");
        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        jPanel2.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 300, -1));

        loginBtn.setBackground(new java.awt.Color(0, 139, 207));

        loginTxt.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        loginTxt.setForeground(new java.awt.Color(255, 255, 255));
        loginTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTxt.setText("ENTRAR");
        loginTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 120, 40));

        HEADER.setBackground(new java.awt.Color(255, 255, 255));
        HEADER.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HEADERMouseDragged(evt);
            }
        });
        HEADER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HEADERMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HEADERLayout = new javax.swing.GroupLayout(HEADER);
        HEADER.setLayout(HEADERLayout);
        HEADERLayout.setHorizontalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HEADERLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1012, Short.MAX_VALUE))
        );
        HEADERLayout.setVerticalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(HEADER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HEADERMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HEADERMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HEADERMousePressed

    private void HEADERMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HEADERMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_HEADERMouseDragged

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void loginTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTxtMouseEntered
        loginBtn.setBackground(new Color(136, 212, 234));
        loginTxt.setForeground(Color.black);
    }//GEN-LAST:event_loginTxtMouseEntered

    private void loginTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTxtMouseExited
        loginBtn.setBackground(new Color(0, 139, 207));
        loginTxt.setForeground(Color.white);
    }//GEN-LAST:event_loginTxtMouseExited

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        if (userTxt.getText().equals("Ingrese su nombre de usuario:")) {
            userTxt.setText("");
            userTxt.setForeground(Color.black);
        }

        if (String.valueOf(passTxt.getPassword()).isEmpty()) {
            passTxt.setText("*******");
            passTxt.setForeground(Color.gray);
        }

    }//GEN-LAST:event_userTxtMousePressed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if (String.valueOf(passTxt.getPassword()).equals("*******")) {
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }

        if (userTxt.getText().isEmpty()) {
            userTxt.setText("Ingrese su nombre de usuario:");
            userTxt.setForeground(Color.gray);
        }


    }//GEN-LAST:event_passTxtMousePressed

    private void loginTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTxtMouseClicked
        if (userTxt.getText().equals("Ingrese su nombre de usuario:") || String.valueOf(passTxt.getPassword()).equals("*******")) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos.", "", JOptionPane.ERROR_MESSAGE);
        } else if (userTxt.getText().isEmpty() || String.valueOf(passTxt.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos solicitados", "", JOptionPane.ERROR_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Se guardaron los datos: \nUsuario: " + userTxt.getText() + "\nContrasela: " + String.valueOf(passTxt.getPassword()), "", JOptionPane.INFORMATION_MESSAGE);

        }

    }//GEN-LAST:event_loginTxtMouseClicked

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CONTRASEÑA;
    private javax.swing.JPanel HEADER;
    private javax.swing.JLabel INICIAR_SESION;
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel UES_FMO;
    private javax.swing.JLabel USUARIO;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginTxt;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
