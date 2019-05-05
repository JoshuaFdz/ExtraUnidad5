package com.example.extra;

public class estudiantes {
    private String NoControlAl;
    private String NombreAl;
    private String ApeMaterno;
    private String ApePaterno;
    private String Grupo;

    public estudiantes ()
    {

    }

    public estudiantes(String noControlAl, String nombreAl) {
        NoControlAl = noControlAl;
        NombreAl = nombreAl;
    }


    public String getNoControlAl() {
        return NoControlAl;
    }

    public void setNoControlAl(String noControlAl) {
        NoControlAl = noControlAl;
    }

    public String getNombreAl() {
        return NombreAl;
    }

    public void setNombreAl(String nombreAl) {
        NombreAl = nombreAl;
    }

    public String getApeMaterno() {
        return ApeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        ApeMaterno = apeMaterno;
    }

    public String getApePaterno() {
        return ApePaterno;
    }

    public void setApePaterno(String apePaterno) {
        ApePaterno = apePaterno;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String grupo) {
        Grupo = grupo;
    }
}
