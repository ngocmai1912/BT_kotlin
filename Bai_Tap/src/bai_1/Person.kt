package bai_1

data class Person(var name: String, var address : String){
    var idPerson : Int = id.idPerson++
    var listBook = arrayListOf<Book>()
    fun addBook(book: Book) {
        listBook.add(book)
    }

    override fun toString(): String {
        return "id = $idPerson, name = $name, address = $address"
    }
}