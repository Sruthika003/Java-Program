package day7Exercixe;

interface Searchable{
	boolean search(String keyword);
}
class Document{
	  final String text;
	  public Document(String text){
		  this.text = text;
	  }
	public boolean search(String keyword) {
		return text.contains(keyword);
	}
}
class WebPage{
	final String webText;
	public WebPage(String webText) {
		this.webText = webText;
	}
	public boolean search(String keyword) {
		return webText.contains(keyword);
	}
}
public class SearchableInterface {

	public static void main(String[] args) {
		Document doc = new Document("this is document");
		System.out.println("the document conatins "+ doc.search("is"));
		WebPage web = new WebPage("this is web page document");
		System.out.println("this web page contain "+ web.search("web"));
		

	}

}
