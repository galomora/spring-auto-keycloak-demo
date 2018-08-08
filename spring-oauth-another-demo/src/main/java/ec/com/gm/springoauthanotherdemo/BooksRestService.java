package ec.com.gm.springoauthanotherdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class BooksRestService {
	@RequestMapping(method = RequestMethod.GET, path="/books")
	public List<Book> searchBooks () {
		return Arrays.stream(new Book[] {
			new Book("In Search of Lost Time", "Proust, Marcel"),
			new Book("Don Quixote", "Cervantes, Miguel de"),
			new Book("Ulysses", "Joyce, Jaymes")
		}).collect(Collectors.toList());
	}
}
