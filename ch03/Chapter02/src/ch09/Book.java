package ch09;

public class Book {
	public static int length;
	private int totalPage;
	private String title;
	private String autor;
	
	public Book(String title, String autor) {
		this.title = title;
		this.autor = autor;
	}

	public Book(int toalPage, String title, String autor) {
		this(title, autor);
		this.totalPage = totalPage;
	}

	public int getTotalPage() {
		return this.totalPage;
	}

	public String getTitle() {
		return this.title;
	}

	public String getAutor() {
		return this.autor;
	}
	
	public void showInfo() {
		System.out.println(">>> 책정보 <<<");
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + autor);
	}

}
