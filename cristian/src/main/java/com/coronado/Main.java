package com.coronado;

import com.Miembro;

public class Main {
 public static void main(String[] args) {
// 1. Demostración de jerarquía de carga con Herencia
System.out.println("--- 1. Carga de Clases e Instanciación con Herencia ---");
Miembro miembro1 = new Miembro("Carlos Mendoza", 1);
System.out.println("\n--- Creación de un Segundo Objeto (Lo estático no se repite) ---");
Miembro miembro2 = new Miembro("Ana Gómez", 2);
System.out.println();
// 2. Configuración de Arreglos Asimétricos
System.out.println("--- 2. Configuración de Arreglo Asimétrico Semanal ---");
int[] planCarlos = {2, 3, 1}; // Rutina de 3 días con 2, 3 y 1 ejercicios
miembro1.definirPlanSemanal1(planCarlos);
int[][] datosMinutos = (int[][]) miembro1.getMinutosPorEjercicio();
datosMinutos[0][0] = 15; datosMinutos[0][1] = 20; // Día 0
datosMinutos[1][0] = 10; datosMinutos[1][1] = 12; datosMinutos[1][2] = 25; // Día 1
datosMinutos[2][0] = 40; // Día 2
// 3. Comprobación de Cálculos y Sobrecarga
System.out.println("Miembro: " + miembro1.getNombre() + " (ID: " + miembro1.getId() + ")");
System.out.println("Total minutos entrenados: " + miembro1.calcularTotalMinutos(1) + " min.");
System.out.println("Minutos entrenados en el Día 1: " + miembro1.calcularTotalMinutos(1) + " min.");
System.out.println();
// 4. Polimorfismo basado en interfaces
System.out.println("--- 3. Procesamiento de Pagos Polimórficos ---");
double mensualidad = 45.50;
MetodoPago pasarela;
pasarela = (MetodoPago) new PagoTarjeta();
pasarela.procesarPago(mensualidad);
pasarela = (MetodoPago) new PagoTransferencia();
pasarela.procesarPago(mensualidad);
}
}