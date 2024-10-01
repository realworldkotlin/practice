import java.util.Locale

fun toCamelCase(value: String) = value.split(" ").map { capitalizeFirst(it) }.joinToString("")

private fun capitalizeFirst(value: String): String = value.take(1).capitalize() + value.drop(1)
    .lowercase(Locale.getDefault())


fun String.capitalize() = replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
