package kadai15;

public class AcAdapter extends Dengen {
	private JapaneseConsent jc;
	
	public AcAdapter(){
		jc = new JapaneseConsent();
	}
	
	public int kyuuden() {		
		return (int)(jc.power() * 0.16);
	}

}
