package com.nicholasblackburn.status.Gui;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

import javax.swing.JTextField;

import com.nicholasblackburn.status.Network.Status;

import sun.jvm.hotspot.types.JBooleanField;

public class Display {

    Status status = new Status();

    public void display() {

        JFrame frame = new JFrame("Network_tps");

        frame.setUndecorated(true);
        frame.setBackground(new Color(0, 0, 0, 0));
        frame.setAlwaysOnTop(true);
        // Without this, the window is draggable from any non transparent
        // point, including points inside textboxes.
        frame.getRootPane().putClientProperty("apple.awt.draggableWindowBackground", false);

        frame.getContentPane().setLayout(new java.awt.BorderLayout());
        frame.getContentPane().add(new JTextField(status.addr), java.awt.BorderLayout.NORTH);
        frame.getContentPane().add(new JTextField(), java.awt.BorderLayout.SOUTH);
        frame.setVisible(true);
        frame.pack();
    }



}
