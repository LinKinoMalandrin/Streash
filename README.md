# Streash

## Fonctionnement

Pour lancer votre interface shell, veuillez lancer la classe Console :
Chemin : bin/streash/console/Console.class    
Ou alors utiliser eclipse en selectionnant le dossier "Streash" comme projet.


Voici plusieurs instructions pour vous permettre au mieux d'utiliser votre console :

- Il vous ait possible de changer la notation. Au lancement du shell, la notation est en notation polonaise inversée. Pour pouvoir passer à une notation polonaise simple veuillez indiquer dans la console "/notation npr". Pour repassez à une notation polonaise inversée, veuillez indiquer dans la console "/notation npi".

- Pour avoir des informations sur les développeurs de ce projet veuillez indiquer dans la console "/about".


## Fonctions

### Streams ajoutés 

- distinct(Stream) : Supprime toutes les répétitions présentes dans le stream. Renvoie un nouveau stream où chaque élément est différent.

- split(String, String) / split(StringStream, String) : Split la chaine passée en premier paramètre par la chaine passée en deuxième paramètre  / Split chaque élément du stream par la chaine passée en deuxième paramètre. 
--> Renvoie un stream contenant les éléments du/des string(s) découpés.  

- mapwhere(Stream, FilterLambda, Operator, Operand, MapLambda) : Renvoie un map contenant les élements du Stream qui sont validés par le FilterLambda.

- prime(x) : Renvoie un stream des nombres premiers supérieurs à x. (x DOIT ETRE UN NOMBRE)

### Puits ajoutés

-count(stream, x) : Renvoie le nombre de fois que x apparait dans le Stream. (x DOIT ETRE DE MEME TYPE QUE LES ELEMENTS DU STREAM)

-join(StringStreamn String) : Join les éléments du stream par la chaine passée en deuxième paramètre. 


BARBERET Rémy
BUCZKO Mélissa
COLIN Armand
CHARDON Léo
