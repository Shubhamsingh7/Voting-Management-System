/*
 * UserSection.java
 *
 * Created on __DATE__, __TIME__
 */

package com.shubham.ui;

/**
 *
 * @author  __USER__
 */
public class UserSection extends javax.swing.JFrame {

	/** Creates new form UserSection */
	public UserSection() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel28 = new javax.swing.JLabel();
		jLabel29 = new javax.swing.JLabel();
		jLabel30 = new javax.swing.JLabel();
		jLabel31 = new javax.swing.JLabel();
		jLabel32 = new javax.swing.JLabel();
		jRadioButton1 = new javax.swing.JRadioButton();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jRadioButton2 = new javax.swing.JRadioButton();
		jRadioButton3 = new javax.swing.JRadioButton();
		jRadioButton4 = new javax.swing.JRadioButton();
		jRadioButton5 = new javax.swing.JRadioButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(23, 146, 156));

		jLabel1.setFont(new java.awt.Font("Bodoni MT Condensed", 3, 48));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("Voting Management System");

		jLabel2.setFont(new java.awt.Font("Bell MT", 2, 36));
		jLabel2.setText("Voter Section ");

		jLabel28.setFont(new java.awt.Font("Bell MT", 2, 24));
		jLabel28.setText("Candidate 1:-");

		jLabel29.setFont(new java.awt.Font("Bell MT", 2, 24));
		jLabel29.setText("Candidate 2:-");

		jLabel30.setFont(new java.awt.Font("Bell MT", 2, 24));
		jLabel30.setText("Candidate 3:-");

		jLabel31.setFont(new java.awt.Font("Bell MT", 2, 24));
		jLabel31.setText("Candidate 4:-");

		jLabel32.setFont(new java.awt.Font("Bell MT", 2, 24));
		jLabel32.setText("Candidate 5:-");

		jRadioButton1.setBackground(new java.awt.Color(23, 146, 146));

		jButton1.setBackground(new java.awt.Color(255, 255, 255));
		jButton1.setFont(new java.awt.Font("Bookman Old Style", 2, 24));
		jButton1.setText("Vote");

		jButton2.setBackground(new java.awt.Color(255, 255, 255));
		jButton2.setFont(new java.awt.Font("Bookman Old Style", 2, 24));
		jButton2.setText("Cancel");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jRadioButton2.setBackground(new java.awt.Color(23, 146, 146));

		jRadioButton3.setBackground(new java.awt.Color(23, 146, 146));

		jRadioButton4.setBackground(new java.awt.Color(23, 146, 146));

		jRadioButton5.setBackground(new java.awt.Color(23, 146, 146));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap(205, Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				460,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				177,
																				177,
																				177))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel2)
																		.addGap(
																				304,
																				304,
																				304))))
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(264, 264, 264)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jLabel32,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																174,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel31,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																174,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel30,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																174,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel29,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																174,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel28,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																174,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jRadioButton1)
																						.addComponent(
																								jRadioButton2)
																						.addComponent(
																								jRadioButton4))
																		.addGap(
																				107,
																				107,
																				107)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jButton1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								212,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jButton2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								212,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addComponent(
																jRadioButton3)
														.addComponent(
																jRadioButton5))
										.addContainerGap(46, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel1)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jLabel2)
																		.addGap(
																				58,
																				58,
																				58)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel28)
																						.addComponent(
																								jRadioButton1))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel29)
																						.addComponent(
																								jRadioButton2))
																		.addGap(
																				18,
																				18,
																				18)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel30)
																										.addGap(
																												18,
																												18,
																												18)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																jLabel31)
																														.addComponent(
																																jButton2,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																65,
																																javax.swing.GroupLayout.PREFERRED_SIZE)))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jRadioButton3)
																										.addGap(
																												46,
																												46,
																												46)
																										.addComponent(
																												jRadioButton4)))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jRadioButton5)
																						.addComponent(
																								jLabel32)))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				123,
																				123,
																				123)
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				65,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(85, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UserSection().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JRadioButton jRadioButton2;
	private javax.swing.JRadioButton jRadioButton3;
	private javax.swing.JRadioButton jRadioButton4;
	private javax.swing.JRadioButton jRadioButton5;
	// End of variables declaration//GEN-END:variables

}