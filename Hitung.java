/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbaloktabung2;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class Hitung extends JFrame {
    JLabel judulprogram = new JLabel("Kalkulator Balok");
    JLabel lebar = new JLabel("Lebar");
    JLabel panjang = new JLabel("Panjang");
    JLabel tinggi = new JLabel("Tinggi");
    JLabel hasiltext = new JLabel("HASIL : ");

    JLabel labelluas = new JLabel("");
    JLabel labelkeliling = new JLabel("");
    JLabel labelvolume = new JLabel("");
    JLabel labellp = new JLabel("");

    JTextField fieldlebar = new JTextField();
    JTextField fieldpanjang = new JTextField();
    JTextField fieldtinggi = new JTextField();

    JButton tombolhitung=  new JButton("Hitung");
    JButton tombolreset=  new JButton("Reset");

    public Hitung(){
        setSize(600,600);
        setLayout(null);

        add(judulprogram);
        add(lebar);
        add(panjang);
        add(tinggi);
        add(hasiltext);

        add(fieldlebar);
        add(fieldpanjang);
        add(fieldtinggi);

        add(labelluas);
        add(labelkeliling);
        add(labelvolume);
        add(labellp);

        add(tombolhitung);
        add(tombolreset);


        judulprogram.setBounds(250,20,300,50);

        lebar.setBounds(50,70,150,25);
        fieldlebar.setBounds(180,70,270,25);

        panjang.setBounds(50,130,150,25);   
        fieldpanjang.setBounds(180,130,270,25);

        tinggi.setBounds(50,190,150,25);
        fieldtinggi.setBounds(180,190,270,25);

        hasiltext.setBounds(250,230,100,25);

        labelluas.setBounds(20,260,300,25);
        labelkeliling.setBounds(20,290,300,25);
        labelvolume.setBounds(20,320,300,25);
        labellp.setBounds(20,350,300,25);

        tombolhitung.setBounds(150,450,100,20);
        tombolreset.setBounds(350,450,100,20);


        tombolhitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double panjang = Double.parseDouble(fieldpanjang.getText());
                double lebar = Double.parseDouble(fieldlebar.getText());
                double tinggi = Double.parseDouble(fieldtinggi.getText());

                double luas =  panjang * lebar;
                double keliling = 2*(panjang + lebar);
                double volume = panjang * lebar * tinggi;
                double luasPermukaan = 2 * (panjang*lebar + panjang*tinggi + lebar*tinggi);


                labelluas.setText("Luas Persegi Panjang : " + luas);
                labelkeliling.setText("Keliling Persegi Panjang : " + keliling);
                labelvolume.setText("Volume Balok : " + volume);
                labellp.setText("Luas Permukaan Balok : " + luasPermukaan);
            }
        });

        tombolreset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldpanjang.setText("");
                fieldlebar.setText("");
                fieldtinggi.setText("");
                labelluas.setText("");
                labelkeliling.setText("");
                labelvolume.setText("");
                labellp.setText("");
            }
        });

        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
