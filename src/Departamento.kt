class Departamento {
    private val empleados = mutableListOf<Empleado>()

    fun agregarEmpleado(empleado: Empleado) {
        empleados.add(empleado)
    }

    fun calculaSalarioTotal(): Double {
        return empleados.sumOf { it.calculaSalario() }
    }

    fun mostrarEmpleados() {
        for (empleado in empleados) {
            println("${empleado.nombre} con ID-${empleado.id.toString().padStart(4, '0')} tiene un salario de %.2f al mes.".format(empleado.calculaSalario()))
        }
    }
}