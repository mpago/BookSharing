package de.bookexchange.pack;

public class ShopController implements BusinessInterface{
	


	public ShopController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean signInUser(User user) {
		
		UserManager.createUser(user);
		return true;
		
	}

	@Override
	public void loginUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logOutUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void suggestExchange() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editExchange() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchForBooks() {
		BookManager.createBook();
		
	}

	@Override
	public void showBookProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBook() {
		// TODO Auto-generated method stub
		
	}



}
