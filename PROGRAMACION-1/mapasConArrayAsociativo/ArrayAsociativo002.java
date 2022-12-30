import java.util.*;
public class ArrayAsociativo002 {
    final static int FILA = 0;
    final static int COLUMNA = 1;
    public static void main(String[] args) {

		String[] castilloLB = {
			"................................................................",
			"................................................................",
			".......                                                   ......",
			".....                                                       ....",
			"....                                                         ...",
			"...      ..................................                   ..",
			"...    .....................................          ....    ..",
			"..    .......................................        ......    .",
			"..    ..|-----|..........|-------------|.....    .|-----|..    .",
			"..   ...|::+::|..........O+++++++++++++|....    ..|::+::|...   .",
			"..   ...|:+++:|..........|+++++++++++++|...    ...|:+++:|...   .",
			"..   ...|+++++------------++|-------|++------------+++++|...   .",
			"..   ...|:++++++++++++++++++|#######|++++++++++++++++++:|...   .",
			"..   ...|::+++++++++++++++++|::###::|+++++++++++++++++::|...   .",
			"..   ...---|++|-------|-+++-|:*#*#*:|-----|---|---|++|---...   .",
			"..   ......|++|---O---|+++++|*******|#####|+++-$$$|++|......   .",
			"..   ......|++|*#***#*|+++++|*******|#####-+++O*$$|++|......   .",
			"..    .....|++|*#***#*|+++++|*******|+++++X+++|**$|++|......   .",
			"..    .....|++|*#####*|+++++O*******|+++++X+++|---|++|......   .",
			"..     ....|++|*******|--+--|--***--|+++++X+++-**$|++|......   .",
			"..      ...|++|--***--|+++++|::+++::|+++++|+++O*$$|++|......   .",
			"..       ..|++|+++++++|+++++|:+++++:|+++++|+++|$$$|++|......   .",
			"...      ..|++|+##+##+|------+++++++--+++|---|----|++|......   .",
			"....      .|++|+++++++|++++++++++++++++++|***|**#*|++|......   .",
			"....       |++|+##+##+|++++++++++++++++++|---|**##|++|......   .",
			".....      |++|+++++++|++++++++++++++++++|********|++|......   .",
			".....      |++|+##+##+--++|----+++----|++|***|****|++|......   .",
			"....      .|++|+++++++++++|:::+++++:::|++-------**|++|......   .",
			"....     ..|++|++++++++++:|::+++++++::|+++++++++++|++|......   .",
			"...      ..|++|-------|+::|:+++++++++:|+++++++++++|++|......   .",
			"...     ...|++|*******|----++++   ++++-------|----|++|......   .",
			"..      ...|++|**|---*|+++++++     ++++++++++|++++|++|......   .",
			"..     ....|++|**|*#**|+++++++     ++++++++++O++++|++|......   .",
			"..     ....|++|**|*#**|+++++++     ++++++++++|++++|++|......   .",
			"..    .....|++|**--|**|++++++++   ++++|-------++++|++|......   .",
			"..    .....|++|****|**|++++++++++++++:|+++++++++++|++|......   .",
			"..   ......|++|--**----+++++++++++++::|+-+++++++++|++|......   .",
			"..   ......|++|++++++++++++++++++++:::|+++++++++++|++|......   .",
			"..   ......|++|-------------|--+++--|----|+++|----|++|......   .",
			"..   ......|++|XXXXXXXXXXXXX|::+++::|#***|+++|***#|++|......   .",
			"..   ......|++|X+++++++++++X| :+++: |****|+++|****|++|......   .",
			"..   ......|++|X++XXXXXXXX+X|  +++  |--O--+++--O--|++|......   .",
			"..   ......|++|X++|-----|X+X|  +++  |+++++++++++++|++|......   .",
			"..   ......|++|X++|%%%%%|X+X| :+++: |--O-|+++|-O--|++|......   .",
			"..   ......|++|X++|*****|X+X|::+++::|****|+++|****|++|......   .",
			"..   ......|++|X++|#####|X+X| :+++: |#***|+++|***#|++|......   .",
			"..   ......|++|X++|*****|X+X|  +++  |-----+++-----|++|......   .",
			"..   ......|++|X++----**|X+X|  +++  |X+++++++++++%|++|......   .",
			"..   ......|++|X++++++++|X+X|  +++  |XX+++++++++%%|++|......   .",
			"..   ......|++|XXXXXXXXX|X+X| :+++: |XXX+++++++%%%|++|......   .",
			"..   ...|---++-----------X+X|::+++::|XXXX+++++%%%%|XX---|...   .",
			"..   ...|::++++++++++++++++X| :+++: |XXXXX+++%%%%%|***$$|...   .",
			"..   ...|:+++++++++++++++++X|  +++  |#############|****$|...   .",
			"..   ...|+++++|-------------|  +++  |-------------|*****|...   .",
			"..   ...|:+++:|.............| :+++: |.............|$***$|...   .",
			"..   ...|::+::|.............|::+++::|.............|$$*$$|...   .",
			"..    ..-------.............---+++---.............-------..    .",
			"..    .....................................................    .",
			"...    ...................................................    ..",
			"...      ......................+++......................      ..",
			"....                           +++                           ...",
			".....                          +++                          ....",
			".......                        +++                        ......",
			"...............................+++.............................."
		};

		String[] castilloEX = {
			"                                                                ",
			"                                          %%%%%%%%%%%%%%%%%%%%%%",
			"                                          %%%%%%%%%%%%%%%%%%%%%%",
			"                                          %%%%%%%%%%%%%%%%%%%%%%",
			"                                          %%%%%%%%%%%%%%%%%%%%%%",
			"                       |----------------|%%%%%%%%%%%%%%%%%%%%%%%",
			"                       |   ###%%%%###   |%%%%%%%%%%%%%%%%%%%%%%%",
			"                       |   ##      ##   |%%%%%%%%%%%%%%%%%%%%%%%",
			"             |------|  |   #  ****  #   |%%%%%%%%%%%%%%%%%%%%%%%",
			"             |******|  |     #****#     |%%%%%%%%%%%%%%%%%%%%%%%",
			"|--------|----******---|     #****#     |---------###%%%%%%%%%%%",
			"|===*****|******||*****|     #****#     |%%%*****O**#%%%%%%%%%%%",
			"|+===****|XX****||*****|    ###**###    |%%******|**#%%%%%%%%%%%",
			"|++|------XX|-----O-|**|    #%%**%%#    |%**|-----###%%%%%%%%%%%",
			"|++|******XX|*******|**|    #%%**%%#    |%****|%%%%%%%%%%%%%%%%%",
			"|++|********|*******|**|    #%%**%%#    |*****|%%%%%%%%%%%%%%%%%",
			"|++|-**------**-|---|**|    ###**###    |*****|%%%%%%%%%%%%%%%%%",
			"|++|#**#%%%%#**#|%%%|**-------****-------**|**|%%%%%%%%%%%%%%%%%",
			"|++|%**%%%%%%***|%%%|**********************|**|%%%%%%%%%%%%%%%%%",
			"|++|%**%|-|%%***|%%%|**********************|XX|%%%%%%%%%%%%%%%%%",
			"|++|**%%|-|%%#**|%%=|-------------|--|-----|XX---|%%%%%%%%%%%%%%",
			"|++|***%---%%***|%==|    *****    |**|=%%%%|XX***|%%%%%%%%%%%%%%",
			"|++|*#*%***%***%|===|             |**|==%%%|*****-----------|--|",
			"|++|%*********#%|===|     ***     |**|===|---||***%#%#%#%-**|%%|",
			"|++|%%*|***|*%%%|+==|    *+++*    |**|===||++||**********O**O*%|",
			"|++|%%%|***|%%%%|++=|    **+***   --O|=+=||++|-***%#%#%#%-**|%%|",
			"|++-----***------+++|    |#+#|*    **|+++||++|***|----------|%%|",
			"|++++++++++++++XX+++|    |+++|*******|+++--++|***-******%%%%|%%|",
			"|++++++++++++++XX+++------#+#---------+++XX++|***********%%%|%%|",
			"--------|-------|+++++++#=+++=#++++++++++XX++|***********%%%|%%|",
			"        |%%%%%%||++++++++++++++++++++++++|--------**%%***%%%|%%|",
			"   |-----%%%%%%||++++++++++++++++++++++++|++++++++%%%%%***%%|%%|",
			"   |*%%%%%%||%%|------------------***----|+++++++%%%%%%***%*|%%|",
			"   |**%%*%%||%%|                ##***#   |++--|-|%%%%%%%*****%%|",
			"   |%*|-O------|               #*****#   |++++|||%%%%%%***%***%|",
			"   |**|%*%%%%%%|               #****#    |++++|||+%%%%%**%%%|---",
			"   |**|%%%%%%%%|              #***##     |-|++|||++|---++|---   ",
			"   |*%------|%%|------|    |---***---|   |--++|--++|+++++|      ",
			"   |%%%***%%|%%|******|    |**%******|   |++++|++++|+++++|      ",
			"   |%%%%***%|%%-******|    |*%%%**%**|   |++++|++++|++|---      ",
			"   ------|**|%%%%*||**-####-%%%|-|%%*-###-++|-|++---++|         ",
			"         |*%|%%***||********%%%|-|%%%*****++|||+++++++|         ",
			"         |%%---|---|*******%%%%---%%******++|||+++++++|         ",
			"         |%%%**|----**|####|%%%%*%%%%|###|++----|++|---         ",
			"         |%%%%*|******|    |%%%***%%%|   |+++++||++|            ",
			"         ---|**|%*****|    |%%*****%%|   |+++++||++|            ",
			"            |*%|%%|----    ---|***|---   ---|++--++|            ",
			"            |%%|%%|           |***|         |++++++|            ",
			"            |%%-%%|           |***|         |++++++|            ",
			"            |%%%%%|          #|***|#        --------            ",
			"            |%%%%%|          #|***|#                            ",
			"            -------            +++                              ",
			"                               +++                              ",
			"                               +++                              ",
			"                               +++                              ",
			"                               +++                              ",
			"                               +++                              ",
			"                               +++                              ",
			"                               +++                              ",
			"                               +++                              ",
			"                               +++                              "			
		};

		int[] posicionPersonaje = {20,20};
        int viewPort = 10;

		imprimeMundo(castilloLB, posicionPersonaje, viewPort);
    }

