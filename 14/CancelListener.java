/**
 * CancelListener.java
 * 
 * Listener for cancelling a Sprite-creation dialog
 *
 * @author CGG
 * CSCI 235, Wheaton College, Fall 2019
 * Lab 14
 * 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CancelListener implements ActionListener {

    private AddListener dialog;

    public CancelListener(AddListener dialog) {
	this.dialog = dialog;
    }

    public void actionPerformed(ActionEvent ae) {
	dialog.reset();
    }
}
