import java.io.File;
import java.io.IOException;

public class TheThread extends Thread {

    String FolderName;
    public TheThread(String FolderName){
        this.FolderName=FolderName;
    }

@Override
    public void run() {

        File x = new File(FolderName);
        File[] imgNameJPG1 = x.listFiles();
//        System.out.println(imgNameJPG1);
        int l=imgNameJPG1.length;
        int b=0;
        while (b < l){
            String ImageOutPut = new String(String.valueOf(imgNameJPG1[b]).substring(0,43));
            String a = "cmd.exe  /C \"avatar_sdk_standalone.exe " + imgNameJPG1[b] + " " + ImageOutPut +" resources -f obj -pipelineSubtype head \"";
          String c= "cmd.exe /C \"move "+imgNameJPG1[b]+" "+ImageOutPut+"\" ";
            try {
                Runtime.getRuntime().exec(a);
                try {
                    sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Runtime.getRuntime().exec(c);

            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(a);
            System.out.println(c);
            b++;

        }


    }}
