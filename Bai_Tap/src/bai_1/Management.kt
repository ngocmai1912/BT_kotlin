package bai_1

class Management{
    var listBook = arrayListOf<Book>()
    var listPerson = arrayListOf<Person>()
    fun addBook(book: Book){
        listBook.add(book)
    }
    fun addPerson(person: Person){
        listPerson.add(person)
    }
    fun borrowBook(person: Person, book: Book){
        person.addBook(book)
        book.amount--
    }
    fun refundBook(person: Person, book: Book){
        person.listBook.remove(book)
        book.amount++
    }
}