	static void imprimeMundo(String[] castillo, int[] personaje, int viewPort){
        String elemento;
        imprimeLinea(viewPort);
		for (int fila=personaje[FILA]-viewPort; fila<personaje[FILA]+viewPort; fila++){
			for (int columna=personaje[COLUMNA]-viewPort; columna<personaje[COLUMNA]+viewPort; columna++) {
				
                if (fila==personaje[FILA] && columna==personaje[COLUMNA]) {
                    elemento = "_O_";
                } else {
                    elemento = mapea(castillo[fila].charAt(columna));
                }
                
                System.out.print(elemento);
			}
			System.out.println();
		}	
        imprimeLinea(viewPort);
	}

    static void imprimeLinea(int viewPort){
        System.out.println(mapea('_').repeat(viewPort*2));
    }

	static String mapea(char elemento){

        HashMap<String, String> tiles = new HashMap<>();
		
        tiles.put(" ", "   ");
		tiles.put(".", " . ");
		tiles.put("-", "[#]");
		tiles.put("=", "|||");
		tiles.put("|", "[#]");
		tiles.put(":", "oOo");
		tiles.put("+", "...");
		tiles.put("O", "[ ]");
		tiles.put("#", ".:.");
		tiles.put("*", "***");
		tiles.put("$", "$$$");
		tiles.put("X", "XXX");
		tiles.put("%", "%%%");
        tiles.put("_", "___");

		return tiles.get("" + elemento);

	}

}