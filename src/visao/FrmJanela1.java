package visao;

import java.awt.Rectangle;

/**
 * @author Osmar de Oliveira Braz Junior
 */
public class FrmJanela1 extends javax.swing.JFrame {

    public javax.swing.JButton btFechar;
    public javax.swing.JButton btJanela2;
    public javax.swing.JButton btJanela3;
    private javax.swing.JLabel jLabel1;

    public FrmJanela1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Janela 1 - Versão 2");
        setResizable(false);
        
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Janela 1");
        jLabel1.setBounds(new Rectangle(5, 150, 350, 17));        
        
        btJanela2 = new javax.swing.JButton();               
        btJanela2.setText("Janela 2 - Dialog");
        btJanela2.setBounds(new Rectangle(5, 250, 150, 27));        
        
        btJanela3 = new javax.swing.JButton();        
        btJanela3.setText("Janela 3 - JFrame");
        btJanela3.setBounds(new Rectangle(160, 250, 150, 27));
        
        btFechar = new javax.swing.JButton();               
        btFechar.setText("Fechar");        
        btFechar.setBounds(new Rectangle(315, 250, 90, 27));
        
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        getContentPane().add(btJanela2);
        getContentPane().add(btJanela3);
        getContentPane().add(btFechar);
       
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width - 416) / 2, (screenSize.height - 338) / 2, 416, 338);
    }
}