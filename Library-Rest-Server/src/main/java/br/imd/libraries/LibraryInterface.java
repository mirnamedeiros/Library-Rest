package br.imd.libraries;

public interface LibraryInterface {

	public String searchForTitle(String title);
	
	public void borrow(String title, int days);
	
	public void returnCopie(String title, int days);
}
