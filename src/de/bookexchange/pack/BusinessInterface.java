package de.bookexchange.pack;

public interface BusinessInterface {
	
	public boolean signInUser(User user);
	public void loginUser();
	public void logOutUser();
	public void showProfile();
	public void suggestExchange();
	public void editExchange();
	public void searchForBooks();
	public void showBookProfile();
	public void addBook();
	public void deleteBook();
	
	
}
