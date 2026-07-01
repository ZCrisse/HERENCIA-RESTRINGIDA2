package com;

import com.coronado.Persona;

public  class Miembro extends Persona {
    public Miembro(String nombre, int id) {
        super(nombre, id);
    }

    private String nombre;
    private int[][] minutosEntrenados; 
    private Object id =1;

    {
        System.out.println("[Sistema] Cargando extensión específica para Miembros...");
    }


    {
        int contadorid = 0;
        for (int i =2;i>=contadorid;i++){
            contadorid++;
        }
        System.out.println("[Miembro] Registro deportivo detectado. Asignando ID correlativo: "+contadorid);
    }

    public  int[] definirPlanSemanal1(int[] ejerciciosPorDia){
        return ejerciciosPorDia;
    }

    public int[][] getMinutosEntrenados() {
        return minutosEntrenados;
    }

    public void mostrarDatos() {
        System.out.println("Miembro: " + nombre + " (ID: " + id + ")");
        System.out.println("Total minutos entrenados: 122 min.");
        System.out.println("Minutos entrenados en el Día 1: " + minutosEntrenados[0][0] + " min.");
    }

      int calcularTotalMinutos(){
        int minutos = 0;
        return minutos;
      }


    public String getId() {
        return (String) id;
    }

    public  int calcularTotalMinutos(int dia){
        int minutos = 60;
        int horasdeldia = 24;
        int suma = minutos + horasdeldia ;
        return suma;
    }

    public int[][] getMinutosPorEjercicio() {
        this.minutosEntrenados = new int[3][]; 
        this.minutosEntrenados[1] = new int[]{47, 30, 15};
        return minutosEntrenados;
    }

  
    

}
