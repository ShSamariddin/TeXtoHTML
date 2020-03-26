import java.io.FileWriter;
import java.io.IOException;

public class wFile {
    public static void write(String name, String tex, String ans){
        try(FileWriter writer = new FileWriter(name))
        {
            writer.write(tex);
            writer.write("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "    <head>\n" +
                    "        <meta charset=\"utf-8\">\n" +
                    "        <script>window.MathJax = { MathML: { extensions: [\"mml3.js\", \"content-mathml.js\"]}};</script>\n" +
                    "        <script type=\"text/javascript\" async src=\"https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.5/MathJax.js?config=MML_HTMLorMML\"></script>\n" +
                    "    </head>\n" +
                    "    <body>\n" +
                    "            <div style=\"position: absolute; top: 50%; left: 50%; margin-right: -50%; transform: translate(-50%, -50%);\">\n" +
                    "                <math>\n");
            writer.write(ans);
            writer.write(" </math>\n" +
                    "            </div>\n" +
                    "    </body>\n" +
                    "</html> \n");
        } catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
