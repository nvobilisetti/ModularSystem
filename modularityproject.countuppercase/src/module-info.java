module modularityproject.countuppercase {

    requires modularityproject.analysis;
    provides textanalysis.analyzer.Analyzer with textanalysis.uppercase.CountUpperCaseLetter;

}