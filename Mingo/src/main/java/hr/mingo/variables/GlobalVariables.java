package hr.mingo.variables;

import java.util.Random;

public class GlobalVariables {
	
	protected static String browser = "Chrome";
	
	protected static String url = "https://www.mingo.hr";
	
	protected static int wait10 = 10;
	
	//1 - novinarski upit; 2 - informacije za graðanstvo; 3 - poslovi s poduzetnicima; 4 - informacije o zakonima i pravilnicima
	static int max = 4;
	static int min = 1;
	static Random r = new Random(); 
	protected static int domPitanja = (r.nextInt(max-min)+1);
	
	static int maxTip = 4;
	static int minTip = 1;
	static Random rt = new Random(); 
	protected static int tipPoruke = (rt.nextInt(maxTip-minTip)+1);
	
	protected static String poruka = "Lorem ipsum....";
	
	protected static String imeprezime = "Pero Periæ";
	
	protected static String kontakt = "098765543";
	
	protected static String email = "pero.peric@harakirimail.com";
	
	public int getDomPitanja() {
	    return GlobalVariables.domPitanja;
	}
	public void setDomPitanja(int value) {
	     GlobalVariables.domPitanja = value;
	}
	
	public int getTipPoruke() {
	    return GlobalVariables.tipPoruke;
	}
	public void setTipPoruke(int value) {
	     GlobalVariables.tipPoruke = value;
	}
	
	public String getPoruka() {
	    return poruka;
	}
	public void setPoruka(String value) {
	     poruka = value;
	}
	
	public String getImePrezime() {
	    return imeprezime;
	}
	public void setImePrezime(String value) {
	     imeprezime = value;
	}
	
	public String getKontakt() {
	    return kontakt;
	}
	public void setKontakt(String value) {
	     kontakt = value;
	}
	
	public String getEmail() {
	    return email;
	}
	public void setEmail(String value) {
	     email = value;
	}
}


