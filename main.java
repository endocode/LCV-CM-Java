//import java.io.IOException;
//import java.util.List;

/*
* SPDX-FileCopyrightText: 2021 Michele Scarlato <michele.scarlato@endocode.com>
*
* SPDX-License-Identifier: MIT
*/

import java.util.List;

public class main {
    public static <string> void main(String[] args){
//        string InboundLicenses;
//        string OutboundLicense;
//        InboundLicenses = (string) "MIT,Apache-2.0";
//        OutboundLicense = (string) "MIT";
//        Verify.CompareFlag(InboundLicenses, OutboundLicense);
        List<Verify.CM> CompatibilityRules = Verify.readCMFromCSV("src/main/resources/cm.csv");
        for (Verify.CM c : CompatibilityRules) {
            System.out.println(c);
        }
    }
}
