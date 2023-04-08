package gui;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;

/**
 * @author mlosa
 */

public class LabelTextSizeFrame extends javax.swing.JFrame {

    // Creates new form LabelTextSizeFrame:

    public LabelTextSizeFrame() {
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
        jLabelSizeText = new javax.swing.JLabel();
        jLabelImage = new javax.swing.JLabel();
        jPanelSizeText = new javax.swing.JPanel();
        jComboBoxTextSize = new javax.swing.JComboBox<>();
        jButtonChange = new javax.swing.JButton();
        jMenuBarHotel = new javax.swing.JMenuBar();
        jMenuPlanner = new javax.swing.JMenu();
        jMenuItemLogin = new javax.swing.JMenuItem();
        jMenuAccessibility = new javax.swing.JMenu();
        jMenuItemChangeTheme = new javax.swing.JMenuItem();
        jMenuItemChangeLabelTextSize = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelMain.setBackground(new java.awt.Color(102, 102, 102));

        jLabelSizeText.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabelSizeText.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSizeText.setText("CHOOSE SIZE TEXT LABEL:");

        jLabelImage.setIcon(new javax.swing.ImageIcon(
                route)); // NOI18N

        jPanelSizeText.setBorder(javax.swing.BorderFactory.createTitledBorder("SIZE TEXT"));

        jComboBoxTextSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "16", "18", "20", "22" }));

        jButtonChange.setText("CHANGE");
        jButtonChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSizeTextLayout = new javax.swing.GroupLayout(jPanelSizeText);
        jPanelSizeText.setLayout(jPanelSizeTextLayout);
        jPanelSizeTextLayout.setHorizontalGroup(
                jPanelSizeTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelSizeTextLayout.createSequentialGroup()
                                .addGroup(jPanelSizeTextLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelSizeTextLayout.createSequentialGroup()
                                                .addGap(81, 81, 81)
                                                .addComponent(jComboBoxTextSize, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelSizeTextLayout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addComponent(jButtonChange)))
                                .addContainerGap(69, Short.MAX_VALUE)));
        jPanelSizeTextLayout.setVerticalGroup(
                jPanelSizeTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelSizeTextLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jComboBoxTextSize, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonChange)
                                .addContainerGap(21, Short.MAX_VALUE)));

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
                jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelImage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanelSizeText, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelSizeText))
                                .addGap(27, 27, 27)));
        jPanelMainLayout.setVerticalGroup(
                jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addGroup(jPanelMainLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelMainLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabelImage)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanelMainLayout.createSequentialGroup()
                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)
                                                        .addComponent(jLabelSizeText)
                                                        .addGap(18, 18, 18)))
                                .addComponent(jPanelSizeText, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)));

        jMenuPlanner.setText("Planner");

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

    private void jMenuItemLoginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemLoginActionPerformed
        close();
        Main li = new Main();
        li.setVisible(true);
    }

    // ThemeFrame MenuItem action:

    private void jMenuItemChangeThemeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemChangeThemeActionPerformed
        close();
        ThemeFrame tf = new ThemeFrame();
        tf.setVisible(true);
    }

    // TextSize Frame MenuItem action:

    private void jMenuItemChangeLabelTextSizeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemChangeLabelTextSizeActionPerformed
        close();
        LabelTextSizeFrame ltsf = new LabelTextSizeFrame();
        ltsf.setVisible(true);
    }

    // Confirm change TextSize button action:

    private void jButtonChangeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonChangeActionPerformed
        int sel = jComboBoxTextSize.getSelectedIndex();

        if (sel == 0) {
            close();
            MainInterface mi = new MainInterface();
            mi.setVisible(true);
            mi.setSize(16);

        } else if (sel == 1) {
            close();
            MainInterface mi = new MainInterface();
            mi.setVisible(true);
            mi.setSize(18);

        } else if (sel == 2) {
            close();
            MainInterface mi = new MainInterface();
            mi.setVisible(true);
            mi.setSize(20);

        } else {
            close();
            MainInterface mi = new MainInterface();
            mi.setVisible(true);
            mi.setSize(22);

        }

    }

    // Close method:

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    // psvm method:
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LabelTextSizeFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LabelTextSizeFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LabelTextSizeFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LabelTextSizeFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }

        // Create and display the form:

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LabelTextSizeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration:

    private javax.swing.JButton jButtonChange;
    private javax.swing.JComboBox<String> jComboBoxTextSize;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JLabel jLabelSizeText;
    private javax.swing.JMenu jMenuAccessibility;
    private javax.swing.JMenuBar jMenuBarHotel;
    private javax.swing.JMenuItem jMenuItemChangeLabelTextSize;
    private javax.swing.JMenuItem jMenuItemChangeTheme;
    private javax.swing.JMenuItem jMenuItemLogin;
    private javax.swing.JMenu jMenuPlanner;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelSizeText;

}
