package comp1110.ass2;


import java.util.*;

/*
 * This class provides the text interface for the Warring States game
 */
public class WarringStatesGame {

    /**
     * Determine whether a card placement is well-formed according to the following:
     * - it consists of exactly three characters
     * - the first character is in the range a..g (kingdom) or is z (Zhang Yi)
     * - the second character is numeric, and is a valid character number for that kingdom (9 for Zhang Yi)
     * - the third character is in the range A .. Z or 0..9 (location)
     *
     * @param cardPlacement A string describing a card placement
     * @return true if the card placement is well-formed
     *
     * Authority: Ruimin Chu
     */
    static boolean isCardPlacementWellFormed(String cardPlacement) {
        char[] k = cardPlacement.toCharArray();
        char first = k[0]; /* to store the first character*/
        char second = k[1]; /* to store the second character*/
        char third = k[2]; /* to store the third character*/
        if (!((third >= 'A' && third <= 'Z')||(third >= '0' && third <= '9'))) {
            return false; /*if teh third character is not in the range A .. Z or 0..9, return false;*/
        } else {  /* after pass the test for third character, then check first and second based on the which kingdom that card is from */
            if (first == 'a') {
                if (second >= '0' && second <= '7') {
                    return true;
                } else {
                    return false;
                }
            } else if (first == 'b') {
                if (second >= '0' && second <= '6') {
                    return true;
                } else {
                    return false;
                }
            } else if (first == 'c') {
                if (second >= '0' && second <= '5') {
                    return true;
                } else {
                    return false;
                }
            } else if (first == 'd') {
                if (second >= '0' && second <= '4') {
                    return true;
                } else {
                    return false;
                }
            } else if (first == 'e') {
                if (second >= '0' && second <= '3') {
                    return true;
                } else {
                    return false;
                }
            } else if (first == 'f') {
                if (second >= '0' && second <= '2') {
                    return true;
                } else {
                    return false;
                }
            } else if (first == 'g') {
                if (second >= '0' && second <= '1') {
                    return true;
                } else {
                    return false;
                }
            } else if (first == 'z') {
                if (second == '9') {
                    return true;
                } else {
                    return false;
                }
            } else{
                return false;
            }
        }
    }

    /**
     * Determine whether a placement string is well-formed:
     * - it consists of exactly N three-character card placements (where N = 1 .. 36);
     * - each card placement is well-formed
     * - no card appears more than once in the placement
     * - no location contains more than one card
     * @param placement A string describing a placement of one or more cards
     * @return true if the placement is well-formed
     *
     * authority: Xing Meng
     */



