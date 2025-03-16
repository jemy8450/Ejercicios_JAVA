/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_8;

/**
 *
 * @author segur
 */
public class Ejercicio_8 {

    public static void main(String[] args) {
        Notificable correo = new CorreoElectronicoClass();
        Notificable sms = new SMSClass();

        correo.enviarNotificacion(); // Salida: Enviando notificacion por correo electronico.
        sms.enviarNotificacion();     // Salida: Enviando notificacion por SMS.
    }
}
