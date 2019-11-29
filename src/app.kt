fun main() {
    val mouseA = Mouse()
    mouseA.color = "blanco"
    println(mouseA.toString())
    println(mouseA.color)
    val mouseB = Mouse("bluetooth")
    println(mouseB.toString())
    var miComputador = Computer("i5", Mouse())
    println("${miComputador.cpu} y ${miComputador.mouse.tipo}")
    println(miComputador.toString())
    var mouseSorpresa = Mouse("ay")
    println(mouseSorpresa.tipo)

//HOLA DAMIAN
}


