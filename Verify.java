//import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Verify {
    //private static String CSVfilePath;
    public static <string> void CompareFlag(string inboundLicenses, string outboundLicense) {
        int InboundLicenseIndex;
        List<CM> CompatibilityRules = readCMFromCSV("src/main/resources/cm.csv");
        //InboundLicenseIndex = CM.indexOf(inboundLicenses);

        for (CM c : CompatibilityRules) {
            }
        }

            //List<CM> CSVfilePath = read"src/main/resources/cm.csv";
    //}
    public static List<CM> readCMFromCSV(String fileName){
        List<CM> CompatibilityRules = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
            // read the first line from the text file
            String line = br.readLine();
            // loop until all lines are read
            while (line != null) {
                // use string.split to load a string array with the values from
                // each line of the file, using a comma as the delimiter
                String[] attributes = line.split(",");
                CM LicenseRulesSet = fulfillCM(attributes);
                // adding a set of CompatibilityRules into ArrayList
                CompatibilityRules.add(LicenseRulesSet);
                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return CompatibilityRules;
    }

    private static CM fulfillCM(String[] metadata) {
        String License = metadata[0];
        String Unknown = metadata[1];
        String LGPL30 = metadata[2];
        String LGPL30orlater = metadata[3];
        return new CM(License, Unknown, LGPL30, LGPL30orlater);
    }

    static class CM {
        private String License;
        private String Unknown;
        private String LGPL30;
        private String LGPL30orlater;
        public CM(String License, String Unknown, String LGPL30, String LGPL30orlater) {
            this.License = License;
            this.Unknown = Unknown;
            this.LGPL30 = LGPL30;
            this.LGPL30orlater = LGPL30orlater;
        }
        public String getLicense() {
            return License;
        }
        public String getUnknown() {
            return Unknown;
        }

        public String getLGPL30() {
            return LGPL30;
        }

        public String getLGPL30orlater() {
            return LGPL30orlater;
        }

        @Override public String toString() {
            return "Compatibility Matrix [License=" + License + ", Unknown=" + Unknown + ", LGPL30=" + LGPL30 + ", LGPL30orlater=" + LGPL30orlater + "]";
        }
    }
}
