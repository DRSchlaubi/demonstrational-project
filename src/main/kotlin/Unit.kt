@file:JvmName("UnitTest")

fun x() = Unit

fun x2() = "${x()}"

fun test(a: String): Nothing = TODO()

@OptIn(ExperimentalStdlibApi::class)
val x = buildList {
    add(1)
}

fun use() {
    test("")
}