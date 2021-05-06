import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ListTests {
    public static @NotNull List JSONPathList(){
        List GitHubURL;
        GitHubURL = new ArrayList();

        GitHubURL.add("https://api.github.com/repos/hope-for/hope-boot/license");;
        GitHubURL.add(
                "https://api.github.com/repos/spotify/docker-maven-plugin/license");;
        GitHubURL.add(
                "https://api.github.com/repos/spotify/dockerfile-maven/license");
    // Inbound: GPL3.0 or later
        GitHubURL.add(
                "https://api.github.com/repos/fabric8io/docker-maven-plugin/license");
    // links to do https://github.com/bonigarcia/webdrivermanager
    // https://github.com/git-commit-id/git-commit-id-maven-plugin
        GitHubURL.add("https://api.github.com/repos/bytedeco/javacv/license");
        GitHubURL.add("https://api.github.com/repos/bytedeco/javacpp/license");
        GitHubURL.add(
                "https://api.github.com/repos/rubenlagus/TelegramBots/license");
        GitHubURL.add(
                "https://api.github.com/repos/git-commit-id/git-commit-id-maven-plugin/license");
        GitHubURL.add(
                "https://api.github.com/repos/TheHolyWaffle/TeamSpeak-3-Java-API/license");
    // https://github.com/dzikoysk/reposilite
        GitHubURL.add(
                "https://api.github.com/repos/dzikoysk/reposilite/license");
    // https://github.com/policeman-tools/forbidden-apis
    // GitHubURL.add(
                //     "https://api.github.com/repos/policeman-tools/forbidden-apis/license");
    // GitHubURL.add(
                //     "https://api.github.com/repos/eclipse/jkube/license");
        GitHubURL.add(
                "https://api.github.com/repos/revelc/formatter-maven-plugin/license");
        GitHubURL.add(
                "https://api.github.com/repos/mojohaus/versions-maven-plugin/license");
        GitHubURL.add(
                "https://api.github.com/repos/jhg023/SimpleNet/license");
        GitHubURL.add(
                "https://api.github.com/repos/CryptoMorin/XSeries/license");
        GitHubURL.add(
                "https://api.github.com/repos/mojohaus/exec-maven-plugin/license");
        GitHubURL.add(
                "https://api.github.com/repos/mojohaus/flatten-maven-plugin/license");
        GitHubURL.add(
                "https://api.github.com/repos/SonarSource/sonar-scanner-maven/license");
        GitHubURL.add(
                "https://api.github.com/repos/spring-cloud/spring-cloud-build/license");
        GitHubURL.add(
                "https://api.github.com/repos/raydac/java-comment-preprocessor/license");
        GitHubURL.add(
                "https://api.github.com/repos/egineering-llc/gitflow-helper-maven-plugin/license");
        GitHubURL.add(
                "https://api.github.com/repos/mojohaus/appassembler/license");
        GitHubURL.add(
                "https://api.github.com/repos/mojohaus/aspectj-maven-plugin/license");
        GitHubURL.add(
                "https://api.github.com/repos/mojohaus/jaxb2-maven-plugin/license");
        GitHubURL.add(
                "https://api.github.com/repos/RadarCOVID/radar-covid-backend-configuration-server/license");
        GitHubURL.add(
                "https://api.github.com/repos/Zlika/reproducible-build-maven-plugin/license");
        GitHubURL.add(
                "https://api.github.com/repos/mojohaus/rpm-maven-plugin/license");
        GitHubURL.add(
                "https://api.github.com/repos/mojohaus/buildnumber-maven-plugin/license");
        GitHubURL.add(
                "https://api.github.com/repos/Carleslc/Simple-YAML/license");
        GitHubURL.add(
                "https://api.github.com/repos/CycloneDX/cyclonedx-maven-plugin/license");
        GitHubURL.add(
                "https://api.github.com/repos/ctron/rpm-builder/license");
        GitHubURL.add(
                "https://api.github.com/repos/jinahya/executable-jar-with-maven-example/license");
        GitHubURL.add(
                "https://api.github.com/repos/bonigarcia/webdrivermanager/license");

        return GitHubURL;

    }
    public static @NotNull
    List GitHubURLList() {
        List JSONPath;
        JSONPath = new ArrayList();
        // hope-boot is license compliant
        JSONPath.add("json/hope-boot.json");

        // spotify-docker-maven-plugin uses only Apache 2.0, so it is compliant
        JSONPath.add("json/spotify-docker-maven-plugin.json");

        // spotify:dockerfile-maven-plugin uses only Apache 2.0, so it is compliant
        JSONPath.add("json/dockerfile-maven.json");

        // ffabric8io-docker-maven-plugin uses only Apache 2.0, so it is compliant
        JSONPath.add("json/fabric8io-docker-maven-plugin.json");
        // emptyJSON

        // This project does not specify correctly an SPDX id for its oubound license
        JSONPath.add("json/javacv.json");

        // This project does not specify correctly an SPDX id for its oubound license
        JSONPath.add("json/javacpp.json");

        // GPL-3.0-or-later is not supported, because "or later" notation.
        JSONPath.add("json/TelegramBots.json");

        // 1 above 3 licenses found are compatible.
        JSONPath.add("json/git-commit-id-maven-plugin.json");

        // An UNKNOWN license has been found within the project. This cannot reveal license incompatibility
        JSONPath.add("json/teamspeak3.json");

        // 9
        // outbound Apache2.0 https://github.com/dzikoysk/reposilite
        JSONPath.add("json/org.panda-lang:reposilite.json");

        // policeman-tools/forbidden-apis
        // outbound Apache2.0 https://api.github.com/repos/policeman-tools/forbidden-apis/license

        // 10 https://github.com/mojohaus/versions-maven-plugin
        // JSONPath.add("json/policeman-tools-forbidden-apis.json");
        JSONPath.add("json/org.codehaus.mojo:versions-maven-plugin.json");

        // 11  https://github.com/revelc/formatter-maven-plugin
        JSONPath.add(
                "json/net.revelc.code.formatter:formatter-maven-plugin.json");

        // 12
        JSONPath.add(
                "json/com.github.jhg023:SimpleNet.json");

        // 13
        JSONPath.add(
                "json/com.github.cryptomorin:XSeries.json");

        // 14
        JSONPath.add(
                "json/org.codehaus.mojo:exec-maven-plugin.json");

        // 15
        JSONPath.add(
                "json/org.codehaus.mojo:flatten-maven-plugin.json");

        // 16
        JSONPath.add(
                "json/org.sonarsource.scanner.maven:sonar-maven-plugin.json");
        // 17
        JSONPath.add(
                "json/spring-cloud-build.json");
        // 18
        JSONPath.add(
                "json/java-comment-preprocessor.json");
        // 19
        JSONPath.add(
                "json/gitflow-helper-maven-plugin.json");
        // 20
        JSONPath.add(
                "json/appassembler.json");

        // 21
        JSONPath.add(
                "json/aspectj-maven-plugin.json");
        // 22
        JSONPath.add(
                "json/jaxb2-maven-plugin.json");
        // 23
        JSONPath.add(
                "json/radar-covid-backend-configuration-server.json");
        // 24
        JSONPath.add(
                "json/reproducible-build-maven-plugin.json");
        // 25
        JSONPath.add(
                "json/rpm-maven-plugin.json");
        // 26
        JSONPath.add(
                "json/buildnumber-maven-plugin.json");
        // 27
        JSONPath.add(
                "json/Simple-YAML.json");
        // 28
        JSONPath.add(
                "json/cyclonedx-maven-plugin.json");
        // 29
        JSONPath.add(
                "json/rpm-builder.json");
        // 30
        JSONPath.add(
                "json/executable-jar-with-maven-example.json");
        // 31
        JSONPath.add("json/webdrivermanager.json");

        return JSONPath;

    }
}
