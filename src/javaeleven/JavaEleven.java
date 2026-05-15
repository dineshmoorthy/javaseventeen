package javaeleven;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;

public class JavaEleven {

	public static void main(String[] args) throws IOException {
		
		// var for local variables
		
		var varlist = List.of("A", "B", "C");  // compiler infers List<String>
		for (var item : varlist) {
		    System.out.println(item);
		}

		
		// in string new methods 
		
		List<String> list = List.of("a", "bb", "ccc");

		list.forEach((var item) -> {
		    System.out.println(item.toUpperCase());
		});

		
		System.out.println("   ".isBlank()); // true

		
		String multiline = "Java\nPython\nC++";
		multiline.lines().forEach(System.out::println);

		// Java 11 adds a few new methods to the String class: isBlank, lines, strip, stripLeading, stripTrailing, and repeat.
		System.out.println("  hello  ".strip());         // "hello"
		System.out.println("  hello  ".stripLeading());  // "hello  "
		System.out.println("  hello  ".stripTrailing()); // "  hello"

		
		System.out.println("Java".repeat(3)); // JavaJavaJava



				
		Path path = Path.of("example.txt");

		// Write to file
		Files.writeString(path, "Java 11 file write demo");

		// Read from file
		String content = Files.readString(path);
		System.out.println(content);
		
		
	//	Path filePath = Files.writeString(Files.createTempFile(tempDir, "demo", ".txt"), "Sample text");
	//	String fileContent = Files.readString(filePath);
		
		// how to convert list to array 
		String[] arr = list.toArray(new String[list.size()]);
		// java 11
		// remember below syntax
		String[] arr2 = list.toArray(String[]::new);
		
		//  The java.util.Collection interface contains a new default toArray method which takes an IntFunction argument.

		//	This makes it easier to create an array of the right type from a collection:
		
		System.out.println("1: "+arr);
		System.out.println("2: "+arr2);
		
		
		// is empty returns false for whitespace 
		
		System.out.println("Example text".isEmpty());
		System.out.println("".isEmpty());
	    System.out.println("  ".isEmpty());
	    System.out.println("\t\n\r\f".isEmpty());
	    
	    // is identical to isEmpty() with the nuance that it also returns true for Strings that contain only whitespace characters.
	    
	    System.out.println(".............."+"Example text".isBlank());
	    System.out.println("".isBlank());
	    System.out.println("  ".isBlank());
	    System.out.println("\t\n\r\f ".isBlank());
	    
	    
	    String str11 = "    baeldung is a java       \n \n deveolper \n exploer java";
	    
	    List<String> ho = str11.lines()
	    		.filter(s -> !s.isBlank())
	    		.map(String::strip)
	    		.collect(Collectors.toList());
	    
	    ho.stream().forEach(System.out::println);
	    
	    // trim vs strip java
	    
	    // trim() removes a single leading white space and a single trailing white space, but does not remove multiple leading or trailing white spaces. strip() removes both leading and trailing white spaces from a string.
	    
	    
	    List<String> strm = str11.lines()
	    		.filter(s -> !s.isBlank())
	    		.map(String::trim)
	    		.collect(Collectors.toList());
	    
	    ho.stream().forEach(System.out::println);
	    System.out.println("strip: "+str11.strip());
	    System.out.println("trim: "+str11.trim());
	    
	    List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
	    List withoutBlanks = sampleList.stream()
	      .filter(Predicate.not(String::isBlank))
	      .collect(Collectors.toList());
	    
	    System.out.println("not predicate: "+withoutBlanks);
	    
	    

        // Using Predicate.not with a lambda
	    // remember below syntax
		List notpredicatelambda = sampleList.stream().filter(Predicate.not(s -> s.trim().isEmpty()))
				.collect(Collectors.toList());
		System.out.println("not predicate lamdb: " + notpredicatelambda);

	    List<String> sampleList2 = Arrays.asList("Java", "Kotlin");
	    String resultString = sampleList2.stream()
	      .map(( var x) -> x.toUpperCase())
	      .collect(Collectors.joining(", "));
	    
	    System.out.println("result: "+resultString);
	    
	  
	    List<String> names = List.of("A", "B", "C");

	 // remember below syntax
	    List<String> unmod = names.stream()
	                              .collect(Collectors.toUnmodifiableList());

	    System.out.println("unmod: "+unmod);
	  //  names.add("D"); // Throws UnsupportedOperationException
	    System.out.println(names);
	    unmod.add("D"); // Throws UnsupportedOperationException

	    
	    /*
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
		    .uri(URI.create("https://api.github.com"))
		    .build();

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());

	*/
		
	}
}
