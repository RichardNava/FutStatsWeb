/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.core.models;

/**
 *
 * @author richa
 */
@SuppressWarnings("FieldMayBeFinal")
public class Player {

    private double[] stats;
    private int ID;
    private String Nombre,
            Equipo;
    private double Minutos,
            TAmarillas,
            Goles,
            FuerasDeJuego,
            FaltasRecibidas,
            FaltasCometidas,
            Centros,
            Corners,
            Entradas,
            Duelos,
            DuelosCuerpo,
            DuelosAire,
            Pases,
            PasesCortos,
            PasesLargos,
            PasesHueco,
            Tiros,
            TirosPuerta,
            Asistencias,
            RegatesExito,
            RegatesFracaso,
            Recuperaciones,
            EntradasExito,
            EntradasFracaso,
            DuelosCuerpoExito,
            DuelosCuerpoFracaso,
            DuelosAireExito,
            DuelosAireFracaso,
            PrecisionTiros, // double real
            Regates,
            PrecisionRegates, //double real
            Importante;

    public Player(int ID, String Nombre, String Equipo) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Equipo = Equipo;
    }

    public Player(int ID, String Nombre, String Equipo, double Minutos, double TAmarillas, double Goles, double FuerasDeJuego, double FaltasRecibidas, double FaltasCometidas, double Centros, double Corners, double Entradas, double Duelos, double DuelosCuerpo, double DuelosAire, double Pases, double PasesCortos, double PasesLargos, double PasesHueco, double Tiros, double TirosPuerta, double Asistencias, double RegatesExito, double RegatesFracaso, double Recuperaciones, double EntradasExito, double EntradasFracaso, double DuelosCuerpoExito, double DuelosCuerpoFracaso, double DuelosAireExito, double DuelosAireFracaso, double PrecisionTiros, double Regates, double PrecisionRegates, double Importante) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Equipo = Equipo;
        this.Minutos = Minutos;
        this.TAmarillas = TAmarillas;
        this.Goles = Goles;
        this.FuerasDeJuego = FuerasDeJuego;
        this.FaltasRecibidas = FaltasRecibidas;
        this.FaltasCometidas = FaltasCometidas;
        this.Centros = Centros;
        this.Corners = Corners;
        this.Entradas = Entradas;
        this.Duelos = Duelos;
        this.DuelosCuerpo = DuelosCuerpo;
        this.DuelosAire = DuelosAire;
        this.Pases = Pases;
        this.PasesCortos = PasesCortos;
        this.PasesLargos = PasesLargos;
        this.PasesHueco = PasesHueco;
        this.Tiros = Tiros;
        this.TirosPuerta = TirosPuerta;
        this.Asistencias = Asistencias;
        this.RegatesExito = RegatesExito;
        this.RegatesFracaso = RegatesFracaso;
        this.Recuperaciones = Recuperaciones;
        this.EntradasExito = EntradasExito;
        this.EntradasFracaso = EntradasFracaso;
        this.DuelosCuerpoExito = DuelosCuerpoExito;
        this.DuelosCuerpoFracaso = DuelosCuerpoFracaso;
        this.DuelosAireExito = DuelosAireExito;
        this.DuelosAireFracaso = DuelosAireFracaso;
        this.PrecisionTiros = PrecisionTiros;
        this.Regates = Regates;
        this.PrecisionRegates = PrecisionRegates;
        this.Importante = Importante;
    }

    public static Player ofPlayer(String... data) {
        Player p = new Player(Integer.parseInt(data[0]), data[1], data[2]);
        p.setNumberData(data);
        return p;
    }

    public void setNumberData(String... data) {
        this.stats = new double[data.length - 3];
        for (int i = 3; i < data.length; i++) {
            stats[i - 3] = Double.parseDouble(data[i]);
        }

        this.Minutos = stats[0];
        this.TAmarillas = stats[1];
        this.Goles = stats[2];
        this.FuerasDeJuego = stats[3];
        this.FaltasRecibidas = stats[4];
        this.FaltasCometidas = stats[5];
        this.Centros = stats[6];
        this.Corners = stats[7];
        this.Entradas = stats[8];
        this.Duelos = stats[9];
        this.DuelosCuerpo = stats[10];
        this.DuelosAire = stats[11];
        this.Pases = stats[12];
        this.PasesCortos = stats[13];
        this.PasesLargos = stats[14];
        this.PasesHueco = stats[15];
        this.Tiros = stats[16];
        this.TirosPuerta = stats[17];
        this.Asistencias = stats[18];
        this.RegatesExito = stats[19];
        this.RegatesFracaso = stats[20];
        this.Recuperaciones = stats[21];
        this.EntradasExito = stats[22];
        this.EntradasFracaso = stats[23];
        this.DuelosCuerpoExito = stats[24];
        this.DuelosCuerpoFracaso = stats[25];
        this.DuelosAireExito = stats[26];
        this.DuelosAireFracaso = stats[27];
        this.PrecisionTiros = stats[28];
        this.Regates = stats[29];
        this.PrecisionRegates = stats[30];
        this.Importante = stats[31];
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public double getMinutos() {
        return Minutos;
    }

    public void setMinutos(double Minutos) {
        this.Minutos = Minutos;
    }

    public double getTAmarillas() {
        return TAmarillas;
    }

    public void setTAmarillas(double TAmarillas) {
        this.TAmarillas = TAmarillas;
    }

    public double getGoles() {
        return Goles;
    }

    public void setGoles(double Goles) {
        this.Goles = Goles;
    }

    public double getFuerasDeJuego() {
        return FuerasDeJuego;
    }

    public void setFuerasDeJuego(double FuerasDeJuego) {
        this.FuerasDeJuego = FuerasDeJuego;
    }

    public double getFaltasRecibidas() {
        return FaltasRecibidas;
    }

    public void setFaltasRecibidas(double FaltasRecibidas) {
        this.FaltasRecibidas = FaltasRecibidas;
    }

    public double getFaltasCometidas() {
        return FaltasCometidas;
    }

    public void setFaltasCometidas(double FaltasCometidas) {
        this.FaltasCometidas = FaltasCometidas;
    }

    public double getCentros() {
        return Centros;
    }

    public void setCentros(double Centros) {
        this.Centros = Centros;
    }

    public double getCorners() {
        return Corners;
    }

    public void setCorners(double Corners) {
        this.Corners = Corners;
    }

    public double getEntradas() {
        return Entradas;
    }

    public void setEntradas(double Entradas) {
        this.Entradas = Entradas;
    }

    public double getDuelos() {
        return Duelos;
    }

    public void setDuelos(double Duelos) {
        this.Duelos = Duelos;
    }

    public double getDuelosCuerpo() {
        return DuelosCuerpo;
    }

    public void setDuelosCuerpo(double DuelosCuerpo) {
        this.DuelosCuerpo = DuelosCuerpo;
    }

    public double getDuelosAire() {
        return DuelosAire;
    }

    public void setDuelosAire(double DuelosAire) {
        this.DuelosAire = DuelosAire;
    }

    public double getPases() {
        return Pases;
    }

    public void setPases(double Pases) {
        this.Pases = Pases;
    }

    public double getPasesCortos() {
        return PasesCortos;
    }

    public void setPasesCortos(double PasesCortos) {
        this.PasesCortos = PasesCortos;
    }

    public double getPasesLargos() {
        return PasesLargos;
    }

    public void setPasesLargos(double PasesLargos) {
        this.PasesLargos = PasesLargos;
    }

    public double getPasesHueco() {
        return PasesHueco;
    }

    public void setPasesHueco(double PasesHueco) {
        this.PasesHueco = PasesHueco;
    }

    public double getTiros() {
        return Tiros;
    }

    public void setTiros(double Tiros) {
        this.Tiros = Tiros;
    }

    public double getTirosPuerta() {
        return TirosPuerta;
    }

    public void setTirosPuerta(double TirosPuerta) {
        this.TirosPuerta = TirosPuerta;
    }

    public double getAsistencias() {
        return Asistencias;
    }

    public void setAsistencias(double Asistencias) {
        this.Asistencias = Asistencias;
    }

    public double getRegatesExito() {
        return RegatesExito;
    }

    public void setRegatesExito(double RegatesExito) {
        this.RegatesExito = RegatesExito;
    }

    public double getRegatesFracaso() {
        return RegatesFracaso;
    }

    public void setRegatesFracaso(double RegatesFracaso) {
        this.RegatesFracaso = RegatesFracaso;
    }

    public double getRecuperaciones() {
        return Recuperaciones;
    }

    public void setRecuperaciones(double Recuperaciones) {
        this.Recuperaciones = Recuperaciones;
    }

    public double getEntradasExito() {
        return EntradasExito;
    }

    public void setEntradasExito(double EntradasExito) {
        this.EntradasExito = EntradasExito;
    }

    public double getEntradasFracaso() {
        return EntradasFracaso;
    }

    public void setEntradasFracaso(double EntradasFracaso) {
        this.EntradasFracaso = EntradasFracaso;
    }

    public double getDuelosCuerpoExito() {
        return DuelosCuerpoExito;
    }

    public void setDuelosCuerpoExito(double DuelosCuerpoExito) {
        this.DuelosCuerpoExito = DuelosCuerpoExito;
    }

    public double getDuelosCuerpoFracaso() {
        return DuelosCuerpoFracaso;
    }

    public void setDuelosCuerpoFracaso(double DuelosCuerpoFracaso) {
        this.DuelosCuerpoFracaso = DuelosCuerpoFracaso;
    }

    public double getDuelosAireExito() {
        return DuelosAireExito;
    }

    public void setDuelosAireExito(double DuelosAireExito) {
        this.DuelosAireExito = DuelosAireExito;
    }

    public double getDuelosAireFracaso() {
        return DuelosAireFracaso;
    }

    public void setDuelosAireFracaso(double DuelosAireFracaso) {
        this.DuelosAireFracaso = DuelosAireFracaso;
    }

    public double getPrecisionTiros() {
        return PrecisionTiros;
    }

    public void setPrecisionTiros(double PrecisionTiros) {
        this.PrecisionTiros = PrecisionTiros;
    }

    public double getRegates() {
        return Regates;
    }

    public void setRegates(double Regates) {
        this.Regates = Regates;
    }

    public double getPrecisionRegates() {
        return PrecisionRegates;
    }

    public void setPrecisionRegates(double PrecisionRegates) {
        this.PrecisionRegates = PrecisionRegates;
    }

    public double getImportante() {
        return Importante;
    }

    public void setImportante(double Importante) {
        this.Importante = Importante;
    }

    @Override
    public String toString() {
        return "Player" + "ID=" + ID
                + "\n\tNombre=" + Nombre
                + "\n\tEquipo=" + Equipo
                + "\n\tMinutos=" + Minutos
                + "\n\tTAmarillas=" + TAmarillas
                + "\n\tGoles=" + Goles
                + "\n\tFuerasDeJuego=" + FuerasDeJuego
                + "\n\tFaltasRecibidas=" + FaltasRecibidas
                + "\n\tFaltasCometidas=" + FaltasCometidas
                + "\n\tCentros=" + Centros
                + "\n\tCorners=" + Corners
                + "\n\tEntradas=" + Entradas
                + "\n\tDuelos=" + Duelos
                + "\n\tDuelosCuerpo=" + DuelosCuerpo
                + "\n\tDuelosAire=" + DuelosAire
                + "\n\tPases=" + Pases
                + "\n\tPasesCortos=" + PasesCortos
                + "\n\tPasesLargos=" + PasesLargos
                + "\n\tPasesHueco=" + PasesHueco
                + "\n\tTiros=" + Tiros
                + "\n\tTirosPuerta=" + TirosPuerta
                + "\n\tAsistencias=" + Asistencias
                + "\n\tRegatesExito=" + RegatesExito
                + "\n\tRegatesFracaso=" + RegatesFracaso
                + "\n\tRecuperaciones=" + Recuperaciones
                + "\n\tEntradasExito=" + EntradasExito
                + "\n\tEntradasFracaso=" + EntradasFracaso
                + "\n\tDuelosCuerpoExito=" + DuelosCuerpoExito
                + "\n\tDuelosCuerpoFracaso=" + DuelosCuerpoFracaso
                + "\n\tDuelosAireExito=" + DuelosAireExito
                + "\n\tDuelosAireFracaso=" + DuelosAireFracaso
                + "\n\tPrecisionTiros=" + PrecisionTiros
                + "\n\tRegates=" + Regates
                + "\n\tPrecisionRegates=" + PrecisionRegates
                + "\n\tImportante=" + Importante;
    }

    public double[] getStats() {
        return stats;
    }

}
