import java.io.IOException;
import java.util.List;

/*
* SPDX-FileCopyrightText: 2021 Michele Scarlato <michele.scarlato@endocode.com>
*
* SPDX-License-Identifier: MIT
*/

public class main {
    public static void main(String[] args) throws IOException, InterruptedException {
      List JSONPath;
      JSONPath = ListTests.JSONPathList();
      System.out.println(JSONPath);
      List GitHubURL;
      GitHubURL = ListTests.GitHubURLList();
      System.out.println(GitHubURL);
    }
}
