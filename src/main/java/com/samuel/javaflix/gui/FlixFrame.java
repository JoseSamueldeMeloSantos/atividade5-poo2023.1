package com.samuel.javaflix.gui;

import com.samuel.javaflix.controllers.MenuController;
import com.samuel.javaflix.model.SystemJavaFlix;

import javax.swing.*;

/**
 * @author José Samuel de Melo Santosl
 */
public class FlixFrame extends javax.swing.JFrame {

    private javax.swing.JPanel MenuP;
    private javax.swing.JLabel descriptionL;
    private javax.swing.JButton quitB;
    private javax.swing.JButton registerB;
    private javax.swing.JButton removeAllMoviesB;
    private javax.swing.JButton removeB;
    private javax.swing.JButton reseachB;
    private javax.swing.JButton showAllMoviesB;
    private javax.swing.JLabel title;

    private SystemJavaFlix systemJF;


    public FlixFrame() {
        this.systemJF = new SystemJavaFlix();
        initComponents();
        initEvents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        MenuP = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        registerB = new javax.swing.JButton();
        removeB = new javax.swing.JButton();
        showAllMoviesB = new javax.swing.JButton();
        reseachB = new javax.swing.JButton();
        descriptionL = new javax.swing.JLabel();
        quitB = new javax.swing.JButton();
        removeAllMoviesB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));

        MenuP.setBackground(new java.awt.Color(204, 0, 0));
        MenuP.setBorder(new javax.swing.border.MatteBorder(null));

        title.setFont(new java.awt.Font("Noto Sans Mono", 1, 40)); // NOI18N
        title.setText("JAVAFLIX");

        registerB.setBackground(new java.awt.Color(0, 0, 0));
        registerB.setFont(new java.awt.Font("Noto Sans Mono", 0, 13)); // NOI18N
        registerB.setForeground(new java.awt.Color(255, 255, 255));
        registerB.setText("Register");

        removeB.setBackground(new java.awt.Color(0, 0, 0));
        removeB.setFont(new java.awt.Font("Noto Sans Mono", 0, 13)); // NOI18N
        removeB.setForeground(new java.awt.Color(255, 255, 255));
        removeB.setText("Remove");

        showAllMoviesB.setBackground(new java.awt.Color(0, 0, 0));
        showAllMoviesB.setFont(new java.awt.Font("Noto Sans Mono", 0, 13)); // NOI18N
        showAllMoviesB.setForeground(new java.awt.Color(255, 255, 255));
        showAllMoviesB.setText("Show All Moives");

        reseachB.setBackground(new java.awt.Color(0, 0, 0));
        reseachB.setFont(new java.awt.Font("Noto Sans Mono", 0, 13)); // NOI18N
        reseachB.setForeground(new java.awt.Color(255, 255, 255));
        reseachB.setText("Research");

        descriptionL.setFont(new java.awt.Font("Noto Sans Mono", 0, 16)); // NOI18N
        descriptionL.setText("\"your movies in the right place\"");

        quitB.setBackground(new java.awt.Color(0, 0, 0));
        quitB.setFont(new java.awt.Font("Noto Sans Mono", 0, 13)); // NOI18N
        quitB.setForeground(new java.awt.Color(255, 255, 255));
        quitB.setText("Quit");

        removeAllMoviesB.setBackground(new java.awt.Color(0, 0, 0));
        removeAllMoviesB.setFont(new java.awt.Font("Noto Sans Mono", 0, 13)); // NOI18N
        removeAllMoviesB.setForeground(new java.awt.Color(255, 255, 255));
        removeAllMoviesB.setText("Remove All Movies");

        javax.swing.GroupLayout MenuPLayout = new javax.swing.GroupLayout(MenuP);
        MenuP.setLayout(MenuPLayout);
        MenuPLayout.setHorizontalGroup(
            MenuPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(MenuPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPLayout.createSequentialGroup()
                        .addGroup(MenuPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registerB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reseachB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showAllMoviesB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quitB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeAllMoviesB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPLayout.createSequentialGroup()
                        .addComponent(descriptionL)
                        .addGap(84, 84, 84))))
        );
        MenuPLayout.setVerticalGroup(
            MenuPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionL)
                .addGap(64, 64, 64)
                .addComponent(registerB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reseachB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showAllMoviesB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeAllMoviesB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quitB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setLocationRelativeTo(null);
        pack();
    }

    private void initEvents() {
        registerB.addActionListener(new MenuController(systemJF, this));
        reseachB.addActionListener(new MenuController(systemJF, this));
        removeB.addActionListener(new MenuController(systemJF, this));
        showAllMoviesB.addActionListener(new MenuController(systemJF, this));
        removeAllMoviesB.addActionListener(new MenuController(systemJF, this));
        quitB.addActionListener(new MenuController(systemJF, this));
    }

    public JButton getQuitB() {
        return quitB;
    }

    public JButton getRegisterB() {
        return registerB;
    }

    public JButton getRemoveB() {
        return removeB;
    }

    public JButton getReseachB() {
        return reseachB;
    }

    public JButton getShowAllMoviesB() {
        return showAllMoviesB;
    }

    public JButton getRemoveAllMoviesB() {
        return removeAllMoviesB;
    }
}
