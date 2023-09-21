/*
 * @(#)SummaryToolBar.java
 *
 * Copyright (c) 2007-2008 The authors and contributors of JHotDraw.
 * You may not use, copy or modify this file, except in compliance with the
 * accompanying license terms.
 */
package org.jhotdraw.samples.svg.gui;

import java.awt.*;
import java.util.ResourceBundle;
import javax.swing.*;
import org.jhotdraw.util.*;

/**
 * SummaryToolBar.
 *
 * @author Werner Randelshofer
 * @version $Id$
 */
public class SummaryToolBar extends JToolBar {

    private static final long serialVersionUID = 1L;
    private ResourceBundleUtil labels;

    /**
     * Creates new instance.
     */
    public SummaryToolBar() {
        labels = ResourceBundleUtil.getBundle(ResourceBundle.getBundle("org.jhotdraw.samples.svg.Labels", LocaleUtil.getDefault()));
        initComponents();
        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(0, 10, 0, 0);
        gbc.weightx = 1d;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        layout.setConstraints(summaryField, gbc);
    }

    public String getSummary() {
        return summaryField.getText();
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        summaryLabel = new javax.swing.JLabel();
        summaryField = new javax.swing.JTextField();
        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setFloatable(false);
        setOpaque(false);
        summaryLabel.setFont(new java.awt.Font("Dialog", 0, 11));
        summaryLabel.setText(labels.getString("summary")); // NOI18N
        add(summaryLabel);
        summaryField.setFont(new java.awt.Font("DialogInput", 0, 11));
        add(summaryField);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField summaryField;
    private javax.swing.JLabel summaryLabel;
    // End of variables declaration//GEN-END:variables
}
