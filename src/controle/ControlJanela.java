package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import visao.*;

/**
 * @author Osmar de Oliveira Braz Junior
 */

public class ControlJanela {

    private FrmJanela1 janela1;
    private FrmJanela2 janela2;
    private FrmJanela3 janela3;

    public ControlJanela() {
        janela1 = new FrmJanela1();
        janela2 = new FrmJanela2();
        janela3 = new FrmJanela3();
        ouvintes();
    }

    public void ouvintes() {
        //Ouvintes da Janela 1
        janela1.btFechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        janela1.btJanela2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela2();
            }
        });
        janela1.btJanela3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela3();
            }
        });
        //Ouvintes da Janela 2
        janela2.btJanela1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela1();
            }
        });
        //Ouvintes da Janela 3
        janela3.btJanela1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela1();
            }
        });
    }

    public void executar() {
        janela1.setVisible(true);
        janela2.setVisible(false);
        janela3.setVisible(false);
    }

    private void janela1() {        
        janela1.setVisible(true);        
        janela2.setVisible(false);        
        janela3.setVisible(false);        
    }

    private void janela2() {
        janela2.setModal(true);
        janela2.setVisible(true);
        janela3.setVisible(false);
    }

    private void janela3() {
        janela2.setVisible(false);
        janela3.setVisible(true);
    }
}
