/*
 * @(#)ToggleStatusBarAction.java
 *
 * Copyright (c) 2005 The authors and contributors of JHotDraw.
 * You may not use, copy or modify this file, except in compliance with the
 * accompanying license terms.
 */
package org.jhotdraw.samples.teddy.action;

import java.awt.event.*;
import java.util.ResourceBundle;
import javax.swing.Action;
import org.jhotdraw.action.AbstractViewAction;
import org.jhotdraw.api.app.Application;
import org.jhotdraw.util.*;
import org.jhotdraw.api.app.View;
import org.jhotdraw.samples.teddy.TeddyView;

/**
 * ToggleStatusBarAction.
 *
 * @author Werner Randelshofer
 * @version $Id$
 */
public class ToggleStatusBarAction extends AbstractViewAction {

    private static final long serialVersionUID = 1L;
    public static final String ID = "view.toggleStatusBar";
    private ResourceBundleUtil labels = ResourceBundleUtil.getBundle(ResourceBundle.getBundle("org.jhotdraw.samples.teddy.Labels", LocaleUtil.getDefault()));

    /**
     * Creates a new instance.
     */
    public ToggleStatusBarAction(Application app, View view) {
        super(app, view);
        labels.configureAction(this, ID);
        setPropertyName("statusBarVisible");
    }

    @Override
    public TeddyView getActiveView() {
        return (TeddyView) super.getActiveView();
    }

    @Override
    protected void updateView() {
        putValue(
                Action.SELECTED_KEY,
                getActiveView() != null && getActiveView().isStatusBarVisible());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        getActiveView().setStatusBarVisible(!getActiveView().isStatusBarVisible());
    }
}
