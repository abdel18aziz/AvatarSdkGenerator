import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class Executeshell {

    public static void main (String [] args){

            TheThread folderN1 = new TheThread("/*FOLDERNAME*/");
            TheThread folderN2 = new TheThread("/*FOLDERNAME*/");
            TheThread folderN3 = new TheThread("/*FOLDERNAME*/");
            TheThread folderN4 = new TheThread("/*FOLDERNAME*/");
            TheThread folderN5 = new TheThread("/*FOLDERNAME*/");

        folderN1.start();
        folderN2.start();
        folderN3.start();
        folderN4.start();
        folderN5.start();

    }
}
