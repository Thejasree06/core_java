class RemoteUnique
{
	public static void main(String[] args)
	{
		System.out.println("Stsrting main in RemoteUnique");
		Remote remote=new Remote(23,"onida",RemoteusedFor.volumelow);
		remote.on();
		remote.off();
		remote.increaseVolume();
		remote.decreaseVolume();
		remote.changeChannel();
		
		
		System.out.println("usedFor:"+remote.usedFor);
		System.out.println("totalButtons:"+remote.totalButtons);
		System.out.println("original:"+remote.original);
		
		LgRemote lgRemote=new LgRemote(2,10,RemoteusedFor.off,"yes",10);
		lgRemote.on();
		lgRemote.off();
		lgRemote.increaseVolume();
		lgRemote.decreaseVolume();
		lgRemote.changeChannel();
		
		lgRemote.voiceCommand();
		
		System.out.println("usedFor:"+lgRemote.usedFor);
		System.out.println("totalButtons:"+lgRemote.totalButtons);
		System.out.println("original:"+lgRemote.original);
		
		System.out.println("warrwnty:"+lgRemote.warrenty);
		System.out.println("totalBatteries:"+lgRemote.totalBatteries);
		
		
		
		
		
	}
	
}