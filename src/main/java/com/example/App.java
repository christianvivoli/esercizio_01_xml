package com.example;

import java.util.ArrayList;
import java.io.File;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws Exception
    {
        System.out.println("------------");
        
        Studente s1 = new Studente(1,"pippo", "topolandia", "1985-5-15", 96);
        
        Studente s2 = new Studente(2,"pluto", "topolandia", "1985-10-30", 86);
        
        Studente s3 = new Studente(3,"paperino", "topolandia", "1985-12-5", 60);
        
        Studente s4 = new Studente(4,"minni", "topolandia", "1985-3-26",70);

        Studenti lista = new Studenti("itis meucci");

        lista.aggiungi(s1);
        lista.aggiungi(s2);
        lista.aggiungi(s3);
        lista.aggiungi(s4);

        XmlMapper xmlMapper = new XmlMapper();
        
        //serializzazione
        
            xmlMapper.writeValue(new File("test.xml"), lista);
            String myXml = xmlMapper.writeValueAsString(lista);
            System.out.println("Oggetto serializzato:" + myXml);
        
    
        /*
        // Deserializzazione        
        Studenti s5 = xmlMapper.readValue(myXml, Studenti.class);
        System.out.println("Oggetto deserializzato da stringa:" + s5.getNome());

        Studenti s6 = xmlMapper.readValue(new File("test.xml"), Studenti.class);
        System.out.println("Oggetto deserializzato da file: " + s6.getNome());
         */
    }
}
