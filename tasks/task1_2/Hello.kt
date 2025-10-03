fun main (args:Array<String>){
    if (args.isNotEmpty()){
        println(greetingsFor(args[0]))
    }
    else{
        println(greetingsFor("World"))
    }
}
