fun main(){
    // print keyword prints the given text in the terminal
    // semicolan is optional in kotlin
    print("namaste kotlin");
    // println help to print text in next line
    println("namaste kotlin")
    // variables can be made with var and val keywords , var is mutable meaning which can be changed later
    // val keyword is immutable which means the variable value can be changed
    var temp:Int = 10
    // all the data type starts with cap letter
    temp = 30 // this shows var is mutable
    println(temp)
    val immutable:String = "i am not mutable"
    println(immutable)
    println("every thing needs to be put in main , main is kind of a interpreter")
    // data are not necessary always
    var test = "chatty is op"
    println(test)
    var num1 = 2
    var num2 = 30
    var sum:Int = num1+num2
    println("the sum of ${num1} and ${num2} is ${sum}")
    /*
    this is a multiline comment
     */
    /*
    Number - Integer - Decimal
    Integer - Byte , Short , Int
    Floating Point Number - Float , Double
    all these are classes so their name starts from capital letter
     */
    var a = "#"
    println(a)
    // arrayof helps to create array
    var ints = arrayOf(2,2,3,4,5,9,10)
    println(ints[1])
    println(ints.size)
    val emptystring_test = ""
    println(emptystring_test.lowercase())
    println(emptystring_test.isEmpty())
}

