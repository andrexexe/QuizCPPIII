fun main() {

    var opc: Int
    var opcion = 0
    var nota = 0
    var i = 0
    var suma = 0.0
    var descuento = ""











    do {
        println(
            """
            Menu de opciones
            1. Ejercicio 1
            2. Ejercicio 2
            3.  Salir
        """.trimIndent()
        )
        opc = readln().toInt()

        when (opc) {
            1 -> {

                val tarifa = 8500;


                println("Ingrese cantidad de Trayectos ")
                var trayectos = readln().toInt()
                var total = trayectos * tarifa



                println("Ingrese su edad por favor  ")
                var edad = readln().toInt()

                if (edad >= 60) {

                    println("Desea descuento ?  si o no  ")

                    descuento = readln();
                }
                if (descuento == "si") {
                    var des = total * 0.45
                    println(
                        """
        
        Cantidad de Trayectos : $trayectos
        
        Precio Trayectos: $total
        
        Precio con Descuento : $des
        
        Total a pagar :$des
        
        Tenga Buen Viaje   Empresa Andrex
   
        
    """.trimIndent()
                    )


                } else {
                    println(
                        """
        
        Cantidad de Trayectos : $trayectos
        
        Precio Trayectos: $total
        
        Total a pagar :$total  
        
        Tenga Buen Viaje   Empresa Andrex
   
    """.trimIndent()
                    )


                }
            }

            2 -> {

                val notas = arrayListOf<Double>()
                println("Digite la cantidad de notas")
                var cantnotas = 0
                cantnotas = readln().toInt()
                for (i in 1..cantnotas) {
                    println("Escriba  la nota:")
                    var calificacion = readln().toDouble()
                    notas.add(calificacion)
                }

                var suma = 0.0
                var sumag=0.0
                var contador = 0
                for (i in notas) {
                    if (i <= 3.5) {
                        suma = suma + i
                        contador = contador + 1
                    }
                }
                var promedio = suma / contador
                println("El promedio de las notas menores a 3.5 es = $promedio")


                for (i in notas) {

                    sumag = sumag + i
                }
                var promediogeneral = sumag / notas.size
                println("El promedio general de las notas es = $promediogeneral")



                var numeroMayor = 0.0
                for (calificacion in notas) {
                    if (calificacion > numeroMayor) {
                        numeroMayor = calificacion
                    }
                }

                println("Numero mayor $numeroMayor")

                var numeroMenor: Double = numeroMayor

                for (calificacion in notas) {
                    if (calificacion < numeroMenor) {
                        numeroMenor = calificacion
                    }
                }


                println("La nota menor es: $numeroMenor")
            }


        }


    }        while (opc != 3)

}