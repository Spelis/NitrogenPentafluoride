package io.github.spelis;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.interactions.commands.build.Commands;

public class Main {
    public static void main(String[] args) {
        String token = args[0];
        JDA jda = JDABuilder.createDefault(token).addEventListeners(new InteractionHandler()).build();
        jda.updateCommands().addCommands(
            Commands.slash("hello","Greets you.")
        ).queue();
    }
}
