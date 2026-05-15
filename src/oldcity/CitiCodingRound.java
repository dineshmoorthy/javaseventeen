package oldcity;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CitiCodingRound {
	
	public static void main(String[] args) {
		
		// traversing list of list using java8
		List<Book> books = Arrays.asList(
			    new Book("Book A", new Author("Smith", 55)),
			    new Book("Book E", new Author("Brown", 60)),
			    new Book("Book B", new Author("Johnson", 65)),
			    new Book("Book F", new Author("Davis", 52)),
			    new Book("Book C", new Author("Williams", 45)),
			    new Book("Book D", new Author("Jones", 70)),
			    new Book("Book G", new Author("Miller", 48))
			);
		
		
		
			books.stream()
			    .map(Book::getAuthor)
			    .filter(author -> author.getAge() > 50)
			    .map(author -> author.getSurname().toUpperCase())
			    .limit(5)
			    .forEach(System.out::println);

	}

}

