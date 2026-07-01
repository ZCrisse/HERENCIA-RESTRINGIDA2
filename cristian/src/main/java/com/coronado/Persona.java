package com.coronado;
public abstract class Persona {


    public Persona(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    private String nombre;
    static int contadorId = 0; // Estático para mantener el ID correlativo entre instancias
    protected int id;
  
    {
        System.out.println("[Sistema] Cargando infraestructura de Persona...");
    }

    {
        System.out.println("[Persona] Inicializando datos básicos del individuo...");
    }
}