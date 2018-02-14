interface Modem {
	public String modemVersion = "V";
	public boolean open();                               
	public boolean close();
	public int read ();
	public int write(byte[] buffer);

	public static String myName() {
		return "Modem";

	}
}
