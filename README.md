#    <center> PSO Bot </center>

<br>
The purpose of this project is to create a bot that can "communicate" or "interact" with streamers who are watching RetrogradeX's Phantasy Star Online livestream. Not just any bot, however, because this bot actually controls the in-game character seen on stream. his project utilizes the Java Robots lib and essentially automates keypresses so that the in-game character types them into chat.<br>

Currently, it can read a textfile containing strings and newlines, and parse them into an array of split string arrays. The purpose of this structure is so I can easily invoke certain keypresses through their respective characters, once I define said keypresses in a uniform way. This feature is strictly for passing chat messages from a textfile (or eventually, maybe Twitch chat) to the game.

In the future, I would love to implement the [Java-Twirk](https://github.com/Gikkman/Java-Twirk) lib that will allow me to create custom chat commands that will trigger in game responses (ie. the command "!teleport forest" would teleport the character to Forest 1) as well as passing certain chats from users directly to the game. I would also like to implement a feature that creates travel routes for the character.

Essentially, the opportunities are endless with this. I can automate any series of keypresses or key holds, or even something along the lines of an in-game voting system. I'm thinking something along the lines of Twitch Plays Pokemon, but way more casual.

Also, in the process of trying to create some cool custom commands, I've been attempting to reverse engineer many of the old trainers from back in the days of PSO PC (King Arthur and Hipopo namely). I've managed to find some cool hacks with CheatEngine, but certain things (like area warping) are tougher for me to figure out (somewhere out there, pG and GUK are laughing at me). If you're reading this and have suggestions on that, please leave a comment / issue on this repo.

Check back for updates on this project soon!