    static boolean isPlacementWellFormed(String placement) {
        if(placement == null || placement == "") {
            return false;
        }else {
            if(!(placement.length() % 3 == 0)){
                return false;
            } else {
                char[] l = placement.toCharArray();
                int a = 0;
                for(int i = 2; i < placement.length(); i = i + 3) {
                    if(l[i] == 'A' || l[i] == 'B' || l[i] == 'C' || l[i] == 'D' || l[i] == 'E' || l[i] == 'F' || l[i] == 'G' || l[i] == 'H' || l[i] == 'I' || l[i] == 'J' || l[i] == 'K' || l[i] == 'L' || l[i] == 'M' || l[i] == 'N' || l[i] == 'O' || l[i] == 'P' || l[i] == 'Q' || l[i] == 'R' || l[i] == 'S' || l[i] == 'T' || l[i] == 'U' || l[i] == 'V' || l[i] == 'W' || l[i] == 'X' || l[i] == 'Y' || l[i] == 'Z' || l[i] == '0' || l[i] == '1' || l[i] == '2' || l[i] == '3' || l[i] == '4' || l[i] == '5' || l[i] == '6' || l[i] == '7' || l[i] == '8' || l[i] == '9'){
                        for (int j = i + 3; j < placement.length(); j = j + 3) {
                            if (l[i] == l[j]) {
                                return false;
                            }else{
                                a++;
                            }
                        }
                    }else{
                        return false;
                    }
                }

                for(int x = 0; x < (placement.length() - 2); x = x + 3){
                    if(l[x] == 'a'){
                        if(l[x + 1] == '0' || l[x + 1] == '1' || l[x + 1] == '2' || l[x + 1] == '3' || l[x + 1] == '4' || l[x + 1] == '5' || l[x + 1] == '6' || l[x + 1] == '7'){
                            for(int y = x + 3; y < (placement.length() - 2); y = y + 3) {
                                if (l[y] == 'a') {
                                    if (l[x + 1] == l[y + 1]) {
                                        return false;
                                    }
                                }
                            }
                        }else{
                            return false;
                        }
                    }else if(l[x] == 'b'){
                        if(l[x + 1] == '0' || l[x + 1] == '1' || l[x + 1] == '2' || l[x + 1] == '3' || l[x + 1] == '4' || l[x + 1] == '5' || l[x + 1] == '6'){
                            for(int y = x + 3; y < (placement.length() - 2); y = y + 3) {
                                if (l[y] == 'b') {
                                    if (l[x + 1] == l[y + 1]) {
                                        return false;
                                    }
                                }
                            }
                        }else{
                            return false;
                        }
                    }else if(l[x] == 'c'){
                        if(l[x + 1] == '0' || l[x + 1] == '1' || l[x + 1] == '2' || l[x + 1] == '3' || l[x + 1] == '4' || l[x + 1] == '5'){
                            for(int y = x + 3; y < (placement.length() - 2); y = y + 3) {
                                if (l[y] == 'c') {
                                    if (l[x + 1] == l[y + 1]) {
                                        return false;
                                    }
                                }
                            }
                        }else{
                            return false;
                        }
                    }else if(l[x] == 'd'){
                        if(l[x + 1] == '0' || l[x + 1] == '1' || l[x + 1] == '2' || l[x + 1] == '3' || l[x + 1] == '4'){
                            for(int y = x + 3; y < (placement.length() - 2); y = y + 3) {
                                if (l[y] == 'd') {
                                    if (l[x + 1] == l[y + 1]) {
                                        return false;
                                    }
                                }
                            }
                        }else{
                            return false;
                        }
                    }else if(l[x] == 'e'){
                        if(l[x + 1] == '0' || l[x + 1] == '1' || l[x + 1] == '2' || l[x + 1] == '3'){
                            for(int y = x + 3; y < (placement.length() - 2); y = y + 3) {
                                if (l[y] == 'e') {
                                    if (l[x + 1] == l[y + 1]) {
                                        return false;
                                    }
                                }
                            }
                        }else{
                            return false;
                        }
                    }else if(l[x] == 'f'){
                        if(l[x + 1] == '0' || l[x + 1] == '1' || l[x + 1] == '2'){
                            for(int y = x + 3; y < (placement.length() - 2); y = y + 3) {
                                if (l[y] == 'f') {
                                    if (l[x + 1] == l[y + 1]) {
                                        return false;
                                    }
                                }
                            }
                        }else{
                            return false;
                        }
                    }else if(l[x] == 'g'){
                        if(l[x + 1] == '0' || l[x + 1] == '1'){
                            for(int y = x + 3; y < (placement.length() - 2); y = y + 3) {
                                if (l[y] == 'g') {
                                    if (l[x + 1] == l[y + 1]) {
                                        return false;
                                    }
                                }
                            }
                        }else{
                            return false;
                        }
                    }else if(l[x] == 'z'){
                        if(l[x + 1] == '9'){
                            for(int y = x + 3; y < (placement.length() - 2); y = y + 3) {
                                if (l[y] == 'z') {
                                    if (l[x + 1] == l[y + 1]) {
                                        return false;
                                    }
                                }
                            }
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     *
     * - the location char is in the range A .. Z or 0..9
     * - there is a card at the chosen location;
     * - the location is in the same row or column of the grid as Zhang Yi's current position; and
     * - drawing a line from Zhang Yi's current location through the card at the chosen location,
     *   there are no other cards along the line from the same kingdom as the chosen card
     *   that are further away from Zhang Yi.
     * @param placement the current placement string
     * @param locationChar a location for Zhang Yi to move to
     * @return true if Zhang Yi may move to that location
     *
     * Authority: Ruimin Chu
     */
    public static boolean isMoveLegal(String placement, char locationChar) {
        char[] a = placement.toCharArray(); /*convert string to a char[]*/
        char zyl = ' '; /* initialize Zhang Yi's location*/
        for (int i = 0; i < a.length - 2; i += 3){
            if(a[i] == 'z'){
                zyl = a[i+2]; /* store Zhang Yi's location*/
            }
        }
        if (zyl == locationChar){
            return false;
        }
        /*first check if that location Character is in the range A .. Z or 0..9 */
        if (!((locationChar >= 'A' && locationChar <= 'Z')||(locationChar >= '0' && locationChar <= '9'))){
            return false;
        }else{
            int c = 0;
            for (int i = 2; i<placement.length(); i += 3){
                if(a[i] == locationChar) {
                    c = 1; /*if that locationChar still has a card on it change c from 0 to 1 so later if c==0 then return false*/
                }
            }
            if (c==0){
                return false;
            } else{
                if(!rowNcol(zyl,locationChar)){
                    return false; /*rowNcol function tests if zy's location is on the same row or the same column as locationChar*/
                }else{
                    if(!sameKingdom(locationChar,zyl,placement)){
                        return false; /* sameKingdom function tests if there is any other cards along the line from the same kingdom as the chosen card that are further away from Zhang Yi.*/
                    }else {
                        return true; /* if pass all the tests above, return true*/
                    }
                }
            }
        }
    }

    /**
     *
     * @param location
     * @param zy
     * @param placement
     * @return true if there are no other cards along the line from the same kingdom as the chosen card
     *   that are further away from Zhang Yi.
     * Authority: Ruimin Chu
     */
    static boolean sameKingdom(char location, char zy,  String placement) {
        char[][] row = {{'A', 'G', 'M', 'S', 'Y', '4'}, {'B', 'H', 'N', 'T', 'Z', '5'}, {'C', 'I', 'O', 'U', '0', '6'}, {'D', 'J', 'P', 'V', '1', '7'}, {'E', 'K', 'Q', 'W', '2', '8'}, {'F', 'L', 'R', 'X', '3', '9'}};
        char[][] col = {{'A', 'B', 'C', 'D', 'E', 'F'}, {'G', 'H', 'I', 'J', 'K', 'L'}, {'M', 'N', 'O', 'P', 'Q', 'R'}, {'S', 'T', 'U', 'V', 'W', 'X'}, {'Y', 'Z', '0', '1', '2', '3'}, {'4', '5', '6', '7', '8', '9'}};
        char[] r = {};
        char[] c = {};
        char[] pm = placement.toCharArray();
        for (int i = 0; i < 6; i++) {
            char[] h = row[i];
            for (int p = 0; p < 6; p++) {
                char b = h[p];
                if (b == zy) {
                    r = h;
                    break;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            char[] f = col[i];
            for (int p = 0; p < 6; p++) {
                char b = f[p];
                if (b == zy) {
                    c = f;
                    break;
                }
            }
        }
        if (String.valueOf(r).contains(Character.toString(location))) {
            int l = String.valueOf(r).indexOf(location);
            int z = String.valueOf(r).indexOf(zy);
            char k = ' ';
            for (int i = 2; i < placement.length(); i += 3) {
                if (pm[i] == location) {
                    k = pm[i - 2];
                }
            }
            if (z < l) {
                for (int i = l + 1; i < 6; i++) {
                    char test = ' ';
                    for (int j = 2; j < placement.length(); j += 3) {
                        if (pm[j] == r[i]) {
                            test = pm[j - 2];
                            if (test == k) {
                                return false;
                            }
                        }
                    }
                }
            } else {
                for (int i = l -1; i >=0; i--) {
                    char test = ' ';
                    for (int j = 2; j < placement.length(); j += 3) {
                        if (pm[j] == r[i]) {
                            test = pm[j - 2];
                            if (test == k) {
                                return false;
                            }
                        }
                    }
                }
            }
        } else {
            int l = String.valueOf(c).indexOf(location);
            int z = String.valueOf(c).indexOf(zy);
            char k = ' ';
            for (int i = 2; i < placement.length(); i += 3) {
                if (pm[i] == location) {
                    k = pm[i - 2];
                }
            }
            if (z < l) {
                for (int i = l + 1; i < 6; i++) {
                    char test = ' ';
                    for (int j = 2; j < placement.length(); j += 3) {
                        if (pm[j] == c[i]) {
                            test = pm[j - 2];
                            if (test == k) {
                                return false;
                            }
                        }
                    }
                }
            } else {
                for (int i = l -1; i >=0; i--) {
                    char test = ' ';
                    for (int j = 2; j < placement.length(); j += 3) {
                        if (pm[j] == c[i]) {
                            test = pm[j - 2];
                            if (test == k) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    /**
     *
     * @param zy
     * @param location
     * @return true if the location is the on the same row or same column as ZY
     *
     * Authority: Ruimin Chu
     */
    static boolean rowNcol(char zy,char location) {
        char[][] row = {{'A','G','M','S','Y','4'},{'B','H','N','T','Z','5'},{'C','I','O','U','0','6'},{'D','J','P','V','1','7'},{'E','K','Q','W','2','8'},{'F','L','R','X','3','9'}};
        char[][] col = {{'A','B','C','D','E','F'},{'G','H','I','J','K','L'},{'M','N','O','P','Q','R'},{'S','T','U','V','W','X'},{'Y','Z','0','1','2','3'},{'4','5','6','7','8','9'}};
        char[] r = {};
        char[] c = {};
        for (int i = 0; i < 6; i++){
            char[] a = row[i];
            for (int p = 0; p < 6; p++){
                char b = a[p];
                if (b == zy){
                    r = a;
                    break;
                }
            }
        }
        for (int i = 0; i < 6; i++){
            char[] a = col[i];
            for (int p = 0; p < 6; p++){
                char b = a[p];
                if (b == zy){
                    c = a;
                    break;
                }
            }
        }
        for (int i = 0; i < 6; i++ ){
            char k = r[i];
            if (k == location){
                return true;
            }
        }
        for (int i = 0; i < 6; i++ ){
            char k = c[i];
            if (k == location){
                return true;
            }
        }
        return false;
    }

    /**
     * Determine whether a move sequence is valid.
     * To be valid, the move sequence must be comprised of 1..N location characters
     * showing the location to move for Zhang Yi, and each move must be valid
     * given the placement that would have resulted from the preceding sequence
     * of moves.
     *
     * @param setup        A placement string representing the board setup
     * @param moveSequence a string of location characters representing moves
     * @return True if the placement sequence is valid
     *
     * authority: Ruimin Chu
     */
    static boolean isMoveSequenceValid(String setup, String moveSequence) {
        String placement = setup;
        for (int i = 0; i < moveSequence.length(); i++){
            for (int j = 0; j < placement.length(); j += 3){
                if (placement.charAt(j) == 'z'){
                    if (placement.charAt(j+2) == moveSequence.charAt(i)){
                        return false;
                    }
                }
            }
            if(!isMoveLegal(placement,moveSequence.charAt(i))){
                return false; /* If the next move for the current board is not legal, return false*/
            } else {
                placement=changeBoard(placement,moveSequence.charAt(i)); /*after testing if the next move is legal, change the board based on the movement*/
            }
        }
        return true;
    }

    /** after passing isMoveLegal, we know the next move location is valid. Then we can take the row that Zhang Yi is now on out.
     We first find ZY's current location. Then going through all different combinations of row we have to find the row that has that location.
     Finally we store that row into char[] r.
     * get the row where zy located
     * will be used in changeBoard function
     * @param placement
     * @return char[] the row that contains zy's locationChar
     *
     * Authority: Ruimin Chu
     */
    public static char[] takeRow(String placement){
        char[][] row = {{'A','G','M','S','Y','4'},{'B','H','N','T','Z','5'},{'C','I','O','U','0','6'},{'D','J','P','V','1','7'},{'E','K','Q','W','2','8'},{'F','L','R','X','3','9'}};
        char[] r = {};
        char zylocation = ' ';
        for (int i = 0; i < placement.length(); i+=3){
            if (placement.charAt(i) == 'z'){
                zylocation=placement.charAt(i+2);
                break;
            }
        }
        for (int i = 0;i < 6; i++){
            char[] a = row[i];
            for (int p = 0;p < 6; p++){
                char b = a[p];
                if (b == zylocation){
                    r = a;
                    break;
                }
            }
        }
        return r;
    }

    /**
     * get the column where zy located
     * @param placement
     * @return char[] the column that contains zy's locationChar
     *
     * Authority: Ruimin Chu
     */
    public static char[] takeCol(String placement){
        char[][] col = {{'A','B','C','D','E','F'},{'G','H','I','J','K','L'},{'M','N','O','P','Q','R'},{'S','T','U','V','W','X'},{'Y','Z','0','1','2','3'},{'4','5','6','7','8','9'}};
        char[] c = {};
        char zylocation = ' ';
        for (int i = 0; i < placement.length();i += 3){
            if (placement.charAt(i) == 'z'){
                zylocation=placement.charAt(i+2);
                break;
            }
        }
        for (int i = 0;i < 6; i++){
            char[] a = col[i];
            for (int p = 0; p < 6; p++){
                char b = a[p];
                if (b == zylocation){
                    c = a;
                    break;
                }
            }
        }
        return c;
    }

    /**
     *change the string of board after the new movement
     * @param placement
     * @param locationChar
     * @return String the new board
     *
     * Authority: Ruimin
     */
    public static String changeBoard(String placement, char locationChar){
        char[] c = takeCol(placement);
        char[] r = takeRow(placement);
        char[] list = { };
        char kingdom = ' ';
        int start;
        int end;
        char zylocation = ' ';
        /*
         * get the location of zy
         */
        for (int i = 0; i < placement.length(); i += 3){
            if (placement.charAt(i) == 'z'){
                zylocation = placement.charAt(i+2);
                break;
            }
        }
        /*
         * find the next movement character is on the same column or row as zy's location and store it in a list
         */
        for (int i = 0; i < 6; i++ ){
            char k = r[i];
            if (k == locationChar){
                list = r;
            }
        }
        for (int i = 0; i < 6; i++ ){
            char k = c[i];
            if (k == locationChar){
                list = c;
            }
        }
        /*
         * store the kingdom of the card that zy's moving on
         */
        for (int i = 2; i<placement.length();i+=3){
            if(placement.charAt(i) == locationChar){
                kingdom = placement.charAt(i-2);
                break;
            }
        }
        /*
         * store the indices of zy's location and move's location in start and end
         */
        int tmp = 0;
        int tmp1 = 0;
        for (int i = 0; i < 6; i++){
            if (list[i] == locationChar){
                tmp = i;
            }
        }
        for (int i = 0; i < 6; i++){
            if (list[i] == zylocation){
                tmp1 = i;
            }
        }
        if (tmp > tmp1){
            start = tmp1;
            end = tmp;
        } else {
            start = tmp;
            end = tmp1;
        }
        /*
         * check if there is any card that is from the same kingdom as the next movement adn take it out
         */
        for (int i = start + 1; i< end; i++){
            char checkLocation = list[i];
            for (int j = 2; j < placement.length(); j+=3){
                if (placement.charAt(j) == checkLocation){
                    if (placement.charAt(j-2) == kingdom){
                        placement= placement.substring(0,j-2) + placement.substring(j+1);
                    }
                }
            }
        }
        /*
         * remove the original cardPlacement of Zhang Yi
         */
        for (int i = 2; i < placement.length(); i+=3){
            if (placement.charAt(i) == zylocation){
                placement=placement.substring(0,i-2) + placement.substring(i+1);
            }
        }
        /*
         * replace the next movement's cardPlacement with Zhang Yi
         */
        for (int i = 2; i < placement.length(); i+=3){
            if (placement.charAt(i) == locationChar){
                char[] placementChars = placement.toCharArray();
                placementChars[i-2] = 'z';
                placementChars[i-1] = '9';
                placement = String.valueOf(placementChars);
            }
        }
        return placement;
    }

    /**
     * Get the list of supporters for the chosen player, given the provided
     * setup and move sequence.
     * The list of supporters is a sequence of two-character card IDs, representing
     * the cards that the chosen player collected by moving Zhang Yi.
     *
     * @param setup        A placement string representing the board setup
     * @param moveSequence a string of location characters representing moves
     * @param numPlayers   the number of players in the game, must be in the range [2..4]
     * @param playerId     the player number for which to get the list of supporters, [0..(numPlayers-1)]
     * @return the list of supporters for the given player
     *
     * Authority: Zhoujing Yang
     */
    public static String getSupporters(String setup, String moveSequence, int numPlayers, int playerId) {
        String[] cardCollect = new String[moveSequence.length()];
        String placement = setup;
        String newPlacement = "";

        if (numPlayers>4||numPlayers<2){
            return "wrong player number";
        }
        if (!isPlacementWellFormed(setup)){
            return "wrong placement";
        }
        for (int i =0;i <moveSequence.length();i++){
            newPlacement = changeBoard(placement,moveSequence.charAt(i));
            cardCollect[i] = findDifference(placement,newPlacement);
            placement = newPlacement;
        }
        StringBuilder supporter = new StringBuilder();
        for (int i = playerId; i < cardCollect.length; i+=numPlayers){
            supporter.append(cardCollect[i]);
        }
        return supporter.toString();
    }

    public static String findDifference(String x,String y){
        int m;
        int n;
        String p="";
        String q="";
        for (m=0; m<x.length();m+=3){
            if (x.charAt(m)=='z'){
                p=x.substring(0,m)+x.substring(m+3);
                break;
            }
        }
        for (n=0; n<y.length();n+=3){
            if (y.charAt(n)=='z'){
                q=y.substring(0,n)+y.substring(n+3);
                break;
            }
        }
        String a ="";
        int j = 0;
        for (int i=0;i<p.length();i+=3){
            if (j>=q.length()){
                a = a + p.substring(i,i+2);
                continue;
            } else {
                if (p.charAt(i)==q.charAt(j)&&p.charAt(i+1)==q.charAt(j+1)){
                    j+=3;
                } else {
                    a = a + p.substring(i,i+2);
                }
            }
        }
        return a;
    }

    /**
     * Given a setup and move sequence, determine which player controls the flag of each kingdom
     * after all the moves in the sequence have been played.
     *
     * @param setup        A placement string representing the board setup
     * @param moveSequence a string of location characters representing a sequence of moves
     * @param numPlayers   the number of players in the game, must be in the range [2..4]
     * @return an array containing the player ID who controls each kingdom, where
     * - element 0 contains the player ID of the player who controls the flag of Qin
     * - element 1 contains the player ID of the player who controls the flag of Qi
     * - element 2 contains the player ID of the player who controls the flag of Chu
     * - element 3 contains the player ID of the player who controls the flag of Zhao
     * - element 4 contains the player ID of the player who controls the flag of Han
     * - element 5 contains the player ID of the player who controls the flag of Wei
     * - element 6 contains the player ID of the player who controls the flag of Yan
     * If no player controls a particular house, the element for that house will have the value -1.
     *
     * Authority: Ruimin Chu
     */
    public static int[] getFlags(String setup, String moveSequence, int numPlayers) {
        List<String> Supporters = new ArrayList<String>(numPlayers); /* store the cards different players have*/
        int[] output;
        output = new int[7]; /* create an empty list to store the output. The length of it is 7*/
        for (int i = 0; i < numPlayers; i++){
            String a = getSupporters(setup, moveSequence, numPlayers, i);
            Supporters.add(a);
        }
        output[0]= getFlag('a', Supporters,numPlayers,moveSequence,setup); /* use the getFlag function to find who will get the flag of this kingdom and add it to the list*/
        output[1]= getFlag('b', Supporters,numPlayers,moveSequence,setup);
        output[2]= getFlag('c', Supporters,numPlayers,moveSequence,setup);
        output[3]= getFlag('d', Supporters,numPlayers,moveSequence,setup);
        output[4]= getFlag('e', Supporters,numPlayers,moveSequence,setup);
        output[5]= getFlag('f', Supporters,numPlayers,moveSequence,setup);
        output[6]= getFlag('g', Supporters,numPlayers,moveSequence,setup);
        return output;
    }
    /**
     * @param kingdom
     * @param Supporters List of strings the cards that different players have
     * @param numPlayers   the number of players in the game, must be in the range [2..4]
     * @param moveSequence     a string of location characters representing moves
     * @param setup        A placement string representing the board setup
     * @return the playerId of the person who should hold the flag
     *
     * Authority: Ruimin Chu
     */
    public static int getFlag (char kingdom,  List<String> Supporters, int numPlayers,String moveSequence,String setup){
        int j = 0; /* store how many cards of that kingdom the current flag-holder has*/
        int output=0; /* store current flag-holder's playerID*/
        for (int i = 0; i<numPlayers; i++){
            int m = countCardNumber(kingdom, Supporters.get(i));
            if (j<m){
                j=m;
                output=i; /* if this player has more cards of that kingdom than current flag-holder, change j and output*/
            } else if (j == m) {
                List<Integer> temp = new ArrayList<Integer>();
                for (int a = 0; a<moveSequence.length(); a++) {
                    for (int b = 2; b < setup.length(); b += 3) {
                        if (setup.charAt(b) == moveSequence.charAt(a)) {
                            if (setup.charAt(b - 2) == kingdom) {
                                temp.add(a); /* find all the movement that takes a or more cards of that kingdom*/
                            }
                        }
                    }
                }
                /*checking from the last movement, if that movement belongs to the player we are checking, replace the old one with it;
                if it belongs to the current flag-holder, do nothing; if it belongs to any other player, check next movement*/
                for (int k = temp.size()-1; k >= 0;k--){
                    if (temp.get(k) % numPlayers == i){
                        j=m;
                        output=i;
                        break;
                    } else if (temp.get(k)%numPlayers==output){
                        break;
                    } else {
                        continue;
                    }
                }
            }
        }
        /* if no one has a card of that kingdom return -1*/
        if (j==0){
            return -1;
        } else {
            return output;
        }
    }
    /* count how may cards of that kingdom the player is holding*/
    public static int countCardNumber(char kingdom, String helpers){
        int output=0;
        for (int i = 0; i<helpers.length(); i+=2){
            if (helpers.charAt(i)==kingdom){
                output+=1;
            }
        }
        return output;
    }


    /**
     * Generate a legal move, given the provided placement string.
     * A move is valid if:
     * - the location char is in the range A .. Z or 0..9
     * - there is a card at the chosen location;
     * - the destination location is different to Zhang Yi's current location;
     * - the destination is in the same row or column of the grid as Zhang Yi's current location; and
     * - drawing a line from Zhang Yi's current location through the card at the chosen location,
     * there are no other cards along the line from the same kingdom as the chosen card
     * that are further away from Zhang Yi.
     * If there is no legal move available, return the null character '\0'.
     * @param placement the current placement string
     * @return a location character representing Zhang Yi's destination for the move
     *
     * Authority: Ruimin Chu
     */
    public static char generateMove(String placement) {
        char zylocation = ' ';
        for (int i = 0; i < placement.length(); i+=3){
            if (placement.charAt(i) == 'z'){
                zylocation = placement.charAt(i+2); /*find Zhang Yi's current location*/
            }
        }

        char[] r = takeRow(placement);
        char[] c = takeCol(placement);
        ArrayList<Character> destionationLocations = new ArrayList<Character>();
        /* take the list of the row and column that Zhang Yi is on. Store those characters except Zhang Yi's current location into a list*/

        for (int i = 0; i < 6; i++){
            char d = r[i];
            if (d == zylocation){
                continue;
            }
            for (int j = 2; j < placement.length(); j+=3){
                if (placement.charAt(j) == d){
                    destionationLocations.add(d);
                }
            }
        }
        for (int i=0; i<6; i++){
            char d = c[i];
            if (d == zylocation){
                continue;
            }
            for (int j = 2; j < placement.length(); j+=3){
                if (placement.charAt(j) == d){
                    destionationLocations.add(d);
                }
            }
        }
        /*test all those characters if they can generate a valid move, remove those who are not illegal*/
        for (int i = 0; i < destionationLocations.size(); i++){
            if(!isMoveLegal(placement, destionationLocations.get(i))){
                destionationLocations.remove(i);
            }
        }
        /* use random function to generate a move from those valid movement options*/
        Random random = new Random();
        if (destionationLocations.size() == 0){
            return '\0';
        } else {
            char output = destionationLocations.get(random.nextInt(destionationLocations.size()));
            return output;
        }
    }

    /**
     *
     * @param setup
     * @param moveSequence
     * @param numPlayers
     * @return the playerId of the winner
     *
     * Authority: Ruimin Chu
     */
    public static int determineTheWinner (String setup, String moveSequence, int numPlayers){
        int[] temp = new int[numPlayers];
        int[] flags = WarringStatesGame.getFlags(setup, moveSequence, numPlayers);
        for ( int i = 0; i <flags.length; i++){
            int k = flags[i];
            temp[k]+=1;
        }
        int max = 0;
        int output = 0;
        for (int j = 0; j < temp.length; j++){
            if (temp[j] > max){
                max = temp[j];
                output = j;
            } else if (temp[j] == max){
                for (int k = flags.length-1; k >= 0; k--){
                    if (flags[k] == j){
                        max = temp[j];
                        output = j;
                        break;
                    } else if (flags[k] == output){
                        break;
                    } else{
                        continue;
                    }
                }
            }
        }
        return output;
    }
}


