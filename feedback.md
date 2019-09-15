# Assignment Two Feedback

## Group members: u5924220,u6490332,u6483085

## Tutor Comment
You need to try more tasks which will help java better.

Overall nice codes.

UI :
The gui is good and the instructions for the game are clear.
Problems : I need more comments and more reasonable names of fields. You miss some authorships for some classes. I suggest using the random location for the placement. There for too many 'if', why not consider 'switch'? Besides, you should add space between mathematical symbols.

Backend :
The names of fields and methods are very easy to understand.
Problems : Same problems with gui. In addition, you should add more classes to show your understanding of OO.

## Mark

**  8.75/11.0**

## Miscellaneous marks

| Level | Requirement | Result |
|:-:|---|:-:|
||All files correct                     | .25/.25 |
||Authorship clear for all classes      | 0/.25 |
||Appropriate use of git                | .5/.5  |
||Program runs from jar                 | .25/.25 |
|P|Appropriate use of OO features       | .25/.5  |
|P|Presentation pdf complete            | .5/.5  |
|CR|Program well designed               | .5/.5  |
|CR|Comments clear and sufficient       | .25/.5  |
|CR|Coding style good                   | 0/.25 |
|CR|Appropriate use of JUnit tests      | .5/.5  |
|D|Design and code of very high quality | 0/.25 |
|D|Demonstrates interesting extensions  | .25/.25 |
|D|Works well and easy to run           | .25/.25 |
|HD|Game is exceptional                 | .25/.5  |

**Total for miscellaneous marks:**  3.75/5.25

## Game marks (manual)

| Level | Requirement | Result |
|:-:|---|:-:|
|CR|Game can be played by 2-4 humans | .25/.25 |
|CR|Only valid moves allowed         | .25/.25 |
|CR|Flags and supporters displayed   | .25/.25 |
|CR|End of game indicates winner     | .25/.25 |
|D |Basic computer opponent          | 0/.25 |
|HD|Advanced computer opponent       | 0/.5  |

**Total for manual marks:** 1/1.75

## Test results

| Task | Test | Result | Marks |
|:-:|---|:-:|:-:|
| |Compiled|.25/.25|.25|
|2|CardPlacementWellFormed|5/5|.5|
|3|PlacementWellFormed|5/5|.5|
|5|MoveLegal|5/5|.5|
|6|MoveSequenceValid|5/5|1|
|7|GetSupporters|3/3|.375|
|8|GetFlags|3/3|.375|
|10|GenerateMove|3/3|.5|

**Total for tests:** 4.00/4.0

## Originality statements

#### Originality statement G
We declare that the work we have submitted for Stage G of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

* The method of using <EventHandler setOnMouseClicked> to make the game run fluently came from a website with <https://stackoverflow.com/questions/27785917/javafx-mouseposition?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa> (noted in source code comments)

* The code in ZyMove() under Game.java uses the popup of alter box. This method is metioned in a website <https://blog.sixlab.cn/archives/441/>

Signed: Ruimin Chu (u5924220), Zhoujing Yang (u6490332), and Xing Meng (u6483085)

#### Originality statement F
We declare that the work we have submitted for Stage F of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

null

Signed: Ruimin Chu (u5924220), Zhoujing Yang (u6490332), and Xing Meng (u6483085)
#### Originality statements E
I declare that the work I have submitted for Stage E of this assignment and all stages before it is entirely my own work, with the
following documented exceptions:

* The idea of <...> came from a discussion with <...>

* The code in class <...> uses an idea suggested by <...>

Signed: Mary Jones (u23445678)
I declare that the work I have submitted for Stage E of this assignment and all stages before it is entirely my own work, with the
following documented exceptions:

* The idea of <for (char c = 'A'; c <= 'Z'; c++){
                           ascii.add (c);
                       }> came from the discussion about "Assign ASCII character A-Z in a list" on stackoverflow https://stackoverflow.com/questions/14827322/assign-ascii-character-a-z-in-a-list

* The code in function PickNRandom in testRowNCol uses an idea suggested by <Óscar López on stackoverflow https://stackoverflow.com/questions/8378752/pick-multiple-random-elements-from-a-list-in-java/8378788#8378788>

* The different combinations of placement used in takeRow and takeCol is from TestUtility in tests folder.

Signed: Ruimin Chu (u5924220)

#### Originality statements D
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


Signed:  Ruimin Chu (u5924220)I declare that the work I have submitted for Stage D of this assignment and all stages before it is entirely my own work, with the following documented exceptions:

* The idea of <...> came from a discussion with <...>

* The code in class <...> uses an idea suggested by <...>

Signed:  Xing Meng (u6483085)
I declare that the work I have submitted for Stage D of this assignment and all stages before it is entirely my own work, with the following documented exceptions:

NIL

Signed: Zhoujing Yang(u6490332)

#### Originality statement C
We declare that the work we have submitted for Stage C of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

