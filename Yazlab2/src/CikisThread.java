public class CikisThread implements Runnable {
	
	Thread[] thread=new Thread[5];
	Asansor[] asansor=new Asansor[5];
	Thread cikisThread;
	
	
	public CikisThread(Thread t1,Thread t2,Thread t3,Thread t4,Thread t5,Asansor a1,Asansor a2,Asansor a3,Asansor a4,Asansor a5)
	{	
		
		thread[0]=new Thread();
		thread[0]=t1;
		
		thread[1]=new Thread();
		thread[1]=t2;
		
		thread[2]=new Thread();
		thread[2]=t3;
		
		thread[3]=new Thread();
		thread[3]=t4;
		
		thread[4]=new Thread();
		thread[4]=t5;
		
		asansor[0]=new Asansor();
		asansor[0]=a1;
		
		asansor[1]=new Asansor();
		asansor[1]=a2;
		
		asansor[2]=new Asansor();
		asansor[2]=a3;
		
		asansor[3]=new Asansor();
		asansor[3]=a4;
		
		asansor[4]=new Asansor();
		asansor[4]=a5;
		
	}


	@Override
	public void run() {
		
		while(true)
		{
			int hedefKat=(int) (Math.random()*5)+1;
			int kisiSayisi=(int) (Math.random()*5)+1;
			boolean basarilimi=false;
			
			synchronized (asansor[0]) {
				
				synchronized (asansor[0].kat[hedefKat-1]) {
					
					if(kisiSayisi<=asansor[0].kat[hedefKat-1].inebilcekKisi)
					{	
						basarilimi=true;
						asansor[0].kat[hedefKat-1].inebilcekKisi-=kisiSayisi;
					}
					
				}
				
			}
			
			
			if(basarilimi==true)
			{
				Kuyruk yeniKuyruk=new Kuyruk(0, kisiSayisi,hedefKat, false);
				
				int i=0;
				
				while(i<4)
				{	
					synchronized(asansor[i])
					{
						if(asansor[i].bekleyenKisi+kisiSayisi>20)
						{
							i++;
						}
						
						else
						{
							break;
						}
					}
					
				}
				
				
				
				synchronized (asansor[i]) {
					
					asansor[i].bekleyenKisi+=kisiSayisi;
					asansor[i].kuyruk.add(yeniKuyruk);
					
					if(asansor[i].baslamismi==false)
					{	
						synchronized(thread[i])
						{
							thread[i].start();
						}
						asansor[i].baslamismi=true;
					}
					
					if(asansor[i].baslamismi==true&&asansor[i].aktifmi==false)
					{
						synchronized (thread[i]) {
							
							thread[i].notify();
							
						}
					}

					
				}
				
			
			}
			
			
			try {
				cikisThread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}
		
		
	}
	
}