package gui;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;

/**
 * @author mlosa
 */

public class MainInterface extends javax.swing.JFrame {

        // Creates new form MainInterface:

        public MainInterface() {
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
                jLabelImage = new javax.swing.JLabel();
                jLabelTitle = new javax.swing.JLabel();
                jButtonBack = new javax.swing.JButton();
                jButtonSubmit = new javax.swing.JButton();
                jPanelInvisible = new javax.swing.JPanel();
                jSpinnerInvisible = new javax.swing.JSpinner();
                jLabelIInvisible = new javax.swing.JLabel();
                jComboBoxInvisible = new javax.swing.JComboBox<>();
                jLabelInvisible = new javax.swing.JLabel();
                jPanelKeyData = new javax.swing.JPanel();
                jLabelName = new javax.swing.JLabel();
                jLabelPhoneNumber = new javax.swing.JLabel();
                jTextFieldName = new javax.swing.JTextField();
                jTextFieldPhoneNumber = new javax.swing.JTextField();
                jPanelSecondaryData = new javax.swing.JPanel();
                jLabelKitchenType = new javax.swing.JLabel();
                jComboBoxType = new javax.swing.JComboBox<>();
                jLabelBookingDate = new javax.swing.JLabel();
                jSpinnerBookingDate = new javax.swing.JSpinner();
                jLabelType = new javax.swing.JLabel();
                TypeJComboBox = new javax.swing.JComboBox<>();
                jMenuBarHotel = new javax.swing.JMenuBar();
                jMenuPlanner = new javax.swing.JMenu();
                jMenuItemLogin = new javax.swing.JMenuItem();
                jMenuAccessibility = new javax.swing.JMenu();
                jMenuItemChangeTheme = new javax.swing.JMenuItem();
                jMenuItemChangeLabelTextSize = new javax.swing.JMenuItem();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setBackground(new java.awt.Color(102, 102, 102));

                jPanelMain.setBackground(new java.awt.Color(102, 102, 102));
                jPanelMain.setPreferredSize(new java.awt.Dimension(600, 400));

                jLabelImage.setIcon(new javax.swing.ImageIcon(
                                route));
                jLabelImage.setToolTipText("Butterfree Image ");

                jLabelTitle.setFont(new java.awt.Font("Segoe UI", 3, 28));
                jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
                jLabelTitle.setText("BOOKING:");
                jLabelTitle.setToolTipText("Booking Titlte");

                jButtonBack.setText("BACK");
                jButtonBack.setToolTipText("Back Button ");
                jButtonBack.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonBackActionPerformed(evt);
                        }
                });

                jButtonSubmit.setText("SUBMIT");
                jButtonSubmit.setToolTipText("Submit Button ");
                jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonSubmitActionPerformed(evt);
                        }
                });

                jPanelInvisible.setBorder(javax.swing.BorderFactory.createTitledBorder("CONCRETE DATA"));

                jSpinnerInvisible.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
                jSpinnerInvisible.setToolTipText("Dinners number Spinner");

                jLabelIInvisible.setFont(new java.awt.Font("Calibri", 1, 14));
                jLabelIInvisible.setForeground(new java.awt.Color(0, 0, 0));
                jLabelIInvisible.setText("Nº diners:");
                jLabelIInvisible.setToolTipText("Dinners number  Label");

                jComboBoxInvisible.setModel(
                                new javax.swing.DefaultComboBoxModel<>(new String[] { "Rectangular", "Redonda" }));
                jComboBoxInvisible.setToolTipText("Table type Box");
                jComboBoxInvisible.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {

                        }
                });

                jLabelInvisible.setFont(new java.awt.Font("Calibri", 1, 14));
                jLabelInvisible.setForeground(new java.awt.Color(0, 0, 0));
                jLabelInvisible.setText("Table type:");
                jLabelInvisible.setToolTipText("Table type  Label");

                javax.swing.GroupLayout jPanelInvisibleLayout = new javax.swing.GroupLayout(jPanelInvisible);
                jPanelInvisible.setLayout(jPanelInvisibleLayout);
                jPanelInvisibleLayout.setHorizontalGroup(
                                jPanelInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelInvisibleLayout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addGroup(jPanelInvisibleLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabelIInvisible)
                                                                                .addComponent(jLabelInvisible))
                                                                .addGap(58, 58, 58)
                                                                .addGroup(jPanelInvisibleLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jComboBoxInvisible,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                160,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jSpinnerInvisible,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                160,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(21, 21, 21)));
                jPanelInvisibleLayout.setVerticalGroup(
                                jPanelInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelInvisibleLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanelInvisibleLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabelInvisible,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBoxInvisible,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                15,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanelInvisibleLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jSpinnerInvisible,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabelIInvisible,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                18,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(17, 17, 17)));

                jPanelKeyData.setBorder(javax.swing.BorderFactory.createTitledBorder("KEY DATA"));

                jLabelName.setFont(new java.awt.Font("Calibri", 1, 14));
                jLabelName.setForeground(new java.awt.Color(0, 0, 0));
                jLabelName.setText("Name:");
                jLabelName.setToolTipText("Name Label");

                jLabelPhoneNumber.setFont(new java.awt.Font("Calibri", 1, 14));
                jLabelPhoneNumber.setForeground(new java.awt.Color(0, 0, 0));
                jLabelPhoneNumber.setText("Phone number:");
                jLabelPhoneNumber.setToolTipText(" Phone number Label");

                jTextFieldName.setToolTipText("Name TextField ");

                jTextFieldPhoneNumber.setToolTipText("Phone number TextField");
                jTextFieldPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {

                        }
                });

                javax.swing.GroupLayout jPanelKeyDataLayout = new javax.swing.GroupLayout(jPanelKeyData);
                jPanelKeyData.setLayout(jPanelKeyDataLayout);
                jPanelKeyDataLayout.setHorizontalGroup(
                                jPanelKeyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelKeyDataLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanelKeyDataLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabelName)
                                                                                .addComponent(jLabelPhoneNumber))
                                                                .addGap(43, 43, 43)
                                                                .addGroup(jPanelKeyDataLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jTextFieldPhoneNumber,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                161,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTextFieldName,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                161,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanelKeyDataLayout.setVerticalGroup(
                                jPanelKeyDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelKeyDataLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanelKeyDataLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabelName)
                                                                                .addComponent(jTextFieldName,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(20, 20, 20)
                                                                .addGroup(jPanelKeyDataLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabelPhoneNumber)
                                                                                .addComponent(jTextFieldPhoneNumber,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                jPanelSecondaryData.setBorder(javax.swing.BorderFactory.createTitledBorder("SECONDARY DATA"));

                jLabelKitchenType.setFont(new java.awt.Font("Calibri", 1, 14));
                jLabelKitchenType.setForeground(new java.awt.Color(0, 0, 0));
                jLabelKitchenType.setText("Kitchen type:");
                jLabelKitchenType.setToolTipText("Kitchen type  Label");

                jComboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Bufé", "Carta", "Pedir cita con el chef", "No precisa" }));
                jComboBoxType.setToolTipText("Type Box");
                jComboBoxType.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {

                        }
                });

                jLabelBookingDate.setFont(new java.awt.Font("Calibri", 1, 14));
                jLabelBookingDate.setForeground(new java.awt.Color(0, 0, 0));
                jLabelBookingDate.setText("Booking date:");
                jLabelBookingDate.setToolTipText("Booking date  Label");

                jSpinnerBookingDate
                                .setModel(new javax.swing.SpinnerDateModel(new java.util.Date(),
                                                new java.util.Date(1678551866378L),
                                                new java.util.Date(1710174120000L), java.util.Calendar.DAY_OF_MONTH));
                jSpinnerBookingDate.setToolTipText("Booking date Spinner");

                jLabelType.setFont(new java.awt.Font("Calibri", 1, 14));
                jLabelType.setForeground(new java.awt.Color(0, 0, 0));
                jLabelType.setText("Type:");
                jLabelType.setToolTipText("Type  Label");

                TypeJComboBox.setModel(
                                new javax.swing.DefaultComboBoxModel<>(
                                                new String[] { "Banquete", "Congreso", "Jornada", " " }));
                TypeJComboBox.setToolTipText("Kitchen type Box");
                TypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                TypeJComboBoxActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanelSecondaryDataLayout = new javax.swing.GroupLayout(jPanelSecondaryData);
                jPanelSecondaryData.setLayout(jPanelSecondaryDataLayout);
                jPanelSecondaryDataLayout.setHorizontalGroup(
                                jPanelSecondaryDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelSecondaryDataLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanelSecondaryDataLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabelKitchenType)
                                                                                .addComponent(jLabelBookingDate)
                                                                                .addComponent(jLabelType))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanelSecondaryDataLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jComboBoxType,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                161,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jSpinnerBookingDate,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                161,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(TypeJComboBox,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                161,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(20, 20, 20)));
                jPanelSecondaryDataLayout.setVerticalGroup(
                                jPanelSecondaryDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelSecondaryDataLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanelSecondaryDataLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabelKitchenType)
                                                                                .addComponent(jComboBoxType,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(19, 19, 19)
                                                                .addGroup(jPanelSecondaryDataLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabelBookingDate,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                25,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jSpinnerBookingDate,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(19, 19, 19)
                                                                .addGroup(jPanelSecondaryDataLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(TypeJComboBox,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabelType,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                18,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
                jPanelMain.setLayout(jPanelMainLayout);
                jPanelMainLayout.setHorizontalGroup(
                                jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelMainLayout.createSequentialGroup()
                                                                .addGap(58, 58, 58)
                                                                .addComponent(jLabelImage)
                                                                .addGap(18, 18, Short.MAX_VALUE)
                                                                .addGroup(jPanelMainLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jLabelTitle)
                                                                                .addComponent(jPanelSecondaryData,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanelKeyData,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanelInvisible,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap(141, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanelMainLayout.createSequentialGroup()
                                                                                .addContainerGap()
                                                                                .addComponent(jButtonBack)
                                                                                .addGap(44, 44, 44)
                                                                                .addComponent(jButtonSubmit)
                                                                                .addGap(105, 105, 105)));
                jPanelMainLayout.setVerticalGroup(
                                jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelMainLayout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addGroup(
                                                                                jPanelMainLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                .addComponent(jLabelImage)
                                                                                                .addComponent(jLabelTitle))
                                                                .addGap(18, 18, Short.MAX_VALUE)
                                                                .addComponent(jPanelKeyData,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, Short.MAX_VALUE)
                                                                .addComponent(jPanelSecondaryData,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jPanelInvisible,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(
                                                                                jPanelMainLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jButtonBack)
                                                                                                .addComponent(jButtonSubmit))
                                                                .addGap(49, 49, 49)));

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
                jMenuAccessibility.setToolTipText("Accesibility  JMenuOption");

                jMenuItemChangeTheme.setText("Change Theme");
                jMenuItemChangeTheme.setToolTipText("Change Theme JMenuItem");
                jMenuItemChangeTheme.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jMenuItemChangeThemeActionPerformed(evt);
                        }
                });
                jMenuAccessibility.add(jMenuItemChangeTheme);

                jMenuItemChangeLabelTextSize.setText("Change Label TextSize");
                jMenuItemChangeLabelTextSize.setToolTipText("Change Size JMenuItem");
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
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addComponent(jPanelMain,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                659, Short.MAX_VALUE)
                                                                .addGap(0, 0, 0)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 622,
                                                                Short.MAX_VALUE));

                pack();
                setLocationRelativeTo(null);
        }

        // Below method that shows or set invisible each panel:

        private void TypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
                int sel = TypeJComboBox.getSelectedIndex();

                if (sel == 0) {
                        jPanelInvisible.setVisible(true);
                        jLabelInvisible.setText("Nº days:   ");
                        jLabelIInvisible.setText("Guest rooms:");
                        jComboBoxInvisible.setModel(
                                        new javax.swing.DefaultComboBoxModel<>(
                                                        new String[] { "With rooms ", "Without rooms    " }));
                } else if (sel == 1) {
                        jPanelInvisible.setVisible(true);
                        jLabelInvisible.setText("Nº diners: ");
                        jLabelIInvisible.setText("Table type: ");
                        jComboBoxInvisible.setModel(
                                        new javax.swing.DefaultComboBoxModel<>(
                                                        new String[] { "Round table", "Rectangular table" }));
                } else {
                        jPanelInvisible.setVisible(false);
                }
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

        // Back button action:

        private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {
                close();
                Main li = new Main();
                li.setVisible(true);
        }

        // Submit button action:

        private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {
                close();
                Main li = new Main();
                li.setVisible(true);
        }

        // Below method receives an int from the LabelTextSizeFrame.class jComboBox, and
        // that int is the fontSize:

        public void setSize(int i) {
                jLabelBookingDate.setFont(new Font("Calibri", Font.BOLD, i));
                jLabelIInvisible.setFont(new Font("Calibri", Font.BOLD, i));
                jLabelInvisible.setFont(new Font("Calibri", Font.BOLD, i));
                jLabelKitchenType.setFont(new Font("Calibri", Font.BOLD, i));
                jLabelName.setFont(new Font("Calibri", Font.BOLD, i));
                jLabelPhoneNumber.setFont(new Font("Calibri", Font.BOLD, i));
                jLabelType.setFont(new Font("Calibri", Font.BOLD, i));
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
                        java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }

                // Create and display the form:

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new MainInterface().setVisible(true);
                        }
                });
        }

        // Variables declaration:

        private javax.swing.JComboBox<String> TypeJComboBox;
        private javax.swing.JButton jButtonBack;
        private javax.swing.JButton jButtonSubmit;
        private javax.swing.JComboBox<String> jComboBoxInvisible;
        private javax.swing.JComboBox<String> jComboBoxType;
        private javax.swing.JLabel jLabelBookingDate;
        private javax.swing.JLabel jLabelIInvisible;
        private javax.swing.JLabel jLabelImage;
        private javax.swing.JLabel jLabelInvisible;
        private javax.swing.JLabel jLabelKitchenType;
        private javax.swing.JLabel jLabelName;
        private javax.swing.JLabel jLabelPhoneNumber;
        private javax.swing.JLabel jLabelTitle;
        private javax.swing.JLabel jLabelType;
        private javax.swing.JMenu jMenuAccessibility;
        private javax.swing.JMenuBar jMenuBarHotel;
        private javax.swing.JMenuItem jMenuItemChangeLabelTextSize;
        private javax.swing.JMenuItem jMenuItemChangeTheme;
        private javax.swing.JMenuItem jMenuItemLogin;
        private javax.swing.JMenu jMenuPlanner;
        private javax.swing.JPanel jPanelInvisible;
        private javax.swing.JPanel jPanelKeyData;
        private javax.swing.JPanel jPanelMain;
        private javax.swing.JPanel jPanelSecondaryData;
        private javax.swing.JSpinner jSpinnerBookingDate;
        private javax.swing.JSpinner jSpinnerInvisible;
        private javax.swing.JTextField jTextFieldName;
        private javax.swing.JTextField jTextFieldPhoneNumber;

}
