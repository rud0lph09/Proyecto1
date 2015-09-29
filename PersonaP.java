class PersonaP{
private int edad;
private String genero,estudios,ocupacion, idioma;

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
genero=Teclado.LeeCadena("Genero: ");
}
public void LeeEstudios(){
estudios=Teclado.LeeCadena("Nivel maximo de estudios: ");
}
public void LeeOcupacion(){
ocupacion=Teclado.LeeCadena("Trabaja o Estudia: ");
}
public void Listar(){
System.out.print(edad+"\t"+genero+"\t"+estudios+"\t"+ocupacion);
}
public void LeeIdioma(){
int x;
idioma=Teclado.LeeCadena("Aparte del Español, ¿hablas algun otro idioma?\n1.-Si\n2.-No\n ");
if(idioma=="si" || idioma=="Si")
x=Teclado.LeeEntero("¿Cuantos?: ");
}
}
