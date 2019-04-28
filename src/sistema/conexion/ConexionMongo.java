/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.conexion;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose
 */
public class ConexionMongo {
    DB BaseDatos;
    DBCollection coleccion;
    BasicDBObject document = new BasicDBObject();

    public ConexionMongo() {
        try {
            Mongo mongo = new Mongo("localhost",27017);
            BaseDatos = mongo.getDB("ToDo");
            coleccion = BaseDatos.getCollection("ToDo");
            System.out.println("Coneccion a base de datos exitosa");
        } catch (UnknownHostException ex) {
            Logger.getLogger(ConexionMongo.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    
    
}






