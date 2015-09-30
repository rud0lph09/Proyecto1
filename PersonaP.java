class PersonaP
{
   private int edad, genero,estudios,ocupacion, idioma;
   public void CapturaPersona(){
      LeeEdad();
      LeeGenero();
      LeeEstudios();
      LeeOcupacion();
   }
   public void LeeEdad(){
      edad=Teclado.LeeEntero("Edad: ");
   }
   public void LeeGenero(){
      genero=Teclado.LeeEntero("Usted es: \n1.-Hombre\n2.-Mujer\n");
   }
   public void LeeEstudios(){
      estudios=Teclado.LeeEntero("Nivel maximo de estudios:\n1.-Primaria\n2.-Secundaria\n3.-Preparatoria\n4.-Licenciatura\n5.-Otro\n ");
   }
   public void LeeOcupacion(){
      ocupacion=Teclado.LeeEntero("¿A que se dedica?\n1.-Estudia\n2.-Trabaja\n");
   }
   public void Listar(){
      System.out.print(edad+"\t"+genero+"\t"+estudios+"\t"+ocupacion);
   }
   public void LeeIdioma(){
      int x;
      idioma=Teclado.LeeEntero("Aparte del Español, ¿hablas algun otro idioma?\n1.-Si\n2.-No\n ");
      if(idioma==1)
      x=Teclado.LeeEntero("¿Cuantos?: ");
   }
}
