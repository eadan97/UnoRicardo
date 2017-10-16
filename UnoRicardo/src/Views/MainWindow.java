
package Views;


import Comun.IGame;
import Utils.Jugador;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MainWindow extends javax.swing.JFrame {
    IGame game;

    public MainWindow(IGame g) throws Exception {
        this.game = g;
        initComponents();
    }

    public void activar()
    {
        this.setVisible(true);
    }
    
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblWallPaper = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txfUserName = new javax.swing.JTextField();
        lblIP = new javax.swing.JLabel();
        txfUserIP = new javax.swing.JTextField();
        btnSetUserData = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        lblPrueba = new javax.swing.JLabel();
        lblPruebaCarta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));

        jPanel1.setLayout(null);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 0, 350);

        lblWallPaper.setIcon(new javax.swing.ImageIcon("F:\\Users\\rshum\\Desktop\\ImagenesUNO\\Wallpaper.jpg")); // NOI18N
        jPanel1.add(lblWallPaper);
        lblWallPaper.setBounds(0, 0, 710, 350);

        jPanel3.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Name: ");

        txfUserName.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        lblIP.setForeground(new java.awt.Color(255, 204, 0));
        lblIP.setText("IP:");

        txfUserIP.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txfUserIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfUserIPActionPerformed(evt);
            }
        });

        btnSetUserData.setIcon(new javax.swing.ImageIcon("F:\\Users\\rshum\\Desktop\\ImagenesUNO\\check-mark.png")); // NOI18N
        btnSetUserData.setOpaque(false);
        btnSetUserData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetUserDataActionPerformed(evt);
            }
        });

        btnPlay.setIcon(new javax.swing.ImageIcon("f:\\Users\\rshum\\Desktop\\ImagenesUNO\\play.png")); // NOI18N
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        lblPrueba.setForeground(new java.awt.Color(255, 255, 255));
        lblPrueba.setText("Prueba");

        lblPruebaCarta.setForeground(new java.awt.Color(255, 255, 255));
        lblPruebaCarta.setText("Carta");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(txfUserIP))
                .addGap(28, 28, 28)
                .addComponent(btnSetUserData, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lblPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(lblPruebaCarta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIP)
                            .addComponent(txfUserIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPruebaCarta))
                    .addComponent(btnSetUserData, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfUserIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfUserIPActionPerformed

    }//GEN-LAST:event_txfUserIPActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed

        Integer numDePrueba = 88;
        
        try 
        {
            numDePrueba = game.getJugadores().size();
            if (numDePrueba >= 2)
            {
                game.inicializarDrawPile();
                game.dealCardsToAllPlayers();
                
                Jugador primerJugador = game.getJugadores().get(0);
                String color = primerJugador.getHand().get(0).getColor().toString();
                lblPruebaCarta.setText(color);
            }
            
            else
            {
                System.out.println("No hay suficientes jugadores");
            }
        }
        
        catch (Exception ex) 
        {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        lblPrueba.setText(numDePrueba.toString());
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnSetUserDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetUserDataActionPerformed
        String ip = txfUserIP.getText();
        String nombre = txfUserName.getText();
        
        Jugador nuevoJugador = new Jugador(nombre , ip);
        lblPrueba.setText(nuevoJugador.getName());
        
        try 
        {
            game.añadirJugador(nuevoJugador);//potencial breakpoint
        } 
        
        catch (Exception ex) 
        {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        txfUserIP.setText("");
        txfUserName.setText("");

    }//GEN-LAST:event_btnSetUserDataActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnSetUserData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblIP;
    private javax.swing.JLabel lblPrueba;
    private javax.swing.JLabel lblPruebaCarta;
    private javax.swing.JLabel lblWallPaper;
    private javax.swing.JTextField txfUserIP;
    private javax.swing.JTextField txfUserName;
    // End of variables declaration//GEN-END:variables

}//End of Class

