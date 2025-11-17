package javaapplication28;

import java.util.ArrayList;


public class Cabina {
    private int numeroCabina;
    private ArrayList<Persona>personasAbordo;

    public Cabina(int numeroCabina, ArrayList<Persona> personasAbordo) {
        this.numeroCabina = numeroCabina;
        this.personasAbordo = new ArrayList<>();
    }
    
    public boolean agregarPersona(Persona p){
        if(personasAbordo.size()>=10){
        return false;
        }
        float pesoTotal = p.getPesoPersona();
        for ( Personapersona: personasAbordo){
            pesoTotal += persona.getPesoPersona();
        }
    }
    