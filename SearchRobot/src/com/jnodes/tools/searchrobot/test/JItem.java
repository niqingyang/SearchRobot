/*
 * JItem.java
 *
 * Created on __DATE__, __TIME__
 */

package com.jnodes.tools.searchrobot.test;

/**
 *
 * @author  __USER__
 */
public class JItem extends javax.swing.JPanel {

	/** Creates new form JItem */
	public JItem() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		lblItem = new javax.swing.JLabel();
		btnDel = new javax.swing.JButton();

		lblItem.setFont(new java.awt.Font("微软雅黑", 0, 14));
		lblItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		btnDel.setText("X");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(lblItem, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(btnDel)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lblItem, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE).addComponent(btnDel));
	}// </editor-fold>
	//GEN-END:initComponents

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton btnDel;
	private javax.swing.JLabel lblItem;
	// End of variables declaration//GEN-END:variables

}