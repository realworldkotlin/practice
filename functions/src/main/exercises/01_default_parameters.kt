import java.util.Locale

fun sayHello(): String {
    return sayHello("World")
}

fun sayHello(name: String): String {
    return "Hello $name!"
}

fun sayHelloTwice(first: String): String {
    return sayHelloTwice(first, first.uppercase(Locale.getDefault()))
}

fun sayHelloTwice(first: String, second: String): String {
    return "Hello $first! $second?!"
}
