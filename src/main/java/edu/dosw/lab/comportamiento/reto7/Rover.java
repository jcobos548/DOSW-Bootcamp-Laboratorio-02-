package edu.dosw.lab.comportamiento.reto7;

public class Rover {

    public String avanzar(int metros) {
        return "Rover avanza " + metros + " m";
    }

    public String retroceder(int metros) {
        return "Rover retrocede " + metros + " m";
    }

    public String recoger() {
        return "Muestra recogida";
    }

    public String soltar() {
        return "Muestra soltada";
    }

    public String grabar(int segundos) {
        return "Cámara grabando " + segundos + " s";
    }

    public String detenerCamara() {
        return "Cámara detenida";
    }

    public String perforar(int profundidad) {
        return "Taladro perfora " + profundidad + " cm";
    }

    public String retraerTaladro() {
        return "Taladro se retrae";
    }
}
