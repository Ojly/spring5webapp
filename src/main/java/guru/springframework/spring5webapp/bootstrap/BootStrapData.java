package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("Started in Bootstrap");

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "53422334");
        Publisher publisher = new Publisher("Wydawnictwo heheszek", "Krzywa 22","Lodz" ,"Lodzkie", "91-700");
        publisherRepository.save(publisher);

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        publisher.getBooks().add(ddd);
        ddd.setPublisher(publisher);
        publisher.getBooks().add(noEJB);
        noEJB.setPublisher(publisher);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

//        System.out.println("Number of books: " + bookRepository.count());
//        System.out.println("Number of authors: " + authorRepository.count());
//        System.out.println("Number of publishers: " + publisherRepository.count());
    }
}
