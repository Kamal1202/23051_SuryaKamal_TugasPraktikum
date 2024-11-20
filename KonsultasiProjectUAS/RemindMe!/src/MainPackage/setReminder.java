/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package MainPackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author soery
 */
public class setReminder extends javax.swing.JFrame {
    
    
    /**
     * Creates new form setReminder
     */
     private String currentUser;
    
    public setReminder(String currentUser) {
        this.currentUser = currentUser; // Simpan data user yang login
        initComponents();
        showDateTime();
    }
    
    public setReminder() {
        initComponents();
        showDateTime();
    }
    
    private void showDateTime() {
        javax.swing.Timer timer = new javax.swing.Timer(1000, e -> {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEEE, dd-MM-yyyy HH:mm:ss");
            tanggal.setText(now.format(dateFormatter));
        });
        timer.start(); // Memulai timer
    }
    
    private void setReminderAction() {
//        String selectedDate = dateChooser.get
//            System.out.println(selectedDate);
        try {
            LocalDate selectedDate = dateChooser.getSelectedDate();
            System.out.println(selectedDate);
            
            if (selectedDate == null) {
                JOptionPane.showMessageDialog(this, "Tanggal tidak boleh kosong!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Format tanggal
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            String formattedDate = dateFormat.format(selectedDate);

            // Ambil waktu
            String timeInput = timeField.getText();
            if (!timeInput.matches("\\d{2}:\\d{2}")) {
                JOptionPane.showMessageDialog(this, "Format waktu salah! Gunakan HH:mm.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Gabungkan tanggal dan waktu
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            LocalDateTime reminderDateTime = LocalDateTime.parse(formattedDate + " " + timeInput, formatter);

            // Validasi waktu
            LocalDateTime now = LocalDateTime.now();
            if (reminderDateTime.isBefore(now)) {
                JOptionPane.showMessageDialog(this, "Waktu pengingat harus di masa depan!", "Invalid Time", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Hitung delay dan set pengingat
            long delay = java.time.Duration.between(now, reminderDateTime).toMillis();
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    javax.swing.SwingUtilities.invokeLater(() -> {
                        JOptionPane.showMessageDialog(null, "Tugas Anda Sudah Memasuki Batas Waktu Pengumpulan!", "Reminder", JOptionPane.INFORMATION_MESSAGE);
                    });
                }
            }, delay);

            JOptionPane.showMessageDialog(this, "Reminder berhasil diset untuk " + formattedDate + " " + timeInput,
                    "Reminder Set", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan. Mohon periksa format input Anda.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void validateInput() {
        try {
            // Ambil nilai dari JDateChooser
            String selectedDate = dateChooser.getDateFormat();
            if (selectedDate == null) {
                throw new IllegalArgumentException("Tanggal tidak boleh kosong!");
            }

            // Format tanggal menjadi dd-MM-yyyy
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            String formattedDate = dateFormat.format(selectedDate);

            // Ambil input waktu dari text field
            String timeInput = timeField.getText(); // HH:mm

            // Validasi format waktu
            if (!timeInput.matches("\\d{2}:\\d{2}")) {
                throw new IllegalArgumentException("Format waktu salah! Gunakan HH:mm");
            }

            // Jika validasi lolos
            System.out.println("Tanggal: " + formattedDate + " Waktu: " + timeInput);

        } catch (IllegalArgumentException e) {
            // Tampilkan pesan error
            JOptionPane.showMessageDialog(this, "Format salah! Gunakan format tanggal: dd-MM-yyyy dan waktu: HH:mm.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kalenderButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        dateTitle2 = new javax.swing.JLabel();
        timeTitle = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        timeField = new javax.swing.JTextField();
        setButton = new javax.swing.JButton();
        navBar = new javax.swing.JPanel();
        tanggal = new javax.swing.JLabel();
        userButton = new javax.swing.JButton();
        namaLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dateChooser = new com.raven.datechooser.DateChooser();
        jLabel3 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        kalenderButton.setBackground(new java.awt.Color(153, 153, 153));
        kalenderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kalender.png"))); // NOI18N
        kalenderButton.setBorder(null);
        kalenderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalenderButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        dateTitle2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        dateTitle2.setText("Date: ");

        timeTitle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        timeTitle.setText("Time: ");

        dateField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        timeField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        timeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeFieldActionPerformed(evt);
            }
        });

        setButton.setBackground(new java.awt.Color(255, 234, 133));
        setButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        setButton.setText("Set");
        setButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setButtonActionPerformed(evt);
            }
        });

        navBar.setBackground(new java.awt.Color(255, 234, 133));

        tanggal.setForeground(new java.awt.Color(102, 102, 102));

        userButton.setBackground(new java.awt.Color(121, 134, 199));
        userButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        userButton.setBorder(null);
        userButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userButtonActionPerformed(evt);
            }
        });

        namaLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        namaLabel.setText("Nama Lengkap");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Remind Me!");

        javax.swing.GroupLayout navBarLayout = new javax.swing.GroupLayout(navBar);
        navBar.setLayout(navBarLayout);
        navBarLayout.setHorizontalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 477, Short.MAX_VALUE)
                .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(namaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        navBarLayout.setVerticalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navBarLayout.createSequentialGroup()
                        .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namaLabel)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE))
                    .addComponent(userButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel2.setText("Set Reminder");

        jPanel2.setBackground(new java.awt.Color(239, 235, 235));

        dateChooser.setForeground(new java.awt.Color(255, 234, 133));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Reminder.png"))); // NOI18N

        backButton.setBackground(new java.awt.Color(121, 134, 199));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dateTitle2)
                                    .addComponent(timeTitle))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateField)
                                    .addComponent(timeField)
                                    .addComponent(setButton, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(backButton)))
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(navBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTitle2)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timeTitle)
                    .addComponent(timeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(setButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 50, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeFieldActionPerformed

    private void setButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setButtonActionPerformed
        validateInput();
        setReminderAction();
    }//GEN-LAST:event_setButtonActionPerformed

    private void kalenderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalenderButtonActionPerformed
        //dateChooser.showPopup();
    }//GEN-LAST:event_kalenderButtonActionPerformed

    private void userButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userButtonActionPerformed
        formProfile profilePage = new formProfile(currentUser);
        profilePage.setVisible(true);
        dispose();
    }//GEN-LAST:event_userButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       new mainMenu().setVisible(true);
       dispose(); 
    }//GEN-LAST:event_backButtonActionPerformed

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(setReminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(setReminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(setReminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(setReminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new setReminder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private com.raven.datechooser.DateChooser dateChooser;
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel dateTitle2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton kalenderButton;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JPanel navBar;
    private javax.swing.JButton setButton;
    private javax.swing.JLabel tanggal;
    private javax.swing.JTextField timeField;
    private javax.swing.JLabel timeTitle;
    private javax.swing.JButton userButton;
    // End of variables declaration//GEN-END:variables
}
