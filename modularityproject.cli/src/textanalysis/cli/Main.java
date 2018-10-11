package textanalysis.cli;



//import org.apache.commons.lang3.StringUtils;
import textanalysis.analyzer.Analyzer;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ServiceLoader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        if (args.length == 0)
        {
            System.out.println("Welcome to Modularity Project. Provide a filename to analyze");
            return;
        }
        //System.out.println(StringUtils.capitalize("hello"));
        Path path = Paths.get(args[0]);
        System.out.println("Reading " + path);
        String text = new String(Files.readAllBytes(path), Charset.forName("UTF-8"));

        Iterable<Analyzer> analyzers = ServiceLoader.load(Analyzer.class);
        for (Analyzer analyzer : analyzers)
        {
            System.out.println(analyzer.getAnalysisType() + ": " + analyzer.getAlphabetCount(text));
        }

    }
}
