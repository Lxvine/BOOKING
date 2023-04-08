package gui;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.sound.sampled.SourceDataLine;

/**
 * @author mlosa
 */

public class Main extends javax.swing.JFrame {

        // Creates new form Main:

        public Main() {
                initComponents();
        }

        // Create a file to get the absolute path, to pass it as route to the image:

        File f = new File("Booking\\src\\images\\butterfly.png");

        String route = f.getAbsolutePath();

        @SuppressWarnings("unchecked")

        // Below method configure the frame:

        private void initComponents() {

                // Initiate variables:

                jPanelMain = new javax.swing.JPanel();
                jLabelBackground = new javax.swing.JLabel();
                jLabelImage = new javax.swing.JLabel();
                jLabelTitle = new javax.swing.JLabel();
                jButtonExit = new javax.swing.JButton();
                jButtonLogin = new javax.swing.JButton();
                jPanelLogin = new javax.swing.JPanel();
                jLabelPassword = new javax.swing.JLabel();
                jLabelUser = new javax.swing.JLabel();
                jTextFieldUser = new javax.swing.JTextField();
                jPasswordField = new javax.swing.JPasswordField();
                jMenuBarHotel = new javax.swing.JMenuBar();
                jMenuPlanner = new javax.swing.JMenu();
                jMenuItemLogin = new javax.swing.JMenuItem();
                jMenuAccessibility = new javax.swing.JMenu();
                jMenuItemChangeTheme = new javax.swing.JMenuItem();
                jMenuItemChangeLabelTextSizeSize = new javax.swing.JMenuItem();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                jPanelMain.setBackground(new java.awt.Color(102, 102, 102));

                jLabelImage.setIcon(new javax.swing.ImageIcon(
                                route));
                jLabelImage.setToolTipText("Butterfree Image");

                jLabelTitle.setBackground(new java.awt.Color(255, 153, 153));
                jLabelTitle.setFont(new java.awt.Font("Carlito", 3, 32));
                jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
                jLabelTitle.setText("BOLBORETA HOTEL");
                jLabelTitle.setToolTipText("Title");

                jButtonExit.setText("EXIT");
                jButtonExit.setToolTipText("Exit Button");
                jButtonExit.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonExitActionPerformed(evt);
                        }
                });

                jButtonLogin.setText("LOGIN");
                jButtonLogin.setToolTipText("Login Button");
                jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonLoginActionPerformed(evt);
                        }
                });

                jPanelLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOGIN",
                                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                                new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

                jLabelPassword.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
                jLabelPassword.setForeground(new java.awt.Color(0, 0, 0));
                jLabelPassword.setText("Password:");
                jLabelPassword.setToolTipText("Password Label");

                jLabelUser.setBackground(new java.awt.Color(0, 0, 0));
                jLabelUser.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
                jLabelUser.setForeground(new java.awt.Color(0, 0, 0));
                jLabelUser.setText("User:");
                jLabelUser.setToolTipText("User Label");

                jTextFieldUser.setToolTipText("User TextField");
                jTextFieldUser.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {

                        }
                });

                jPasswordField.setToolTipText("Password TextField");

                javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
                jPanelLogin.setLayout(jPanelLoginLayout);
                jPanelLoginLayout.setHorizontalGroup(
                                jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelLoginLayout.createSequentialGroup()
                                                                .addGap(39, 39, 39)
                                                                .addGroup(jPanelLoginLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanelLoginLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabelPassword,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                90,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                72,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jPasswordField,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                192,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanelLoginLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabelUser)
                                                                                                .addGap(128, 128, 128)
                                                                                                .addComponent(jTextFieldUser)))
                                                                .addGap(33, 33, 33)));
                jPanelLoginLayout.setVerticalGroup(
                                jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelLoginLayout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addGroup(jPanelLoginLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabelUser)
                                                                                .addComponent(jTextFieldUser,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanelLoginLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabelPassword)
                                                                                .addComponent(jPasswordField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(20, Short.MAX_VALUE)));

                javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
                jPanelMain.setLayout(jPanelMainLayout);
                jPanelMainLayout.setHorizontalGroup(
                                jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelMainLayout.createSequentialGroup()
                                                                .addContainerGap(99, Short.MAX_VALUE)
                                                                .addGroup(jPanelMainLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanelMainLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabelImage)
                                                                                                                .addGroup(jPanelMainLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addGroup(jPanelMainLayout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addGap(328, 328,
                                                                                                                                                                328)
                                                                                                                                                .addComponent(jLabelBackground))
                                                                                                                                .addGroup(jPanelMainLayout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                .addComponent(jLabelTitle)))
                                                                                                                .addGap(152, 152,
                                                                                                                                152))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanelMainLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGroup(jPanelMainLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                false)
                                                                                                                                .addComponent(jPanelLogin,
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                jPanelMainLayout.createSequentialGroup()
                                                                                                                                                                .addComponent(jButtonExit)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addComponent(jButtonLogin)))
                                                                                                                .addGap(126, 126,
                                                                                                                                126)))));
                jPanelMainLayout.setVerticalGroup(
                                jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelMainLayout.createSequentialGroup()
                                                                .addGroup(jPanelMainLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addGroup(jPanelMainLayout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(jLabelImage)
                                                                                                .addGap(30, 30, 30))
                                                                                .addGroup(jPanelMainLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(65, 65, 65)
                                                                                                .addComponent(jLabelBackground)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabelTitle)
                                                                                                .addGap(18, 18, 18)))
                                                                .addComponent(jPanelLogin,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(
                                                                                jPanelMainLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jButtonExit)
                                                                                                .addComponent(jButtonLogin))
                                                                .addContainerGap(40, Short.MAX_VALUE)));

                jMenuPlanner.setText("Planner");
                jMenuPlanner.setToolTipText("Planner JMenuOption");
                jMenuPlanner.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {

                        }
                });

                jMenuItemLogin.setText("Login");
                jMenuItemLogin.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jMenuItemLoginActionPerformed(evt);
                        }
                });
                jMenuPlanner.add(jMenuItemLogin);

                jMenuBarHotel.add(jMenuPlanner);

                jMenuAccessibility.setText(" Accessibility");
                jMenuAccessibility.setToolTipText("Accessibility  JMenuOption");

                jMenuItemChangeTheme.setText("Change Theme");
                jMenuItemChangeTheme.setToolTipText("Change Theme JMenuItem");
                jMenuItemChangeTheme.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jMenuItemChangeThemeActionPerformed(evt);
                        }
                });
                jMenuAccessibility.add(jMenuItemChangeTheme);

                jMenuItemChangeLabelTextSizeSize.setText("Change Label TextSize");
                jMenuItemChangeLabelTextSizeSize.setToolTipText("Change Size JMenuItem");
                jMenuItemChangeLabelTextSizeSize.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jMenuItemChangeLabelTextSizeSizeActionPerformed(evt);
                        }
                });
                jMenuAccessibility.add(jMenuItemChangeLabelTextSizeSize);

                jMenuBarHotel.add(jMenuAccessibility);

                setJMenuBar(jMenuBarHotel);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
                setLocationRelativeTo(null);
        }

        // Planner MenuItem action:

        private void jMenuItemLoginActionPerformed(java.awt.event.ActionEvent evt) {
                close();
                Main li = new Main();
                li.setVisible(true);
        }

        // ThemeFrame MenuItem action:

        private void jMenuItemChangeThemeActionPerformed(java.awt.event.ActionEvent evt) {
                close();
                ThemeFrame tf = new ThemeFrame();
                tf.setVisible(true);
        }

        // TextSize Frame MenuItem action:

        private void jMenuItemChangeLabelTextSizeSizeActionPerformed(java.awt.event.ActionEvent evt) {
                close();
                LabelTextSizeFrame ltsf = new LabelTextSizeFrame();
                ltsf.setVisible(true);
        }

        // Exit button action:

        private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {
                close();
        }

        // Login button action:

        private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {
                close();
                MainInterface mi = new MainInterface();
                mi.setVisible(true);
        }

        // Close method:

        public void close() {
                WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
                Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
        }

        // psvm method:
        public static void main(String args[]) {

                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }

                // Create and display the form:

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Main().setVisible(true);
                        }
                });
        }

        // Variables declaration:

        private javax.swing.JButton jButtonExit;
        private javax.swing.JButton jButtonLogin;
        private javax.swing.JLabel jLabelBackground;
        private javax.swing.JLabel jLabelImage;
        private javax.swing.JLabel jLabelPassword;
        private javax.swing.JLabel jLabelTitle;
        private javax.swing.JLabel jLabelUser;
        private javax.swing.JMenu jMenuAccessibility;
        private javax.swing.JMenuBar jMenuBarHotel;
        private javax.swing.JMenuItem jMenuItemChangeLabelTextSizeSize;
        private javax.swing.JMenuItem jMenuItemChangeTheme;
        private javax.swing.JMenuItem jMenuItemLogin;
        private javax.swing.JMenu jMenuPlanner;
        private javax.swing.JPanel jPanelLogin;
        private javax.swing.JPanel jPanelMain;
        private javax.swing.JPasswordField jPasswordField;
        private javax.swing.JTextField jTextFieldUser;

}
