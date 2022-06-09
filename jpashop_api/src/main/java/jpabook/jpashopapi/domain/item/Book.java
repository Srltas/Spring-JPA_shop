package jpabook.jpashopapi.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")
@Getter @Setter
public class Book extends Item {

    private String author;
    private String isbn;

    public static Book createBook(Item item, String author, String isbn) {
        Book book = new Book();

        book.setName(item.getName());
        book.setPrice(item.getPrice());
        book.setStockQuantity(item.getStockQuantity());
        book.setAuthor(author);
        book.setIsbn(isbn);

        return book;
    }
}
