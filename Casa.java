class Casa
{
   int []edad;
   int genero,hogar, nivelEs, integrantes, trabajadores, estudiantes;
   float ingresos;
   public void capInte()
   {
      integrantes=Teclado.LeeEntero("¿Cuántos integrantes conforman tu casa? ");
   }
   public void capEdad(int integrantes)
   {
      edad= new int[integrantes];
      for(int i=0; i<integrantes;i++)
         {
            edad[i]=Teclado.LeeEntero("Dame la edad del intrante "+(i+1)+": ");
         }
   }
   public void ocupacion()
   {
      estudiantes=Teclado.LeeEntero("¿Cuántos de los habitantes de su hogar estudian? ");
      trabajadores=Teclado.LeeEntero("¿Cuántos de los habitantes de su hogar trabajan? ");
   }
   public void capIngresos()
   {
      ingresos=Teclado.LeeReal(¿Cuáles son los ingresos mensuales de tu hogar? ");
   }
}
