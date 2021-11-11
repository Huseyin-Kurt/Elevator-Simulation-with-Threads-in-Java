import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Arayuz extends JPanel implements ActionListener {
	
	JLabel kat1Yazisi,kat2Yazisi,kat3Yazisi,kat4Yazisi,kat5Yazisi;
	JLabel kat1Sayi,kat2Sayi,kat3Sayi,kat4Sayi,kat5Sayi;
	
	JLabel asansor1Yazisi,asansor1DurumYazisi,asansor1MevcutKatYazisi,asansor1hedefKatYazisi,asansor1TasinanKisiYazisi;
	JLabel asansor1Durum,asansor1MevcutKat,asansor1HedefKat,asansor1TasinanKisi;
	
	JLabel asansor2Yazisi,asansor2DurumYazisi,asansor2MevcutKatYazisi,asansor2hedefKatYazisi,asansor2TasinanKisiYazisi;
	JLabel asansor2Durum,asansor2MevcutKat,asansor2HedefKat,asansor2TasinanKisi;
	
	JLabel asansor3Yazisi,asansor3DurumYazisi,asansor3MevcutKatYazisi,asansor3hedefKatYazisi,asansor3TasinanKisiYazisi;
	JLabel asansor3Durum,asansor3MevcutKat,asansor3HedefKat,asansor3TasinanKisi;
	
	JLabel asansor4Yazisi,asansor4DurumYazisi,asansor4MevcutKatYazisi,asansor4hedefKatYazisi,asansor4TasinanKisiYazisi;
	JLabel asansor4Durum,asansor4MevcutKat,asansor4HedefKat,asansor4TasinanKisi;
	
	JLabel asansor5Yazisi,asansor5DurumYazisi,asansor5MevcutKatYazisi,asansor5hedefKatYazisi,asansor5TasinanKisiYazisi;
	JLabel asansor5Durum,asansor5MevcutKat,asansor5HedefKat,asansor5TasinanKisi;
	
	JButton baslaButonu,durButonu;
	
	Kat kat1,kat2,kat3,kat4,kat5;
	Asansor a1,a2,a3,a4,a5;
	Thread t1,t2,t3,t4,t5,giris,cikis;
	GirisThread girisThread;
	CikisThread cikisThread;
	
	JFrame pencere;
	
	public Arayuz()
	{
		super();
		this.setLayout(null);
		
		
		pencere= new JFrame();
		pencere.setSize(1920, 1080);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		kat1Yazisi=new JLabel("1.kat:");
		kat1Yazisi.setBounds(100, 50, 100, 100);
		kat1Yazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		
		kat1Sayi=new JLabel("0");
		kat1Sayi.setBounds(150, 50, 100, 100);
		kat1Sayi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		kat2Yazisi=new JLabel("2.kat:");
		kat2Yazisi.setBounds(250, 50, 100, 100);
		kat2Yazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		
		kat2Sayi=new JLabel("0");
		kat2Sayi.setBounds(300, 50, 100, 100);
		kat2Sayi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		kat3Yazisi=new JLabel("3.kat:");
		kat3Yazisi.setBounds(400, 50, 100, 100);
		kat3Yazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		
		kat3Sayi=new JLabel("0");
		kat3Sayi.setBounds(450, 50, 100, 100);
		kat3Sayi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		kat4Yazisi=new JLabel("4.kat:");
		kat4Yazisi.setBounds(550, 50, 100, 100);
		kat4Yazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		
		kat4Sayi=new JLabel("0");
		kat4Sayi.setBounds(600, 50, 100, 100);
		kat4Sayi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		
		kat5Yazisi=new JLabel("5.kat:");
		kat5Yazisi.setBounds(700, 50, 100, 100);
		kat5Yazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		
		kat5Sayi=new JLabel("0");
		kat5Sayi.setBounds(750, 50, 100, 100);
		kat5Sayi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor1Yazisi=new JLabel("1.Asansor");
		asansor1Yazisi.setBounds(100, 200, 100, 100);
		asansor1Yazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor1DurumYazisi=new JLabel("Durum:");
		asansor1DurumYazisi.setBounds(100,300,100,100);
		asansor1DurumYazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor1Durum=new JLabel("boþ");
		asansor1Durum.setBounds(200, 300, 100, 100);
		asansor1Durum.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor1MevcutKatYazisi=new JLabel("Mevcut Kat:");
		asansor1MevcutKatYazisi.setBounds(100,400,200,100);
		asansor1MevcutKatYazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor1MevcutKat=new JLabel("0");
		asansor1MevcutKat.setBounds(250, 400, 200, 100);
		asansor1MevcutKat.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor1hedefKatYazisi=new JLabel("Hedef Kat:");
		asansor1hedefKatYazisi.setBounds(100,500,200,100);
		asansor1hedefKatYazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor1HedefKat=new JLabel("");
		asansor1HedefKat.setBounds(250, 500, 200, 100);
		asansor1HedefKat.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor1TasinanKisiYazisi=new JLabel("Taþýnan kiþi:");
		asansor1TasinanKisiYazisi.setBounds(100,600,200,100);
		asansor1TasinanKisiYazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor1TasinanKisi=new JLabel("0");
		asansor1TasinanKisi.setBounds(250, 600, 200, 100);
		asansor1TasinanKisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		
		
		asansor2Yazisi=new JLabel("2.Asansor");
		asansor2Yazisi.setBounds(400, 200, 100, 100);
		asansor2Yazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor2DurumYazisi=new JLabel("Durum:");
		asansor2DurumYazisi.setBounds(400,300,100,100);
		asansor2DurumYazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor2Durum=new JLabel("boþ");
		asansor2Durum.setBounds(500, 300, 100, 100);
		asansor2Durum.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor2MevcutKatYazisi=new JLabel("Mevcut Kat:");
		asansor2MevcutKatYazisi.setBounds(400,400,200,100);
		asansor2MevcutKatYazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor2MevcutKat=new JLabel("0");
		asansor2MevcutKat.setBounds(550, 400, 200, 100);
		asansor2MevcutKat.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor2hedefKatYazisi=new JLabel("Hedef Kat:");
		asansor2hedefKatYazisi.setBounds(400,500,200,100);
		asansor2hedefKatYazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor2HedefKat=new JLabel("");
		asansor2HedefKat.setBounds(550, 500, 200, 100);
		asansor2HedefKat.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor2TasinanKisiYazisi=new JLabel("Taþýnan kiþi:");
		asansor2TasinanKisiYazisi.setBounds(400,600,200,100);
		asansor2TasinanKisiYazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor2TasinanKisi=new JLabel("0");
		asansor2TasinanKisi.setBounds(550, 600, 400, 100);
		asansor2TasinanKisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		
		asansor3Yazisi=new JLabel("3.Asansor");
		asansor3Yazisi.setBounds(700, 200, 100, 100);
		asansor3Yazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor3DurumYazisi=new JLabel("Durum:");
		asansor3DurumYazisi.setBounds(700,300,100,100);
		asansor3DurumYazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor3Durum=new JLabel("boþ");
		asansor3Durum.setBounds(800, 300, 100, 100);
		asansor3Durum.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor3MevcutKatYazisi=new JLabel("Mevcut Kat:");
		asansor3MevcutKatYazisi.setBounds(700,400,200,100);
		asansor3MevcutKatYazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor3MevcutKat=new JLabel("0");
		asansor3MevcutKat.setBounds(850, 400, 200, 100);
		asansor3MevcutKat.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor3hedefKatYazisi=new JLabel("Hedef Kat:");
		asansor3hedefKatYazisi.setBounds(700,500,200,100);
		asansor3hedefKatYazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor3HedefKat=new JLabel("");
		asansor3HedefKat.setBounds(850, 500, 200, 100);
		asansor3HedefKat.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor3TasinanKisiYazisi=new JLabel("Taþýnan kiþi:");
		asansor3TasinanKisiYazisi.setBounds(700,600,200,100);
		asansor3TasinanKisiYazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor3TasinanKisi=new JLabel("0");
		asansor3TasinanKisi.setBounds(850, 600, 400, 100);
		asansor3TasinanKisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor4Yazisi=new JLabel("4.Asansor");
		asansor4Yazisi.setBounds(1000, 200, 100, 100);
		asansor4Yazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor4DurumYazisi=new JLabel("Durum:");
		asansor4DurumYazisi.setBounds(1000,300,100,100);
		asansor4DurumYazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor4Durum=new JLabel("boþ");
		asansor4Durum.setBounds(1100, 300, 100, 100);
		asansor4Durum.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor4MevcutKatYazisi=new JLabel("Mevcut Kat:");
		asansor4MevcutKatYazisi.setBounds(1000,400,200,100);
		asansor4MevcutKatYazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor4MevcutKat=new JLabel("0");
		asansor4MevcutKat.setBounds(1150, 400, 200, 100);
		asansor4MevcutKat.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor4hedefKatYazisi=new JLabel("Hedef Kat:");
		asansor4hedefKatYazisi.setBounds(1000,500,200,100);
		asansor4hedefKatYazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor4HedefKat=new JLabel("");
		asansor4HedefKat.setBounds(1150, 500, 200, 100);
		asansor4HedefKat.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor4TasinanKisiYazisi=new JLabel("Taþýnan kiþi:");
		asansor4TasinanKisiYazisi.setBounds(1000,600,200,100);
		asansor4TasinanKisiYazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor4TasinanKisi=new JLabel("0");
		asansor4TasinanKisi.setBounds(1150, 600, 400, 100);
		asansor4TasinanKisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		
		asansor5Yazisi=new JLabel("5.Asansor");
		asansor5Yazisi.setBounds(1300, 200, 100, 100);
		asansor5Yazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor5DurumYazisi=new JLabel("Durum:");
		asansor5DurumYazisi.setBounds(1300,300,100,100);
		asansor5DurumYazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor5Durum=new JLabel("boþ");
		asansor5Durum.setBounds(1400, 300, 100, 100);
		asansor5Durum.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor5MevcutKatYazisi=new JLabel("Mevcut Kat:");
		asansor5MevcutKatYazisi.setBounds(1300,400,200,100);
		asansor5MevcutKatYazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor5MevcutKat=new JLabel("0");
		asansor5MevcutKat.setBounds(1450, 400, 200, 100);
		asansor5MevcutKat.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor5hedefKatYazisi=new JLabel("Hedef Kat:");
		asansor5hedefKatYazisi.setBounds(1300,500,200,100);
		asansor5hedefKatYazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor5HedefKat=new JLabel("");
		asansor5HedefKat.setBounds(1450, 500, 200, 100);
		asansor5HedefKat.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor5TasinanKisiYazisi=new JLabel("Taþýnan kiþi:");
		asansor5TasinanKisiYazisi.setBounds(1300,600,200,100);
		asansor5TasinanKisiYazisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		asansor5TasinanKisi=new JLabel("0");
		asansor5TasinanKisi.setBounds(1450, 600, 400, 100);
		asansor5TasinanKisi.setFont(new Font("Arial", Font.PLAIN, 20));
		
		
		baslaButonu=new JButton("basla");
		baslaButonu.addActionListener(this);
		baslaButonu.setFont(new Font("Arial", Font.PLAIN, 40));
		baslaButonu.setBackground(Color.cyan);
		baslaButonu.setBounds(1500, 300, 200, 200);
		
		durButonu=new JButton("Dur");
		durButonu.addActionListener(this);
		durButonu.setFont(new Font("Arial", Font.PLAIN, 40));
		durButonu.setBackground(Color.yellow);
		durButonu.setBounds(1500, 300, 200, 200);
		
		
		
		
		this.setBackground(Color.white);
		this.add(kat1Yazisi);
		this.add(kat1Sayi);
		this.add(kat2Yazisi);
		this.add(kat2Sayi);
		this.add(kat3Yazisi);
		this.add(kat3Sayi);
		this.add(kat4Yazisi);
		this.add(kat4Sayi);
		this.add(kat5Yazisi);
		this.add(kat5Sayi);
		this.add(asansor1Yazisi);
		this.add(asansor1DurumYazisi);
		this.add(asansor1Durum);
		this.add(asansor1MevcutKatYazisi);
		this.add(asansor1MevcutKat);
		this.add(asansor1hedefKatYazisi);
		this.add(asansor1HedefKat);
		this.add(asansor1TasinanKisiYazisi);
		this.add(asansor1TasinanKisi);
		this.add(asansor2Yazisi);
		this.add(asansor2DurumYazisi);
		this.add(asansor2Durum);
		this.add(asansor2MevcutKatYazisi);
		this.add(asansor2MevcutKat);
		this.add(asansor2hedefKatYazisi);
		this.add(asansor2HedefKat);
		this.add(asansor2TasinanKisiYazisi);
		this.add(asansor2TasinanKisi);
		this.add(asansor3Yazisi);
		this.add(asansor3DurumYazisi);
		this.add(asansor3Durum);
		this.add(asansor3MevcutKatYazisi);
		this.add(asansor3MevcutKat);
		this.add(asansor3hedefKatYazisi);
		this.add(asansor3HedefKat);
		this.add(asansor3TasinanKisiYazisi);
		this.add(asansor3TasinanKisi);
		this.add(asansor4Yazisi);
		this.add(asansor4DurumYazisi);
		this.add(asansor4Durum);
		this.add(asansor4MevcutKatYazisi);
		this.add(asansor4MevcutKat);
		this.add(asansor4hedefKatYazisi);
		this.add(asansor4HedefKat);
		this.add(asansor4TasinanKisiYazisi);
		this.add(asansor4TasinanKisi);
		this.add(asansor5Yazisi);
		this.add(asansor5DurumYazisi);
		this.add(asansor5Durum);
		this.add(asansor5MevcutKatYazisi);
		this.add(asansor5MevcutKat);
		this.add(asansor5hedefKatYazisi);
		this.add(asansor5HedefKat);
		this.add(asansor5TasinanKisiYazisi);
		this.add(asansor5TasinanKisi);
		this.add(baslaButonu);
		
		
		kat1=new Kat(1,kat1Sayi);
		kat2=new Kat(2,kat2Sayi);
		kat3=new Kat(3,kat3Sayi);
		kat4=new Kat(4,kat4Sayi);
		kat5=new Kat(5,kat5Sayi);
		
		a1=new Asansor(this, kat1, kat2, kat3, kat4, kat5,asansor1Durum,asansor1MevcutKat,asansor1HedefKat,asansor1TasinanKisi,asansor1Yazisi);
		a2=new Asansor(this, kat1, kat2, kat3, kat4, kat5,asansor2Durum,asansor2MevcutKat,asansor2HedefKat,asansor2TasinanKisi,asansor2Yazisi);
		a3=new Asansor(this, kat1, kat2, kat3, kat4, kat5,asansor3Durum,asansor3MevcutKat,asansor3HedefKat,asansor3TasinanKisi,asansor3Yazisi);
		a4=new Asansor(this, kat1, kat2, kat3, kat4, kat5,asansor4Durum,asansor4MevcutKat,asansor4HedefKat,asansor4TasinanKisi,asansor4Yazisi);
		a5=new Asansor(this, kat1, kat2, kat3, kat4, kat5,asansor5Durum,asansor5MevcutKat,asansor5HedefKat,asansor5TasinanKisi,asansor5Yazisi);
		
		
		
		t1=new Thread(a1);
		t2=new Thread(a2);
		t3=new Thread(a3);
		t4=new Thread(a4);
		t5=new Thread(a5);
		
		girisThread=new GirisThread(t1, t2, t3, t4, t5, a1, a2, a3, a4, a5);
		cikisThread=new CikisThread(t1, t2, t3, t4, t5, a1, a2, a3, a4, a5);
		
		giris=new Thread(girisThread);
		cikis=new Thread(cikisThread);
		
		girisThread.girisThread=giris;
		cikisThread.cikisThread=cikis;
		a1.thread=t1;
		a2.thread=t2;
		a3.thread=t3;
		a4.thread=t4;
		a5.thread=t5;
		
		
		pencere.add(this);
		pencere.setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getActionCommand().equals("basla"))
		{	
			this.setVisible(false);
			this.remove(baslaButonu);
			this.setVisible(true);
			
			giris.start();
			cikis.start();	
		}
		
		
	}
	
	

}
