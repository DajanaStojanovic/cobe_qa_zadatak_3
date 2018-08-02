# QA zadatak, 3. zadatak
### Dajana Stojanović, dajana.stojanovic994@gmail.com



# Što sam napravila?
Moja ideja je bila napraviti basic automation test za stranicu https://www.mingo.hr. 
Cijeli test se pokreće pokretanjem samo <a href="https://github.com/DajanaStojanovic/cobe_qa_zadatak_3/blob/master/MingoTests/src/test/java/hr/mingo/PostaviPitanje.java" target="_blank">jedne java klase</a>.

Test obuhvaća:
1. Otvaranje Chrome preglednika,  maximiziranje preglednika i odlazak na željeni URL (<a href="https://github.com/DajanaStojanovic/cobe_qa_zadatak_3/blob/master/Mingo/src/main/java/hr/mingo/Browser.java" target="_blank">code</a>);
2. Scroll do elementa 'Postavi pitanje', klik na element i čekanje da se element otvori (<a href="https://github.com/DajanaStojanovic/cobe_qa_zadatak_3/blob/master/Mingo/src/main/java/hr/mingo/PosPitanje.java" target="_blank">code, line 23-34</a>);
3. Popunjavanje svih polja, odabiranje iz dropdown-a i odabiranje radio buttona (<a href="https://github.com/DajanaStojanovic/cobe_qa_zadatak_3/blob/master/Mingo/src/main/java/hr/mingo/PosPitanje.java" target="_blank">code, line 36-70</a>); <br />
3.1 Opcije iz dropdown-a se random odabiru (<a href="https://github.com/DajanaStojanovic/cobe_qa_zadatak_3/blob/master/Mingo/src/main/java/hr/mingo/variables/GlobalVariables.java" target="_blank">code, line 13-17</a>);<br />
3.2. Radio button-i se isto tako random odabiru (<a href="https://github.com/DajanaStojanovic/cobe_qa_zadatak_3/blob/master/Mingo/src/main/java/hr/mingo/variables/GlobalVariables.java" target="_blank">code, line 19-22</a>);
4. Provjera validacije polja na način da se iz jednog po jednog polja brišu popunjeni podaci i klika se na button 'Pošalji'. Nakon toga se provjerava pojavljuje li se poruka validacije tamo gdje bi se trebala pojaviti te se polje ponovno popunjava (<a href="https://github.com/DajanaStojanovic/cobe_qa_zadatak_3/blob/master/Mingo/src/main/java/hr/mingo/PosPitanje.java" target="_blank">code, line 70-118</a>);
5. Slanje obrasca (<a href="https://github.com/DajanaStojanovic/cobe_qa_zadatak_3/blob/master/Mingo/src/main/java/hr/mingo/PosPitanje.java" target="_blank">code, line 120-123</a>). 

# Što bih još napravila?
1. Prvenstveno bih odvojila testove za popunjavanje polja i provjeru validacije polja te bih dodala testove za provjeru ispravnosti linkova. 
2. Napisala bih testove koji će provjeravati responsive na način da će resize-at preglednik na određenu rezoluciju i napraviti screenshot koji se sprema u lokalni file. 
3. Izradila bih variablu pomoću koje će se moći odabirati u kojem browser-u želimo pokrenuti test (i pripremila sve drivere za browsere) te ako variabla nije popunjena neka se odabere random browser od onih koji budu ponuđeni u testu.
4. E sad, ovdje nije bilo registracije, ali da stranica ili aplikacija ima registraciju ili nekakvo unošenje podataka u sustav, napravila bih test koji ispunjava sve inpute i šalje popunjenu formu. Napisala bih test za provjeru podataka, točnije jesu li se podaci ispravno zapisali u bazu i je li s ispravno prikazuju na front-u. Ono što bih isto provjerila na registraciji ili bilo gdje gdje se upisuju podaci koji se ne bi smjeli ponavljati u bazi jest upisivanje podataka već zapisanih u bazu i provjeru validacije.
5. Ukoliko sustav šalje mail template kada se izvrši određena akcija, provjerila bih stižu li mail template-i te jesu li stigli ispravni.
