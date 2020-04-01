package bai_1

object id{
    var idBook : Int = 1
    var idPerson : Int = 1
}

fun main(){
    var management : Management = Management()
    val book1 : Book = Book("Sach 1", "Van hoc", 6)
    val book2 : Book = Book("Sach 2", "Toan hoc", 10)
    management.addBook(book1)
    management.addBook(book2)
    val person1 : Person = Person("Mai", "Ba Vi")
    val person2 : Person = Person("Trang", "Ba Vi")
    management.addPerson(person1)
    management.addPerson(person2)
    for(i in management.listBook){
        println(i.toString())
    }
    for(i in management.listPerson){
        println(i.toString())
    }
    management.borrowBook(person1, book1)
    for(i in management.listBook){
        println(i.toString())
    }
    management.refundBook(person1, book1)
    for(i in management.listBook){
        println(i.toString())
    }
}
