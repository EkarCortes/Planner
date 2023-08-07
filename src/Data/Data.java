/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Models.Members.Member;
import Models.Members.MemberList;
import Models.Members.Role;
import java.util.Random;

/**
 *
 * @author jprod
 */
public class Data {
    public static void loadMembers(){        
        String[] nombres = {
            "Iron Man", "Thor", "Captain America", "Hulk", "Black Widow",
            "Black Panther", "Spider-Man", "Doctor Strange", "Captain Marvel",
            "Scarlet Witch", "Vision", "Falcon", "Ant-Man", "Wasp",
            "Star-Lord", "Gamora", "Drax", "Rocket", "Groot",
            "Hawkeye", "Winter Soldier", "War Machine", "Nick Fury", "Loki",
            "Thanos", "Ultron", "Nebula", "Okoye", "Mantis", "Wong",
            "Black Bolt", "Quicksilver", "Sif", "Heimdall", "The Collector",
            "Agent Coulson", "Jessica Jones", "Luke Cage", "Daredevil", "Punisher",
            "Elektra", "Jigsaw", "Hellcat", "Mockingbird", "Moon Knight",
            "Blade", "Ghost Rider", "Doctor Doom", "Green Goblin", "Red Skull",
            "Hank Pym", "Janet Van Dyne", "Carol Danvers", "Scott Lang", "T'Challa",
            "Peter Quill", "Stephen Strange", "Bruce Banner", "Tony Stark", "Natasha Romanoff",
            "Clint Barton", "Bucky Barnes", "Sam Wilson", "Steve Rogers", "Vision",
            "Wanda Maximoff", "Scott Summers", "Jean Grey", "Logan", "Charles Xavier",
            "Ororo Munroe", "Peter Parker", "Matt Murdock", "Jessica Drew", "Eddie Brock",
            "Frank Castle", "Max Eisenhardt", "Anna Marie", "Remy LeBeau", "James Howlett",
            "Otto Octavius", "Cletus Kasady", "Victor Von Doom", "Norman Osborn", "Wilson Fisk",
            "Felicia Hardy", "Carol Danvers", "Kitty Pryde", "Gwen Stacy", "Miles Morales",
            "Groot", "Rocket Raccoon", "Drax the Destroyer", "Gamora", "Star-Lord",
            "Mantis", "Nebula", "Yondu", "Black Panther", "Okoye",
            "Shuri", "M'Baku", "Nakia", "Erik Killmonger", "Ulysses Klaue",
            "Scarlet Witch", "Quicksilver", "Vision", "Agatha Harkness", "Darcy Lewis",
            "Jimmy Woo", "Monica Rambeau", "Nick Fury", "Maria Hill", "Phil Coulson",
            "Agent 13", "Sharon Carter", "Baron Zemo", "Red Skull", "Crossbones",
            "Iron Fist", "Colleen Wing", "Misty Knight", "Luke Cage", "Jessica Jones",
            "Daredevil", "Trish Walker", "Kingpin", "Bullseye", "Punisher",
            "Ghost Rider", "Moon Knight", "Black Cat", "White Tiger", "Silk",
            "Jessica Drew", "Spider-Woman", "Miles Morales", "Spider-Gwen", "Spider-Ham",
            "Green Goblin", "Doctor Octopus", "Electro", "Sandman", "Lizard",
            "Vulture", "Kraven the Hunter", "Mysterio", "Carnage", "Venom",
            "Thanos", "Black Order", "Corvus Glaive", "Proxima Midnight", "Ebony Maw",
            "Cull Obsidian", "Ronan the Accuser", "Kang the Conqueror", "Enchantress", "Taskmaster",
            "Abomination", "Malekith", "Hela", "Yellowjacket", "Aldrich Killian",
            "Red Hulk", "Surtur", "Whiplash", "Viper", "Zemo",
            "Arnim Zola", "Madame Hydra", "Crossbones", "Armadillo", "Jack O'Lantern",
            "Man-Wolf", "Living Laser", "Attuma", "M.O.D.O.K.", "Korath",
            "Mephisto", "The Leader", "Nightmare", "Living Tribunal", "Grandmaster",
            "Collector", "Ego the Living Planet", "Sentry", "Nova", "Adam Warlock",
            "Blue Marvel", "Hyperion", "Spectrum", "Quasar", "Molecule Man",
            "Thane", "Angela", "Nova", "Magus", "Death",
            "Sif", "Valkyrie", "Hogun", "Fandral", "Odin",
            "Frigga", "Volstagg", "Hela", "Skurge", "The Warriors Three",
            "Lady Sif", "Valkyrie", "Heimdall", "Grandmaster", "Korg",
            "Miek", "Hogun", "Fandral", "Eitri", "Yondu",
            "Kraglin Obfonteri", "Horuz", "Oblo", "Tullk", "Urur",
            "Korath", "King T'Chaka", "Queen Ramonda", "N'Jobu", "Zuri",
            "W'Kabi", "Shuri", "M'Baku", "Okoye", "Nakia",
            "Everett K. Ross", "Ayo", "Xoliswa", "Tilda Johnson", "N'Jadaka",
            "T'Chaka", "T'Challa", "Nakia", "Okoye", "M'Baku",
            "Everett K. Ross", "Zuri", "W'Kabi", "Shuri", "Ramonda",
            "N'Jadaka", "N'Jobu", "Zuri", "M'Baku", "Okoye",
            "Xoliswa", "Tilda Johnson", "River", "Jakarra", "Z'Nata",
            "Z'Maja", "Ch'thra", "Jul'R'Ch", "Y'Garon", "W'Kabi",
            "Imara", "The Falcon", "Korath", "Drax", "Gamora",
            "Groot", "Rocket Raccoon", "Nebula", "Yondu", "Ant-Man",
            "Wasp", "Hank Pym", "Scott Lang", "Hope Van Dyne", "Janet Van Dyne",
            "Ghost", "Sonny Burch", "Dave", "Kurt", "Cassie Lang",
            "Maggie Lang", "Peggy Carter", "The Winter Soldier", "Bucky Barnes", "Baron Zemo",
            "Baron Strucker", "Quicksilver", "Scarlet Witch", "Crossbones", "Agent 13",
            "General Thunderbolt Ross", "Everett K. Ross", "M'Baku", "N'Jobu", "N'Jadaka",
            "Zuri", "Okoye", "Nakia", "Shuri", "Queen Ramonda",
            "Ayo", "Xoliswa", "Tilda Johnson", "X-Con Security Crew", "Sonny Burch",
            "Dora Milaje", "Erik Selvig", "Hogun", "Volstagg", "Fandral",
            "JARVIS", "Heimdall", "Pepper Potts", "Jane Foster", "Betty Ross",
            "Frigga", "Kraglin Obfonteri", "Howard the Duck", "Cosmo the Spacedog", "Carina",
            "Irani Rael", "Nebula", "Peggy Carter", "The Winter Soldier", "Bucky Barnes",
            "Baron Zemo", "Baron Strucker", "Quicksilver", "Scarlet Witch", "Crossbones",
            "Agent 13", "General Thunderbolt Ross", "Everett K. Ross", "M'Baku", "N'Jobu",
            "N'Jadaka", "Zuri", "Okoye", "Nakia", "Shuri",
            "Queen Ramonda", "Ayo", "Xoliswa", "Tilda Johnson", "X-Con Security Crew",
            "Sonny Burch", "Dora Milaje", "Erik Selvig", "Hogun", "Volstagg",
            "Fandral", "JARVIS", "Heimdall", "Pepper Potts", "Jane Foster",
            "Betty Ross", "Frigga", "Kraglin Obfonteri", "Howard the Duck", "Cosmo the Spacedog",
            "Carina", "Irani Rael", "Nebula"
        };
        MemberList membersList = MemberList.getInstance();
        for (int i = 0; i < 500; i++) {
            String cedula = String.valueOf(10000000 + i);
            String nombre = nombres[i % nombres.length];
            String telefono = "555" + String.format("%04d", new Random().nextInt(10000));
            String correo = nombre.replaceAll(" ", "").toLowerCase() + "@example.com";
            Role rol = Role.values()[new Random().nextInt(Role.values().length)];
            membersList.insert(new Member(cedula, nombre, telefono, correo, rol));
        }
    }
}
