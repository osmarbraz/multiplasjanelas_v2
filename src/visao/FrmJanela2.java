package visao;

import java.awt.Rectangle;

/**
 * @author Osmar de Oliveira Braz Junior
 */
public class FrmJanela2 extends javax.swing.JDialog {

    public javax.swing.JButton btJanela1;
    private javax.swing.JLabel jLabel1;

    public FrmJanela2() {
        initComponents();
    }

    private void initComponents() {

        setTitle("Janela 2 - Versão 2");

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Janela 2 -  Clique na área da Janela 1");
        jLabel1.setBounds(new Rectangle(5, 150, 350, 17));

        btJanela1 = new javax.swing.JButton();
        btJanela1.setText("Janela 1");
        btJanela1.setBounds(new Rectangle(5, 250, 150, 27));

        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        getContentPane().add(btJanela1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width - 616) / 2, (screenSize.height - 538) / 2, 416, 338);
    }
}
