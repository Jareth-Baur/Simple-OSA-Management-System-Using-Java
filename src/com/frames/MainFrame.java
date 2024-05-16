package com.frames;

import com.classes.DatabaseAccess;
import static com.classes.DatabaseAccess.getLatestData;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        DatabaseAccess.viewImportantDetails(viewRecordsTable);
        displayLatestDataInTextArea(latestRecordDetailsTextArea);
        totalStudentCountLabel.setText(DatabaseAccess.getTotalStudentCount() + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        navPanel = new javax.swing.JPanel();
        dashboardButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        manageButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        dashBoardPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        totalStudentCountLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        latestRecordDetailsTextArea = new javax.swing.JTextArea();
        viewMoreTotalCountButton = new javax.swing.JButton();
        viewMoreLatestRecordButton = new javax.swing.JButton();
        addNewRecordPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        addRecordFullNameField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        addRecordYearField = new javax.swing.JTextField();
        addRecordCourseField = new javax.swing.JTextField();
        addRecordPhoneNumberField = new javax.swing.JTextField();
        addRecordOffenseTypeField = new javax.swing.JTextField();
        addRecordOffenseDetailsField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        viewRecordPanel = new javax.swing.JPanel();
        viewRecordsScrollPane = new javax.swing.JScrollPane();
        viewRecordsTable = new javax.swing.JTable();
        viewRecordsButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        allDetailsTextArea = new javax.swing.JTextArea();
        managePanel = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        manageIDField = new javax.swing.JTextField();
        manageFullNameField = new javax.swing.JTextField();
        manageYearField = new javax.swing.JTextField();
        manageCourseField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        managePhoneNumberField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        manageOffenseTypeField = new javax.swing.JTextField();
        manageOffenseDetailsField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        editDetailsButton = new javax.swing.JButton();
        saveDetailsButton = new javax.swing.JButton();
        deleteDetailsButton = new javax.swing.JButton();
        settingsPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("OSA Management System - Main Frame");
        setResizable(false);

        rootPanel.setLayout(new java.awt.BorderLayout());

        navPanel.setBackground(new java.awt.Color(235, 255, 255));
        navPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        navPanel.setPreferredSize(new java.awt.Dimension(130, 488));

        dashboardButton.setText("Dashboard");
        dashboardButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardButtonMouseClicked(evt);
            }
        });

        viewButton.setText("Visualize");
        viewButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewButton.setPreferredSize(new java.awt.Dimension(95, 25));
        viewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewButtonMouseClicked(evt);
            }
        });

        settingsButton.setText("Settings");
        settingsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsButtonMouseClicked(evt);
            }
        });

        logoutButton.setText("Log out");
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        jLabel1.setText("OSMS");

        manageButton.setText("Manage");
        manageButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageButtonMouseClicked(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        addButton.setText("Add Record");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(navPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(settingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(dashboardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboardButton)
                .addGap(51, 51, 51)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageButton)
                .addGap(18, 18, 18)
                .addComponent(settingsButton)
                .addGap(18, 18, 18)
                .addComponent(logoutButton)
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        rootPanel.add(navPanel, java.awt.BorderLayout.WEST);

        contentPanel.setBackground(new java.awt.Color(102, 102, 102));
        contentPanel.setPreferredSize(new java.awt.Dimension(700, 488));
        contentPanel.setLayout(new java.awt.CardLayout());

        dashBoardPanel.setBackground(new java.awt.Color(200, 235, 255));
        dashBoardPanel.setPreferredSize(new java.awt.Dimension(715, 488));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Total Student Count"));

        totalStudentCountLabel.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        totalStudentCountLabel.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(totalStudentCountLabel)
                .addGap(143, 143, 143))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(totalStudentCountLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Latest Record Added"));

        latestRecordDetailsTextArea.setColumns(20);
        latestRecordDetailsTextArea.setFont(new java.awt.Font("Segoe UI", 0, 29)); // NOI18N
        latestRecordDetailsTextArea.setRows(5);
        jScrollPane2.setViewportView(latestRecordDetailsTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );

        viewMoreTotalCountButton.setText("View More");
        viewMoreTotalCountButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewMoreTotalCountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMoreTotalCountButtonMouseClicked(evt);
            }
        });

        viewMoreLatestRecordButton.setText("View More");
        viewMoreLatestRecordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewMoreLatestRecordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMoreLatestRecordButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dashBoardPanelLayout = new javax.swing.GroupLayout(dashBoardPanel);
        dashBoardPanel.setLayout(dashBoardPanelLayout);
        dashBoardPanelLayout.setHorizontalGroup(
            dashBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashBoardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashBoardPanelLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(viewMoreLatestRecordButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addComponent(viewMoreTotalCountButton)
                .addGap(127, 127, 127))
        );
        dashBoardPanelLayout.setVerticalGroup(
            dashBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashBoardPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(dashBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewMoreTotalCountButton)
                    .addComponent(viewMoreLatestRecordButton))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        contentPanel.add(dashBoardPanel, "card2");

        addNewRecordPanel.setBackground(new java.awt.Color(200, 235, 255));

        jLabel9.setText("Full Name");

        addRecordFullNameField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel10.setText("Year");

        jLabel11.setText("Course");

        jLabel12.setText("Phone Number");

        jLabel13.setText("Offense Type");

        jLabel14.setText("Offense Details");

        addRecordYearField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        addRecordCourseField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        addRecordPhoneNumberField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        addRecordOffenseTypeField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        addRecordOffenseDetailsField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        createButton.setText("Create Record");
        createButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addNewRecordPanelLayout = new javax.swing.GroupLayout(addNewRecordPanel);
        addNewRecordPanel.setLayout(addNewRecordPanelLayout);
        addNewRecordPanelLayout.setHorizontalGroup(
            addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewRecordPanelLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createButton)
                    .addComponent(addRecordFullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addRecordYearField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addRecordCourseField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addRecordPhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addRecordOffenseTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addRecordOffenseDetailsField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        addNewRecordPanelLayout.setVerticalGroup(
            addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewRecordPanelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRecordFullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRecordYearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRecordCourseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRecordPhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRecordOffenseTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRecordOffenseDetailsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(createButton)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        contentPanel.add(addNewRecordPanel, "card3");

        viewRecordPanel.setBackground(new java.awt.Color(200, 235, 255));

        viewRecordsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Full Name", "Year", "Course", "Offense Type", "Offense Details"
            }
        ));
        viewRecordsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewRecordsTableMouseClicked(evt);
            }
        });
        viewRecordsScrollPane.setViewportView(viewRecordsTable);

        viewRecordsButton.setText("View Records");
        viewRecordsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewRecordsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewRecordsButtonMouseClicked(evt);
            }
        });

        allDetailsTextArea.setColumns(20);
        allDetailsTextArea.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        allDetailsTextArea.setRows(5);
        jScrollPane1.setViewportView(allDetailsTextArea);

        javax.swing.GroupLayout viewRecordPanelLayout = new javax.swing.GroupLayout(viewRecordPanel);
        viewRecordPanel.setLayout(viewRecordPanelLayout);
        viewRecordPanelLayout.setHorizontalGroup(
            viewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewRecordsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(viewRecordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewRecordsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        viewRecordPanelLayout.setVerticalGroup(
            viewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewRecordPanelLayout.createSequentialGroup()
                .addComponent(viewRecordsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(viewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewRecordPanelLayout.createSequentialGroup()
                        .addComponent(viewRecordsButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(viewRecordPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        contentPanel.add(viewRecordPanel, "card4");

        managePanel.setBackground(new java.awt.Color(200, 235, 255));

        searchButton.setText("Search");
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });

        manageIDField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        manageIDField.setEnabled(false);

        manageFullNameField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        manageFullNameField.setEnabled(false);

        manageYearField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        manageYearField.setEnabled(false);

        manageCourseField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        manageCourseField.setEnabled(false);

        jLabel2.setText("ID");

        jLabel3.setText("Full Name");

        jLabel4.setText("Year");

        jLabel5.setText("Course");

        managePhoneNumberField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        managePhoneNumberField.setEnabled(false);

        jLabel6.setText("Phone Number");

        jLabel7.setText("Offense Type");

        manageOffenseTypeField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        manageOffenseTypeField.setEnabled(false);

        manageOffenseDetailsField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        manageOffenseDetailsField.setEnabled(false);

        jLabel8.setText("Offense Details");

        editDetailsButton.setText("Edit Details");
        editDetailsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editDetailsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editDetailsButtonMouseClicked(evt);
            }
        });

        saveDetailsButton.setText("Save Details");
        saveDetailsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveDetailsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveDetailsButtonMouseClicked(evt);
            }
        });

        deleteDetailsButton.setText("Delete");
        deleteDetailsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteDetailsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteDetailsButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout managePanelLayout = new javax.swing.GroupLayout(managePanel);
        managePanel.setLayout(managePanelLayout);
        managePanelLayout.setHorizontalGroup(
            managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managePanelLayout.createSequentialGroup()
                .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(managePanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(managePanelLayout.createSequentialGroup()
                                .addComponent(searchButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editDetailsButton))
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(managePanelLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manageFullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageYearField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageCourseField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(managePhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageOffenseTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageOffenseDetailsField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(managePanelLayout.createSequentialGroup()
                                .addComponent(saveDetailsButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        managePanelLayout.setVerticalGroup(
            managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managePanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(editDetailsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageFullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageYearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageCourseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(managePhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageOffenseTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageOffenseDetailsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveDetailsButton)
                    .addComponent(deleteDetailsButton))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        contentPanel.add(managePanel, "card6");

        settingsPanel.setBackground(new java.awt.Color(200, 235, 255));

        jButton1.setText("View Terms & Conditions");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton2.setText("Language & Preferences");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton3.setText("Themes");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton4.setText("System Settings");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsPanelLayout.createSequentialGroup()
                .addContainerGap(255, Short.MAX_VALUE)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(278, 278, 278))
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        contentPanel.add(settingsPanel, "card5");

        rootPanel.add(contentPanel, java.awt.BorderLayout.EAST);

        getContentPane().add(rootPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardButtonMouseClicked
        swapPanels(dashBoardPanel);
    }//GEN-LAST:event_dashboardButtonMouseClicked

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        swapPanels(addNewRecordPanel);
    }//GEN-LAST:event_addButtonMouseClicked

    private void viewButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewButtonMouseClicked
        swapPanels(viewRecordPanel);
    }//GEN-LAST:event_viewButtonMouseClicked

    private void settingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseClicked
        swapPanels(settingsPanel);
    }//GEN-LAST:event_settingsButtonMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.out.println("Logging out...");
            new Home().setVisible(true);
            this.dispose();
        } else {
            System.out.println("Logout canceled.");
        }
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to Exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.out.println("Exiting...");
            this.dispose();
        } else {
            System.out.println("Exit canceled.");
        }
    }//GEN-LAST:event_exitButtonMouseClicked

    private void manageButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageButtonMouseClicked
        swapPanels(managePanel);
    }//GEN-LAST:event_manageButtonMouseClicked

    private void viewRecordsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewRecordsButtonMouseClicked
        DatabaseAccess.viewImportantDetails(viewRecordsTable);
    }//GEN-LAST:event_viewRecordsButtonMouseClicked

    private void viewRecordsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewRecordsTableMouseClicked
        DatabaseAccess.displayDetailsOnClick(viewRecordsTable, allDetailsTextArea);
    }//GEN-LAST:event_viewRecordsTableMouseClicked

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        try {
            int id = Integer.parseInt(searchField.getText());
            Map<String, String> studentDetails = DatabaseAccess.getDetailsByID(id);
            if (!studentDetails.isEmpty()) {
                manageIDField.setText(studentDetails.get("ID"));
                manageFullNameField.setText(studentDetails.get("Full Name"));
                manageYearField.setText(studentDetails.get("Year"));
                manageCourseField.setText(studentDetails.get("Course"));
                manageOffenseTypeField.setText(studentDetails.get("Offense Type"));
                managePhoneNumberField.setText(studentDetails.get("Phone Number"));
                manageOffenseDetailsField.setText(studentDetails.get("Offense Details"));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input: Not a valid ID", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Invalid input: Not a valid ID");
        }
        setFieldEnableOrDisable(false);
    }//GEN-LAST:event_searchButtonMouseClicked

    private void editDetailsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editDetailsButtonMouseClicked
        if (!manageIDField.getText().isBlank()) {
            setFieldEnableOrDisable(true);
            System.out.println("Fields set to enabled.");
        } else {
            JOptionPane.showMessageDialog(null, "Cannot edit an empty data. Please select an entry first.", "Empty data", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Cannot edit an empty data. Please select an entry first.");
        }
    }//GEN-LAST:event_editDetailsButtonMouseClicked

    private void saveDetailsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveDetailsButtonMouseClicked
        try {
            if (!manageFullNameField.isEnabled()) {
                return;
            }
            int id = Integer.parseInt(manageIDField.getText());
            String fullName = manageFullNameField.getText();
            String year = manageYearField.getText();
            String course = manageCourseField.getText();
            String phoneNumber = managePhoneNumberField.getText();
            String offenseType = manageOffenseTypeField.getText();
            String offenseDetails = manageOffenseDetailsField.getText();
            boolean isRecordEdited = DatabaseAccess.editStudent(id, fullName, year, course, phoneNumber, offenseType, offenseDetails);
            if (isRecordEdited) {
                clearFields();
                setFieldEnableOrDisable(false);
                searchField.setText("");
                DatabaseAccess.viewImportantDetails(viewRecordsTable);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid: Please select a valid record.");
            JOptionPane.showMessageDialog(null, "Invalid: Please select a valid record.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveDetailsButtonMouseClicked

    private void deleteDetailsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteDetailsButtonMouseClicked
        try {
            int id = Integer.parseInt(manageIDField.getText());
            String fullName = manageFullNameField.getText();
            boolean isDeletionSuccessful = DatabaseAccess.deleteStudent(id, fullName);
            if (isDeletionSuccessful) {
                clearFields();
                setFieldEnableOrDisable(false);
                searchField.setText("");
                DatabaseAccess.viewImportantDetails(viewRecordsTable);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid: Please select a valid record to delete.");
            JOptionPane.showMessageDialog(null, "Invalid: Please select a valid record to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteDetailsButtonMouseClicked

    private void createButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createButtonMouseClicked
        String fullName = addRecordFullNameField.getText();
        String year = addRecordYearField.getText();
        String course = addRecordCourseField.getText();
        String phoneNumber = addRecordPhoneNumberField.getText();
        String offenseType = addRecordOffenseTypeField.getText();
        String offenseDetails = addRecordOffenseDetailsField.getText();
        boolean isRecordAdded = DatabaseAccess.addNewStudent(fullName, year, course, phoneNumber, offenseType, offenseDetails);
        if (isRecordAdded) {
            addRecordFullNameField.setText("");
            addRecordYearField.setText("");
            addRecordCourseField.setText("");
            addRecordPhoneNumberField.setText("");
            addRecordOffenseTypeField.setText("");
            addRecordOffenseDetailsField.setText("");
            DatabaseAccess.viewImportantDetails(viewRecordsTable);
        }
    }//GEN-LAST:event_createButtonMouseClicked

    private void viewMoreTotalCountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMoreTotalCountButtonMouseClicked
        swapPanels(viewRecordPanel);
    }//GEN-LAST:event_viewMoreTotalCountButtonMouseClicked

    private void viewMoreLatestRecordButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMoreLatestRecordButtonMouseClicked
        swapPanels(viewRecordPanel);
    }//GEN-LAST:event_viewMoreLatestRecordButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel addNewRecordPanel;
    private javax.swing.JTextField addRecordCourseField;
    private javax.swing.JTextField addRecordFullNameField;
    private javax.swing.JTextField addRecordOffenseDetailsField;
    private javax.swing.JTextField addRecordOffenseTypeField;
    private javax.swing.JTextField addRecordPhoneNumberField;
    private javax.swing.JTextField addRecordYearField;
    private javax.swing.JTextArea allDetailsTextArea;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton createButton;
    private javax.swing.JPanel dashBoardPanel;
    private javax.swing.JButton dashboardButton;
    private javax.swing.JButton deleteDetailsButton;
    private javax.swing.JButton editDetailsButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea latestRecordDetailsTextArea;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton manageButton;
    private javax.swing.JTextField manageCourseField;
    private javax.swing.JTextField manageFullNameField;
    private javax.swing.JTextField manageIDField;
    private javax.swing.JTextField manageOffenseDetailsField;
    private javax.swing.JTextField manageOffenseTypeField;
    private javax.swing.JPanel managePanel;
    private javax.swing.JTextField managePhoneNumberField;
    private javax.swing.JTextField manageYearField;
    private javax.swing.JPanel navPanel;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JButton saveDetailsButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton settingsButton;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JLabel totalStudentCountLabel;
    private javax.swing.JButton viewButton;
    private javax.swing.JButton viewMoreLatestRecordButton;
    private javax.swing.JButton viewMoreTotalCountButton;
    private javax.swing.JPanel viewRecordPanel;
    private javax.swing.JButton viewRecordsButton;
    private javax.swing.JScrollPane viewRecordsScrollPane;
    private javax.swing.JTable viewRecordsTable;
    // End of variables declaration//GEN-END:variables
    private void swapPanels(JPanel panel) {
        dashBoardPanel.setVisible(false);
        addNewRecordPanel.setVisible(false);
        viewRecordPanel.setVisible(false);
        managePanel.setVisible(false);
        settingsPanel.setVisible(false);
        panel.setVisible(true);
    }

    private void setFieldEnableOrDisable(boolean choice) {
        manageFullNameField.setEnabled(choice);
        manageYearField.setEnabled(choice);
        manageCourseField.setEnabled(choice);
        manageOffenseTypeField.setEnabled(choice);
        managePhoneNumberField.setEnabled(choice);
        manageOffenseDetailsField.setEnabled(choice);
    }

    private void clearFields() {
        manageIDField.setText("");
        manageFullNameField.setText("");
        manageYearField.setText("");
        manageCourseField.setText("");
        managePhoneNumberField.setText("");
        manageOffenseTypeField.setText("");
        manageOffenseDetailsField.setText("");
    }

    private void getLatestDataAdded() {
        Map<String, String> latestData = DatabaseAccess.getLatestData();
        if (!latestData.isEmpty()) {
            System.out.println("Latest data added.");

        } else {
            System.out.println("No data found.");
        }
    }

    public static void displayLatestDataInTextArea(JTextArea textArea) {
        Map<String, String> latestData = getLatestData();
        if (!latestData.isEmpty()) {
            List<String> orderedKeys = Arrays.asList("ID", "Full Name", "Year", "Course");
            StringBuilder outputBuilder = new StringBuilder();
            for (String key : orderedKeys) {
                if (latestData.containsKey(key)) {
                    outputBuilder.append(key).append(": ").append(latestData.get(key)).append("\n");
                }
            }
            textArea.setText(outputBuilder.toString());
        } else {
            textArea.setText("No data found.");
        }
    }
}
