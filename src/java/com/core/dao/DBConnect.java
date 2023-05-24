package com.core.dao;

import com.core.models.Player;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class DBConnect {

    private final List<Player> players = new ArrayList<>();
    private final String URL = "jdbc:sqlite:D:\\Programación\\Proyectos\\FutStatsWeb\\football_stats.db";

    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, " El driver no carga ", ex);
        }
    }

    public DBConnect() {

        showData();

    }

    // ----------- EJEMPLOS DE COMO INSERTAR DATOS : 1-Statement 2-PreparedStatement ------------
//    public void insertData(String url) {
//       
//        try (Connection con = DriverManager.getConnection(url)) {
//
//            Statement st = con.createStatement();
//
//            st.execute("INSERT INTO player (name,team) VALUES ('Lassana diarra','RMA')");
//
//        } catch (SQLException ex) {
//            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    public void insertData(String url, String name, String team) {
//       
//       
//        try (Connection con = DriverManager.getConnection(url)) {
//            PreparedStatement st = con.prepareStatement("INSERT INTO player (name,team) VALUES (?,?)");
//
//            st.setString(1, name);
//            st.setString(2, team);
//
//            st.execute();
//
//        } catch (SQLException ex) {
//            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
// ---------- (LEGAY) Este método se ha utilizado para crear la base de datos. -----------
//    public void insertData(String url, List<Player> data) {
//      
//        try (Connection con = DriverManager.getConnection(url)) {
//            PreparedStatement st = con.prepareStatement("INSERT INTO player (name,team,Minutos,TAmarillas,Goles,FuerasDeJuego,FaltasRecibidas,FaltasCometidas,Centros,Corners,Entradas,Duelos,DuelosCuerpo,DuelosAire,Pases,PasesCortos,PasesLargos,PasesHueco,Tiros,TirosPuerta,Asistencias,RegatesExito,RegatesFracaso,Recuperaciones,EntradasExito,EntradasFracaso,DuelosCuerpoExito,DuelosCuerpoFracaso,DuelosAireExito,DuelosAireFracaso,PrecisionTiros,Regates,PrecisionRegates,Importante) "
//                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
//
//            for (Player pl : data) {
//                st.setString(1, pl.getNombre());
//                st.setString(2, pl.getEquipo());
//                for (int i = 0; i < pl.getStats().length; i++) {
//                    st.setDouble(i + 3, pl.getStats()[i]);
//
//                }
//                st.execute();
//            }
//
//            st.execute();
//
//        } catch (SQLException ex) {
//            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    public void showData() {

        try (Connection con = DriverManager.getConnection(URL)) {

            Statement st = con.createStatement();

            st.execute("SELECT * FROM player");

            ResultSet rs = st.getResultSet();

            while (rs.next()) {
                String[] datos = new String[35];
                for (int i = 0; i < datos.length; i++) {
                    datos[i] = (i == 0) ? "" + rs.getInt(i + 1) : (i < 3) ? rs.getString(i + 1) : "" + rs.getDouble(i + 1);

                }
                players.add(Player.ofPlayer(datos));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public List<Player> getPlayers() {
        return players;
    }
}
