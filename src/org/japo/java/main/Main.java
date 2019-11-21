/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static void main(String[] args) {

        //Constantes
        final double DINERO_INICIAL = 2.00;
        final double PRECIO_PELICULA = 1.30;
        final double PARTE_PALOMITAS = 0.45;

        //Variables
        double gastosPersona = PRECIO_PELICULA + PARTE_PALOMITAS;
        double dineroRestante = DINERO_INICIAL - gastosPersona;

        //Cabecera
        System.out.println("Secuencia de Kung-Fu");
        System.out.println("====================");

        //DINERO INICIAL
        System.out.printf(Locale.ENGLISH, "Dinero inicial .....: %.2f €%n",
                DINERO_INICIAL);

        //Separador
        System.out.println("---");

        //PRECIO PELICULA
        System.out.printf(Locale.ENGLISH, "Precio película ....: %.2f €%n",
                PRECIO_PELICULA);

        //PARTE PALOMITAS
        System.out.printf(Locale.ENGLISH, "Parte palomitas ....: %.2f €%n",
                PARTE_PALOMITAS);

        //Separador
        System.out.println("---");

        //GASTOS POR PERSONA
        System.out.printf(Locale.ENGLISH, "Gastos por persona .: %.2f €%n",
                gastosPersona);

        //Separador
        System.out.println("---");

        //DINERO RESTANTE
        System.out.printf(Locale.ENGLISH, "Dinero restante ....: %.2f €%n",
                dineroRestante);

    }//main

}//class
