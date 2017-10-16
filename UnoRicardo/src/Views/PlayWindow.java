/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Utils.Game;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import Utils.Jugador;
import Comun.IGame;
import Utils.Carta;

/**
 *
 * @author rshum
 */
public class PlayWindow extends javax.swing.JFrame {
    IGame game;
    Jugador jugador;
    private List<JButton> botonesDeCartas ; //lista de Botones
    private int indice;
    private int cartaEscogida;


    // -------------------Constructor---------------------------
    public PlayWindow(IGame g , Jugador j)
    {
        initComponents();//SUMAMENTE IMPORTANTE
        this.botonesDeCartas = new ArrayList<>();
        this.jugador = j;
        this.game = g;
    }


    // --------------------------- Methods ---------------------------
    public void placeGraphicCard(String nameOfImage)
    {
        JButton botonDeCarta = new JButton();
        botonDeCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("../Resources/"+nameOfImage+".png")));
        this.cardsDisplayPanel.add(botonDeCarta);
        this.botonesDeCartas.add(botonDeCarta);
        
        
        botonDeCarta.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                cartaEscogida = botonesDeCartas.indexOf(botonDeCarta);
                //Si = 0, No = otra cosa >.<
                int yesOrNo = JOptionPane.showConfirmDialog(null, "¿Desea jugar esta carta?" ,
                        "Confirmación de jugada", JOptionPane.YES_NO_OPTION );
                
                if (yesOrNo == 0)
                {
                    //Aquí debe ir el método de jugar del jugador respectivo.
                    System.out.println("Se jugó la carta de índice: " + cartaEscogida);
                    
                }
      
            }
        });
        
        indice++ ;
        this.cardsDisplayPanel.updateUI();
    }
        
    public void placeOneCard(Carta c)
    {
        String nombreImagen = c.getNombre().toString() + c.getColor().toString();
   
        placeGraphicCard(nombreImagen.toLowerCase());
    }
    
    public void placePlayerCards(Jugador j)
    {
        int largo = j.getHand().size();
        for (int i = 0; i < largo ; i++)
        {
            Carta currentCard = j.getHand().get(i);
            placeOneCard(currentCard);
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

        panelFondo = new javax.swing.JPanel();
        cardsDisplay = new javax.swing.JScrollPane();
        cardsDisplayPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnStartGame = new javax.swing.JButton();
        drawAndDiscardPanel = new javax.swing.JPanel();
        btnDrawPile = new javax.swing.JButton();
        lblDiscardPile = new javax.swing.JLabel();
        serverPanel = new javax.swing.JPanel();
        txfServerComandos = new javax.swing.JTextField();
        lblServerComandos = new javax.swing.JLabel();
        serverList = new java.awt.List();
        brnUsarComando = new javax.swing.JButton();
        btnClearServerList = new javax.swing.JButton();
        callUNOPanel = new javax.swing.JPanel();
        btnCallUNO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panelFondo.setBackground(new java.awt.Color(204, 0, 0));
        panelFondo.setForeground(new java.awt.Color(204, 0, 51));

        cardsDisplayPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardsDisplayPanelMouseClicked(evt);
            }
        });
        cardsDisplayPanel.setLayout(new java.awt.GridLayout(0, 7));
        cardsDisplay.setViewportView(cardsDisplayPanel);

        btnStartGame.setIcon(new javax.swing.ImageIcon("f:\\Users\\rshum\\Desktop\\ImagenesUNO\\rugby-fan-with-an-encouraging-signal-with-word-go.png")); // NOI18N
        btnStartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnStartGame, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnStartGame, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        btnDrawPile.setIcon(new javax.swing.ImageIcon("f:\\Users\\rshum\\Downloads\\Images\\dorso.png")); // NOI18N
        btnDrawPile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawPileActionPerformed(evt);
            }
        });

        lblDiscardPile.setBackground(new java.awt.Color(153, 51, 255));
        lblDiscardPile.setText("DEBE IR ÚLTIMA CARTA QUE SE JUGÓ");

        javax.swing.GroupLayout drawAndDiscardPanelLayout = new javax.swing.GroupLayout(drawAndDiscardPanel);
        drawAndDiscardPanel.setLayout(drawAndDiscardPanelLayout);
        drawAndDiscardPanelLayout.setHorizontalGroup(
            drawAndDiscardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drawAndDiscardPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblDiscardPile, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnDrawPile, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        drawAndDiscardPanelLayout.setVerticalGroup(
            drawAndDiscardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drawAndDiscardPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(drawAndDiscardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDrawPile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDiscardPile, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        serverPanel.setBackground(new java.awt.Color(102, 102, 102));

        lblServerComandos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblServerComandos.setText("Comando:");
        lblServerComandos.setToolTipText("");

        serverList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverListActionPerformed(evt);
            }
        });

        brnUsarComando.setText("Usar");
        brnUsarComando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnUsarComandoActionPerformed(evt);
            }
        });

        btnClearServerList.setText("Limpiar");
        btnClearServerList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearServerListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout serverPanelLayout = new javax.swing.GroupLayout(serverPanel);
        serverPanel.setLayout(serverPanelLayout);
        serverPanelLayout.setHorizontalGroup(
            serverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serverPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(serverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(serverList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(serverPanelLayout.createSequentialGroup()
                        .addGroup(serverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblServerComandos, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(btnClearServerList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(serverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(brnUsarComando, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txfServerComandos, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        serverPanelLayout.setVerticalGroup(
            serverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, serverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serverList, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(serverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblServerComandos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfServerComandos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(serverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brnUsarComando)
                    .addComponent(btnClearServerList))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnCallUNO.setIcon(new javax.swing.ImageIcon("f:\\Users\\rshum\\Desktop\\ImagenesUNO\\UNO.png")); // NOI18N
        btnCallUNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCallUNOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout callUNOPanelLayout = new javax.swing.GroupLayout(callUNOPanel);
        callUNOPanel.setLayout(callUNOPanelLayout);
        callUNOPanelLayout.setHorizontalGroup(
            callUNOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(callUNOPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnCallUNO, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        callUNOPanelLayout.setVerticalGroup(
            callUNOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCallUNO, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drawAndDiscardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardsDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(serverPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(callUNOPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(drawAndDiscardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(cardsDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(serverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(callUNOPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Aquí se desactiva el botón de UNO. PROGRAMAR, POSTERIORMENTE, ADECUADAMENTE.
    private void btnStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartGameActionPerformed

        placePlayerCards(jugador);
        btnCallUNO.setEnabled(false);
    }//GEN-LAST:event_btnStartGameActionPerformed

    private void cardsDisplayPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardsDisplayPanelMouseClicked

    }//GEN-LAST:event_cardsDisplayPanelMouseClicked

    private void btnDrawPileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrawPileActionPerformed

        try 
        {
            ArrayList<Carta> drawedCards = game.drawACard(jugador, 1);
            int largo = drawedCards.size();
            for (int i = 0 ; i < largo ; i++)
            {
                placeOneCard(drawedCards.get(i));
            }
        } 
        
        catch (Exception ex)
        {
            Logger.getLogger(PlayWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDrawPileActionPerformed

    private void serverListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serverListActionPerformed

    private void brnUsarComandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnUsarComandoActionPerformed

    }//GEN-LAST:event_brnUsarComandoActionPerformed

    private void btnClearServerListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearServerListActionPerformed
        // TODO add your handling code here:
        serverList.removeAll();
    }//GEN-LAST:event_btnClearServerListActionPerformed

    private void btnCallUNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCallUNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCallUNOActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnUsarComando;
    private javax.swing.JButton btnCallUNO;
    private javax.swing.JButton btnClearServerList;
    private javax.swing.JButton btnDrawPile;
    private javax.swing.JButton btnStartGame;
    private javax.swing.JPanel callUNOPanel;
    private javax.swing.JScrollPane cardsDisplay;
    private javax.swing.JPanel cardsDisplayPanel;
    private javax.swing.JPanel drawAndDiscardPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDiscardPile;
    private javax.swing.JLabel lblServerComandos;
    private javax.swing.JPanel panelFondo;
    private java.awt.List serverList;
    private javax.swing.JPanel serverPanel;
    private javax.swing.JTextField txfServerComandos;
    // End of variables declaration//GEN-END:variables
}
