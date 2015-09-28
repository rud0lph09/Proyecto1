class Estadisticas
{
   public static int listaMenu()
   {
      int opcion;
      do
        {
            opcion=Teclado.LeeEntero("1)Ingresos promedio por familia.\ln 2)Promedio de nivel de estudios.\ln3)Porcentaje de personas que hablan más de un idioma.\ln4)Promedio de persona más vieja por familia.\ln5)Promedio de persona más joven por familia.\ln6)Porcentaje de personas que trabajan.\ln7)Porcentaje de personas que estudian.\ln8)Promedio de edad.\ln9)Promedio de personas por colonia.\ln10)Promedio de personas por delegación.\ln11)Porcentaje de hombres.\ln12)Porcentaje de mujeres.\ln13)Porcentaje de personas que tienen casa propia.\ln14)Porcentaje de personas que rentar su vivienda.\ln15)Salir.\ln");
            if (opcion>15 || opcion<1)
                System.out.println("Error, opncion no valida");
            switch(opcion)
            {
               case 1:
            }
        }while(opcion>15 || opcion<1);
        return opcion;
    }
    
}
