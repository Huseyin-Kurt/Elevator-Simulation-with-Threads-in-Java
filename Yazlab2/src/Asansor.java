import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JLabel;

public class Asansor implements Runnable {
	
	ArrayList<Kuyruk> kuyruk;
	Thread thread;
	int mevcutKat,hedefKat;
	Arayuz arayuz;
	int tasinanKisi;
	int bekleyenKisi;
	boolean baslamismi;
	boolean aktifmi;
	Kat[] kat=new Kat[5];
	JLabel asansorYazi, asansorDurum,asansorMevcutKat,asansorHedefKat,asansorTasinanKisi;
	
	public Asansor(Arayuz arayuz,Kat kat1,Kat kat2,Kat kat3,Kat kat4,Kat kat5,JLabel asansorDurum,JLabel asansorMevcutKat,JLabel asansorHedefKat,JLabel asansorTasinanKisi,JLabel asansorYazi)
	{
		mevcutKat=0;
		hedefKat=0;
		tasinanKisi=0;
		bekleyenKisi=0;
		this.arayuz=arayuz;
		kuyruk=new ArrayList<Kuyruk>();
		baslamismi=false;
		aktifmi=false;
		
		kat[0]=new Kat();
		kat[0]=kat1;
		
		kat[1]=new Kat();
		kat[1]=kat2;
		
		kat[2]=new Kat();
		kat[2]=kat3;
		
		kat[3]=new Kat();
		kat[3]=kat4;
		
		kat[4]=new Kat();
		kat[4]=kat5;
		
		this.asansorDurum=asansorDurum;
		this.asansorHedefKat=asansorHedefKat;
		this.asansorMevcutKat=asansorMevcutKat;
		this.asansorTasinanKisi=asansorTasinanKisi;
		this.asansorYazi=asansorYazi;
		
		
		
	}
	
	public Asansor()
	{
	}
	

	@Override
	public void run() {
		
		while(true)
		{
				
			if(kuyruk.size()!=0)
			{	
				
				aktifmi=true;
				hedefKat=kuyruk.get(0).ilkGidilcek;
				boolean girismi=true;
				
				if(kuyruk.get(0).girismi==true)
				{
					synchronized (arayuz) {
						
						arayuz.setVisible(false);
						asansorDurum.setForeground(Color.green);
						asansorHedefKat.setForeground(Color.green);
						asansorHedefKat.setText(Integer.toString(hedefKat));
						asansorMevcutKat.setForeground(Color.green);
						asansorTasinanKisi.setForeground(Color.green);
						asansorYazi.setForeground(Color.green);
						girismi=true;
						arayuz.setVisible(true);
						
					}
				}
				
				else if(kuyruk.get(0).girismi==false)
				{
					arayuz.setVisible(false);
					asansorDurum.setForeground(Color.red);
					asansorHedefKat.setForeground(Color.red);
					asansorHedefKat.setText(Integer.toString(hedefKat));
					asansorMevcutKat.setForeground(Color.red);
					asansorTasinanKisi.setForeground(Color.red);
					asansorYazi.setForeground(Color.red);
					girismi=false;
					arayuz.setVisible(true);
				}
				
				
				while(mevcutKat>hedefKat)
				{
					mevcutKat--;
					
					synchronized (arayuz) {
						
						arayuz.setVisible(false);
						asansorMevcutKat.setText(Integer.toString(mevcutKat));
						asansorDurum.setText("Ýniyor");
						arayuz.setVisible(true);
						
						
					}
					
					try {
						thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				while(mevcutKat<hedefKat)
				{
					mevcutKat++;
					
					synchronized (arayuz) {
						
						arayuz.setVisible(false);
						asansorMevcutKat.setText(Integer.toString(mevcutKat));
						asansorDurum.setText("Çýkýyor");
						arayuz.setVisible(true);
						
						
					}
					
					try {
						thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
				if(girismi==true)
				{
					hedefKat=kuyruk.get(0).hedefKat;
					tasinanKisi=kuyruk.get(0).kisiSayisi;
					bekleyenKisi-=tasinanKisi;
				}
				
				else if(girismi==false)
				{	
					tasinanKisi=kuyruk.get(0).kisiSayisi;
					bekleyenKisi-=tasinanKisi;
					
					synchronized (kat[hedefKat-1]) {
						
						kat[hedefKat-1].kisiSayisi-=tasinanKisi;
						kat[hedefKat-1].kat.setText(Integer.toString(kat[hedefKat-1].kisiSayisi));
					}
					
					synchronized(arayuz)
					{
						arayuz.setVisible(false);
						arayuz.setVisible(true);
					}
					
					hedefKat=kuyruk.get(0).hedefKat;
				}
				
				kuyruk.remove(0);
				
				synchronized (arayuz) {
					
					arayuz.setVisible(false);
					asansorTasinanKisi.setText(Integer.toString(tasinanKisi));
					asansorHedefKat.setText(Integer.toString(hedefKat));
					arayuz.setVisible(true);
					
				}
				
				while(mevcutKat>hedefKat)
				{
					mevcutKat--;
					
					synchronized (arayuz) {
						
						arayuz.setVisible(false);
						asansorMevcutKat.setText(Integer.toString(mevcutKat));
						asansorDurum.setText("Ýniyor");
						arayuz.setVisible(true);
						
					}
					
					try {
						thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				while(mevcutKat<hedefKat)
				{
					mevcutKat++;
					
					synchronized (arayuz) {
						
						arayuz.setVisible(false);
						asansorMevcutKat.setText(Integer.toString(mevcutKat));
						asansorDurum.setText("Çýkýyor");
						arayuz.setVisible(true);
						
						
					}
					
					try {
						thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
					if(girismi==true)
					{
						synchronized(kat[hedefKat-1])
						{
							kat[hedefKat-1].kisiSayisi+=tasinanKisi;
							kat[hedefKat-1].inebilcekKisi+=tasinanKisi;
							kat[hedefKat-1].kat.setText(Integer.toString(kat[hedefKat-1].kisiSayisi));
						}
					}
					
			
					
					tasinanKisi=0;
					
					synchronized (arayuz) {
						
						arayuz.setVisible(false);
						asansorDurum.setForeground(Color.black);
						asansorDurum.setText("boþ");
						asansorHedefKat.setForeground(Color.black);
						asansorHedefKat.setText("");
						asansorMevcutKat.setForeground(Color.black);
						asansorTasinanKisi.setForeground(Color.black);
						asansorTasinanKisi.setText("0");
						asansorYazi.setForeground(Color.black);
						arayuz.setVisible(true);
						
					}
					
				
				
			}
			
			else
			{
				synchronized (thread) {
					
					aktifmi=false;
					
					try {
						thread.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	
	}

}
