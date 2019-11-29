fun main() {
    var miComputadora = Computer(Cpu(), Mouse(), Screen())
    println(miComputadora.cpu)
    println(
        "Memoria de ${miComputadora.cpu.memory} Tb y ${miComputadora.cpu.memory} Tb de SSD y velocidad " +
                "de ${miComputadora.cpu.speed} Ghz, tiene un raton ${miComputadora.mouse.tipo} y " +
                "una pantalla ${miComputadora.screen.brand} de ${miComputadora.screen.inches} pulgadas"
    )
    println(miComputadora.toString())
    var mouseSurprise = Mouse("ay")
    println(mouseSurprise.tipo)
    var miComp = Computer(Cpu(), Mouse(), Screen())
    miComp.memory = 4000
    println(miComp.toString())
    
    /*Fin de la cita*/
}