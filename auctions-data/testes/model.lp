Maximize 
obj: 5 p1t1t2 + 3 p2t3 + 3 p2t4 + 3.5 p3t4 + 3.5 p3t5 -3 p1t6 -3 p2t6 -3 p3t6; 

Subject To

p1t1t2 = 1;
p2t3 = 1;
p2t4 + p3t4 = 1;
p3t5 = 1;
p1t6 + p2t6 + p3t6 = 1;

p1t1t2 + p1t6 >= 1;	
p2t3 + p2t4 + p2t6 >= 1;
p3t4 + p3t5 + p3t6 >= 1;

4 p1t1t2 +  2 p1t6 > 4;
4 p2t3 + 2 p2t4 + 2 p2t6 > 4;
2 p3t4 + 4 p3t5 + 2 p3t6 > 4;

4 p1t1t2 +  2 p1t6 <= 14;
4 p2t3 + 2 p2t4 + 2 p2t6 <= 14;
2 p3t4 + 4 p3t5 + 2 p3t6 <= 14;
	

BINARY 
	p1t1t2 p2t3 p2t4 p3t4 p3t5 p1t6 p2t6 p3t6;
END


