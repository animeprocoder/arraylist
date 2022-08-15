fun main(){
    val colors = arrayListOf("blue", "red", "blue", "green")
    println(colors.set(1,"redder"))
    println(colors.subList(1,2))
    colors.clear() // []
    println(colors.isEmpty()) //
    

}