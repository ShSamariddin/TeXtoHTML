import junit.framework.TestCase;

public class checker extends TestCase {
    public void test1(){
        String Tex = "${n} \\choose {k + 1}$";
        String HTML = TexToHtmlConverter.solv(Tex);
        wFile fl = new wFile();
        fl.write("/home/samar/ITMO-2018-19/MT/MT3/src/TEST/test1.html", Tex, HTML);
       // System.out.println(HTML);
    }
    public  void test2(){
        String Tex = "$a^{i} = b^{i} + x^{2}$";
        String HTML = TexToHtmlConverter.solv(Tex);
        wFile fl = new wFile();
        fl.write("/home/samar/ITMO-2018-19/MT/MT3/src/TEST/test2.html", Tex, HTML);
    }
    public void test3(){
        String Tex = "$k_{n+1} = n^{2} + k_{n}^{2} - k_{n-1}$";
        String HTML = TexToHtmlConverter.solv(Tex);
        wFile fl = new wFile();
        fl.write("/home/samar/ITMO-2018-19/MT/MT3/src/TEST/test3.html", Tex, HTML);
    }
    public void test4(){
        String Tex = "$\\frac{\\frac{1}{x}+\\frac{1}{y}}{y-z}$";
        String HTML = TexToHtmlConverter.solv(Tex);
        wFile fl = new wFile();
        fl.write("/home/samar/ITMO-2018-19/MT/MT3/src/TEST/test4.html", Tex, HTML);    }
    public void test5(){
        String Tex = "$\\sqrt{\\frac{a}{b}}$";
        String HTML = TexToHtmlConverter.solv(Tex);
        wFile fl = new wFile();
        fl.write("/home/samar/ITMO-2018-19/MT/MT3/src/TEST/test5.html", Tex, HTML);    }

}
