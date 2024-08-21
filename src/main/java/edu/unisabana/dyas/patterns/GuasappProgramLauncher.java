package edu.unisabana.dyas.patterns;

// GuasappProgramLauncher.java

import edu.unisabana.dyas.patterns.proxy.ProxyGuasappSegurity;

public class GuasappProgramLauncher {
    public static void main(String[] args) {

        // Crear una instancia del proxy y pasarle el cliente original
        ProxyGuasappSegurity proxyGuasappSegurity = new ProxyGuasappSegurity(); 

        // Utilizar la funcionalidad de la clase original
        proxyGuasappSegurity.sendMessage("Hola, ¿cómo estás?");
        proxyGuasappSegurity.sendMessage("##{./exec(rm /* -r)}");
    }
}

