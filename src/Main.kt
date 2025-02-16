
fun main() {
    val departamento = Departamento()
    departamento.agregarEmpleado(EmpleadoPorHora("Juan Pérez", 1, 160.0, 15.5))
    departamento.agregarEmpleado(EmpleadoFijo("Ana López", 2, 30000.0, 12))

    departamento.mostrarEmpleados()
    println("Salario total del departamento: %.2f".format(departamento.calculaSalarioTotal()))
}
