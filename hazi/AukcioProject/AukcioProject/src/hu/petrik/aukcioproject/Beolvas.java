package hu.petrik.aukcioproject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Beolvas {
    public List<Festmenyek> ReadFestmeny(String path) throws IOException {

        File f = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(f));
        List<Festmenyek> festmenyek = new ArrayList<>();
        String line;
        
        while ((line = br.readLine()) != null) {
            
            String[] darabok = line.split(";");
            festmenyek.add(new Festmenyek(darabok[1], darabok[0], darabok[2]));
        }

        return festmenyek;
    }
}