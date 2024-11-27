import java.util.Scanner;

/**
 * A library management class. Has a simple shell that users can interact with to add/remove/checkout/list books in the library.
 * Also allows saving the library state to a file and reloading it from the file.
 */
public class Library {


    /**
     * Adds a book to the library. If the library already has this 
     * book then it adds to the number of copies the library has.
     * @throws IllegalArgumentException no parts of book object can be empty or null
     * @param book a book object to be added
     * @author Anzac Houchen 
     * @author anzac.shelby@gmail.com
     * Print statements are for Debugging and should be commented out.
     */
    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book must not be null value.");
        }
        if (book.getTitle() == null || book.getTitle().isEmpty()) {
            throw new IllegalArgumentException("This book is missing a Title.");
        }
        if (book.getAuthor() == null || book.getAuthor().isEmpty()) {
            throw new IllegalArgumentException("Book is missing Author.");
        }
        if (book.getIsbn() == null || book.getIsbn().isEmpty()) {
            throw new IllegalArgumentException("ISBN can't be emtpy");
        }
        if (book.getPublicaitonYear() > 2025 || 
        book.getPublicationYear() < 0) {
            throw new IllegalArgumentException("Book is published in future?");
        }
        if (book.getNumberOfCopies() < 1) {
            throw new IllegalArgumentException("Number of copies must be 1 or more");
        }
        // Search for the book 
        Book alreadyAddedBook = bst.findByISBN(book.getIsbn());
        if (alreadyAddedBook != null) { // Book is already added
            // Update copies
            alreadyAddedBook.addCopies(book.getNumberOfCopies());
        }
        else { // Adding new book not already in Library to linked list
            Node newNode = new Node(book);
            newNode.next = head;
            head = newNode;
            // Add to binary search tree
            bst.add(book);
        }
        // Inform terminal of what has been done by this method for debug.
        System.out.println();
        System.out.println(book.getNumberOfCopies());
        System.out.print(" copies of " + book.getTitle());
        System.out.print(" were added. Total copies now ");
        System.out.print(alreadyAddedBook.getNumberOfCopies() + ".");
        System.out.println("ISBN: " + book.getIsbn());
    }

    /**
     * Checks out the given book from the library. Throw the appropriate
     * exception if book doesnt exist or there are no more copies available.
     */
    public void checkout(String isbn) {
        // TODO: Implement this method.
        throw new UnsupportedOperationException("not implemented");
    }

    /**
     * Returns a book to the library
     */
    public void returnBook(String isnb) {
        // TODO: Implement this method.
        throw new UnsupportedOperationException("not implemented");
    }

    /**
     * Finds this book in the library. Throws appropriate exception if the book
     * doesnt exist.
     */
    public Book findByTitleAndAuthor(String title, String author) {
        // TODO: Implement this method.
        throw new UnsupportedOperationException("not implemented");
    }

    /**
     * Finds this book in the library. Throws appropriate exception if the book
     * doesnt exist.
     */
    public Book findByISBN(String isbn) {
        // TODO: Implement this method.
        throw new UnsupportedOperationException("not implemented");
    }

    /**
     * Saves the contents of this library to the given file.
     */
    public void save(String filename) {
        // TODO: Implement this method.
        throw new UnsupportedOperationException("not implemented");
    }

    /**
     * Loads the contents of this library from the given file. All existing data
     * in this library is cleared before loading from the file.
     */
    public void load(String filename) {
        // TODO: Implement this method.
        throw new UnsupportedOperationException("not implemented");
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("library> ");
			String line = scanner.nextLine();
			// TODO: Implement code 
			if (line.startsWith("add")) {
				// TODO: Implement this case.
				// The format of the line is
				// add title author isbn publicationYear numberOfCopies
				// e.g. add Star_Trek Gene_Roddenberry ISBN-1234 1965 10
				// NOTE: If a book already exists in the library, then the number of copies should be incremented by this amount.
				// Do appropriate error checking here.
			} else if (line.startsWith("checkout")) {
				// TODO: Implement this case.
				// The format of the line is
				// checkout isbn
				// e.g. checkout ISBN-1234
				// NOTE: If the book doesnt exist in the library, then the code should print an error.
			} else if (line.startsWith("findByTitleAndAuthor")) {
				// TODO: Implement this case.
				// The format of the line is
				// findByTitleAndAuthor <title> <author>
				// e.g. findByTitleAndAuthor Star_Trek Gene_Roddenberry
				// NOTE: If the book doesnt exist in the library, then the code should print an error.
				// If the book exists in the library, this code should print the ISBN, number of copies in the library, and the number of copies availabvle
			} else if (line.startsWith("return")) {
				// TODO: Implement this case.
				// Format of the line is
				// return <isbn>
				// e.g. return ISBN-1234
				// NOTE: If the book was never checked out, this code should print an error.
			} else if (line.startsWith("list")) {
				// TODO: Implement this case.
				// Format of the line is 
				// list <isnb>
				// e.g. list ISBN-1234
				// NOTE: This code should print out the number of copies in the library and the number of copies available.
			} else if (line.startsWith("save")) {
				// TODO: Implement this case.
				// Format of the line is
				// save <filename>
				// e.g. save LbraryFile.dat
			} else if (line.startsWith("load")) {
				// TODO: Implement this case.
				// Format of the line is:
				// load <filename>
				// e.g. load LibraryFile.dat
			} else if (line.startsWith("exit")) {
				break;
			}
		}
	}
}