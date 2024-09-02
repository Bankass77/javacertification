package org.example.algortihme.interview.testInterviewQuestions;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Options options = new Options();

        // Création de l'option 'verbose'
        Option verbose = new Option("v", "verbose", false, "verbose mode");
        options.addOption(verbose);

        // Création de l'option 'server'
        Option server = new Option("s", "server", true, "server name");
        server.setRequired(true);
        options.addOption(server);

        // Création de l'option 'nbTries'
        Option nbTries = Option.builder("n")
                .longOpt("nbtries")
                .hasArg()
                .type(Number.class)
                //.desc("number of tries")
                .build();
        options.addOption(nbTries);

        // Création du parser et parsing des arguments
        CommandLineParser parser = new DefaultParser();

            CommandLine cmd = parser.parse(options, args);
            System.out.println(cmd);

    }
}