* The idea of using <String.valueOf(r).contains(Character.toString(location))> in line 312 and similar functions to check if a array list contains an char is based on the idea of converting a char to string (https://stackoverflow.com/questions/8172420/how-to-convert-a-char-to-a-string/30219789#30219789) and String.contains method (https://www.tutorialspoint.com/java/lang/string_contains.htm)


Signed: Ruimin Chu (u5924220), Zhoujing Yang (u6490332), and Xing Meng (u6483085)

#### Originality statement B
We declare that the work we have submitted for Stage B of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

NIL

Signed: Ruimin Chu (u5924220), Zhoujing Yang (u6490332), and Xing Meng (u6483085)

## Git Log
```
commit baa892ba43f9879c144088543950abeb2da946d2
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Fri May 18 09:40:15 2018 +1000

    Update G-best-u6490332.md

commit 612835bd08265a8889ce3d2f52d8997ea3bd3283
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Fri May 18 09:39:54 2018 +1000

    Update G-best-u6490332.md

commit 5f80ee1d8a895fddccf7dbe581d20b37000bac14
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Fri May 18 03:34:58 2018 +1000

    add presentation.pdf

commit 6320025afbc6d702cd0acf421da781ebefd0c6e9
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Fri May 18 02:59:17 2018 +1000

    edit some admin files and add comments

commit 34e69de0c76b29732a9c4b65cf7139431457e529
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Fri May 18 01:05:52 2018 +1000

    remove printout

commit fc7e3e76f05ea17eee49644db2f08c0f354c5fda
Merge: 1e53222 cb94410
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu May 17 23:58:36 2018 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u5924220/comp1110-ass2-thu16o
    
    # Conflicts:
    #       src/comp1110/ass2/gui/Game.java
    #       tests/comp1110/ass2/u5924220WarringStatesGameTest.java

commit 1e53222aaba59ec61b3fbd0bec910848cffa3ae9
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu May 17 23:43:08 2018 +1000

    update

commit cf2c611e5593d7355c5147c3cf9786dd73a18738
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu May 17 23:42:18 2018 +1000

    update

commit bdfd7734a49ef45f74bd43d5c11a8edf6649362a
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu May 17 23:26:39 2018 +1000

    remove a test

commit cb94410ecf0a1cdaca3229b32f5cb76f25ff9f6e
Author: u6490332 <u6490332@anu.edu.au>
Date:   Thu May 17 21:25:48 2018 +1000

    contribution

commit 6c1a619b25dd8e6b17a3b3e283527801571f0bae
Author: u6490332 <u6490332@anu.edu.au>
Date:   Thu May 17 21:25:17 2018 +1000

    contribution

commit 8f4582e42874c8dfc08e57efbe8749675aaa6a70
Author: u6490332 <u6490332@anu.edu.au>
Date:   Thu May 17 21:17:19 2018 +1000

    contribution

commit a97af7c49a77514815595aebbfac611b429e94aa
Author: u6490332 <u6490332@anu.edu.au>
Date:   Thu May 17 21:15:05 2018 +1000

    contribution

commit 5b912697ad9a8694d3539ca34c35373e48e7dbe3
Author: Zhoujing Yang <u6490332@anu.edu.au>
Date:   Thu May 17 21:11:11 2018 +1000

    final verion 2

commit 3d4403c3a37487f5e5828c8af278f24b2664032c
Author: Zhoujing Yang <u6490332@anu.edu.au>
Date:   Thu May 17 21:03:31 2018 +1000

    final verion 1

commit 7fc65fd390cfa0b04629a7c1362d33cc95590b16
Merge: 9123955 7590b72
Author: u5924220 <u5924220@anu.edu.au>
Date:   Thu May 17 20:17:29 2018 +1000

    Merge remote-tracking branch 'origin/master'

commit 9123955035538184280a963625b03f09999ed681
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu May 17 20:17:13 2018 +1000

    add some methods

commit 7590b726c96e502a0af1e1e60e35671c5aace648
Author: u6490332 <u6490332@anu.edu.au>
Date:   Thu May 17 20:13:29 2018 +1000

    changed the test

commit 5812e8c427ebf474f7a1b0ef7ef3bbf6baf8b052
Merge: 8e37a80 f39f0ed
Author: u5924220 <u5924220@anu.edu.au>
Date:   Thu May 17 20:12:38 2018 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/comp1110/ass2/WarringStatesGame.java

commit f39f0ed9bbd8683ba2738e99ec4ac796734e9d8f
Author: u6490332 <u6490332@anu.edu.au>
Date:   Thu May 17 20:11:13 2018 +1000

    change the changeBoard method

commit 8e37a80e8e7e152b5c53d9d01b3689a041c9ecda
Author: u5924220 <u5924220@anu.edu.au>
Date:   Thu May 17 20:09:12 2018 +1000

    add

commit 184f7795a31ae92742dcec05ae981680504eadf0
Author: Sing_yang <15600567028@163.com>
Date:   Thu May 17 17:47:01 2018 +1000

    allllllmmmmmost done

commit 0488563f81dcdfc65bbe7b0e3b51cfab7ac11651
Author: Sing_yang <15600567028@163.com>
Date:   Thu May 17 17:32:42 2018 +1000

    alllllmost done

commit 6d2371a2bd16ed10258cf3e6ff0a953bbc2ca6f5
Author: Sing_yang <15600567028@163.com>
Date:   Thu May 17 16:59:34 2018 +1000

    almost finish

commit f63fb10b8986002f228795f7f61b24e7732079a7
Author: Sing_yang <15600567028@163.com>
Date:   Thu May 17 14:12:28 2018 +1000

    part finished

commit 6ce984c4457f75b01f8ed88fc0c2547519386a2f
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu May 17 14:12:25 2018 +1000

    task 9 2:12 17/05/2018

commit ca2b59c4d363d5294c4744fff3f20c4d5e849272
Author: Sing_yang <15600567028@163.com>
Date:   Thu May 17 14:07:35 2018 +1000

    task9 part finished

commit 6c09c17bd3e7f01b0b3365d9b66f09cc25ba81d9
Author: Sing_yang <15600567028@163.com>
Date:   Wed May 16 18:52:03 2018 +1000

    haven't finish

commit e38e7aaa7d618dacd3dd38b4f06d3cad80d1800b
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Wed May 16 13:07:14 2018 +1000

    add commentsb

commit 46a852fe90648499bec1b133c979af84cc7a1b2a
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Wed May 16 12:57:59 2018 +1000

    add comments and task8 pass all the tests

commit 903f4c54f9b5501157eebd99d38f58b8e2a5b0ad
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu May 10 16:51:53 2018 +1000

    debug task7 and pass all task 7 tests

commit a9f1ab955538456f4381d326c2b4f5b0d5471763
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu May 10 16:02:35 2018 +1000

    Update F-originality.md

commit 349458665b606f5de21f73ca14e1ceb43c62148d
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu May 10 16:01:12 2018 +1000

    Update F-contribution.md

commit fb4b24ca317d7b79172be4a6442f0ff37f98c8dc
Author: Sing_yang <15600567028@163.com>
Date:   Thu May 10 13:33:11 2018 +1000

    D2F review

commit 7eeb6089e4ac0f78d7456c593fbbb6789a7eb424
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu May 10 13:30:09 2018 +1000

    add review and authority

commit 318a4437ab4dfb016fb060a89c15d169ed25ecde
Merge: f1a1fb1 7704643
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu May 10 13:23:41 2018 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u5924220/comp1110-ass2-thu16o

commit 7704643066cf1763d0de33a0f4dc1c0da0c47911
Author: Sing_yang <15600567028@163.com>
Date:   Thu May 10 13:23:22 2018 +1000

    D2F group part finish

commit f1a1fb18829cfcb47611e5af6a37885963cc51a2
Merge: a2f101e 9e22c9a
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu May 10 13:21:37 2018 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u5924220/comp1110-ass2-thu16o

commit a2f101eaa56267394f34a2b8d5c5fd53623787d8
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu May 10 13:20:23 2018 +1000

    add review

commit 9e22c9aeb94efdd25c67503aecdc20a633774937
Author: Sing_yang <15600567028@163.com>
Date:   Thu May 10 12:55:25 2018 +1000

    D2F group part finish

commit 9b29e27b17a3dedae807ff515b14657508421e50
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu May 3 14:51:20 2018 +1000

    add tests and edit originality u5924220

commit 9ebe8f3a01a740c86b4d455fe50c71d1250a2b51
Author: Zhoujing Yang <zhoujing.yang@anu.edu.au>
Date:   Thu May 3 12:57:57 2018 +1000

    Update  E-originality-u6490332

commit 1c2dc6a7e4f8f9b0875d79c02aef8dff499f1df9
Author: Zhoujing Yang <zhoujing.yang@anu.edu.au>
Date:   Thu May 3 12:57:33 2018 +1000

    Add new file

commit cc060eacea57699739deaeeedde19d5573036d1a
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu May 3 11:55:45 2018 +1000

    add tests and edit originality u5924220

commit a5b1960314f708778775b37f11a21f28f2de99d1
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Mon Apr 30 11:38:26 2018 +1000

    pass all task 10 tests

commit 86bfc64845e28d33cad8c06ccfd748e375d45a9a
Merge: eccbcd9 e2dfa4e
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Sun Apr 29 16:30:47 2018 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit eccbcd984c00eddaf5281230c9b18187223460e1
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Sun Apr 29 16:30:35 2018 +1000

    pass all task 6 tests

commit 2ef23279d4b847d80c3f3051a6caafd3218feca4
Merge: c0870b8 42b440b
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Sun Apr 29 15:15:33 2018 +1000

    Merge remote-tracking branch 'origin/master'

commit c0870b807c919028daf5d765e4dc83bac13e4836
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Sun Apr 29 15:15:07 2018 +1000

    pass all task 6 tests &remove some comments & add author

commit 3929f251da67f71ea1070066b530c46c99d7d530
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Sun Apr 29 15:13:49 2018 +1000

    pass all task 6 tests

commit e2dfa4e5fc035da3d27f1cd8b3cb202a907266b9
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Thu Apr 26 21:00:12 2018 +1000

    GetSupportersTest should not require supporters to be sorted

commit 484b89db8f5eadfdc2459aa89e53762cfdd7cbf6
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Thu Apr 26 16:25:26 2018 +1000

    simplify GetFlagsTest and improve error output

commit 42b440b001711538176a4b564905a07f4661e236
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Apr 19 16:05:37 2018 +1000

    Update D-originality-u5924220.md

commit a5c71bf87596bfa8ff3503050014ba729e4f7961
Author: Zhoujing Yang <zhoujing.yang@anu.edu.au>
Date:   Thu Apr 19 15:20:53 2018 +1000

    Update D-originality-u6490332.md

commit 4a6db0ffc4a91c4c6c3a8c6a05123b9aed10fa36
Author: Zhoujing Yang <zhoujing.yang@anu.edu.au>
Date:   Thu Apr 19 15:16:14 2018 +1000

    Update D-originality-u5924220.md

commit c36ff42c0c4886c0545cc1622165cbbe2c7ef6b1
Author: Zhoujing Yang <zhoujing.yang@anu.edu.au>
Date:   Thu Apr 19 15:15:26 2018 +1000

    Update D-originality-u5924220.md

commit ae0600ed82d4543c158eb83a185c57b9f2a24f80
Author: Zhoujing Yang <zhoujing.yang@anu.edu.au>
Date:   Thu Apr 19 15:12:37 2018 +1000

    Update D-originality-u1234567.md

commit 980deeda37174f49de7cb229af84f1e55eeaa191
Author: Zhoujing Yang <zhoujing.yang@anu.edu.au>
Date:   Thu Apr 19 15:11:39 2018 +1000

    Update D-originality-.md

commit 94016057bfef4aca4245c67d09b1cc97486b0c42
Author: Zhoujing Yang <zhoujing.yang@anu.edu.au>
Date:   Thu Apr 19 15:10:44 2018 +1000

    Add new file

commit 65c25a0df1fd04748123f5868664c8449f7ae94c
Author: Zhoujing Yang <zhoujing.yang@anu.edu.au>
Date:   Thu Apr 19 15:10:13 2018 +1000

    Update D

commit 7fe8013116709faeae0c141a0fbd09a25c135bcb
Author: Zhoujing Yang <zhoujing.yang@anu.edu.au>
Date:   Thu Apr 19 15:09:26 2018 +1000

    Add new file

commit 9be0fc96c474a96a2ca573143e64cd724d46860c
Merge: 3e6fe40 da892d1
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Apr 19 14:43:24 2018 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/comp1110/ass2/WarringStatesGame.java

commit 3e6fe400e8424ea250c29dbecc06d7ea0473cdf5
Merge: a72548d a04a0f7
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Apr 19 14:42:04 2018 +1000

    update D-originality

commit 36c3e706fb68df0e7de005e13e91be541cd8b3af
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Tue Apr 10 22:48:08 2018 +1000

    added tests: Task 8 GetFlagsTest and Task 10 GenerateMoveTest
    
    also renamed CardPlacementWellFormedTest to be consistent with others

commit da892d108f54af0fef7d76a340849c86a421c517
Merge: 0e5dddb c703a94
Author: Sing_yang <15600567028@163.com>
Date:   Thu Mar 29 16:37:19 2018 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u5924220/comp1110-ass2-thu16o

commit 0e5dddb340e7de91f86f59a591983e60e96d1a9d
Author: Sing_yang <15600567028@163.com>
Date:   Thu Mar 29 16:37:08 2018 +1100

    task6 continue

commit c703a94efe22bc524f905aa5bfb0be1a7048dbca
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Mar 29 15:48:47 2018 +1100

    Update WarringStatesGame.java
    add import

commit 51a972431dccd75bb27cd4035e3196dcf98279c0
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Mar 29 15:42:58 2018 +1100

    Update C-contribution.md

commit 0ea82121f49e667d968399619c99b422380a1b7a
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Mar 29 14:43:26 2018 +1100

    Update C-originality.md

commit a72548d8a953baaf9b148200bd9be2535a867eb3
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Mar 29 11:51:00 2018 +1100

    commit

commit a04a0f7e59cb06f758dd893ef3db656d9d2e5d83
Author: Sing_yang <15600567028@163.com>
Date:   Thu Mar 29 11:48:17 2018 +1100

    task6 continue

commit b18317089dec7d5ff24a74bac334d7d7da54eb8c
Merge: 978a546 7f12706
Author: Sing_yang <15600567028@163.com>
Date:   Wed Mar 28 22:35:37 2018 +1100

    Merge remote-tracking branch 'origin/master'

commit 978a54605bd0b3e914cd3aac88be7bbb07455c37
Merge: 3e3e375 e4ee75f
Author: Sing_yang <15600567028@163.com>
Date:   Wed Mar 28 22:35:25 2018 +1100

    Merge branches 'BobsExperiment' and 'master' of https://gitlab.cecs.anu.edu.au/u5924220/comp1110-ass2-thu16o
    
    # Conflicts:
    #       src/comp1110/ass2/gittest/Main.java

commit 7f12706d2d29f6bbb28e0fc85a88b1c89e21b169
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Wed Mar 28 22:31:26 2018 +1100

    Update task 5

commit 3e3e3750ee7cff58b344e1e2ab542cd9c4e6957e
Author: Zhoujing Yang <u6490332@anu.edu.au>
Date:   Tue Mar 27 22:51:47 2018 +1100

    task4 finished

commit ddeaefccde2cb39b1a692af7f3d30ca5673facbc
Merge: aabcd3b fe876d2
Author: mengxing <u6483085@anu.edu.au>
Date:   Tue Mar 27 13:48:14 2018 +1100

    Merge remote-tracking branch 'origin/master'

commit aabcd3bca1aa4766ca19d40b9699c685a2534da7
Author: mengxing <u6483085@anu.edu.au>
Date:   Tue Mar 27 13:48:03 2018 +1100

    Meng Xing u6483085 finish the task3 of ass2

commit fe876d2bd53d10b0db3c15abccecb2865b69ff7f
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Sun Mar 25 23:05:55 2018 +1100

    task 5 pass all tests

commit 1901a2afb9d280152922d35bc1b16e45203d9f5b
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Sun Mar 25 21:31:05 2018 +1100

    task 5 pass 4 tests

commit 05534c1c53e794958798c8c40a1803aac5534ab2
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Sun Mar 25 21:02:57 2018 +1100

    task 5 first version

commit 5ba51adeca029a299c5c212b08c85cf7d2ec8022
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Mar 22 23:29:49 2018 +1100

    task2 pass all the tests

commit 378005664077dbdc162fef2a422eb9f096a34885
Merge: 141bf56 5c7bd56
Author: mengxing <u6483085@anu.edu.au>
Date:   Thu Mar 22 18:02:50 2018 +1100

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/comp1110/ass2/gittest/Main.java

commit 5c7bd5665f4a0770d6c632168c7b3750636489fd
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Mar 22 17:57:05 2018 +1100

    Merge branch 'master' of C:\Users\w\IdeaProjects\comp1110-ass2-thu16o with conflicts.

commit 141bf56317f2ab24313eea9f0de118f0ae58607e
Author: mengxing <u6483085@anu.edu.au>
Date:   Thu Mar 22 17:53:43 2018 +1100

    Meng Xing u6483085 finish the step8

commit e4ee75fa97ac2d6a655e6657a9c47a9a1c7097c1
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Mar 22 17:49:57 2018 +1100

    B-design first version

commit 54f6f9783bd36d0b83e3fcbf8c09e602003c9c63
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Mar 22 17:47:51 2018 +1100

    B-design first version

commit 01bb12c5d8833a683a1a4d42db5d01810e1402cc
Merge: 6e753f1 269930e
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Mar 22 17:46:10 2018 +1100

    Merge remote-tracking branch 'origin/master'

commit 269930eefaf4776b6a04f91786ccf22bae759be8
Author: Cindy <u6483085@au.edu.au>
Date:   Thu Mar 22 17:43:33 2018 +1100

    Meng Xing u6483085 finish the step

commit 6e753f1a85ae18412777133fb35a17de7929bc80
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Mar 22 17:36:34 2018 +1100

    B-design first version

commit 02c21de456d6e1d7dbc0cab382a046632c62114e
Merge: 1372358 d92f87e
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Mar 22 17:34:48 2018 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u5924220/comp1110-ass2-thu16o

commit d92f87ee354b45ee88251d3d3840c6d52278d45b
Author: Alice <u6490332@anu.edu.au>
Date:   Thu Mar 22 17:34:38 2018 +1100

    create classes and methods

commit 13723582c8b62c3e0292480e122d3117494880a0
Merge: 4e32f73 5fe7628
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Mar 22 17:33:59 2018 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u5924220/comp1110-ass2-thu16o

commit 5fe7628b33c67093d9ad964eef6d94ea681ac79e
Author: Alice <u6490332@anu.edu.au>
Date:   Thu Mar 22 17:33:00 2018 +1100

    create classes and methods

commit 4e32f735a95354f34b08d9da9554a9f3f396a3d4
Merge: e4fcb61 b53bf13
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Mar 22 17:26:08 2018 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u5924220/comp1110-ass2-thu16o

commit b53bf13db59b499aa0fc1d66118d890bc1d41612
Merge: d60e953 bca3e83
Author: u6490332 <u6490332@anu.edu.au>
Date:   Thu Mar 22 17:17:16 2018 +1100

    Merge remote-tracking branch 'origin/master'

commit d60e95391b3ceaad07bfac0221ddd2e9f810f9ee
Author: u6490332 <u6490332@anu.edu.au>
Date:   Thu Mar 22 17:17:00 2018 +1100

    create classes and methods

commit bca3e83faa859c2444b4eef075a32ce3cb341946
Merge: ca2d2f4 41b7619
Author: mengxing <u6483085@anu.edu.au>
Date:   Thu Mar 22 17:14:21 2018 +1100

    Merge remote-tracking branch 'origin/master'

commit e4fcb612fbbb28fad2b0c955fb4a9be237ff57c7
Merge: 41b7619 ca2d2f4
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Mar 22 17:09:25 2018 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 41b76198cb13f4e71353c3195f597183186cea2d
Author: Zhoujing Yang <zhoujing.yang@anu.edu.au>
Date:   Thu Mar 22 16:26:27 2018 +1100

    Update B-contribution.md

commit d4bd591fb111bf626f83e512fe97efd5f71450f4
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Mar 22 16:12:18 2018 +1100

    Update B-contribution.md

commit 0294166962290e79feefb9e8538ca94539351c82
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Mar 22 16:10:27 2018 +1100

    Update B-originality.md

commit 0f5504462cffdd48f1efc9bbb2dcd61bb7d4b052
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Mar 22 16:08:27 2018 +1100

    Update Classes and Methods

commit 07e740cd0da76fcc707e13f4d216c4c6eb29faaf
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Mar 22 16:08:01 2018 +1100

    Delete B-design

commit 4a3c1415cc470c3ca4cc7f8967e0e432ce6004e1
Author: Zhoujing Yang <zhoujing.yang@anu.edu.au>
Date:   Thu Mar 22 15:54:22 2018 +1100

    Update Classes and Methods

commit 2906eb07c3004df1f91f78636724295c7547a93e
Author: Zhoujing Yang <zhoujing.yang@anu.edu.au>
Date:   Thu Mar 22 15:50:46 2018 +1100

    Add new file

commit 0d84bb909253c44ecfee3d1e42a63ff6570fc628
Merge: 676ab50 b252029
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Mar 22 15:41:19 2018 +1100

    Merge remote-tracking branch 'origin/master'

commit 676ab505f5cf3ebdc27017afdab25ef5a67af38c
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Mar 22 15:41:00 2018 +1100

    B-design first version

commit ca2d2f4d325faef911ef2bdfd6ca1e1c028e4697
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Mon Mar 19 18:58:31 2018 +1100

    fix to error message for CardPlacementWellFormed.testCase for valid string
    
    thanks to Jay Heyman for finding

commit 10a0d461c8d7f95f4cefc75d8feff0f4ee43115a
Merge: 9700ecf efff375
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Sun Mar 18 21:15:32 2018 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 9700ecfaa66ba883caaaf32fc72a3af405931f13
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Sun Mar 18 21:13:59 2018 +1100

    fix to Task 5 testNoCard - included incorrect 'stay put' move for Zhang Yi
    
    thanks to Cooper Yang for finding this bug

commit efff3750e8fb92cf4f822b270d1d1915a71c2d29
Author: COMP1110 2018 S1 <josh.milthorpe+comp1110-2018s1@anu.edu.au>
Date:   Thu Mar 15 17:14:22 2018 +1100

    remove link to non-existent statement of originality

commit b252029337f1e576d192a31d2b73c4c3aa7a7e5b
Author: Ruimin  Chu <u5924220@anu.edu.au>
Date:   Thu Mar 15 16:57:44 2018 +1100

    Add contact

commit 55545e7867b9903ddbe9247c9a143ccc53655f63
Author: milthorpe <josh.milthorpe@gmail.com>
Date:   Wed Mar 14 23:46:03 2018 +1100

    fix typo in locations image

commit b59a979d9604995508e01a7879daa031be2be6c7
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Tue Mar 13 17:25:19 2018 +1100

    fix CardPlacementWellFormed: was calling wrong method isPlacementWellFormed

commit adcde368e6588adec46a48f85782ab70c9644add
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Tue Mar 13 13:01:51 2018 +1100

    print out valid placement string in CardPlacementWellFormed.checkSimpleValid

commit a5266a419c512e3c432b240fee12f9fe69a1f246
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Tue Mar 13 12:43:58 2018 +1100

    isCardPlacementWellFormed specification should mention Zhang Yi (z9) is allowed

commit e2f00bd5b201e6065f70aa85d7b00a378129aae9
Author: milthorpe <josh.milthorpe@gmail.com>
Date:   Tue Mar 13 07:31:52 2018 +1100

    COMP1110 Assignment 2 2018 S1

commit cee45f5d06e0cd03de74b15abe6488a44bf89ee8
Author: milthorpe <josh.milthorpe@gmail.com>
Date:   Thu Mar 1 08:06:29 2018 +1100

    Initial commit
```
## Changes
```
Only in comp1110-ass2/admin: B-Classes and Methods
diff -ru -x .git ../master/comp1110-ass2/admin/B-contribution.md comp1110-ass2/admin/B-contribution.md
--- ../master/comp1110-ass2/admin/B-contribution.md	2018-05-18 08:54:16.257374551 +1000
+++ comp1110-ass2/admin/B-contribution.md	2018-05-18 10:09:03.760881350 +1000
@@ -1,7 +1,7 @@
 We declare that the work toward our submission of Stage B was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0234567 30
+* u5924220  40
+* u6490332  40
+* u6483085  20
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0234567)
+Signed: Ruimin Chu (u5924220), Zhoujing Yang (u6490332), and Xing Meng (u6483085)
diff -ru -x .git ../master/comp1110-ass2/admin/B-originality.md comp1110-ass2/admin/B-originality.md
--- ../master/comp1110-ass2/admin/B-originality.md	2018-05-18 08:54:16.273374638 +1000
+++ comp1110-ass2/admin/B-originality.md	2018-05-18 10:09:03.772881413 +1000
@@ -1,9 +1,5 @@
 We declare that the work we have submitted for Stage B of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
+NIL
 
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
-
-*  ....
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Ruimin Chu (u5924220), Zhoujing Yang (u6490332), and Xing Meng (u6483085)
diff -ru -x .git ../master/comp1110-ass2/admin/C-contribution.md comp1110-ass2/admin/C-contribution.md
--- ../master/comp1110-ass2/admin/C-contribution.md	2018-05-18 08:54:16.285374702 +1000
+++ comp1110-ass2/admin/C-contribution.md	2018-05-18 10:09:03.780881455 +1000
@@ -1,7 +1,7 @@
 We declare that the work toward our submission of Stage C was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0234567 30
+* u5924220 37
+* u6490332 37
+* u6483085 26
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0234567)
+Signed:Ruimin Chu (u5924220), Zhoujing Yang (u6490332), and Xing Meng (u6483085)
Only in comp1110-ass2/admin: contact
diff -ru -x .git ../master/comp1110-ass2/admin/C-originality.md comp1110-ass2/admin/C-originality.md
--- ../master/comp1110-ass2/admin/C-originality.md	2018-05-18 08:54:16.293374746 +1000
+++ comp1110-ass2/admin/C-originality.md	2018-05-18 10:09:03.788881497 +1000
@@ -1,9 +1,6 @@
 We declare that the work we have submitted for Stage C of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
+* The idea of using <String.valueOf(r).contains(Character.toString(location))> in line 312 and similar functions to check if a array list contains an char is based on the idea of converting a char to string (https://stackoverflow.com/questions/8172420/how-to-convert-a-char-to-a-string/30219789#30219789) and String.contains method (https://www.tutorialspoint.com/java/lang/string_contains.htm)
 
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
 
-*  ....
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Ruimin Chu (u5924220), Zhoujing Yang (u6490332), and Xing Meng (u6483085)
Only in ../master/comp1110-ass2/admin: D-originality-u1234567.md
Only in comp1110-ass2/admin: D-originality-u5924220.md
Only in comp1110-ass2/admin: D-originality-u6483085.md
Only in comp1110-ass2/admin: D-originality-u6490332.md
Only in comp1110-ass2/admin: E-originality-u5924220.md
Only in comp1110-ass2/admin:  E-originality-u6490332
diff -ru -x .git ../master/comp1110-ass2/admin/F-contribution.md comp1110-ass2/admin/F-contribution.md
--- ../master/comp1110-ass2/admin/F-contribution.md	2018-05-18 08:54:16.337374984 +1000
+++ comp1110-ass2/admin/F-contribution.md	2018-05-18 10:09:03.856881857 +1000
@@ -1,8 +1,8 @@
 We declare that the work toward our submission of Stage F was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0123456 30
+* u5924220 42
+* u6490332 42
+* u6483085 16
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Ruimin Chu (u5924220), Zhoujing Yang (u6490332), and Xing Meng (u6483085)
 
diff -ru -x .git ../master/comp1110-ass2/admin/F-originality.md comp1110-ass2/admin/F-originality.md
--- ../master/comp1110-ass2/admin/F-originality.md	2018-05-18 08:54:16.357375092 +1000
+++ comp1110-ass2/admin/F-originality.md	2018-05-18 10:09:03.868881921 +1000
@@ -1,9 +1,5 @@
 We declare that the work we have submitted for Stage F of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
+null
 
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
-
-* ....
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Ruimin Chu (u5924220), Zhoujing Yang (u6490332), and Xing Meng (u6483085)
\ No newline at end of file
Only in ../master/comp1110-ass2/admin: F-review-u1234567.md
Only in comp1110-ass2/admin: F-review-u5924220.md
Only in comp1110-ass2/admin: F-review-u6490332.md
Only in comp1110-ass2/admin: G-best-u5924220.md
Only in comp1110-ass2/admin: G-best-u6490332.md
diff -ru -x .git ../master/comp1110-ass2/admin/G-contribution.md comp1110-ass2/admin/G-contribution.md
--- ../master/comp1110-ass2/admin/G-contribution.md	2018-05-18 08:54:16.389375265 +1000
+++ comp1110-ass2/admin/G-contribution.md	2018-05-18 10:09:03.968882452 +1000
@@ -1,8 +1,8 @@
 We declare that the work toward our submission of Stage G was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0123456 30
+* u5924220 65
+* u6490332 33
+* u6483085 2
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed:  Ruimin Chu (u5924220), Zhoujing Yang (u6490332) , and Xing Meng (u6483085)
 
diff -ru -x .git ../master/comp1110-ass2/admin/G-features.md comp1110-ass2/admin/G-features.md
--- ../master/comp1110-ass2/admin/G-features.md	2018-05-18 08:54:16.397375309 +1000
+++ comp1110-ass2/admin/G-features.md	2018-05-18 10:09:03.988882559 +1000
@@ -8,9 +8,11 @@
  - A basic playable link Warring States game that allows legal moves and collects supporters (Task 8)
  - Compute scoring (Task 9)
  - Generate a valid move (Task 10)
- - Basic computer opponent (Task 11)
- - Advanced computer opponent (Task 12)
 
-additional features...
+additional features:
+ - update the board status (changeBoard under task 6)
+ - check if there is any valid move on the board (noValidMove in Game.java)
+ - determine who is the winner (determineTheWinner in WarringStateGame.java)
+
 
 
diff -ru -x .git ../master/comp1110-ass2/admin/G-originality.md comp1110-ass2/admin/G-originality.md
--- ../master/comp1110-ass2/admin/G-originality.md	2018-05-18 08:54:16.409375374 +1000
+++ comp1110-ass2/admin/G-originality.md	2018-05-18 10:09:04.000882623 +1000
@@ -1,9 +1,7 @@
 We declare that the work we have submitted for Stage G of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
+* The method of using <EventHandler setOnMouseClicked> to make the game run fluently came from a website with <https://stackoverflow.com/questions/27785917/javafx-mouseposition?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa> (noted in source code comments)
 
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
+* The code in ZyMove() under Game.java uses the popup of alter box. This method is metioned in a website <https://blog.sixlab.cn/archives/441/>
 
-* ....
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Ruimin Chu (u5924220), Zhoujing Yang (u6490332), and Xing Meng (u6483085)
diff -ru -x .git ../master/comp1110-ass2/comp1110-ass2.iml comp1110-ass2/comp1110-ass2.iml
--- ../master/comp1110-ass2/comp1110-ass2.iml	2018-05-18 08:54:16.549376131 +1000
+++ comp1110-ass2/comp1110-ass2.iml	2018-05-18 10:09:04.148883410 +1000
@@ -1,12 +1,12 @@
 <?xml version="1.0" encoding="UTF-8"?>
 <module type="JAVA_MODULE" version="4">
-  <component name="NewModuleRootManager" inherit-compiler-output="true">
+  <component name="NewModuleRootManager" LANGUAGE_LEVEL="JDK_1_8" inherit-compiler-output="true">
     <exclude-output />
     <content url="file://$MODULE_DIR$">
       <sourceFolder url="file://$MODULE_DIR$/src" isTestSource="false" />
       <sourceFolder url="file://$MODULE_DIR$/tests" isTestSource="true" />
     </content>
-    <orderEntry type="inheritedJdk" />
+    <orderEntry type="jdk" jdkName="1.8" jdkType="JavaSDK" />
     <orderEntry type="sourceFolder" forTests="false" />
     <orderEntry type="module-library" scope="TEST">
       <library name="JUnit4">
Only in comp1110-ass2: feedback.md
Only in comp1110-ass2: game.jar
diff -ru -x .git ../master/comp1110-ass2/.idea/misc.xml comp1110-ass2/.idea/misc.xml
--- ../master/comp1110-ass2/.idea/misc.xml	2018-05-18 08:54:16.109373750 +1000
+++ comp1110-ass2/.idea/misc.xml	2018-05-18 10:09:03.420879539 +1000
@@ -1,6 +1,6 @@
 <?xml version="1.0" encoding="UTF-8"?>
 <project version="4">
-  <component name="ProjectRootManager" version="2" languageLevel="JDK_1_8" default="false" project-jdk-name="1.8" project-jdk-type="JavaSDK">
+  <component name="ProjectRootManager" version="2" languageLevel="JDK_X" default="false" project-jdk-name="1.8" project-jdk-type="JavaSDK">
     <output url="file://$PROJECT_DIR$/out" />
   </component>
 </project>
\ No newline at end of file
Only in comp1110-ass2: presentation.pdf
Only in comp1110-ass2/src/comp1110/ass2: gittest
Only in comp1110-ass2/src/comp1110/ass2/gui: Board.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Board.java
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$1.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$2.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game.class
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/gui/Game.java comp1110-ass2/src/comp1110/ass2/gui/Game.java
--- ../master/comp1110-ass2/src/comp1110/ass2/gui/Game.java	2018-05-18 08:54:16.585376326 +1000
+++ comp1110-ass2/src/comp1110/ass2/gui/Game.java	2018-05-18 10:09:04.476885153 +1000
@@ -1,21 +1,717 @@
 package comp1110.ass2.gui;
 
+import comp1110.ass2.WarringStatesGame;
 import javafx.application.Application;
+import javafx.event.ActionEvent;
+import javafx.event.EventHandler;
+import javafx.scene.Group;
+import javafx.scene.Scene;
+import javafx.scene.control.Alert;
+import javafx.scene.control.Button;
+import javafx.scene.control.Label;
+import javafx.scene.control.TextField;
+import javafx.scene.input.MouseEvent;
+import javafx.scene.layout.HBox;
+import javafx.scene.layout.StackPane;
+import javafx.scene.paint.Color;
+import javafx.scene.paint.Paint;
+import javafx.scene.shape.Rectangle;
+import javafx.scene.text.Font;
+import javafx.scene.text.FontWeight;
+import javafx.scene.text.Text;
 import javafx.stage.Stage;
 
+import java.util.Random;
+
 public class Game extends Application {
     private static final int BOARD_WIDTH = 933;
     private static final int BOARD_HEIGHT = 700;
+    private static final int SQUARE_SIZE = 100;
+    /* color the underlying board */
+    private static final Paint SUBBOARD_FILL = Color.WHITESMOKE;
+    private static final Paint SUBBOARD_STROKE = Color.BLACK;
+    public static final String[] PLACEMENTS = {
+            "g0Aa0Bf1Ca1Dc5Ee1Fa4Ge3He2Ia2Jc2Kd0Lf0Mb4Nd4Oa6Pc3Qe0Ra5Sc1Td1Uc4Vb5Wb0Xa7Yf2Zb10a31z92b33b64d35g16b27d28c09",
+            "g1Aa0Bc0Ce0De3Ed4Fb6Ga4Hg0Ib5Ja7Kb1Lz9Me1Nd0Of0Pf1Qb2Rc1Sd3Ta5Ub4Va2Wc5Xd1Ya3Zc20d21c32f23a64c45b36b07a18e29",
+            "b5Ae0Bc3Ca7Da1Ec1Fg1Gg0Ha0If0Jb2Kb1La3Ma2Nb0Oc5Pe2Qd0Rd2Sd4Td3Ua4Va5Wb6Xb3Yb4Zz90f11a62e33c04f25c46c27d18e19",
+            "c3Aa6Ba1Ca5Dd0Ee3Fa3Gc0Hb1Ic5Jz9Kb3Lb5Mf1Nf0Ob4Pc4Qa0Rd2Sa7Te0Ug1Ve1Wg0Xb6Yb0Zd40d11f22c13b24c25a26d37a48e29",
+            "e2Ab4Bc0Cb1Dd4Ed0Fz9Gg0Ha4Ia7Jf2Kc2Lc5Mb2Nf0Oe3Pb6Qa6Re0Sf1Tc1Uc4Vg1Wa3Xa0Yb0Zc30e11a22b33b54a15d26a57d18d39",
+            "g1Ab2Ba4Ce2Dd4Eb4Fc3Gf1Ha2Ig0Jc2Kd2Le1Ma1Nb6Oc0Pc1Qe0Rf0Sf2Tb3Uc4Vc5Wb5Xd1Ya7Za00z91d02b03a54a65d36b17e38a39",
+            "b4Aa2Bz9Cf1Dd0Ea7Ff0Gb0Hb5Id4Jd2Kf2Lc3Mc4Nd1Oa0Pa1Qa4Re2Se1Tc5Uc0Vg0Wb6Xb1Ya3Za60d31c22a53b24e35g16e07b38c19",
+            "c5Aa6Bf0Cb0Da2Ea5Fc0Gb2Ha3Ib6Jd4Kb3Lb1Mc1Nc4Od3Pg0Qd1Re3Se2Ta0Ud2Ve1Wz9Xd0Ye0Zf20a11c22a73f14b55c36g17b48a49",
+            "c2Az9Bb4Cb2Dc1Ea6Fa7Ga4Hg0Ia1Jd1Ke0Lf0Mb1Nc0Of1Pd0Qg1Rd3Sc4Te2Ub5Vf2We1Xb0Ya5Zb30d21a32b63a04d45c36c57e38a29",
+            "a4Aa2Bb2Cc0Dc5Eb4Fa5Gc4Hf1Ia0Jf0Ke1Lb5Mc2Na3Of2Pz9Qb1Rd0Sd2Td3Ub6Vc1We2Xe3Yb0Zb30g01a12a73c34a65d46d17e08g19",
+            "b5Ae0Bb0Ca2De2Ec3Fa7Gf0Hd2Ia1Jc1Kd1La4Mb6Nd3Oa5Pc5Qe1Ra0Sf1Tg1Ub1Vb4Wa3Xc4Yb2Za60d41c22g03f24e35c06d07b38z99",
+            "e2Ad4Bb6Cf1Da3Ed0Fa5Ga0Hg0Ia7Je0Kc4Lg1Md2Ne1Oc1Pf0Qc3Rd1Sb3Tc2Uc0Va2Wb2Xa1Ya4Zd30b11c52f23b54b45e36a67b08z99",
+            "d4Ad1Ba7Cb3Db1Ee1Fd3Gc3Hb6Ic2Ja2Kf0Lc5Me3Ng0Oz9Pd2Qg1Rc0Sa5Tb4Ud0Va1Wf2Xe2Ya6Za40b01b22b53e04a05a36c17f18c49",
+            "b3Ab0Bd2Ce2Da7Ea4Ff0Gd4He1Ia0Jg0Kb6Lc5Mz9Nc0Oe3Pe0Qa3Rb4Sa2Tf2Ug1Vc1Wc4Xa1Yc2Za50f11c32b23d14d05d36b57a68b19",
+            "f1Aa7Ba0Cb6Da5Ec3Fb0Gc2Hg0Ie3Ja6Kc4La4Mf2Ne1Of0Pd2Qb3Rd3Sb2Tb1Ue0Ve2Wc0Xd1Yc5Zb40d01b52a33d44a15c16z97a28g19",
+            "e1Af2Bc4Ce0Dg1Ea7Fa0Gg0Hc3Ib4Jd3Kc1Lb5Mc0Ne2Od1Pd2Qa2Rb3Sc5Td4Ub1Vf0Wb0Xa1Ya3Ze30a41z92c23a64b25a56b67f18d09",
+            "b0Ac0Bf1Cb4De1Ea3Fc2Gz9Hb3Ia5Jc5Ke2Lb1Mf2Nd2Og0Pf0Qc4Rb2Sg1Ta7Ub5Vd4Wc3Xd1Ye0Ze30c11a62a03d34a25b66a17a48d09",
+            "a7Aa0Bb5Cg1Dd0Ea6Fe3Ga4Hg0Ie2Je1Ka3Lb3Md1Nd2Oz9Pb4Qd4Rc3Sf1Tc4Ua5Vb2Wb1Xc1Yf0Zb60d31c52b03f24c25a26a17c08e09",
+            "e3Ad4Ba5Cd1Dc1Eb3Fc5Gd2Hg0Ie0Ja2Kb5Lf1Md3Na6Oz9Pb1Qc3Rf2Sc4Tb0Uc0Ve1Wd0Xg1Ye2Zb60a71a32a03b24a45b46f07c28a19",
+            "g0Ac1Bb4Ca5Da2Ea6Ff0Gb1Ha3Id3Ja0Kz9Lc5Mb0Nf1Od2Pe1Qc2Re3Sb6Td0Ub5Va1Wb2Xc3Yb3Zc00e21e02a73d14f25a46g17c48d49"
+    };
+
+    TextField textField;
+    /* where to find media assets */
+    private static final String URI_BASE = "assets/";
+    /* node groups */
+    private final Group root = new Group();
+    private final Group controls = new Group();
+    private final Group score = new Group();
+    private final Group flag = new Group();
+    private int n;
+    private String placement;
+    private String setup;
+    private String moveSequence = "";
+    private int numPlayers;
+    private double mouseX;
+    private double mouseY;
+    private char zyLoca;
+    private void numInput() {
+        Label label1 = new Label("Player Number");
+        textField = new TextField();
+        textField.setPrefWidth(30);
+        Button button = new Button("Confirm");
+        button.setOnAction(new EventHandler<ActionEvent>(){
+            @Override
+            public void handle(ActionEvent e) {
+                numPlayers=Integer.parseInt(textField.getText());
+                scoreGener(Integer.parseInt(textField.getText()));
+                textField.clear();
+                makePlacement(setup);
+            }
+        });
+        HBox hb = new HBox();
+        hb.getChildren().addAll(label1, textField, button);
+        hb.setSpacing(10);
+        hb.setLayoutX(130);
+        hb.setLayoutY(BOARD_HEIGHT  - 50);
+        controls.getChildren().add(hb);
+    }
+
+
+    /**
+     * Authority:Zhoujing Yang
+     */
+    private void ZyMove(){
+        root.setOnMouseClicked(new EventHandler<MouseEvent>() {     //
+            @Override
+            public void handle(MouseEvent event) {
+                mouseX = event.getSceneX();
+                mouseY = event.getSceneY();
+                zyLoca=getMove(mouseX,mouseY);//get the position of mouseclick
+                if (WarringStatesGame.isMoveLegal(placement,getMove(mouseX,mouseY))){
+                    moveSequence=moveSequence+getMove(mouseX,mouseY);               //Build moveSequence
+                    placement=WarringStatesGame.changeBoard(placement,zyLoca);//get new board placement
+                    score.getChildren().clear();//clear previous board setting
+                    makePlacement(placement);//change board
+                    viewSupporters();
+                    flag.getChildren().clear();
+                    viewFlags();
+                }else{
+                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
+                    alert.setTitle("Warning");
+                    alert.setHeaderText("Invalid move!");
+                    alert.showAndWait();
+                }
+                if (noValidMove(placement)){
+                    Text endGame = new Text();
+                    int winner = WarringStatesGame.determineTheWinner(setup,moveSequence,numPlayers);
+                    endGame.setText("PLAYER " + winner + " WINS THE GAME!!!");
+                    endGame.setFill(Color.MAROON);
+                    endGame.setFont(Font.font("Tahoma", FontWeight.BOLD, 45));
+                    endGame.setX(100);
+                    endGame.setY(350);
+                    root.getChildren().addAll(endGame);
+                }
+            }
+
+        });
+
+
+    }
+    //Authority: Zhoujing Yang
+    public char getMove(double x, double y){
+        int m=0;
+        int n=0;
+        char zy;
+        for (int j=0;j<6;j++){
+            if (x>105*j&&x<105*(j+1)){
+                m=j;
+                for (int k=0;k<6;k++){
+                    if (y>105*k&&y<105*(k+1)){
+                        n=k;
+                        break;
+                    }
+                }
+            }
+        }
+        char[][]coOrdin={{'4','5','6','7','8','9'},{'Y','Z','0','1','2','3'},{'S','T','U','V','W','X'},{'M','N','O','P','Q','R'},{'G','H','I','J','K','L'},{'A','B','C','D','E','F'}};
+        zy=coOrdin[m][n];
+        return zy;
+    }              //zy's move position
 
-    // FIXME Task 9: Implement a basic playable Warring States game in JavaFX
+    /**
+     * Authority: Zhoujing Yang
+     * @param player
+     */
+    private void scoreGener(int player){
+        Rectangle scoreboard=new Rectangle();
+        Rectangle tiTle = new Rectangle(633,0,300,41);
+        tiTle.setFill(Color.LIGHTBLUE);
+        Text titLe = new Text();
+        Text P1 = new Text(650,54,String.valueOf(0));
+        Text P2 = new Text(800,54,String.valueOf(1));
+        Text P3 = new Text(650,410,String.valueOf(2));
+        Text P4 = new Text(800,410,String.valueOf(3));
+        titLe.setText("Score Board");
+        titLe.setFont(Font.font("Tahoma", FontWeight.BOLD, 25));
+        titLe.setX(700);
+        titLe.setY(33);
+        for (int i=0;i<2;i++){
+            scoreboard = new Rectangle(633+150*i,46,145,350);
+            scoreboard.setFill(Color.LIGHTGRAY);
+            root.getChildren().addAll(scoreboard);}
+        for (int i=0;i<2;i++){
+            scoreboard = new Rectangle(633+150*i,400,145,300);
+            scoreboard.setFill(Color.LIGHTGRAY);
+            root.getChildren().addAll(scoreboard);}
+        root.getChildren().addAll(tiTle,titLe,P1,P2,P3,P4);
+    }
 
-    // FIXME Task 11: Allow players of your Warring States game to play against your simple agent
+    //Authority :Zhoujing Yang
+    private void makePlacement(String placement) {
+        char[] y1={'4','5','6','7','8','9'};
+        char[] y2={'Y','Z','0','1','2','3'};
+        char[] y3={'S','T','U','V','W','X'};
+        char[] y4={'M','N','O','P','Q','R'};
+        char[] y5={'G','H','I','J','K','L'};
+        char[] y6={'A','B','C','D','E','F'};//X axis
+        char[] x1={'4','Y','S','M','G','A'};
+        char[] x2={'5','Z','T','N','H','B'};
+        char[] x3={'6','0','U','O','I','C'};
+        char[] x4={'7','1','V','P','J','D'};
+        char[] x5={'8','2','W','Q','K','E'};
+        char[] x6={'9','3','X','R','L','F'};//Y axis
+        String[] qin={"秦\nDuke Xiao\n孝公","秦\nShang Yang\n商鞅","秦\nKing Hui\n惠文王","秦\nKing Zhaoxiang\n昭襄王","秦\nLadyMi\n羋八子","秦\nBai Qi\n白起","秦\nLady Zhao\n趙姬","秦\nKing Zheng\n政王"};
+        String[] qi={"齊\nKing Xuan\n宣王","齊\nZhong Wuyan\n鍾無艷","齊\nLord Menchang\n孟嘗君","齊\nKing Xiang\n襄王","齊\nQueen Junwang\n君王后","齊\nKing Jian\n建王","齊\nSun Bin\n孫臏"};
+        String[] chu={"楚\nWu Qi\n吳起","楚\nKing Kaolie\n考烈王","楚\nKing You\n幽王","楚\nQu Yuan\n屈原","楚\nFuchu\n負芻","楚\nLord Chunshen\n春申君"};
+        String[] zhao={"趙\nKing Wuling\n武靈王","趙\nLord Pingyuan\n平原君","趙\nKing Xiaocheng\n孝成王","趙\nLi Mu\n李牧","趙\nLian Po\n廉頗"};
+        String[] han={"韓\nMarquess Ai\n韩哀侯","韓\nKing Huanhui\n桓惠王","韓\nKing An\n安王","韓\nHan Fei\n韓非"};
+        String[] wei={"魏\nMarquess Wen\n魏文侯","魏\nLord Xinling\n信陵君","魏\nKing Anxi\n安僖王"};
+        String[] yan={"燕\nKing Xi\n喜王","燕\nPrince Dan\n太子丹"};
+        String[] zhang={"张仪\nZhangyi"};
+        for (int i=0;i<placement.length();i=3+i) {
+            StackPane stack = new StackPane();
+            switch (placement.charAt(i)) {
+                case 'a':
+                    Rectangle square = new Rectangle(0, 0, 100, 100);
+                    square.setFill(Color.RED);
+                    int j=Character.getNumericValue(placement.charAt(i+1));
+                    Text ooh = new Text();
+                    ooh.setText(qin[j]);
+                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 11));
+                    int x = 0;
+                    int y = 0;
+                    for (int k=0;k<6;k++){
+                        if (y1[k]==placement.charAt(i+2)){
+                            x=0;
+                        }if (y2[k]==placement.charAt(i+2)){
+                            x=105;
+                        }if (y3[k]==placement.charAt(i+2)){
+                            x=210;
+                        }if (y4[k]==placement.charAt(i+2)){
+                            x=315;
+                        }if (y5[k]==placement.charAt(i+2)){
+                            x=420;
+                        }if (y6[k]==placement.charAt(i+2)){
+                            x=525;
+                        }if (x1[k]==placement.charAt(i+2)){
+                            y=0;
+                        }if (x2[k]==placement.charAt(i+2)){
+                            y=105;
+                        }if (x3[k]==placement.charAt(i+2)){
+                            y=210;
+                        }if (x4[k]==placement.charAt(i+2)){
+                            y=315;
+                        }if (x5[k]==placement.charAt(i+2)){
+                            y=420;
+                        }if (x6[k]==placement.charAt(i+2)){
+                            y=525;
+                        }
+                    }
+                    square.setX(x);
+                    square.setY(y);
+                    ooh.setX(x+10);
+                    ooh.setY(y+40);
+                    score.getChildren().addAll(square,ooh);
+                    break;
+                case'b':
+                    square = new Rectangle(0, 0, 100, 100);
+                    square.setFill(Color.ORANGE);
+                    j=Character.getNumericValue(placement.charAt(i+1));
+                    ooh = new Text(qi[j]);
+                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 11));
+                    x=0;
+                    y=0;
+                    for (int k=0;k<6;k++){
 
-    // FIXME Task 12: Integrate a more advanced opponent into your game
+                        if (y1[k]==placement.charAt(i+2)){
+                            x=0;
+                        }if (y2[k]==placement.charAt(i+2)){
+                            x=105;
+                        }if (y3[k]==placement.charAt(i+2)){
+                            x=210;
+                        }if (y4[k]==placement.charAt(i+2)){
+                            x=315;
+                        }if (y5[k]==placement.charAt(i+2)){
+                            x=420;
+                        }if (y6[k]==placement.charAt(i+2)){
+                            x=525;
+                        }if (x1[k]==placement.charAt(i+2)){
+                            y=0;
+                        }if (x2[k]==placement.charAt(i+2)){
+                            y=105;
+                        }if (x3[k]==placement.charAt(i+2)){
+                            y=210;
+                        }if (x4[k]==placement.charAt(i+2)){
+                            y=315;
+                        }if (x5[k]==placement.charAt(i+2)){
+                            y=420;
+                        }if (x6[k]==placement.charAt(i+2)){
+                            y=525;
+                        }
+                    }
+                    square.setX(x);
+                    square.setY(y);
+                    ooh.setX(x+10);
+                    ooh.setY(y+40);
+                    score.getChildren().addAll(square,ooh);
+                    break;
+                case 'c':
+                    square = new Rectangle(300, 0, 100, 100);
+                    square.setFill(Color.YELLOW);
+                    j=Character.getNumericValue(placement.charAt(i+1));
+                    ooh = new Text(chu[j]);
+                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 11));
+                    score.getChildren().addAll(square,ooh);
+                    x=0;
+                    y=0;
+                    for (int k=0;k<6;k++){
+                        if (y1[k]==placement.charAt(i+2)){
+                            x=0;
+                        }if (y2[k]==placement.charAt(i+2)){
+                            x=105;
+                        }if (y3[k]==placement.charAt(i+2)){
+                            x=210;
+                        }if (y4[k]==placement.charAt(i+2)){
+                            x=315;
+                        }if (y5[k]==placement.charAt(i+2)){
+                            x=420;
+                        }if (y6[k]==placement.charAt(i+2)){
+                            x=525;
+                        }if (x1[k]==placement.charAt(i+2)){
+                            y=0;
+                        }if (x2[k]==placement.charAt(i+2)){
+                            y=105;
+                        }if (x3[k]==placement.charAt(i+2)){
+                            y=210;
+                        }if (x4[k]==placement.charAt(i+2)){
+                            y=315;
+                        }if (x5[k]==placement.charAt(i+2)){
+                            y=420;
+                        }if (x6[k]==placement.charAt(i+2)){
+                            y=525;
+                        }}
+                    square.setX(x);
+                    square.setY(y);
+                    ooh.setX(x+10);
+                    ooh.setY(y+40);
+                    break;
+                case'd':
+                    square = new Rectangle(180, 0, 100, 100);
+                    square.setFill(Color.GREEN);
+                    j=Character.getNumericValue(placement.charAt(i+1));
+                    ooh = new Text(zhao[j]);
+                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 11));
+                    x=0;
+                    y=0;
+                    for (int k=0;k<6;k++){
+                        if (y1[k]==placement.charAt(i+2)){
+                            x=0;
+                        }if (y2[k]==placement.charAt(i+2)){
+                            x=105;
+                        }if (y3[k]==placement.charAt(i+2)){
+                            x=210;
+                        }if (y4[k]==placement.charAt(i+2)){
+                            x=315;
+                        }if (y5[k]==placement.charAt(i+2)){
+                            x=420;
+                        }if (y6[k]==placement.charAt(i+2)){
+                            x=525;
+                        }if (x1[k]==placement.charAt(i+2)){
+                            y=0;
+                        }if (x2[k]==placement.charAt(i+2)){
+                            y=105;
+                        }if (x3[k]==placement.charAt(i+2)){
+                            y=210;
+                        }if (x4[k]==placement.charAt(i+2)){
+                            y=315;
+                        }if (x5[k]==placement.charAt(i+2)){
+                            y=420;
+                        }if (x6[k]==placement.charAt(i+2)){
+                            y=525;
+                        }
+                    }
+                    square.setX(x);
+                    square.setY(y);
+                    ooh.setX(x+10);
+                    ooh.setY(y+40);
+                    score.getChildren().addAll(square,ooh);
+                    break;
+                case 'e':
+                    square = new Rectangle(0, 0, 100, 100);
+                    square.setFill(Color.OLIVE);
+                    j=Character.getNumericValue(placement.charAt(i+1));
+                    ooh = new Text(han[j]);
+                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 11));
+                    score.getChildren().addAll(square,ooh);
+                    x=0;
+                    y=0;
+                    for (int k=0;k<6;k++){
+                        if (y1[k]==placement.charAt(i+2)){
+                            x=0;
+                        }if (y2[k]==placement.charAt(i+2)){
+                            x=105;
+                        }if (y3[k]==placement.charAt(i+2)){
+                            x=210;
+                        }if (y4[k]==placement.charAt(i+2)){
+                            x=315;
+                        }if (y5[k]==placement.charAt(i+2)){
+                            x=420;
+                        }if (y6[k]==placement.charAt(i+2)){
+                            x=525;
+                        }if (x1[k]==placement.charAt(i+2)){
+                            y=0;
+                        }if (x2[k]==placement.charAt(i+2)){
+                            y=105;
+                        }if (x3[k]==placement.charAt(i+2)){
+                            y=210;
+                        }if (x4[k]==placement.charAt(i+2)){
+                            y=315;
+                        }if (x5[k]==placement.charAt(i+2)){
+                            y=420;
+                        }if (x6[k]==placement.charAt(i+2)){
+                            y=525;
+                        }
+                    }
+                    square.setX(x);
+                    square.setY(y);
+                    ooh.setX(x+10);
+                    ooh.setY(y+40);
+                    break;
+                case 'f':
+                    square = new Rectangle(0, 0, 100, 100);
+                    square.setFill(Color.BLUE);
+                    j=Character.getNumericValue(placement.charAt(i+1));
+                    ooh = new Text(wei[j]);
+                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 11));
+                    x=0;
+                    y=0;
+                    for (int k=0;k<6;k++){
+                        if (y1[k]==placement.charAt(i+2)){
+                            x=0;
+                        }if (y2[k]==placement.charAt(i+2)){
+                            x=105;
+                        }if (y3[k]==placement.charAt(i+2)){
+                            x=210;
+                        }if (y4[k]==placement.charAt(i+2)){
+                            x=315;
+                        }if (y5[k]==placement.charAt(i+2)){
+                            x=420;
+                        }if (y6[k]==placement.charAt(i+2)){
+                            x=525;
+                        }if (x1[k]==placement.charAt(i+2)){
+                            y=0;
+                        }if (x2[k]==placement.charAt(i+2)){
+                            y=105;
+                        }if (x3[k]==placement.charAt(i+2)){
+                            y=210;
+                        }if (x4[k]==placement.charAt(i+2)){
+                            y=315;
+                        }if (x5[k]==placement.charAt(i+2)){
+                            y=420;
+                        }if (x6[k]==placement.charAt(i+2)){
+                            y=525;
+                        }
+                    }
+                    square.setX(x);
+                    square.setY(y);
+                    ooh.setX(x+10);
+                    ooh.setY(y+40);
+                    score.getChildren().addAll(square,ooh);
+                    break;
+                case 'g':
+                    square = new Rectangle(0, 0, 100, 100);
+                    square.setFill(Color.PURPLE);
+                    j=Character.getNumericValue(placement.charAt(i+1));
+                    ooh = new Text(yan[j]);
+                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 11));
+                    x=0;
+                    y=0;
+                    for (int k=0;k<6;k++){
+                        if (y1[k]==placement.charAt(i+2)){
+                            x=0;
+                        }if (y2[k]==placement.charAt(i+2)){
+                            x=105;
+                        }if (y3[k]==placement.charAt(i+2)){
+                            x=210;
+                        }if (y4[k]==placement.charAt(i+2)){
+                            x=315;
+                        }if (y5[k]==placement.charAt(i+2)){
+                            x=420;
+                        }if (y6[k]==placement.charAt(i+2)){
+                            x=525;
+                        }if (x1[k]==placement.charAt(i+2)){
+                            y=0;
+                        }if (x2[k]==placement.charAt(i+2)){
+                            y=105;
+                        }if (x3[k]==placement.charAt(i+2)){
+                            y=210;
+                        }if (x4[k]==placement.charAt(i+2)){
+                            y=315;
+                        }if (x5[k]==placement.charAt(i+2)){
+                            y=420;
+                        }if (x6[k]==placement.charAt(i+2)){
+                            y=525;
+                        }
+                    }
+                    square.setX(x);
+                    square.setY(y);
+                    ooh.setX(x+10);
+                    ooh.setY(y+40);
+                    score.getChildren().addAll(square,ooh);
+                    break;
+                case 'z':
+                    square=new Rectangle(0,0,100,100);
+                    square.setFill(Color.BLACK);
+                    j=Character.getNumericValue(placement.charAt(i+1));
+                    ooh = new Text(zhang[0]);
+                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 11));
+                    ooh.setFill(Color.WHITE);
+                    x=0;
+                    y=0;
+                    for (int k=0;k<6;k++){
+                        if (y1[k]==placement.charAt(i+2)){
+                            x=0;
+                        }if (y2[k]==placement.charAt(i+2)){
+                            x=105;
+                        }if (y3[k]==placement.charAt(i+2)){
+                            x=210;
+                        }if (y4[k]==placement.charAt(i+2)){
+                            x=315;
+                        }if (y5[k]==placement.charAt(i+2)){
+                            x=420;
+                        }if (y6[k]==placement.charAt(i+2)){
+                            x=525;
+                        }if (x1[k]==placement.charAt(i+2)){
+                            y=0;
+                        }if (x2[k]==placement.charAt(i+2)){
+                            y=105;
+                        }if (x3[k]==placement.charAt(i+2)){
+                            y=210;
+                        }if (x4[k]==placement.charAt(i+2)){
+                            y=315;
+                        }if (x5[k]==placement.charAt(i+2)){
+                            y=420;
+                        }if (x6[k]==placement.charAt(i+2)){
+                            y=525;
+                        }
+                    }
+                    square.setX(x);
+                    square.setY(y);
+                    ooh.setX(x+10);
+                    ooh.setY(y+40);
+                    score.getChildren().addAll(square,ooh);
+                    break;}}}
+    //Authority : Ruimin Chu
+    private void viewSupporters (){
+        String[] qin={"秦   Duke Xiao","秦   Shang Yang","秦   King Hui","秦   King Zhaoxiang","秦   LadyMi","秦   Bai Qi","秦   Lady Zhao","秦   King Zheng"};
+        String[] qi={"齊   King Xuan","齊   Zhong Wuyan","齊   Lord Menchang","齊   King Xiang","齊  Queen Junwang","齊   King Jian","齊   Sun Bin"};
+        String[] chu={"楚   Wu Qi","楚   King Kaolie","楚   King You","楚  Qu Yuan","楚   Fuchu","楚  Lord Chunshen"};
+        String[] zhao={"趙   King Wuling","趙   Lord Pingyuan","趙   King Xiaocheng","趙   Li Mu","趙   Lian Po"};
+        String[] han={"韓   Marquess Ai","韓   King Huanhui","韓   King An","韓   Han Fei"};
+        String[] wei={"魏  Marquess Wen","魏   Lord Xinling","魏   King Anxi"};
+        String[] yan={"燕   King Xi","燕   Prince Dan"};
+        for ( int i = 0; i < numPlayers; i++){
+            String supporters = WarringStatesGame.getSupporters(setup,moveSequence,numPlayers,i);
+            int x1 = 633;
+            int y1 = 56;
+            if (i % 2 == 1){
+                x1 = x1 + 150;
+            }
+            if (i >1){
+                y1 = y1 + 344;
+            }
+            for ( int j = 0; j < supporters.length(); j+=2){
+                Rectangle square = new Rectangle(x1, y1, 145, 20);
+                int z=Character.getNumericValue(supporters.charAt(j+1));
+                if (supporters.charAt(j)=='a'){
+                    square.setFill(Color.RED);
+                    Text temp = new Text(x1,y1+15,qin[z]);
+                    temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 11.5));
+                    root.getChildren().addAll(square,temp);
+                    y1+=20;
+                } else if (supporters.charAt(j)=='b'){
+                    square.setFill(Color.ORANGE);
+                    Text temp = new Text(x1,y1+15,qi[z]);
+                    temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 11.5));
+                    root.getChildren().addAll(square,temp);
+                    y1+=20;
+                }  else if (supporters.charAt(j)=='c'){
+                    square.setFill(Color.YELLOW);
+                    Text temp = new Text(x1,y1+15,chu[z]);
+                    temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 11.5));
+                    root.getChildren().addAll(square,temp);
+                    y1+=20;
+                }  else if (supporters.charAt(j)=='d') {
+                    square.setFill(Color.GREEN);
+                    Text temp = new Text(x1,y1+15,zhao[z]);
+                    temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 11.5));
+                    root.getChildren().addAll(square, temp);
+                    y1 += 20;
+                }  else if (supporters.charAt(j)=='e') {
+                    square.setFill(Color.OLIVE);
+                    Text temp = new Text(x1,y1+15,han[z]);
+                    temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 11.5));
+                    root.getChildren().addAll(square, temp);
+                    y1 += 20;
+                }  else if (supporters.charAt(j)=='f') {
+                    square.setFill(Color.BLUE);
+                    Text temp = new Text(x1,y1+15,wei[z]);
+                    temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 11.5));
+                    root.getChildren().addAll(square, temp);
+                    y1 += 20;
+                }  else if (supporters.charAt(j)=='g') {
+                    square.setFill(Color.PURPLE);
+                    Text temp = new Text(x1,y1+15,yan[z]);
+                    temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 11.5));
+                    root.getChildren().addAll(square, temp);
+                    y1 += 20;
+                }
+            }
+        }
+    }
+
+    /**
+     *
+     * @param placement
+     * @return true if there is no valid move on the board
+     *
+     * Authority: Ruimin Chu
+     */
+    public static boolean noValidMove(String placement){
+        for ( int i = 2; i<placement.length(); i += 3){
+            if (WarringStatesGame.isMoveLegal(placement,placement.charAt(i))){
+                return false;
+            }
+        }
+        return true;
+    }
+
+    /**
+     * show the flags on score board
+     *
+     * Authority: Ruimin Chu
+     */
+    private void viewFlags(){
+        int[] flags  = WarringStatesGame.getFlags(setup,moveSequence,numPlayers);
+        for (int i = 0; i < numPlayers; i++){
+            int x2 = 633;
+            int y2 = 375;
+            if (i % 2 == 1){
+                x2 = x2 + 150;
+            }
+            if (i > 1){
+                y2 = y2 + 300;
+            }
+            for (int j = 0; j < flags.length; j++){
+                Rectangle square = new Rectangle(x2, y2, 20, 20);
+                if ( flags[j] == i){
+                    if ( j ==0 ){
+                        square.setFill(Color.RED);
+                        Text temp = new Text(x2,y2+15,"Qin");
+                        temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 10));
+                        flag.getChildren().addAll(square, temp);
+                        flag.toFront();
+                        x2 += 20;
+                    } else if ( j == 1 ){
+                        square.setFill(Color.ORANGE);
+                        Text temp = new Text(x2,y2+15,"Qi");
+                        temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 10));
+                        flag.getChildren().addAll(square, temp);
+                        flag.toFront();
+                        x2 += 20;
+                    } else if ( j == 2 ){
+                        square.setFill(Color.YELLOW);
+                        Text temp = new Text(x2,y2+15,"Chu");
+                        temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 10));
+                        flag.getChildren().addAll(square, temp);
+                        flag.toFront();
+                        x2 += 20;
+                    } else if ( j == 3 ){
+                        square.setFill(Color.GREEN);
+                        Text temp = new Text(x2,y2+15,"Zhao");
+                        temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 10));
+                        flag.getChildren().addAll(square, temp);
+                        flag.toFront();
+                        x2 += 20;
+                    } else if ( j == 4 ){
+                        square.setFill(Color.OLIVE);
+                        Text temp = new Text(x2,y2+15,"Han");
+                        temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 10));
+                        flag.getChildren().addAll(square, temp);
+                        flag.toFront();
+                        x2 += 20;
+                    } else if ( j == 5 ){
+                        square.setFill(Color.BLUE);
+                        Text temp = new Text(x2,y2+15,"Wei");
+                        temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 10));
+                        flag.getChildren().addAll(square, temp);
+                        flag.toFront();
+                        x2 += 20;
+                    } else if ( j == 6 ){
+                        square.setFill(Color.PURPLE);
+                        Text temp = new Text(x2,y2+15,"Yan");
+                        temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 10));
+                        flag.getChildren().addAll(square, temp);
+                        flag.toFront();
+                        x2 += 20;
+                    }
+                }
+            }
+        }
+    }
 
     @Override
     public void start(Stage primaryStage) throws Exception {
-
+        primaryStage.setTitle("Warring States ");
+        Random rand = new Random();
+        n = rand.nextInt(19);
+        setup=PLACEMENTS[n];
+        placement=setup;
+        root.getChildren().add(flag);
+        root.getChildren().add(score);
+        root.getChildren().add(controls);
+        ZyMove();
+        Scene scene = new Scene(root,BOARD_WIDTH, BOARD_HEIGHT );
+        numInput();
+        primaryStage.setScene(scene);
+        primaryStage.show();
     }
 }
 
+
+
Only in comp1110-ass2/src/comp1110/ass2/gui: Player.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Player.java
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$1.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer.class
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/gui/Viewer.java comp1110-ass2/src/comp1110/ass2/gui/Viewer.java
--- ../master/comp1110-ass2/src/comp1110/ass2/gui/Viewer.java	2018-05-18 08:54:16.593376370 +1000
+++ comp1110-ass2/src/comp1110/ass2/gui/Viewer.java	2018-05-18 10:09:04.492885239 +1000
@@ -9,6 +9,12 @@
 import javafx.scene.control.Label;
 import javafx.scene.control.TextField;
 import javafx.scene.layout.HBox;
+import javafx.scene.layout.StackPane;
+import javafx.scene.paint.Color;
+import javafx.scene.shape.Rectangle;
+import javafx.scene.text.Font;
+import javafx.scene.text.FontWeight;
+import javafx.scene.text.Text;
 import javafx.stage.Stage;
 
 /**
@@ -16,6 +22,8 @@
  * <p>
  * NOTE: This class is separate from your main game class.  This
  * class does not play a game, it just illustrates various card placements.
+ *
+ * authority: Zhoujing Yang
  */
 public class Viewer extends Application {
 
@@ -35,7 +43,362 @@
      */
     void makePlacement(String placement) {
         // FIXME Task 4: implement the simple placement viewer
-    }
+        char[] y1={'4','5','6','7','8','9'};
+        char[] y2={'Y','Z','0','1','2','3'};
+        char[] y3={'S','T','U','V','W','X'};
+        char[] y4={'M','N','O','P','Q','R'};
+        char[] y5={'G','H','I','J','K','L'};
+        char[] y6={'A','B','C','D','E','F'};//X轴坐标
+        char[] x1={'4','Y','S','M','G','A'};
+        char[] x2={'5','Z','T','N','H','B'};
+        char[] x3={'6','0','U','O','I','C'};
+        char[] x4={'7','1','V','P','J','D'};
+        char[] x5={'8','2','W','Q','K','E'};
+        char[] x6={'9','3','X','R','L','F'};//Y轴坐标
+        String[] qin={"秦\nDuke Xiao\n孝公","秦\nShang Yang\n商鞅","秦\nKing Hui\n惠文王","秦\nKing Zhaoxiang\n昭襄王","秦\nLadyMi\n羋八子","秦\nBai Qi\n白起","秦\nLady Zhao\n趙姬","秦\nKing Zheng\n政王"};
+        String[] qi={"齊\nKing Xuan\n宣王","齊\nZhong Wuyan\n鍾無艷","齊\nLord Menchang\n孟嘗君","齊\nKing Xiang\n襄王","齊\nQueen Junwang\n君王后","齊\nKing Jian\n建王","齊\nSun Bin\n孫臏"};
+        String[] chu={"楚\nWu Qi\n吳起","楚\nKing Kaolie\n考烈王","楚\nKing You\n幽王","楚\nQu Yuan\n屈原","楚\nFuchu\n負芻","楚\nLord Chunshen\n春申君"};
+        String[] zhao={"趙\nKing Wuling\n武靈王","趙\nLord Pingyuan\n平原君","趙\nKing Xiaocheng\n孝成王","趙\nLi Mu\n李牧","趙\nLian Po\n廉頗"};
+        String[] han={"韓\nMarquess Ai\n韩哀侯","韓\nKing Huanhui\n桓惠王","韓\nKing An\n安王","韓\nHan Fei\n韓非"};
+        String[] wei={"魏\nMarquess Wen\n魏文侯","魏\nLord Xinling\n信陵君","魏\nKing Anxi\n安僖王"};
+        String[] yan={"燕\nKing Xi\n喜王","燕\nPrince Dan\n太子丹"};
+        String[] zhang={"张仪\nZhangyi"};
+        for (int i=0;i<placement.length();i=3+i) {
+            StackPane stack = new StackPane();
+             switch (placement.charAt(i)) {
+                case 'a':
+                Rectangle square = new Rectangle(0, 0, 100, 100);
+                square.setFill(Color.RED);
+                int j=Character.getNumericValue(placement.charAt(i+1));
+                Text ooh = new Text();
+                ooh.setText(qin[j]);
+                ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 11.5));
+                int x = 0;
+                int y = 0;
+                for (int k=0;k<6;k++){
+                    if (y1[k]==placement.charAt(i+2)){
+                        x=0;
+                    }if (y2[k]==placement.charAt(i+2)){
+                        x=105;
+                    }if (y3[k]==placement.charAt(i+2)){
+                        x=210;
+                    }if (y4[k]==placement.charAt(i+2)){
+                        x=315;
+                    }if (y5[k]==placement.charAt(i+2)){
+                        x=420;
+                    }if (y6[k]==placement.charAt(i+2)){
+                        x=525;
+                    }if (x1[k]==placement.charAt(i+2)){
+                        y=0;
+                    }if (x2[k]==placement.charAt(i+2)){
+                        y=105;
+                    }if (x3[k]==placement.charAt(i+2)){
+                        y=210;
+                    }if (x4[k]==placement.charAt(i+2)){
+                        y=315;
+                    }if (x5[k]==placement.charAt(i+2)){
+                        y=420;
+                    }if (x6[k]==placement.charAt(i+2)){
+                        y=525;
+                    }
+                }
+                square.setX(x);
+                square.setY(y);
+                ooh.setX(x+10);
+                ooh.setY(y+40);
+                root.getChildren().addAll(square,ooh);
+                break;
+                case'b':
+                    square = new Rectangle(0, 0, 100, 100);
+                    square.setFill(Color.ORANGE);
+                    j=Character.getNumericValue(placement.charAt(i+1));
+                    ooh = new Text(qi[j]);
+                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
+                    x=0;
+                    y=0;
+                    for (int k=0;k<6;k++){
+
+                        if (y1[k]==placement.charAt(i+2)){
+                            x=0;
+                        }if (y2[k]==placement.charAt(i+2)){
+                            x=105;
+                        }if (y3[k]==placement.charAt(i+2)){
+                            x=210;
+                        }if (y4[k]==placement.charAt(i+2)){
+                            x=315;
+                        }if (y5[k]==placement.charAt(i+2)){
+                            x=420;
+                        }if (y6[k]==placement.charAt(i+2)){
+                            x=525;
+                        }if (x1[k]==placement.charAt(i+2)){
+                            y=0;
+                        }if (x2[k]==placement.charAt(i+2)){
+                            y=105;
+                        }if (x3[k]==placement.charAt(i+2)){
+                            y=210;
+                        }if (x4[k]==placement.charAt(i+2)){
+                            y=315;
+                        }if (x5[k]==placement.charAt(i+2)){
+                            y=420;
+                        }if (x6[k]==placement.charAt(i+2)){
+                            y=525;
+                        }
+                }
+                    square.setX(x);
+                    square.setY(y);
+                    ooh.setX(x+10);
+                    ooh.setY(y+40);
+                    root.getChildren().addAll(square,ooh);
+                    break;
+                case 'c':
+                    square = new Rectangle(300, 0, 100, 100);
+                    square.setFill(Color.YELLOW);
+                    j=Character.getNumericValue(placement.charAt(i+1));
+                    ooh = new Text(chu[j]);
+                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
+                    root.getChildren().addAll(square,ooh);
+                    x=0;
+                    y=0;
+                    for (int k=0;k<6;k++){
+                        if (y1[k]==placement.charAt(i+2)){
+                            x=0;
+                        }if (y2[k]==placement.charAt(i+2)){
+                            x=105;
+                        }if (y3[k]==placement.charAt(i+2)){
+                            x=210;
+                        }if (y4[k]==placement.charAt(i+2)){
+                            x=315;
+                        }if (y5[k]==placement.charAt(i+2)){
+                            x=420;
+                        }if (y6[k]==placement.charAt(i+2)){
+                            x=525;
+                        }if (x1[k]==placement.charAt(i+2)){
+                            y=0;
+                        }if (x2[k]==placement.charAt(i+2)){
+                            y=105;
+                        }if (x3[k]==placement.charAt(i+2)){
+                            y=210;
+                        }if (x4[k]==placement.charAt(i+2)){
+                            y=315;
+                        }if (x5[k]==placement.charAt(i+2)){
+                            y=420;
+                        }if (x6[k]==placement.charAt(i+2)){
+                            y=525;
+                        }}
+                    square.setX(x);
+                    square.setY(y);
+                    ooh.setX(x+10);
+                    ooh.setY(y+40);
+                    break;
+                    case'd':
+                    square = new Rectangle(180, 0, 100, 100);
+                    square.setFill(Color.GREEN);
+                    j=Character.getNumericValue(placement.charAt(i+1));
+                    ooh = new Text(zhao[j]);
+                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
+                    x=0;
+                    y=0;
+                    for (int k=0;k<6;k++){
+                        if (y1[k]==placement.charAt(i+2)){
+                            x=0;
+                        }if (y2[k]==placement.charAt(i+2)){
+                            x=105;
+                        }if (y3[k]==placement.charAt(i+2)){
+                            x=210;
+                        }if (y4[k]==placement.charAt(i+2)){
+                            x=315;
+                        }if (y5[k]==placement.charAt(i+2)){
+                            x=420;
+                        }if (y6[k]==placement.charAt(i+2)){
+                            x=525;
+                        }if (x1[k]==placement.charAt(i+2)){
+                            y=0;
+                        }if (x2[k]==placement.charAt(i+2)){
+                            y=105;
+                        }if (x3[k]==placement.charAt(i+2)){
+                            y=210;
+                        }if (x4[k]==placement.charAt(i+2)){
+                            y=315;
+                        }if (x5[k]==placement.charAt(i+2)){
+                            y=420;
+                        }if (x6[k]==placement.charAt(i+2)){
+                            y=525;
+                        }
+                }
+                        square.setX(x);
+                        square.setY(y);
+                        ooh.setX(x+10);
+                        ooh.setY(y+40);
+                        root.getChildren().addAll(square,ooh);
+                        break;
+                 case 'e':
+                square = new Rectangle(0, 0, 100, 100);
+                square.setFill(Color.OLIVE);
+                j=Character.getNumericValue(placement.charAt(i+1));
+                ooh = new Text(han[j]);
+                ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 11.5));
+                     root.getChildren().addAll(square,ooh);
+                     x=0;
+                     y=0;
+                for (int k=0;k<6;k++){
+                    if (y1[k]==placement.charAt(i+2)){
+                        x=0;
+                    }if (y2[k]==placement.charAt(i+2)){
+                        x=105;
+                    }if (y3[k]==placement.charAt(i+2)){
+                        x=210;
+                    }if (y4[k]==placement.charAt(i+2)){
+                        x=315;
+                    }if (y5[k]==placement.charAt(i+2)){
+                        x=420;
+                    }if (y6[k]==placement.charAt(i+2)){
+                        x=525;
+                    }if (x1[k]==placement.charAt(i+2)){
+                        y=0;
+                    }if (x2[k]==placement.charAt(i+2)){
+                        y=105;
+                    }if (x3[k]==placement.charAt(i+2)){
+                        y=210;
+                    }if (x4[k]==placement.charAt(i+2)){
+                        y=315;
+                    }if (x5[k]==placement.charAt(i+2)){
+                        y=420;
+                    }if (x6[k]==placement.charAt(i+2)){
+                        y=525;
+                    }
+                }
+                     square.setX(x);
+                     square.setY(y);
+                     ooh.setX(x+10);
+                     ooh.setY(y+40);
+                     break;
+                 case 'f':
+                square = new Rectangle(0, 0, 100, 100);
+                square.setFill(Color.BLUE);
+                j=Character.getNumericValue(placement.charAt(i+1));
+                ooh = new Text(wei[j]);
+                ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
+                x=0;
+                y=0;
+                for (int k=0;k<6;k++){
+                    if (y1[k]==placement.charAt(i+2)){
+                        x=0;
+                    }if (y2[k]==placement.charAt(i+2)){
+                        x=105;
+                    }if (y3[k]==placement.charAt(i+2)){
+                        x=210;
+                    }if (y4[k]==placement.charAt(i+2)){
+                        x=315;
+                    }if (y5[k]==placement.charAt(i+2)){
+                        x=420;
+                    }if (y6[k]==placement.charAt(i+2)){
+                        x=525;
+                    }if (x1[k]==placement.charAt(i+2)){
+                        y=0;
+                    }if (x2[k]==placement.charAt(i+2)){
+                        y=105;
+                    }if (x3[k]==placement.charAt(i+2)){
+                        y=210;
+                    }if (x4[k]==placement.charAt(i+2)){
+                        y=315;
+                    }if (x5[k]==placement.charAt(i+2)){
+                        y=420;
+                    }if (x6[k]==placement.charAt(i+2)){
+                        y=525;
+                    }
+                }
+                     square.setX(x);
+                     square.setY(y);
+                     ooh.setX(x+10);
+                     ooh.setY(y+40);
+                     root.getChildren().addAll(square,ooh);
+                     break;
+                 case 'g':
+                square = new Rectangle(0, 0, 100, 100);
+                square.setFill(Color.PURPLE);
+                j=Character.getNumericValue(placement.charAt(i+1));
+                ooh = new Text(yan[j]);
+                ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
+                x=0;
+                y=0;
+                for (int k=0;k<6;k++){
+                    if (y1[k]==placement.charAt(i+2)){
+                        x=0;
+                    }if (y2[k]==placement.charAt(i+2)){
+                        x=105;
+                    }if (y3[k]==placement.charAt(i+2)){
+                        x=210;
+                    }if (y4[k]==placement.charAt(i+2)){
+                        x=315;
+                    }if (y5[k]==placement.charAt(i+2)){
+                        x=420;
+                    }if (y6[k]==placement.charAt(i+2)){
+                        x=525;
+                    }if (x1[k]==placement.charAt(i+2)){
+                        y=0;
+                    }if (x2[k]==placement.charAt(i+2)){
+                        y=105;
+                    }if (x3[k]==placement.charAt(i+2)){
+                        y=210;
+                    }if (x4[k]==placement.charAt(i+2)){
+                        y=315;
+                    }if (x5[k]==placement.charAt(i+2)){
+                        y=420;
+                    }if (x6[k]==placement.charAt(i+2)){
+                        y=525;
+                    }
+                }
+                     square.setX(x);
+                     square.setY(y);
+                     ooh.setX(x+10);
+                     ooh.setY(y+40);
+                     root.getChildren().addAll(square,ooh);
+                     break;
+                 case 'z':
+                     square=new Rectangle(0,0,100,100);
+                     square.setFill(Color.BLACK);
+                     j=Character.getNumericValue(placement.charAt(i+1));
+                     ooh = new Text(zhang[0]);
+                     ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
+                     ooh.setFill(Color.WHITE);
+                     x=0;
+                     y=0;
+                     for (int k=0;k<6;k++){
+                         if (y1[k]==placement.charAt(i+2)){
+                             x=0;
+                         }if (y2[k]==placement.charAt(i+2)){
+                             x=105;
+                         }if (y3[k]==placement.charAt(i+2)){
+                             x=210;
+                         }if (y4[k]==placement.charAt(i+2)){
+                             x=315;
+                         }if (y5[k]==placement.charAt(i+2)){
+                             x=420;
+                         }if (y6[k]==placement.charAt(i+2)){
+                             x=525;
+                         }if (x1[k]==placement.charAt(i+2)){
+                             y=0;
+                         }if (x2[k]==placement.charAt(i+2)){
+                             y=105;
+                         }if (x3[k]==placement.charAt(i+2)){
+                             y=210;
+                         }if (x4[k]==placement.charAt(i+2)){
+                             y=315;
+                         }if (x5[k]==placement.charAt(i+2)){
+                             y=420;
+                         }if (x6[k]==placement.charAt(i+2)){
+                             y=525;
+                         }
+                }
+                     square.setX(x);
+                     square.setY(y);
+                     ooh.setX(x+10);
+                     ooh.setY(y+40);
+                     root.getChildren().addAll(square,ooh);
+             break;}}}
+
+
+
 
     /**
      * Create a basic text field for input and a refresh button.
@@ -45,7 +408,7 @@
         textField = new TextField();
         textField.setPrefWidth(300);
         Button button = new Button("Refresh");
-        button.setOnAction(new EventHandler<ActionEvent>() {
+        button.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent e) {
                 makePlacement(textField.getText());
@@ -64,7 +427,6 @@
     public void start(Stage primaryStage) throws Exception {
         primaryStage.setTitle("Warring States Viewer");
         Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);
-
         root.getChildren().add(controls);
 
         makeControls();
Only in comp1110-ass2/src/comp1110/ass2: WarringStatesGame.class
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/WarringStatesGame.java comp1110-ass2/src/comp1110/ass2/WarringStatesGame.java
--- ../master/comp1110-ass2/src/comp1110/ass2/WarringStatesGame.java	2018-05-18 08:54:16.569376239 +1000
+++ comp1110-ass2/src/comp1110/ass2/WarringStatesGame.java	2018-05-18 10:09:04.420884856 +1000
@@ -1,6 +1,9 @@
 package comp1110.ass2;
 
-/**
+
+import java.util.*;
+
+/*
  * This class provides the text interface for the Warring States game
  */
 public class WarringStatesGame {
@@ -14,10 +17,69 @@
      *
      * @param cardPlacement A string describing a card placement
      * @return true if the card placement is well-formed
+     *
+     * Authority: Ruimin Chu
      */
     static boolean isCardPlacementWellFormed(String cardPlacement) {
-        // FIXME Task 2: determine whether a card placement is well-formed
-        return false;
+        char[] k = cardPlacement.toCharArray();
+        char first = k[0]; /* to store the first character*/
+        char second = k[1]; /* to store the second character*/
+        char third = k[2]; /* to store the third character*/
+        if (!((third >= 'A' && third <= 'Z')||(third >= '0' && third <= '9'))) {
+            return false; /*if teh third character is not in the range A .. Z or 0..9, return false;*/
+        } else {  /* after pass the test for third character, then check first and second based on the which kingdom that card is from */
+            if (first == 'a') {
+                if (second >= '0' && second <= '7') {
+                    return true;
+                } else {
+                    return false;
+                }
+            } else if (first == 'b') {
+                if (second >= '0' && second <= '6') {
+                    return true;
+                } else {
+                    return false;
+                }
+            } else if (first == 'c') {
+                if (second >= '0' && second <= '5') {
+                    return true;
+                } else {
+                    return false;
+                }
+            } else if (first == 'd') {
+                if (second >= '0' && second <= '4') {
+                    return true;
+                } else {
+                    return false;
+                }
+            } else if (first == 'e') {
+                if (second >= '0' && second <= '3') {
+                    return true;
+                } else {
+                    return false;
+                }
+            } else if (first == 'f') {
+                if (second >= '0' && second <= '2') {
+                    return true;
+                } else {
+                    return false;
+                }
+            } else if (first == 'g') {
+                if (second >= '0' && second <= '1') {
+                    return true;
+                } else {
+                    return false;
+                }
+            } else if (first == 'z') {
+                if (second == '9') {
+                    return true;
+                } else {
+                    return false;
+                }
+            } else{
+                return false;
+            }
+        }
     }
 
     /**
@@ -26,29 +88,346 @@
      * - each card placement is well-formed
      * - no card appears more than once in the placement
      * - no location contains more than one card
-     *
      * @param placement A string describing a placement of one or more cards
      * @return true if the placement is well-formed
+     *
+     * authority: Xing Meng
      */
+
+
+
     static boolean isPlacementWellFormed(String placement) {
-        // FIXME Task 3: determine whether a placement is well-formed
-        return false;
+        if(placement == null || placement == "") {
+            return false;
+        }else {
+            if(!(placement.length() % 3 == 0)){
+                return false;
+            } else {
+                char[] l = placement.toCharArray();
+                int a = 0;
+                for(int i = 2; i < placement.length(); i = i + 3) {
+                    if(l[i] == 'A' || l[i] == 'B' || l[i] == 'C' || l[i] == 'D' || l[i] == 'E' || l[i] == 'F' || l[i] == 'G' || l[i] == 'H' || l[i] == 'I' || l[i] == 'J' || l[i] == 'K' || l[i] == 'L' || l[i] == 'M' || l[i] == 'N' || l[i] == 'O' || l[i] == 'P' || l[i] == 'Q' || l[i] == 'R' || l[i] == 'S' || l[i] == 'T' || l[i] == 'U' || l[i] == 'V' || l[i] == 'W' || l[i] == 'X' || l[i] == 'Y' || l[i] == 'Z' || l[i] == '0' || l[i] == '1' || l[i] == '2' || l[i] == '3' || l[i] == '4' || l[i] == '5' || l[i] == '6' || l[i] == '7' || l[i] == '8' || l[i] == '9'){
+                        for (int j = i + 3; j < placement.length(); j = j + 3) {
+                            if (l[i] == l[j]) {
+                                return false;
+                            }else{
+                                a++;
+                            }
+                        }
+                    }else{
+                        return false;
+                    }
+                }
+
+                for(int x = 0; x < (placement.length() - 2); x = x + 3){
+                    if(l[x] == 'a'){
+                        if(l[x + 1] == '0' || l[x + 1] == '1' || l[x + 1] == '2' || l[x + 1] == '3' || l[x + 1] == '4' || l[x + 1] == '5' || l[x + 1] == '6' || l[x + 1] == '7'){
+                            for(int y = x + 3; y < (placement.length() - 2); y = y + 3) {
+                                if (l[y] == 'a') {
+                                    if (l[x + 1] == l[y + 1]) {
+                                        return false;
+                                    }
+                                }
+                            }
+                        }else{
+                            return false;
+                        }
+                    }else if(l[x] == 'b'){
+                        if(l[x + 1] == '0' || l[x + 1] == '1' || l[x + 1] == '2' || l[x + 1] == '3' || l[x + 1] == '4' || l[x + 1] == '5' || l[x + 1] == '6'){
+                            for(int y = x + 3; y < (placement.length() - 2); y = y + 3) {
+                                if (l[y] == 'b') {
+                                    if (l[x + 1] == l[y + 1]) {
+                                        return false;
+                                    }
+                                }
+                            }
+                        }else{
+                            return false;
+                        }
+                    }else if(l[x] == 'c'){
+                        if(l[x + 1] == '0' || l[x + 1] == '1' || l[x + 1] == '2' || l[x + 1] == '3' || l[x + 1] == '4' || l[x + 1] == '5'){
+                            for(int y = x + 3; y < (placement.length() - 2); y = y + 3) {
+                                if (l[y] == 'c') {
+                                    if (l[x + 1] == l[y + 1]) {
+                                        return false;
+                                    }
+                                }
+                            }
+                        }else{
+                            return false;
+                        }
+                    }else if(l[x] == 'd'){
+                        if(l[x + 1] == '0' || l[x + 1] == '1' || l[x + 1] == '2' || l[x + 1] == '3' || l[x + 1] == '4'){
+                            for(int y = x + 3; y < (placement.length() - 2); y = y + 3) {
+                                if (l[y] == 'd') {
+                                    if (l[x + 1] == l[y + 1]) {
+                                        return false;
+                                    }
+                                }
+                            }
+                        }else{
+                            return false;
+                        }
+                    }else if(l[x] == 'e'){
+                        if(l[x + 1] == '0' || l[x + 1] == '1' || l[x + 1] == '2' || l[x + 1] == '3'){
+                            for(int y = x + 3; y < (placement.length() - 2); y = y + 3) {
+                                if (l[y] == 'e') {
+                                    if (l[x + 1] == l[y + 1]) {
+                                        return false;
+                                    }
+                                }
+                            }
+                        }else{
+                            return false;
+                        }
+                    }else if(l[x] == 'f'){
+                        if(l[x + 1] == '0' || l[x + 1] == '1' || l[x + 1] == '2'){
+                            for(int y = x + 3; y < (placement.length() - 2); y = y + 3) {
+                                if (l[y] == 'f') {
+                                    if (l[x + 1] == l[y + 1]) {
+                                        return false;
+                                    }
+                                }
+                            }
+                        }else{
+                            return false;
+                        }
+                    }else if(l[x] == 'g'){
+                        if(l[x + 1] == '0' || l[x + 1] == '1'){
+                            for(int y = x + 3; y < (placement.length() - 2); y = y + 3) {
+                                if (l[y] == 'g') {
+                                    if (l[x + 1] == l[y + 1]) {
+                                        return false;
+                                    }
+                                }
+                            }
+                        }else{
+                            return false;
+                        }
+                    }else if(l[x] == 'z'){
+                        if(l[x + 1] == '9'){
+                            for(int y = x + 3; y < (placement.length() - 2); y = y + 3) {
+                                if (l[y] == 'z') {
+                                    if (l[x + 1] == l[y + 1]) {
+                                        return false;
+                                    }
+                                }
+                            }
+                        }else{
+                            return false;
+                        }
+                    }else{
+                        return false;
+                    }
+                }
+            }
+        }
+        return true;
     }
 
     /**
-     * Determine whether a given move is legal given a provided valid placement:
+     *
      * - the location char is in the range A .. Z or 0..9
      * - there is a card at the chosen location;
      * - the location is in the same row or column of the grid as Zhang Yi's current position; and
      * - drawing a line from Zhang Yi's current location through the card at the chosen location,
      *   there are no other cards along the line from the same kingdom as the chosen card
      *   that are further away from Zhang Yi.
-     * @param placement    the current placement string
+     * @param placement the current placement string
      * @param locationChar a location for Zhang Yi to move to
      * @return true if Zhang Yi may move to that location
+     *
+     * Authority: Ruimin Chu
      */
     public static boolean isMoveLegal(String placement, char locationChar) {
-        // FIXME Task 5: determine whether a given move is legal
+        char[] a = placement.toCharArray(); /*convert string to a char[]*/
+        char zyl = ' '; /* initialize Zhang Yi's location*/
+        for (int i = 0; i < a.length - 2; i += 3){
+            if(a[i] == 'z'){
+                zyl = a[i+2]; /* store Zhang Yi's location*/
+            }
+        }
+        if (zyl == locationChar){
+            return false;
+        }
+        /*first check if that location Character is in the range A .. Z or 0..9 */
+        if (!((locationChar >= 'A' && locationChar <= 'Z')||(locationChar >= '0' && locationChar <= '9'))){
+            return false;
+        }else{
+            int c = 0;
+            for (int i = 2; i<placement.length(); i += 3){
+                if(a[i] == locationChar) {
+                    c = 1; /*if that locationChar still has a card on it change c from 0 to 1 so later if c==0 then return false*/
+                }
+            }
+            if (c==0){
+                return false;
+            } else{
+                if(!rowNcol(zyl,locationChar)){
+                    return false; /*rowNcol function tests if zy's location is on the same row or the same column as locationChar*/
+                }else{
+                    if(!sameKingdom(locationChar,zyl,placement)){
+                        return false; /* sameKingdom function tests if there is any other cards along the line from the same kingdom as the chosen card that are further away from Zhang Yi.*/
+                    }else {
+                        return true; /* if pass all the tests above, return true*/
+                    }
+                }
+            }
+        }
+    }
+
+    /**
+     *
+     * @param location
+     * @param zy
+     * @param placement
+     * @return true if there are no other cards along the line from the same kingdom as the chosen card
+     *   that are further away from Zhang Yi.
+     * Authority: Ruimin Chu
+     */
+    static boolean sameKingdom(char location, char zy,  String placement) {
+        char[][] row = {{'A', 'G', 'M', 'S', 'Y', '4'}, {'B', 'H', 'N', 'T', 'Z', '5'}, {'C', 'I', 'O', 'U', '0', '6'}, {'D', 'J', 'P', 'V', '1', '7'}, {'E', 'K', 'Q', 'W', '2', '8'}, {'F', 'L', 'R', 'X', '3', '9'}};
+        char[][] col = {{'A', 'B', 'C', 'D', 'E', 'F'}, {'G', 'H', 'I', 'J', 'K', 'L'}, {'M', 'N', 'O', 'P', 'Q', 'R'}, {'S', 'T', 'U', 'V', 'W', 'X'}, {'Y', 'Z', '0', '1', '2', '3'}, {'4', '5', '6', '7', '8', '9'}};
+        char[] r = {};
+        char[] c = {};
+        char[] pm = placement.toCharArray();
+        for (int i = 0; i < 6; i++) {
+            char[] h = row[i];
+            for (int p = 0; p < 6; p++) {
+                char b = h[p];
+                if (b == zy) {
+                    r = h;
+                    break;
+                }
+            }
+        }
+        for (int i = 0; i < 6; i++) {
+            char[] f = col[i];
+            for (int p = 0; p < 6; p++) {
+                char b = f[p];
+                if (b == zy) {
+                    c = f;
+                    break;
+                }
+            }
+        }
+        if (String.valueOf(r).contains(Character.toString(location))) {
+            int l = String.valueOf(r).indexOf(location);
+            int z = String.valueOf(r).indexOf(zy);
+            char k = ' ';
+            for (int i = 2; i < placement.length(); i += 3) {
+                if (pm[i] == location) {
+                    k = pm[i - 2];
+                }
+            }
+            if (z < l) {
+                for (int i = l + 1; i < 6; i++) {
+                    char test = ' ';
+                    for (int j = 2; j < placement.length(); j += 3) {
+                        if (pm[j] == r[i]) {
+                            test = pm[j - 2];
+                            if (test == k) {
+                                return false;
+                            }
+                        }
+                    }
+                }
+            } else {
+                for (int i = l -1; i >=0; i--) {
+                    char test = ' ';
+                    for (int j = 2; j < placement.length(); j += 3) {
+                        if (pm[j] == r[i]) {
+                            test = pm[j - 2];
+                            if (test == k) {
+                                return false;
+                            }
+                        }
+                    }
+                }
+            }
+        } else {
+            int l = String.valueOf(c).indexOf(location);
+            int z = String.valueOf(c).indexOf(zy);
+            char k = ' ';
+            for (int i = 2; i < placement.length(); i += 3) {
+                if (pm[i] == location) {
+                    k = pm[i - 2];
+                }
+            }
+            if (z < l) {
+                for (int i = l + 1; i < 6; i++) {
+                    char test = ' ';
+                    for (int j = 2; j < placement.length(); j += 3) {
+                        if (pm[j] == c[i]) {
+                            test = pm[j - 2];
+                            if (test == k) {
+                                return false;
+                            }
+                        }
+                    }
+                }
+            } else {
+                for (int i = l -1; i >=0; i--) {
+                    char test = ' ';
+                    for (int j = 2; j < placement.length(); j += 3) {
+                        if (pm[j] == c[i]) {
+                            test = pm[j - 2];
+                            if (test == k) {
+                                return false;
+                            }
+                        }
+                    }
+                }
+            }
+        }
+        return true;
+    }
+
+    /**
+     *
+     * @param zy
+     * @param location
+     * @return true if the location is the on the same row or same column as ZY
+     *
+     * Authority: Ruimin Chu
+     */
+    static boolean rowNcol(char zy,char location) {
+        char[][] row = {{'A','G','M','S','Y','4'},{'B','H','N','T','Z','5'},{'C','I','O','U','0','6'},{'D','J','P','V','1','7'},{'E','K','Q','W','2','8'},{'F','L','R','X','3','9'}};
+        char[][] col = {{'A','B','C','D','E','F'},{'G','H','I','J','K','L'},{'M','N','O','P','Q','R'},{'S','T','U','V','W','X'},{'Y','Z','0','1','2','3'},{'4','5','6','7','8','9'}};
+        char[] r = {};
+        char[] c = {};
+        for (int i = 0; i < 6; i++){
+            char[] a = row[i];
+            for (int p = 0; p < 6; p++){
+                char b = a[p];
+                if (b == zy){
+                    r = a;
+                    break;
+                }
+            }
+        }
+        for (int i = 0; i < 6; i++){
+            char[] a = col[i];
+            for (int p = 0; p < 6; p++){
+                char b = a[p];
+                if (b == zy){
+                    c = a;
+                    break;
+                }
+            }
+        }
+        for (int i = 0; i < 6; i++ ){
+            char k = r[i];
+            if (k == location){
+                return true;
+            }
+        }
+        for (int i = 0; i < 6; i++ ){
+            char k = c[i];
+            if (k == location){
+                return true;
+            }
+        }
         return false;
     }
 
@@ -62,10 +441,195 @@
      * @param setup        A placement string representing the board setup
      * @param moveSequence a string of location characters representing moves
      * @return True if the placement sequence is valid
+     *
+     * authority: Ruimin Chu
      */
     static boolean isMoveSequenceValid(String setup, String moveSequence) {
-        // FIXME Task 6: determine whether a placement sequence is valid
-        return false;
+        String placement = setup;
+        for (int i = 0; i < moveSequence.length(); i++){
+            for (int j = 0; j < placement.length(); j += 3){
+                if (placement.charAt(j) == 'z'){
+                    if (placement.charAt(j+2) == moveSequence.charAt(i)){
+                        return false;
+                    }
+                }
+            }
+            if(!isMoveLegal(placement,moveSequence.charAt(i))){
+                return false; /* If the next move for the current board is not legal, return false*/
+            } else {
+                placement=changeBoard(placement,moveSequence.charAt(i)); /*after testing if the next move is legal, change the board based on the movement*/
+            }
+        }
+        return true;
+    }
+
+    /** after passing isMoveLegal, we know the next move location is valid. Then we can take the row that Zhang Yi is now on out.
+     We first find ZY's current location. Then going through all different combinations of row we have to find the row that has that location.
+     Finally we store that row into char[] r.
+     * get the row where zy located
+     * will be used in changeBoard function
+     * @param placement
+     * @return char[] the row that contains zy's locationChar
+     *
+     * Authority: Ruimin Chu
+     */
+    public static char[] takeRow(String placement){
+        char[][] row = {{'A','G','M','S','Y','4'},{'B','H','N','T','Z','5'},{'C','I','O','U','0','6'},{'D','J','P','V','1','7'},{'E','K','Q','W','2','8'},{'F','L','R','X','3','9'}};
+        char[] r = {};
+        char zylocation = ' ';
+        for (int i = 0; i < placement.length(); i+=3){
+            if (placement.charAt(i) == 'z'){
+                zylocation=placement.charAt(i+2);
+                break;
+            }
+        }
+        for (int i = 0;i < 6; i++){
+            char[] a = row[i];
+            for (int p = 0;p < 6; p++){
+                char b = a[p];
+                if (b == zylocation){
+                    r = a;
+                    break;
+                }
+            }
+        }
+        return r;
+    }
+
+    /**
+     * get the column where zy located
+     * @param placement
+     * @return char[] the column that contains zy's locationChar
+     *
+     * Authority: Ruimin Chu
+     */
+    public static char[] takeCol(String placement){
+        char[][] col = {{'A','B','C','D','E','F'},{'G','H','I','J','K','L'},{'M','N','O','P','Q','R'},{'S','T','U','V','W','X'},{'Y','Z','0','1','2','3'},{'4','5','6','7','8','9'}};
+        char[] c = {};
+        char zylocation = ' ';
+        for (int i = 0; i < placement.length();i += 3){
+            if (placement.charAt(i) == 'z'){
+                zylocation=placement.charAt(i+2);
+                break;
+            }
+        }
+        for (int i = 0;i < 6; i++){
+            char[] a = col[i];
+            for (int p = 0; p < 6; p++){
+                char b = a[p];
+                if (b == zylocation){
+                    c = a;
+                    break;
+                }
+            }
+        }
+        return c;
+    }
+
+    /**
+     *change the string of board after the new movement
+     * @param placement
+     * @param locationChar
+     * @return String the new board
+     *
+     * Authority: Ruimin
+     */
+    public static String changeBoard(String placement, char locationChar){
+        char[] c = takeCol(placement);
+        char[] r = takeRow(placement);
+        char[] list = { };
+        char kingdom = ' ';
+        int start;
+        int end;
+        char zylocation = ' ';
+        /*
+         * get the location of zy
+         */
+        for (int i = 0; i < placement.length(); i += 3){
+            if (placement.charAt(i) == 'z'){
+                zylocation = placement.charAt(i+2);
+                break;
+            }
+        }
+        /*
+         * find the next movement character is on the same column or row as zy's location and store it in a list
+         */
+        for (int i = 0; i < 6; i++ ){
+            char k = r[i];
+            if (k == locationChar){
+                list = r;
+            }
+        }
+        for (int i = 0; i < 6; i++ ){
+            char k = c[i];
+            if (k == locationChar){
+                list = c;
+            }
+        }
+        /*
+         * store the kingdom of the card that zy's moving on
+         */
+        for (int i = 2; i<placement.length();i+=3){
+            if(placement.charAt(i) == locationChar){
+                kingdom = placement.charAt(i-2);
+                break;
+            }
+        }
+        /*
+         * store the indices of zy's location and move's location in start and end
+         */
+        int tmp = 0;
+        int tmp1 = 0;
+        for (int i = 0; i < 6; i++){
+            if (list[i] == locationChar){
+                tmp = i;
+            }
+        }
+        for (int i = 0; i < 6; i++){
+            if (list[i] == zylocation){
+                tmp1 = i;
+            }
+        }
+        if (tmp > tmp1){
+            start = tmp1;
+            end = tmp;
+        } else {
+            start = tmp;
+            end = tmp1;
+        }
+        /*
+         * check if there is any card that is from the same kingdom as the next movement adn take it out
+         */
+        for (int i = start + 1; i< end; i++){
+            char checkLocation = list[i];
+            for (int j = 2; j < placement.length(); j+=3){
+                if (placement.charAt(j) == checkLocation){
+                    if (placement.charAt(j-2) == kingdom){
+                        placement= placement.substring(0,j-2) + placement.substring(j+1);
+                    }
+                }
+            }
+        }
+        /*
+         * remove the original cardPlacement of Zhang Yi
+         */
+        for (int i = 2; i < placement.length(); i+=3){
+            if (placement.charAt(i) == zylocation){
+                placement=placement.substring(0,i-2) + placement.substring(i+1);
+            }
+        }
+        /*
+         * replace the next movement's cardPlacement with Zhang Yi
+         */
+        for (int i = 2; i < placement.length(); i+=3){
+            if (placement.charAt(i) == locationChar){
+                char[] placementChars = placement.toCharArray();
+                placementChars[i-2] = 'z';
+                placementChars[i-1] = '9';
+                placement = String.valueOf(placementChars);
+            }
+        }
+        return placement;
     }
 
     /**
@@ -79,10 +643,64 @@
      * @param numPlayers   the number of players in the game, must be in the range [2..4]
      * @param playerId     the player number for which to get the list of supporters, [0..(numPlayers-1)]
      * @return the list of supporters for the given player
+     *
+     * Authority: Zhoujing Yang
      */
     public static String getSupporters(String setup, String moveSequence, int numPlayers, int playerId) {
-        // FIXME Task 7: get the list of supporters for a given player after a sequence of moves
-        return null;
+        String[] cardCollect = new String[moveSequence.length()];
+        String placement = setup;
+        String newPlacement = "";
+
+        if (numPlayers>4||numPlayers<2){
+            return "wrong player number";
+        }
+        if (!isPlacementWellFormed(setup)){
+            return "wrong placement";
+        }
+        for (int i =0;i <moveSequence.length();i++){
+            newPlacement = changeBoard(placement,moveSequence.charAt(i));
+            cardCollect[i] = findDifference(placement,newPlacement);
+            placement = newPlacement;
+        }
+        StringBuilder supporter = new StringBuilder();
+        for (int i = playerId; i < cardCollect.length; i+=numPlayers){
+            supporter.append(cardCollect[i]);
+        }
+        return supporter.toString();
+    }
+
+    public static String findDifference(String x,String y){
+        int m;
+        int n;
+        String p="";
+        String q="";
+        for (m=0; m<x.length();m+=3){
+            if (x.charAt(m)=='z'){
+                p=x.substring(0,m)+x.substring(m+3);
+                break;
+            }
+        }
+        for (n=0; n<y.length();n+=3){
+            if (y.charAt(n)=='z'){
+                q=y.substring(0,n)+y.substring(n+3);
+                break;
+            }
+        }
+        String a ="";
+        int j = 0;
+        for (int i=0;i<p.length();i+=3){
+            if (j>=q.length()){
+                a = a + p.substring(i,i+2);
+                continue;
+            } else {
+                if (p.charAt(i)==q.charAt(j)&&p.charAt(i+1)==q.charAt(j+1)){
+                    j+=3;
+                } else {
+                    a = a + p.substring(i,i+2);
+                }
+            }
+        }
+        return a;
     }
 
     /**
@@ -101,12 +719,89 @@
      * - element 5 contains the player ID of the player who controls the flag of Wei
      * - element 6 contains the player ID of the player who controls the flag of Yan
      * If no player controls a particular house, the element for that house will have the value -1.
+     *
+     * Authority: Ruimin Chu
      */
     public static int[] getFlags(String setup, String moveSequence, int numPlayers) {
-        // FIXME Task 8: determine which player controls the flag of each kingdom after a given sequence of moves
-        return null;
+        List<String> Supporters = new ArrayList<String>(numPlayers); /* store the cards different players have*/
+        int[] output;
+        output = new int[7]; /* create an empty list to store the output. The length of it is 7*/
+        for (int i = 0; i < numPlayers; i++){
+            String a = getSupporters(setup, moveSequence, numPlayers, i);
+            Supporters.add(a);
+        }
+        output[0]= getFlag('a', Supporters,numPlayers,moveSequence,setup); /* use the getFlag function to find who will get the flag of this kingdom and add it to the list*/
+        output[1]= getFlag('b', Supporters,numPlayers,moveSequence,setup);
+        output[2]= getFlag('c', Supporters,numPlayers,moveSequence,setup);
+        output[3]= getFlag('d', Supporters,numPlayers,moveSequence,setup);
+        output[4]= getFlag('e', Supporters,numPlayers,moveSequence,setup);
+        output[5]= getFlag('f', Supporters,numPlayers,moveSequence,setup);
+        output[6]= getFlag('g', Supporters,numPlayers,moveSequence,setup);
+        return output;
+    }
+    /**
+     * @param kingdom
+     * @param Supporters List of strings the cards that different players have
+     * @param numPlayers   the number of players in the game, must be in the range [2..4]
+     * @param moveSequence     a string of location characters representing moves
+     * @param setup        A placement string representing the board setup
+     * @return the playerId of the person who should hold the flag
+     *
+     * Authority: Ruimin Chu
+     */
+    public static int getFlag (char kingdom,  List<String> Supporters, int numPlayers,String moveSequence,String setup){
+        int j = 0; /* store how many cards of that kingdom the current flag-holder has*/
+        int output=0; /* store current flag-holder's playerID*/
+        for (int i = 0; i<numPlayers; i++){
+            int m = countCardNumber(kingdom, Supporters.get(i));
+            if (j<m){
+                j=m;
+                output=i; /* if this player has more cards of that kingdom than current flag-holder, change j and output*/
+            } else if (j == m) {
+                List<Integer> temp = new ArrayList<Integer>();
+                for (int a = 0; a<moveSequence.length(); a++) {
+                    for (int b = 2; b < setup.length(); b += 3) {
+                        if (setup.charAt(b) == moveSequence.charAt(a)) {
+                            if (setup.charAt(b - 2) == kingdom) {
+                                temp.add(a); /* find all the movement that takes a or more cards of that kingdom*/
+                            }
+                        }
+                    }
+                }
+                /*checking from the last movement, if that movement belongs to the player we are checking, replace the old one with it;
+                if it belongs to the current flag-holder, do nothing; if it belongs to any other player, check next movement*/
+                for (int k = temp.size()-1; k >= 0;k--){
+                    if (temp.get(k) % numPlayers == i){
+                        j=m;
+                        output=i;
+                        break;
+                    } else if (temp.get(k)%numPlayers==output){
+                        break;
+                    } else {
+                        continue;
+                    }
+                }
+            }
+        }
+        /* if no one has a card of that kingdom return -1*/
+        if (j==0){
+            return -1;
+        } else {
+            return output;
+        }
+    }
+    /* count how may cards of that kingdom the player is holding*/
+    public static int countCardNumber(char kingdom, String helpers){
+        int output=0;
+        for (int i = 0; i<helpers.length(); i+=2){
+            if (helpers.charAt(i)==kingdom){
+                output+=1;
+            }
+        }
+        return output;
     }
 
+
     /**
      * Generate a legal move, given the provided placement string.
      * A move is valid if:
@@ -120,9 +815,98 @@
      * If there is no legal move available, return the null character '\0'.
      * @param placement the current placement string
      * @return a location character representing Zhang Yi's destination for the move
+     *
+     * Authority: Ruimin Chu
      */
     public static char generateMove(String placement) {
-        // FIXME Task 10: generate a legal move
-        return '\0';
+        char zylocation = ' ';
+        for (int i = 0; i < placement.length(); i+=3){
+            if (placement.charAt(i) == 'z'){
+                zylocation = placement.charAt(i+2); /*find Zhang Yi's current location*/
+            }
+        }
+
+        char[] r = takeRow(placement);
+        char[] c = takeCol(placement);
+        ArrayList<Character> destionationLocations = new ArrayList<Character>();
+        /* take the list of the row and column that Zhang Yi is on. Store those characters except Zhang Yi's current location into a list*/
+
+        for (int i = 0; i < 6; i++){
+            char d = r[i];
+            if (d == zylocation){
+                continue;
+            }
+            for (int j = 2; j < placement.length(); j+=3){
+                if (placement.charAt(j) == d){
+                    destionationLocations.add(d);
+                }
+            }
+        }
+        for (int i=0; i<6; i++){
+            char d = c[i];
+            if (d == zylocation){
+                continue;
+            }
+            for (int j = 2; j < placement.length(); j+=3){
+                if (placement.charAt(j) == d){
+                    destionationLocations.add(d);
+                }
+            }
+        }
+        /*test all those characters if they can generate a valid move, remove those who are not illegal*/
+        for (int i = 0; i < destionationLocations.size(); i++){
+            if(!isMoveLegal(placement, destionationLocations.get(i))){
+                destionationLocations.remove(i);
+            }
+        }
+        /* use random function to generate a move from those valid movement options*/
+        Random random = new Random();
+        if (destionationLocations.size() == 0){
+            return '\0';
+        } else {
+            char output = destionationLocations.get(random.nextInt(destionationLocations.size()));
+            return output;
+        }
+    }
+
+    /**
+     *
+     * @param setup
+     * @param moveSequence
+     * @param numPlayers
+     * @return the playerId of the winner
+     *
+     * Authority: Ruimin Chu
+     */
+    public static int determineTheWinner (String setup, String moveSequence, int numPlayers){
+        int[] temp = new int[numPlayers];
+        int[] flags = WarringStatesGame.getFlags(setup, moveSequence, numPlayers);
+        for ( int i = 0; i <flags.length; i++){
+            int k = flags[i];
+            temp[k]+=1;
+        }
+        int max = 0;
+        int output = 0;
+        for (int j = 0; j < temp.length; j++){
+            if (temp[j] > max){
+                max = temp[j];
+                output = j;
+            } else if (temp[j] == max){
+                for (int k = flags.length-1; k >= 0; k--){
+                    if (flags[k] == j){
+                        max = temp[j];
+                        output = j;
+                        break;
+                    } else if (flags[k] == output){
+                        break;
+                    } else{
+                        continue;
+                    }
+                }
+            }
+        }
+        return output;
     }
 }
+
+
diff -ru -x .git ../master/comp1110-ass2/tests/comp1110/ass2/MoveLegalTest.java comp1110-ass2/tests/comp1110/ass2/MoveLegalTest.java
--- ../master/comp1110-ass2/tests/comp1110/ass2/MoveLegalTest.java	2018-05-18 08:54:17.165379463 +1000
+++ comp1110-ass2/tests/comp1110/ass2/MoveLegalTest.java	2018-05-18 10:09:04.828887026 +1000
@@ -29,7 +29,7 @@
     public void testGood() {
         for (int i = 0; i < PLACEMENTS.length; i++) {
             for (char move : LEGAL_MOVE[i]) {
-                assertTrue("Move '" + move + "', should be legal, but was not", WarringStatesGame.isMoveLegal(PLACEMENTS[i], move));
+                assertTrue(" Move '" + move + "', should be legal, but was not", WarringStatesGame.isMoveLegal(PLACEMENTS[i], move));
             }
         }
     }
@@ -75,7 +75,7 @@
     public void testFurtherAway() {
         for (int i = 0; i < PLACEMENTS.length; i++) {
             for (char move : ILLEGAL_MOVE_FURTHER[i]) {
-                assertFalse("Move '" + move + "', should be illegal (a card of the same kingdom was further away in the same direction from Zhang Yi), but was not", WarringStatesGame.isMoveLegal(PLACEMENTS[i], move));
+                assertFalse(" Move '" + move + "', should be illegal (a card of the same kingdom was further away in the same direction from Zhang Yi), but was not", WarringStatesGame.isMoveLegal(PLACEMENTS[i], move));
             }
         }
         Random r = new Random();
Only in comp1110-ass2/tests/comp1110/ass2: u5924220WarringStatesGameTest.java
```
## Test log
```
--javac output--
----
java -cp comp1110-ass2/src:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/junit-4.12.jar:/usr/lib/jvm/oracle-java8-jdk-amd64/jre/lib/ext/jfxrt.jar org.junit.runner.JUnitCore comp1110.ass2.CardPlacementWellFormedTest
---
JUnit version 4.12
.....
Time: 0.017

OK (5 tests)

java -cp comp1110-ass2/src:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/junit-4.12.jar:/usr/lib/jvm/oracle-java8-jdk-amd64/jre/lib/ext/jfxrt.jar org.junit.runner.JUnitCore comp1110.ass2.PlacementWellFormedTest
---
JUnit version 4.12
.....
Time: 0.026

OK (5 tests)

java -cp comp1110-ass2/src:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/junit-4.12.jar:/usr/lib/jvm/oracle-java8-jdk-amd64/jre/lib/ext/jfxrt.jar org.junit.runner.JUnitCore comp1110.ass2.MoveLegalTest
---
JUnit version 4.12
.....
Time: 0.025

OK (5 tests)

java -cp comp1110-ass2/src:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/junit-4.12.jar:/usr/lib/jvm/oracle-java8-jdk-amd64/jre/lib/ext/jfxrt.jar org.junit.runner.JUnitCore comp1110.ass2.MoveSequenceValidTest
---
JUnit version 4.12
.....
Time: 0.065

OK (5 tests)

java -cp comp1110-ass2/src:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/junit-4.12.jar:/usr/lib/jvm/oracle-java8-jdk-amd64/jre/lib/ext/jfxrt.jar org.junit.runner.JUnitCore comp1110.ass2.GetSupportersTest
---
JUnit version 4.12
...
Time: 0.18

OK (3 tests)

java -cp comp1110-ass2/src:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/junit-4.12.jar:/usr/lib/jvm/oracle-java8-jdk-amd64/jre/lib/ext/jfxrt.jar org.junit.runner.JUnitCore comp1110.ass2.GetFlagsTest
---
JUnit version 4.12
...
Time: 0.187

OK (3 tests)

java -cp comp1110-ass2/src:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/junit-4.12.jar:/usr/lib/jvm/oracle-java8-jdk-amd64/jre/lib/ext/jfxrt.jar org.junit.runner.JUnitCore comp1110.ass2.GenerateMoveTest
---
JUnit version 4.12
...
Time: 0.018

OK (3 tests)

```

