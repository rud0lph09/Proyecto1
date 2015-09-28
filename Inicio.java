class Inicio
{
   public int listaMenu()
   {
      int op;
      do 
      {
         op =Teclado.LeeEntero("1)Iniciar censo.\ln2)Consultar estadisticas.\ln3)Salir.\ln");
         if (op>3 || opcion<1)
         System.out.println("Error, opción no valida.");
      }
      while(op>7 || op<1);
      return op; 
   }
   public static void main(String []args)
   {
      int opcion;
      do 
      {
         opcion=listaMenu();
         switch(opcion)
            {
            case 1:
                  break;
            case 2:
                  break;
      }
      while(opcion>7);
}
