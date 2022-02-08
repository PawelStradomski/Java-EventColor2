
package zdarzenia.kolor.pkg2;
/**
 * @author pawelstradomski
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ZdarzeniaKolor2 extends JFrame
{
    ZdarzeniaKolor2()
    {
        super("Zdarzenia 2 sposob");
        this.setBounds(600, 300, 400, 400);
        initComponent();
        this.setDefaultCloseOperation(3);
    }
    public void initComponent()
    {
        budujButton("zielony", Color.GREEN);
        budujButton("czarny", Color.BLACK);
        
    }
    public void budujButton(String nazwa, Color k)
    {
        JButton przycisk = new JButton(nazwa);
        
        this.getContentPane().add(panel);

        panel.add(przycisk);

        przycisk.addActionListener(new sluchaczKoloru(k));

    }
    private class sluchaczKoloru implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            panel.setBackground(kolor);
        }
        public sluchaczKoloru(Color k)
        {
            this.kolor = k;
        }
        Color kolor;
    }
    JPanel panel = new JPanel();

    public static void main(String[] args) {
       
        new ZdarzeniaKolor2().setVisible(true);
    }
    
}
