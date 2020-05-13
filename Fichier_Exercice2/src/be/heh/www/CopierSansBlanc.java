package be.heh.www;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.text.spi.BreakIteratorProvider;

public class CopierSansBlanc
{
    public void copier(String fichierSource,String fichierDestination)
    {
        try
        {
            FileWriter writer = new FileWriter(fichierDestination,true);
            BufferedWriter bw = new BufferedWriter(writer,512);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fichierSource), StandardCharsets.UTF_8),512);
            String line = br.readLine();

            while (line != null)
            {
                line = line.replaceAll(" ","_");
                writer.write(line);
                line = br.readLine();
            }
            bw.close();
            writer.close();
            br.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
