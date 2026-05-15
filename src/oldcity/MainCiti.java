package oldcity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainCiti {

	public static void main(String[] args) {
		Book book1 = new Book("book1", new Author("Din", 67));
		Book book2 = new Book("book1", new Author("Emmett", 71));
		
		Book book3 = new Book("book1", new Author("Adithya", 45));
		
		List<Book> listbook = new ArrayList<Book>();
		
			listbook.add(book1);
			listbook.add(book2);
			listbook.add(book3);
		
		
		List<Book> result = distinctFirstAuthors(listbook);
		
		result.stream()
		.forEach(s -> System.out.println(s.getAuthor().getSurname().toUpperCase()));
		//.filter(s -> s.getAuthor().getSurname().toUpperCase())
	
	}

	public void runcode() {

	}

	public static List<Book> distinctFirstAuthors(List<Book> library) {
		return library.stream().filter(s -> s.getAuthor().getAge() > 50).limit(5).collect(Collectors.toList());
	}

	// first 5 book authors --> > 50 --> surname is same insertion order (in
	// uppercase)
}