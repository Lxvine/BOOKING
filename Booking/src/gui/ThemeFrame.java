package gui;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.UIManager;

/**
 * @author mlosa
 */

public class ThemeFrame extends javax.swing.JFrame {

    // Creates new form Main:

    public ThemeFrame() {
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
        jLabelTitle = new javax.swing.JLabel();
        jLabelImage = new javax.swing.JLabel();
        jPanelThemeChooser = new javax.swing.JPanel();
        jComboBoxLookAndFeel = new javax.swing.JComboBox<>();
        jButtonChange = new javax.swing.JButton();
        jMenuBarHotel = new javax.swing.JMenuBar();
        jMenuPlanner = new javax.swing.JMenu();
        jMenuItemLogin = new javax.swing.JMenuItem();
        jMenuAccessibility = new javax.swing.JMenu();
        jMenuItemChangeTheme = new javax.swing.JMenuItem();
        jMenuItemChangeLabelTextSize = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jPanelMain.setBackground(new java.awt.Color(102, 102, 102));

        jLabelTitle.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 3, 24));
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("CHOOSE THEME:");

        jLabelImage.setIcon(new javax.swing.ImageIcon(
                route));

        jPanelThemeChooser.setBorder(javax.swing.BorderFactory.createTitledBorder("THEME CHOOSER"));

        jComboBoxLookAndFeel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WindowsLookAndFeel",
                "MetalLookAndFeel", "MotifLookAndFeel", "NimbusLookAndFeel", "SynthLookAndFeel" }));

        jButtonChange.setText("CHANGE");
        jButtonChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelThemeChooserLayout = new javax.swing.GroupLayout(jPanelThemeChooser);
        jPanelThemeChooser.setLayout(jPanelThemeChooserLayout);
        jPanelThemeChooserLayout.setHorizontalGroup(
                jPanelThemeChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelThemeChooserLayout.createSequentialGroup()
                                .addContainerGap(42, Short.MAX_VALUE)
                                .addComponent(jComboBoxLookAndFeel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                        .addGroup(jPanelThemeChooserLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jButtonChange)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanelThemeChooserLayout.setVerticalGroup(
                jPanelThemeChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelThemeChooserLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxLookAndFeel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonChange)
                                .addContainerGap(30, Short.MAX_VALUE)));

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
                jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelMainLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanelThemeChooser, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanelMainLayout.createSequentialGroup()
                                                .addComponent(jLabelImage)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelTitle)
                                                .addGap(12, 12, 12)))
                                .addContainerGap(41, Short.MAX_VALUE)));
        jPanelMainLayout.setVerticalGroup(
                jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(
                                        jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabelImage)
                                                .addComponent(jLabelTitle))
                                .addGap(18, 18, 18)
                                .addComponent(jPanelThemeChooser, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(30, Short.MAX_VALUE)));

        jMenuPlanner.setText("Planner");
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

        jMenuAccessibility.setText("Accessibility");

        jMenuItemChangeTheme.setText("Change Theme");
        jMenuItemChangeTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemChangeThemeActionPerformed(evt);
            }
        });
        jMenuAccessibility.add(jMenuItemChangeTheme);

        jMenuItemChangeLabelTextSize.setText("Change Label TextSize");
        jMenuItemChangeLabelTextSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemChangeLabelTextSizeActionPerformed(evt);
            }
        });
        jMenuAccessibility.add(jMenuItemChangeLabelTextSize);

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

    private void jMenuItemChangeLabelTextSizeActionPerformed(java.awt.event.ActionEvent evt) {
        close();
        LabelTextSizeFrame ltsf = new LabelTextSizeFrame();
        ltsf.setVisible(true);
    }

    // Confirm change theme button action:

    private void jButtonChangeActionPerformed(java.awt.event.ActionEvent evt) {
        int sel = jComboBoxLookAndFeel.getSelectedIndex();

        if (sel == 0) {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                close();
                Main li = new Main();
                li.setVisible(true);
            } catch (Exception ex) {

            }

        } else if (sel == 1) {

            try {
                UIManager.setLookAndFeel(new javax.swing.plaf.metal.MetalLookAndFeel());
                close();
                Main li = new Main();
                li.setVisible(true);
            } catch (Exception ex) {

            }

        } else if (sel == 2) {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                close();
                Main li = new Main();
                li.setVisible(true);
            } catch (Exception ex) {

            }
        } else if (sel == 3) {
            try {
                UIManager.setLookAndFeel(new javax.swing.plaf.nimbus.NimbusLookAndFeel());
                close();
                Main li = new Main();
                li.setVisible(true);
            } catch (Exception ex) {

            }
        } else {
            try {
                UIManager.setLookAndFeel(new javax.swing.plaf.synth.SynthLookAndFeel());
                close();
                Main li = new Main();
                li.setVisible(true);
            } catch (Exception ex) {

            }
        }
    }

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThemeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        // Create and display the form:

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration:

    private javax.swing.JButton jButtonChange;
    private javax.swing.JComboBox<String> jComboBoxLookAndFeel;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JMenu jMenuAccessibility;
    private javax.swing.JMenuBar jMenuBarHotel;
    private javax.swing.JMenuItem jMenuItemChangeLabelTextSize;
    private javax.swing.JMenuItem jMenuItemChangeTheme;
    private javax.swing.JMenuItem jMenuItemLogin;
    private javax.swing.JMenu jMenuPlanner;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelThemeChooser;

}
