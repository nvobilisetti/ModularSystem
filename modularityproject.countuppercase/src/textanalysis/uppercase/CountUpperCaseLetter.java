package textanalysis.uppercase;

import textanalysis.analyzer.Analyzer;

public class CountUpperCaseLetter implements Analyzer
{
    @Override
    public String getAnalysisType()
    {
        return "Counting UpperCase letters in the given file";
    }

    @Override
    public double getAlphabetCount(String text)
    {
        return text.chars().filter(ch -> Character.isUpperCase(ch)).count();
    }
}
