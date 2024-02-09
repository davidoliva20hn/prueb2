package juegocartas;

import java.util.ArrayList;

public class Jugador {
    private String nombre;
    ArrayList<Carta> mano=new ArrayList();

    public Jugador() {
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }
    
    public void recibeCarta(Carta c){
        mano.add(c);
    }
    
    public int calculoMano(){
        int r=0;
        for (Carta c : mano) {
            if (c.getNumero().equals("A")) {
                r+=1;
            }else if (c.getNumero().equals("J")) {
                r+=11;
            }else if(c.getNumero().equals("Q")) {
                r+=12;
            }else if (c.getNumero().equals("K")) {
                r+=13;
            }else{
                r+=Integer.parseInt(c.getNumero());
            }
        }
        return r;
    }
    
}







