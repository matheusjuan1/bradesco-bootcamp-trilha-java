package list;

import java.util.ArrayList;
import java.util.List;

import model.Book;

public class ListBook {
    

    private List<Book> bookList;

    public ListBook() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(String title, String author, int year) {
        bookList.add(new Book(title, author, year));
    }

    public List<Book> searchByAuthor(String author){
        List<Book> listAuthor = new ArrayList<>();
        if(!bookList.isEmpty()) {
            for (Book b : bookList) {
                if(b.getAuthor().equalsIgnoreCase(author))
                    listAuthor.add(b);
            }
        }
        return listAuthor;
    }

    public List<Book> booksInYears(int initialYear, int endYear) {
        List<Book> yearsBooks = new ArrayList<>();
        if(!bookList.isEmpty()) {
            for (Book b : bookList) {
                if (b.getYear() >= initialYear && b.getYear() <= endYear)
                    yearsBooks.add(b);
            }
        }

        return yearsBooks;
    }

    public Book getBook(String title) {
        Book book = null;
        if(!bookList.isEmpty()) {
            for (Book b : bookList) {
                if (b.getTitle().equalsIgnoreCase(title))
                    book = b;
                    break;
            }
        }

        return book;
    }
}
