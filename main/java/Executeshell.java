import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class Executeshell {

    public static void main (String [] args){

            TheThread folderN1 = new TheThread("fromlinux1");
            TheThread folderN2 = new TheThread("fromlinux2");
            TheThread folderN3 = new TheThread("fromlinux3");
            TheThread folderN4 = new TheThread("fromlinux4");
            TheThread folderN5 = new TheThread("fromlinux5");

        folderN1.start();
        folderN2.start();
        folderN3.start();
        folderN4.start();
        folderN5.start();

    }
}
