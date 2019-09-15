I declare that the work I have submitted for Stage D of this assignment and all stages before it is entirely my own work, with the following documented exceptions:


task2:
  "char[] k = cardPlacement.toCharArray()" turns cardPlacement into an array of chars;

  "if (!((third>='A'&&third<='Z')||(third>='0'&&third<='9'))) {..."  since the third character of a card placements is the location,
  this instructions check if the placement is in the range of the board. It is either between 'A' to 'Z' or '0' to '9'.

"if (first == 'a') {
    if (second >= '0' && second <= '7') {..."  After checking if the location character is right, my code checks whether the charcter number for that kingdom is valid .
    So if this card is under kingdom A, then the second character, character number, should be in the range of [0,7]. Similarly for kingdom B, the charcter number should be
    be in the range of [0,6].

task5:
"char zyl = ' ';
 for (int i=0;i<a.length-2;i+=3){
      if(a[i]=='z'){
          zyl = a[i+2];
      }
 }"
 For this part, i record the location of Zhang Yi. If the first character is 'z', then i replace char zyl with its third location character.

"int c =0;
 for (int i=2;i<placement.length();i+=3){
      if(a[i]==locationChar) {
           c = 1;
      }
  }
 if (c==0){
      return false;"
for this part, i check whether the current board has a card at the place where Zhang Yi is going to move to.


 "if(!rowNcol(zyl,locationChar)){
     return false;"
i create a function called rowNcol to check if Zhang Yi's current location is in the same column or row as the location he is going to move to

"char[][] row = {{'A','G','M','S','Y','4'}...
 char[][] col = {{'A','B','C','D','E','F'}"
 To check implement rowNcol function, i first create two array which contains the array of the character on the same row or column

 "for (int i=0;i<6;i++){
             char[] a=row[i];
             for (int p=0;p<6;p++){
                 char b = a[p];
                 if (b==zy){
                     r = a;
                     break;
                 }
             }
         }"
 Then i take the column list and the row list which has ZhangYi's currention location character in it.

 "for (int i =0; i<6;i++ ){
              char k = r[i];
              if (k==location){
                  return true;
              }
          }"
 Then i check if the location charcter that Zhang Yi is going to locate on is in one of these two lists.


"if(!sameKingdom(locationChar,zyl,placement)){
     return false;"
I also create a function called the sameKingdom to ckeck if the kingdom that Zhang Yi is going to locate on has a card with the same kingdom beyond its raange.

"if (String.valueOf(r).contains(Character.toString(location))) {
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
                 }"
This part first stores the kingdom Zhang Yi is going to move to. Then check the kingdom of the cards that are not between Zhang Yi location and the chosen location, if they are the same kingdom as the chosen location.


Signed:  Ruimin Chu (u5924220)