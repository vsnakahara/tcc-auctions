\ENCODING=ISO-8859-1
\Problem name: /home/vanessa/Documentos/tcc-auctions/completo/exemplo1.lp

Maximize
 obj: 15 P1T1T2 + 13.5 P3T5 + 13.5 P2T3 + 7.5 P3T4 + 7.5 P2T4 - 1.5 P1T6
      - 1.5 P2T6 - 1.5 P3T6;
Subject To
 c1:  P1T1T2  = 1
 c2:  P1T1T2  = 1
 c3:  P2T3  = 1
 c4:  P3T4 + P2T4  = 1
 c5:  P3T5  = 1
 c6:  P1T6 + P2T6 + P3T6  = 1
 c7:  P1T1T2 + P1T6 >= 1
 c8:  P2T3 + P2T4 + P2T6 >= 1
 c9:  P3T5 + P3T4 + P3T6 >= 1
 c10: 8 P1T1T2 + 4 P1T6 >= 8
 c11: 4 P2T3 + 4 P2T4 + 4 P2T6 >= 8
 c12: 4 P3T5 + 4 P3T4 + 4 P3T6 >= 8
 c13: 8 P1T1T2 + 4 P1T6 <= 20
 c14: 4 P2T3 + 4 P2T4 + 4 P2T6 <= 20
 c15: 4 P3T5 + 4 P3T4 + 4 P3T6 <= 20
Bounds
 0 <= P1T1T2 <= 1
 0 <= P3T5 <= 1
 0 <= P2T3 <= 1
 0 <= P3T4 <= 1
 0 <= P2T4 <= 1
 0 <= P1T6 <= 1
 0 <= P2T6 <= 1
 0 <= P3T6 <= 1
Binaries
 P1T1T2  P3T5  P2T3  P3T4  P2T4  P1T6  P2T6  P3T6 
End
