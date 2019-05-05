package com.example.extra;

/**
 * Created by CHENAO on 7/05/2017.
 */

public class Utilidades {

    //Constantes campos tabla usuario
    public static final String TABLA_USUARIO="usuario";
    public static final String CAMPO_NOCONTROL="nocontrol";
    public static final String CAMPO_NOMBRE="nombre";
    public static final String CAMPO_APATERNO="apaterno";
    public static final String CAMPO_AMATERNO="amaterno";
    public static final String CAMPO_GRUPO="grupo";

    public static final String CREAR_TABLA_USUARIO="CREATE TABLE " + ""+TABLA_USUARIO+" ("+CAMPO_NOCONTROL+" " + "TEXT, "+CAMPO_NOMBRE+" TEXT,"+CAMPO_APATERNO+" TEXT,"+CAMPO_AMATERNO+" TEXT,"+CAMPO_GRUPO+" TEXT)";

}
