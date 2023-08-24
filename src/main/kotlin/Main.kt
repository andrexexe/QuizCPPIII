fun main(args: Array<String>) {






    //when -> Switch Case

    var opc = 0
    var nota =0
    var i =0
    var suma =0.0
    var descuento =""

    val cali= arrayListOf<Double>()
    println("""Menu
        |1.Trayectos 
        |2.Lista de Notas
      
    """.trimMargin())
    opc= readln().toInt()



    when(opc){
        in 1..1-> {
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


            }


            else{
                println("""
        
        Cantidad de Trayectos : $trayectos
        
        Precio Trayectos: $total
        
        Total a pagar :$total  
        
        Tenga Buen Viaje   Empresa Andrex
   
    """.trimIndent())



            }


        }
        in 2..2 ->{


            println("Digite notas a ingresar ")
            val n =readln().toInt()
            for(i in 0 .. n){
                println(" ingrese nota:  ")
                 nota =readln().toInt()
            }
            println(i)
            println(nota)

/*
            val cali= arrayListOf<Double>(5.0,4.0,5.0,3.5)
            for (i in 0 .. cali.size-1){

                println(cali[i])
                suma =(cali[0]+cali[1]+cali[2]+cali[3])
            }
            println("suma :  $suma")
            var promedio = suma/4
            println(""" 
                Notas = $cali 
                1.Promedio de calificaicones = $promedio  
                2.Calificacion mas alta = en proceso
                3.Calificacion mas bajan = en proceso 
                4.Promedio calificaicones menor a 3.5 = en proceso 
                "si tarda demasiado intene mas tarde "
                
                
                
                
                
            """.trimIndent())

*/


        }











        else -> println("error de eleccion ")
    }



}