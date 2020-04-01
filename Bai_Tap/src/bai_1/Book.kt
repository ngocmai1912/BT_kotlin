package bai_1

data class Book(val name: String, val categoryBook: String, var amount : Int){
    var idBook : Int = id.idBook++
    override fun toString(): String {
        return "id = $idBook, name = $name, categoryBook = $categoryBook, amount = $amount"
    }
}