package Creacion_Ficheros;

import Excepcions.EmptyImput;
import Interfaces.Bufferreader;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class newFile implements Bufferreader {
    public static void main(String[] args) throws IOException {
        newFile newFile = new newFile();
      newFile.createXMLfile();
    }


    public  static String directoryPath= "Ficheros/",endData=".dat",endJson=".json",endXml=".xml",endTxt=".txt",date=String.valueOf(LocalDate.now());


    public  File createXMLfile(String fileName) throws IOException {
        File fileXML= new File(directoryPath+fileName+endXml);
        if(!fileXML.exists())fileXML.createNewFile();
        return fileXML;
    }
    public  void  createXMLfile()  {
        boolean flag = false;
        File fileXML = null;
        do {
            try {
                System.out.println("Introducir el nombre del archivo");
                String fileName = br.readLine();
                fileXML = new File(directoryPath + fileName + endXml);
                if (!fileXML.exists()) fileXML.createNewFile();
                flag=true;
                if (fileName.equals(""))throw new EmptyImput();
            } catch (EmptyImput e) {
                System.err.println("Debes introducir un nombre");
                flag=false;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } while (!flag);
    }

    public File createDatFile(String fileName) throws IOException {
        File fileDat= new File(directoryPath+fileName+endData);
        if(!fileDat.exists())fileDat.createNewFile();
        return fileDat;
    }

    public  void  createDatFile()  {
        boolean flag = false;
        File fileDat = null;
        do {
            try {
                System.out.println("Introducir el nombre del archivo");
                String fileName = br.readLine();
                fileDat = new File(directoryPath + fileName + endXml);
                if (!fileDat.exists()) fileDat.createNewFile();
                flag=true;
                if (fileName.equals(""))throw new EmptyImput();
            } catch (EmptyImput e) {
                System.err.println("Debes introducir un nombre");
                flag=false;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } while (!flag);
    }




    public File createJsontFile(String fileName) throws IOException {
        File fileJson= new File(directoryPath+fileName+endJson);
        if(!fileJson.exists())fileJson.createNewFile();
        return fileJson;
    }
    public File createTxtFile(String fileName) throws IOException {
        File fileTxt= new File(directoryPath+fileName+endTxt);
        if(!fileTxt.exists())fileTxt.createNewFile();
        return fileTxt;
    }





}
