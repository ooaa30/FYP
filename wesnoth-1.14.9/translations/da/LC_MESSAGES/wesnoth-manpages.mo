��    h      \  �   �      �  |   �     F	     M	     ^	     g	     �	  7   �	     �	  
   �	     �	  .   �	     "
  %   3
     Y
     i
     x
     �
  #   �
  3   �
  *   �
          .     ?  Q   Q  �   �  O   G     �     �     �     �     �     �     �            	        (     0     C  
   K     V  )   k     �  l   �  <        Q  -   d  	   �     �  8  �     �  =   a  �   �     6     C     P     U     ]     w     �     �  )   �     �     �  (   �  X     J   r     �  �   �  V   �  �   �  W   �     !     )  9   2  	   l     v  \     R   �  z   /     �  I   �  e     "   y     �  '   �     �  �   �  ^   �  �   �  e   �  w   ,  �   �  #   �     �  �   �  +   �     �  �   �     o  @   w     �  ;   �  J  �  �   H   	   �      �      �      �      !  7   $!     \!  
   i!     t!  .   �!     �!  $   �!     �!     �!     "     "  $   '"  3   L"  +   �"     �"     �"     �"  j   �"  �   K#  c   $     $     �$     �$     �$     �$     �$     �$     �$     �$  	   %     %     %     +%  
   3%     >%  )   S%     }%  k   �%  <   �%     8&  -   J&  	   x&     �&  P  �&  �   �(  C   a)  �   �)     L*     ]*     n*     s*     {*     �*     �*     �*  *   �*     �*     +  )   +  W   =+  I   �+     �+  �   �+  Y   �,  �   -  P   �-     H.     P.  9   Y.  	   �.     �.  n   �.  W   /  b   m/  "   �/  Q   �/  T   E0     �0     �0  &   �0     �0  �   1  R   �1  �   �1  i   �2  �   W3  
  �3  #   �4  "   5  �   45  2   �5     "6  �   B6     �6  @   �6     17  <   :7     [       	   J   .   I   (   c          +               #   ;           E   0   Y            \   $          a   C   8   5   >   =   '   %       *   F      ]   h   W   N   2      !   -   6   M   _   4                 R   f         D      e   O                         ^       9   T   G   ,       V           b              U   
   :       1       "           /       B          &      A      )   K   <       X      L   @       H                 P   g      d          Q          ?          7       S             Z   3   `       A comma separated list of versions to redirect. Behaves the same way as B<versions_accepted> in regard to wildcard patterns. AUTHOR B<--exit-at-end> B<--fps> B<--gunzip>I<\ infile.gz> B<--gzip>I<\ infile> B<--log->I<level>B<=>I<domain1>B<,>I<domain2>B<,>I<...> B<--nocache> B<--nogui> B<--nosound> B<-T\ >I<number>B<,\ --max-threads>I<\ number> B<-V, --version> B<-c\ >I<path>B<,\ --config>I<\ path> B<-d, --daemon> B<-d, --debug> B<-f, --fullscreen> B<-h, --help> B<-p\ >I<port>B<,\ --port>I<\ port> B<-r\ >I<X>B<x>I<Y>B<,\ --resolution\ >I<X>B<x>I<Y> B<-t\ >I<number>B<,\ --threads>I<\ number> B<-v, --verbose> B<-v, --version> B<-w, --windowed> B<[ban_time]> A tag to define convenient keywords for temporary ban time lengths. B<[proxy]> A tag to tell the server to act as a proxy and forward the connected client's requests to the specified server.  Accepts the same keys as B<[redirect]>. B<[redirect]> A tag to specify a server to redirect certain client versions to. B<ban_save_file> B<connections_allowed> B<disallow_names> B<fifo_path> B<host> B<max_messages> B<messages_time_period> B<motd> B<name> B<passwd> B<port> B<restart_command> B<time> B<version> B<versions_accepted> B<wesnoth> [I<OPTIONS>] [I<PATH_TO_DATA>] B<wesnothd> B<-V> B<wesnothd> [\|B<-dv>\|] [\|B<-c> I<path>\|] [\|B<-p> I<port>\|] [\|B<-t> I<number>\|] [\|B<-T> I<number>\|] Battle for B<Wesnoth> is a turn-based fantasy strategy game. Battle for Wesnoth Battle for Wesnoth multiplayer network daemon COPYRIGHT DESCRIPTION Defeat all enemy leaders using a well-chosen cadre of troops, taking care to manage your resources of gold and villages. All units have their own strengths and weaknesses; to win, deploy your forces to their best advantage while denying your foes the chance to do the same. As units gain experience, they acquire new abilities and become more powerful. Play in your own language and test your skill against a smart computer opponent, or join Wesnoth's large community of online players. Create your own custom units, scenarios or campaigns, and share them with others. Edited by Nils Kneuper E<lt>crazy-ivanovic@gmx.netE<gt>, ott E<lt>ott@gaon.netE<gt> and Soliton E<lt>soliton.de@gmail.comE<gt>. Example: B<versions_accepted="*"> accepts any version string. Full or relative path to a (gzip compressed) file that the server can read and write.  Bans will be saved to this file and read again on server start. Global keys: Global tags: NAME OPTIONS Options for --multiplayer SEE ALSO SERVER CONFIG SYNOPSIS The address of the server to redirect to. The general syntax is: The message of the day. The name used to reference the ban time. The number of allowed connections from the same IP. B<0> means infinite. (default: B<5>) The number of allowed messages in B<messages_time_period>. (default: B<4>) The port to connect to. The side-specific multiplayer options are marked with I<number>.  I<number> has to be replaced by a side number. It usually is 1 or 2 but depends on the number of players possible in the chosen scenario. The time period (in seconds) message flooding is detected in. (default: B<10> seconds) This is Free Software; this software is licensed under the GPL version 2, as published by the Free Software Foundation.  There is NO warranty; not even for MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. This manual page was originally written by Cyril Bouthors E<lt>cyril@bouthors.orgE<gt>. WESNOTH WESNOTHD Written by David White E<lt>davidnwhite@verizon.netE<gt>. [/I<tag>] [I<tag>] binds the server to the specified port. If no port is specified, port B<15000> will be used. compresses a file in gzip format, stores it as I<infile>.gz and removes I<infile>. decompresses a file which should be in gzip format and stores it without the .gz suffix. The I<infile.gz> will be removed. disables caching of game data. displays a summary of command line options to standard output, and exits. displays the number of frames per second the game is currently running at, in a corner of the screen. runs the game in full screen mode. runs the game in windowed mode. runs the game without sounds and music. runs wesnothd as a daemon. selects a faction of the current era for this side. The faction is chosen by an id. Factions are described in the data/multiplayer.cfg file. selects a multiplayer scenario by id. The default scenario id is B<multiplayer_The_Freelands>. sets additional parameters for this side. This parameter depends on the options used with B<--controller> and B<--algorithm>.  It should only be useful for people designing their own AI. (not yet documented completely) sets the maximum number of waiting worker threads for network I/O to n (default: B<5>,\ max:\ B<30>). sets the maximum number of worker threads that will be created.  If set to B<0> there will be no limit (default: B<0>). sets the severity level of the log domains.  B<all> can be used to match any log domain. Available levels: B<error>,\ B<warning>,\ B<info>,\ B<debug>.  By default the B<error> level is used and the B<info> level for the B<server> domain. shows the version number and exits. shows version number and exits. tells wesnothd where to find the config file to use. See the section B<SERVER CONFIG> below for the syntax. You can reload the config with sending SIGHUP to the server process. tells you what the command line options do. turns debug logging on. use this option to play in the selected era instead of the B<Default> era. The era is chosen by an id. Eras are described in the B<data/multiplayer/eras.cfg> file. wesnoth wesnoth - Battle for Wesnoth, a turn-based fantasy strategy game wesnothd wesnothd - Battle for B<Wesnoth> multiplayer network daemon Project-Id-Version: Battle for Wesnoth 1.3-dev
