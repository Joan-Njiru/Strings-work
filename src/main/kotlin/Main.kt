fun main() {
    val school = "akirachix"
    println(school[0]+""+school[2]+school[3])

    var statement = record("Joan","23")
    println(statement)
    var stringLength = word("assignment")
    println(stringLength.length)
    gesturing("Adisa")
}


fun record(name:String,age:String):String{
    var statement = "Hi, my name is $name and I am $age years old"
    return statement
}
fun word(name: String):String{
    var stringLength = name
    return stringLength
}
fun gesturing(call:String){
    val name = "Wanjiru"
    if (name==call){
        println("That's me")}
    else{
        println("I don't know who that is")}
}
