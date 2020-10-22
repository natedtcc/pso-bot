#    <center> PSO Bot </center>


The purpose of this project is to create a bot that can "communicate" or "interact" with streamers who are watching RetrogradeX's Phantasy Star Online livestream. Not just any bot, however, because this bot actually controls the in-game character seen on stream.

Some things I want to accomplish with this project:
(highly subject to change!)

- [x] Have the bot type chat commands read from a textfile
- [x] Make the bot warp from area to area in-game
- [ ] (maybe) Have the bot greet viewers who join / follow the channel
- [ ] Have the bot move around based on location
- [ ] Design the bot to attack enemies and heal itself if need be
- [ ] Implement a cross-chat feature (chat from Twitch -> chat to game)
- [ ] Create a sub-bot that will feed mags


This project utilizes a Java lib known as WGTools (a rather obscure, simplified version of the JNA library), so shout out to the chap that wrote it. 

In the future, I would love to implement the [Java-Twirk](https://github.com/Gikkman/Java-Twirk) lib that will allow me to create custom chat commands that will trigger in game responses (ie. the command "!teleport forest" would teleport the character to Forest 1) as well as passing certain chats from users directly to the game. 

Head to [Twitch](https://twitch.tv/retrogradex) to check out the stream, and check back for more updates on this project.
