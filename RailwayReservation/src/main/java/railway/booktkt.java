package railway;

import javax.swing.JOptionPane;

public class booktkt extends javax.swing.JFrame {

    /**
     * Creates new form booktkt
     */
    public booktkt() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basepanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        list_srcstation = new javax.swing.JComboBox<>();
        button_submit = new javax.swing.JButton();
        list_deststation = new javax.swing.JComboBox<>();
        list_coachtype = new javax.swing.JComboBox<>();
        list_date = new javax.swing.JComboBox<>();
        list_quota = new javax.swing.JComboBox<>();
        journey_date = new javax.swing.JLabel();
        coach_type = new javax.swing.JLabel();
        quota = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rail_transit = new javax.swing.JLabel();
        button_logout = new javax.swing.JButton();
        button_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basepanel.setBackground(new java.awt.Color(255, 204, 153));
        basepanel.setPreferredSize(new java.awt.Dimension(800, 450));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        list_srcstation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Parassala", "Dhanuvachapuram", "Amaravila", "Neyyattinkara", "Balaramapuram", "Nemom", "Thiruvananthapuram Central", "Thiruvananthapuram Pettah", "Kochuveli" }));
        list_srcstation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_srcstationActionPerformed(evt);
            }
        });

        button_submit.setText("Submit");
        button_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_submitActionPerformed(evt);
            }
        });

        list_deststation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Parassala", "Dhanuvachapuram", "Amaravila", "Neyyattinkara", "Balaramapuram", "Nemom", "Thiruvananthapuram Central", "Thiruvananthapuram Pettah", "Kochuveli" }));
        list_deststation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_deststationActionPerformed(evt);
            }
        });

        list_coachtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sleeper", "AC 3 Tier", "AC Chair Car" }));

        list_date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "July 1", "July 2", "July 3", "July 4", "July 5", "July 6", "July 7" }));

        list_quota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Women", "Senior Citizen" }));
        list_quota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_quotaActionPerformed(evt);
            }
        });

        journey_date.setText("Journey Date");

        coach_type.setText("Class");

        quota.setText("Quota");

        jLabel1.setText("Source");

        jLabel2.setText("Destination");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_submit)
                .addGap(364, 364, 364))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(journey_date)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(coach_type, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(quota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(list_quota, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(list_coachtype, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(list_date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(list_srcstation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(list_deststation, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(list_srcstation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(list_deststation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(list_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(journey_date))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(list_coachtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coach_type))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(list_quota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(button_submit)
                .addGap(40, 40, 40))
        );

        rail_transit.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        rail_transit.setText("RAIL TRANSIT");

        button_logout.setText("Log Out");
        button_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_logoutActionPerformed(evt);
            }
        });

        button_back.setText("Back");
        button_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout basepanelLayout = new javax.swing.GroupLayout(basepanel);
        basepanel.setLayout(basepanelLayout);
        basepanelLayout.setHorizontalGroup(
            basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(basepanelLayout.createSequentialGroup()
                .addComponent(rail_transit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 510, Short.MAX_VALUE)
                .addComponent(button_back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_logout)
                .addContainerGap())
        );
        basepanelLayout.setVerticalGroup(
            basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rail_transit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_logoutActionPerformed
        this.hide();
        global.lgn.setVisible(true);
    }//GEN-LAST:event_button_logoutActionPerformed

    private void button_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_backActionPerformed
        this.hide();
        global.home.setVisible(true);
    }//GEN-LAST:event_button_backActionPerformed

    private void list_srcstationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_srcstationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_srcstationActionPerformed

    private void button_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_submitActionPerformed
        String src=list_srcstation.getSelectedItem().toString();
        String dest=list_deststation.getSelectedItem().toString();
        if(src.equals(dest)) {
            JOptionPane.showMessageDialog(this, "Source and Destination Cannot be the Same!");
        }
        else {
            station cur=global.stlink.first;
            while(cur!=null) {
                if(cur.name.equals(src)) {
                    global.bkdetails.srcstation=cur;
                    break;
                }
                cur=cur.next;
            }
//            if(cur==null) {
//                System.out.println("|"+src+"|");
//            }
            cur=global.stlink.first;
            while(cur!=null) {
                if(cur.name.equals(dest)) {
                    global.bkdetails.deststation=cur;
                    break;
                }
                cur=cur.next;
            }
//            if(cur==null) {
//                System.out.println("|"+dest+"|");
//            }
            if(global.bkdetails.deststation.src_distance>global.bkdetails.srcstation.src_distance) {
                global.bkdetails.direction='n';
            }
            else {
                global.bkdetails.direction='s';
            }
            String dt=list_date.getSelectedItem().toString();
            switch (dt) {
                case "July 1":
                    global.bkdetails.traveldate=global.dtlink.jul1;
                    break;
                case "July 2":
                    global.bkdetails.traveldate=global.dtlink.jul2;
                    break;
                case "July 3":
                    global.bkdetails.traveldate=global.dtlink.jul3;
                    break;
                case "July 4":
                    global.bkdetails.traveldate=global.dtlink.jul4;
                    break;
                case "July 5":
                    global.bkdetails.traveldate=global.dtlink.jul5;
                    break;
                case "July 6":
                    global.bkdetails.traveldate=global.dtlink.jul6;
                    break;
                case "July 7":
                    global.bkdetails.traveldate=global.dtlink.jul7;
                    break;
                default:
                    break;
            }
            String qt=list_quota.getSelectedItem().toString();
            switch (qt) {
                case "General":
                    global.bkdetails.quota="General";
                    break;
                case "Women":
                    global.bkdetails.quota="Women";
                    break;
                case "Senior Citizen":
                    global.bkdetails.quota="Senior Citizen";
                    break;
                default:
                    break;
            }
            String ctype=list_coachtype.getSelectedItem().toString();
            switch (ctype) {
                case "Sleeper":
                    global.bkdetails.coachtype="SL";
                    break;
                case "AC Three Tier":
                    global.bkdetails.coachtype="3AC";
                    break;
                case "AC Chair Car":
                    global.bkdetails.coachtype="CC";
                    break;
                default:
                    break;
            }
            this.hide();
            showtrains shtrain=new showtrains();
            shtrain.setVisible(true);
        }
    }//GEN-LAST:event_button_submitActionPerformed

    private void list_deststationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_deststationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_deststationActionPerformed

    private void list_quotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_quotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_quotaActionPerformed

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
            java.util.logging.Logger.getLogger(booktkt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(booktkt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(booktkt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(booktkt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new booktkt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel basepanel;
    private javax.swing.JButton button_back;
    private javax.swing.JButton button_logout;
    private javax.swing.JButton button_submit;
    private javax.swing.JLabel coach_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel journey_date;
    private javax.swing.JComboBox<String> list_coachtype;
    private javax.swing.JComboBox<String> list_date;
    private javax.swing.JComboBox<String> list_deststation;
    private javax.swing.JComboBox<String> list_quota;
    private javax.swing.JComboBox<String> list_srcstation;
    private javax.swing.JLabel quota;
    private javax.swing.JLabel rail_transit;
    // End of variables declaration//GEN-END:variables
}