PO-Revision-Date: 2008-10-07 17:58+0200
Last-Translator: Joe Hansen <joedalton2@yahoo.dk>
Language-Team: Danish <dansk@dansk-gruppen.dk>
Language: da
MIME-Version: 1.0
Content-Type: text/plain; charset=UTF-8
Content-Transfer-Encoding: 8bit
Plural-Forms: nplurals=2; plural=(n != 1);
 En kommasepareret liste af versioner som omdirigeres. Fungerer på samme måde som B<versions_accepted> i forhold til wildcard patterns. FORFATTER B<--exit-at-end> B<--fps> B<--gunzip>I<\ infile.gz> B<--gzip>I<\ infile> B<--log->I<level>B<=>I<domain1>B<,>I<domain2>B<,>I<...> B<--nocache> B<--nogui> B<--nosound> B<-T\ >I<nummer>B<,\ --max-threads>I<\ nummer> B<-V, --version> B<-c,\ >I<sti>B<,\ --config>I<\ sti> B<-d, --daemon> B<-d, --debug> B<-f, --fullscreen> B<-h, --help> B<-p,\ >I<port>B<,\ --port>I<\ port> B<-r\ >I<X>B<x>I<Y>B<,\ --resolution\ >I<X>B<x>I<Y> B<-t,\ >I<nummer>B<,\ --threads>I<\ nummer> B<-v, --verbose> B<-v, --version> B<-w, --windowed> B<[ban_time]> Et mærke der kan definere praktiske nøgleord for midlertidige længder af karantænetider. B<[proxy]> Et mærke som fortæller serveren den skal fungere som en proxy og og videresende den forbundne klients forespørgsler til den specificerede server.  Accepterer de samme nøgler som B<[redirect]>. B<[redirect]> Et mærke som specificerer en anden server hvortil visse klientversioner omdirigeres. B<ban_save_file> B<connections_allowed> B<disallow_names> B<fifo_path> B<host> B<max_messages> B<messages_time_period> B<motd> B<name> B<passwd> B<port> B<restart_command> B<time> B<version> B<versions_accepted> B<wesnoth> [I<TILVALG>] [I<STI_TIL_DATA>] B<wesnothd> B<-V> B<wesnothd> [\|B<-dv>\|] [\|B<-c> I<sti>\|] [\|B<-p> I<port>\|] [\|B<-t> I<nummer>\|] [\|B<-T> I<nummer>\|] Kampen om B<Wesnoth> er et rundebaseret fantasistrategispil. Kampen om Wesnoth Kampen om Wesnoth flerspiller-netværksdæmon OPHAVSRET BESKRIVELSE Besejr alle fjendtlige ledere med en velvalgt skare af tropper, sørg for at bruge dine ressourcer af guld og landsbyer. Alle enheder har deres styrker og svagheder; for at vinde så sæt dine tropper ind hvor de kan bruge deres fordele mens du forhindrer din modstander i at gøre det samme. Efterhånden som enheder opnår erfaring, så opnår de nye evner og bliver mere magtfulde. Spil på dit eget sprog og test dig selv mod computeren eller tilslut dig de mange andre spillere der spiller på nettet mod hinanden. Skab dine egne enheder, scenarier eller kampagner, og del dem med andre. Redigeret af Nils Kneuper E<lt>crazy-ivanovic@gmx.netE<gt>, ott E<lt>ott@gaon.netE<gt> og Soliton E<lt>soliton.de@gmail.comE<gt>. Eksempel: B<versions_accepted="*"> acceptere enhver versionsstreng. Fuld eller relativ sti til en (gzip-pakket) fil som serveren kan læse og skrive til.  Karantæner vil blive gemt i denne fil, og indlæst når serveren startes igen. Globale nøgler: Globale mærker: NAVN TILVALG Indstillinger for --multiplayer SE OGSÅ SERVERINDSTILLING SYNOPSIS Adressen på serveren der omdirigeres til. Den generelle syntaks er: Dagens besked. Navnet der refererer til karantænetiden. Antallet af tilladte forbindelser fra samme IP. B<0> betyder uendelig. (standard: B<5>) Antallet af tilladte beskeder i B<messages_time_period>. (Standard: B<4>) Forbindelsesport. Denne sideafhængig flerspillerindstilling er markeret med I<nummer>.  I<nummer> skal erstattes af et sidenummer. Det er normalt 1 eller 2 men er afhængigt af antallet af mulige spillere i det valgte scenarie. Tidsperioden (i sekunder) hvor beskeders flooding registreres. (Standard: B<10> sekunder) Dette er fri programmel; programmellet er udgivet under GPL version 2, der er offentliggjort af Free Software Foundation. Der er ingen garanti; selv ikke for at spillet virker eller kan bruges til en konkret formål. Denne manual blev først skrevet af Cyril Bouthors E<lt>cyril@bouthors.orgE<gt>. WESNOTH WESNOTHD Skrevet af David White E<lt>davidnwhite@verizon.netE<gt>. [/I<tag>] [I<tag>] tildeler serveren til den specificerede port. Hvis ingen port er specificeret vil port B<15000> blive anvendt. komprimerer en fil i gzip-format, gemmer den som I<valgtfil>.gz og fjerner I<valgtfil>. pakker en fil som bør være i gzip-format og gemmer den uden gz endelsen. I<valgtfil.gz> fjernes. slår mellemlager af spildata fra. viser et overblik over kommandolinjemuligheder til standard uddata, og afslutter. viser antallet af billeder per sekund spilles afvikles med i et hjørne af skærmen. afvikler spillet i fuldskærm. afvikler spillet i et vindue. afvikler spillet uden lyd eller musik. kør wesnothd som en dæmon. vælger en fraktion for den nuværende æra til denne side. Fraktionen vælges via en id. Fraktioner er beskrevet i data/multiplayer.cfg filen. vælger et flerspillerscenarie. Standardscenariet er B<multiplayer_The_Freelands>. sætter yderligere indstillinger for denne side. Denne indstilling er afhængig af valgene for B<--controller> og B<--algorithm>.  Den er beregnet for folk der selv designer deres egen computerspiller. (ikke dokumenteret ordentligt endnu) indstiller det maksimale antal af ventende tråde til netværk I/O til n (standard: B<5>,\ maks:\ B<30>). indstiller det maksimale antal af tråde som bliver lavet.  Hvis den sættes til B<0> vil der ikke være en begrænsning (standard: B<0>). indstiller strenghedsniveauet på fejlsøgningsdomænerne.  B<all> kan bruges til alle fejlsøgningsdomæner. Tilgængelige niveauer: B<fejl>,\ B<advarsel>,\ B<info>,\ B<fejlsøgning>.  Som standard bruges B<fejl>-niveauet og B<info>-niveauet for B<server>-domænet. viser versionnummeret og afslutter. viser versionsnummer og afslutter. fortæller wesnothd hvor den skal finde konfigurationsfilen. Se afsnittet B<SERVERINDSTILLING> nedenfor for syntaks. Du kan hente konfigurationen ved at sende SIGHUP til serverprocessen. fortæller dig hvad kommandolinje-tilvalgene gør. tænder for mere uddybende log. brug dette tilvalg for at spille i den valgte æra fremfor i B<Default> æraen. Æra vælges via dens id. Æraerne er beskrevet i B<data/multiplayer/eras.cfg>-filen. wesnoth wesnoth - Kampen om Wesnoth, et rundebaseret fantasistrategispil wesnothd wesnothhd - Kampen om B<Wesnoth> flerspiller netværksdæmon 