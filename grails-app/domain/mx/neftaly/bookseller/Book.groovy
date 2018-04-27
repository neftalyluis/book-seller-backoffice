package mx.neftaly.bookseller

class Book {

    String name
    String isbn
    Long price

    static constraints = {
        name nullable: false
        isbn nullable: false, unique: true
        price nullable: false
    }
}
