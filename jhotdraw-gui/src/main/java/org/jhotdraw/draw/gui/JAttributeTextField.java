/*
 * @(#)JAttributeTextField.java
 *
 * Copyright (c) 2009-2010 The authors and contributors of JHotDraw.
 * You may not use, copy or modify this file, except in compliance with the
 * accompanying license terms.
 */
package org.jhotdraw.draw.gui;

import java.awt.*;
import javax.swing.*;
import org.jhotdraw.api.gui.AttributeEditor;
import org.jhotdraw.gui.JLifeFormattedTextField;
import org.jhotdraw.util.*;

/**
 * An entry field that can be used to edit an attribute of a {@code Figure}.
 *
 * @author Werner Randelshofer
 * @version $Id$
 */
public class JAttributeTextField<T> extends JLifeFormattedTextField implements AttributeEditor<T> {

    private static final long serialVersionUID = 1L;
    /**
     * This variable is set to true, when the figures, which are currently
     * being edited by this field, have multiple values.
     */
    private boolean isMultipleValues;

    /**
     * Creates new instance.
     */
    public JAttributeTextField() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (!isFocusOwner() && isMultipleValues) {
            ResourceBundleUtil labels = ResourceBundleUtil.getBundle("org.jhotdraw.gui.Labels");
            Color c = getForeground();
            setForeground(new Color(0x0, true));
            super.paintComponent(g);
            Insets insets = getInsets();
            Insets margin = getMargin();
            FontMetrics fm = g.getFontMetrics(getFont());
            g.setFont(getFont().deriveFont(Font.ITALIC));
            setForeground(c);
            g.setColor(c);
            g.drawString(labels.getString("attribute.differentValues.text"),
                    insets.left + margin.left,
                    insets.top + margin.top + fm.getAscent());
        } else {
            super.paintComponent(g);
        }
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    }// </editor-fold>//GEN-END:initComponents
    @Override
    public JComponent getComponent() {
        return this;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T getAttributeValue() {
        return (T) getValue();
    }

    @Override
    public void setMultipleValues(boolean newValue) {
        isMultipleValues = newValue;
        repaint();
    }

    @Override
    public boolean isMultipleValues() {
        return isMultipleValues;
    }

    @Override
    public boolean getValueIsAdjusting() {
        return isFocusOwner();
    }

    @Override
    public void setAttributeValue(T newValue) {
        setValue(newValue);
    }

    @Override
    protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
        super.firePropertyChange(propertyName, oldValue, newValue);
        if ("value".equals(propertyName)) {
            super.firePropertyChange(ATTRIBUTE_VALUE_PROPERTY, oldValue, newValue);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
