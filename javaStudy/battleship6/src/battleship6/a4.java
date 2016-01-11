package battleship6;

import java.util.*;

public class a4 
{
  public static void main( String args[] ) 
  {
	Ship[] s1 = new Ship[5];
	Ship[] s2 = new Ship[5];

	Scanner in = new Scanner(System.in);
	

	s1[0] = new Ship(1,"Aircraft carrier",5,1,'a',1,'e',0);  // player, ship, size, row front, column front, row back, column back, hit
	s1[1] = new Ship(1,"Battleship",      4,2,'b',5,'b',0);
 	s1[2] = new Ship(1,"Submarine",       3,2,'c',4,'c',0);
	s1[3] = new Ship(1,"Destroyer",       3,2,'d',4,'d',0);
	s1[4] = new Ship(1,"Patrol boat",     2,2,'e',3,'e',0);

	s2[0] = new Ship(1,"Aircraft carrier",5,1,'a',1,'e',0);  // player, ship, size, row front, column front, row back, column back, hit
	s2[1] = new Ship(1,"Battleship",      4,2,'b',5,'b',0);
 	s2[2] = new Ship(1,"Submarine",       3,2,'c',4,'c',0);
	s2[3] = new Ship(1,"Destroyer",       3,2,'d',4,'d',0);
	s2[4] = new Ship(1,"Patrol boat",     2,2,'e',3,'e',0);


	int[][] b1  = new int[11][11];
	int[][] g1 = new int[11][11];
	int[][] a1 = new int[11][11];
	int[][] f1 = new int[11][11];

	int[][] b2  = new int[11][11];
	int[][] g2 = new int[11][11];
	int[][] a2 = new int[11][11];
	int[][] f2 = new int[11][11];

	int i = 0;
	int j = 0;
	int k = 0;
	int l = 0;
	int m = 0;
	//int true = 1;
	int b = 0;
	int player = 1;	
	char c;
	int inrow;
	int count1 = 0;
	int count2 = 0;



	for(Ship e: s1)	
	{

 		
		if((e.getColf() == 'a' || e.getColf() == 'A'))
		{
			if(e.getColf() == e.getColb())
				for(i = e.getRowf(); i < (e.getRowf()+e.getSize()); i++ )
					b1[i][1] = 1;
				
			if(e.getRowf() == e.getRowb())
				for(i = 1; i < (1+e.getSize()); i++ )
					b1[e.getRowf()][i] = 1;
				
		}


		
		if((e.getColf() == 'b' || e.getColf() == 'B'))
		{
			if(e.getColf() == e.getColb())
				for(i = e.getRowf(); i < (e.getRowf()+e.getSize()); i++ )
					b1[i][2] = 1;

			if(e.getRowf() == e.getRowb())
				for(i = 2; i < (2+e.getSize()); i++ )
					b1[e.getRowf()][i] = 1;
				
		}



		if((e.getColf() == 'c' || e.getColf() == 'C'))
		{
			if(e.getColf() == e.getColb())
				for(i = e.getRowf(); i < (e.getRowf()+e.getSize()); i++ )
					b1[i][3] = 1;
				
			if(e.getRowf() == e.getRowb())
				for(i = 3; i < (3+e.getSize()); i++ )
					b1[e.getRowf()][i] = 1;
				
		}

		if((e.getColf() == 'd' || e.getColf() == 'D'))
		{
			if(e.getColf() == e.getColb())
				for(i = e.getRowf(); i < (e.getRowf()+e.getSize()); i++ )
					b1[i][4] = 1;
				
			if(e.getRowf() == e.getRowb())
				for(i = 4; i < (4+e.getSize()); i++ )
					b1[e.getRowf()][i] = 1;
				
		}  

		if((e.getColf() == 'e' || e.getColf() == 'E'))
		{
			if(e.getColf() == e.getColb())
				for(i = e.getRowf(); i < (e.getRowf()+e.getSize()); i++ )
					b1[i][5] = 1;
				
			if(e.getRowf() == e.getRowb())
				for(i = 5; i < (5+e.getSize()); i++ )
					b1[e.getRowf()][i] = 1;
				
		}   

		if((e.getColf() == 'f' || e.getColf() == 'F'))
		{
			if(e.getColf() == e.getColb())
				for(i = e.getRowf(); i < (e.getRowf()+e.getSize()); i++ )
					b1[i][6] = 1;
				
			if(e.getRowf() == e.getRowb())
				for(i = 6; i < (6+e.getSize()); i++ )
					b1[e.getRowf()][i] = 1;
				
		}   

		if((e.getColf() == 'g' || e.getColf() == 'G'))
		{
			if(e.getColf() == e.getColb())
				for(i = e.getRowf(); i < (e.getRowf()+e.getSize()); i++ )
					b1[i][7] = 1;
				
			if(e.getRowf() == e.getRowb())
				for(i = 7; i < (7+e.getSize()); i++ )
					b1[e.getRowf()][i] = 1;
				
		}  

		if((e.getColf() == 'h' || e.getColf() == 'H'))
		{
			if(e.getColf() == e.getColb())
				for(i = e.getRowf(); j < (e.getRowf()+e.getSize()); i++ )
					b1[i][8] = 1;
				
			if(e.getRowf() == e.getRowb())
				for(i = 8; i < (8+e.getSize()); i++ )
					b1[e.getRowf()][i] = 1;
				
		}   

		if((e.getColf() == 'i' || e.getColf() == 'I'))
		{
			if(e.getColf() == e.getColb())
				for(i = e.getRowf(); j < (e.getRowf()+e.getSize()); i++ )
					b1[i][9] = 1;
				
			if(e.getRowf() == e.getRowb())
				for(i = 9; i < (9+e.getSize()); i++ )
					b1[e.getRowf()][i] = 1;
				
		}   

		if((e.getColf() == 'j' || e.getColf() == 'J'))
		{
			if(e.getColf() == e.getColb())
				for(i = e.getRowf(); j < (e.getRowf()+e.getSize()); i++ )
					b1[i][10] = 1;
				
			if(e.getRowf() == e.getRowb())
				for(i = 10; i < (10+e.getSize()); i++ )
					b1[e.getRowf()][i] = 1;
			
		}       

               
	}



	for(Ship e: s2)	
	{

 		
		if((e.getColf() == 'a' || e.getColf() == 'A'))
		{
			if(e.getColf() == e.getColb())
				for(i = e.getRowf(); i < (e.getRowf()+e.getSize()); i++ )
					b1[i][1] = 1;
				
			if(e.getRowf() == e.getRowb())
				for(i = 1; i < (1+e.getSize()); i++ )
					b1[e.getRowf()][i] = 1;
				
		}


		
		if((e.getColf() == 'b' || e.getColf() == 'B'))
		{
			if(e.getColf() == e.getColb())
				for(i = e.getRowf(); i < (e.getRowf()+e.getSize()); i++ )
					b1[i][2] = 1;

			if(e.getRowf() == e.getRowb())
				for(i = 2; i < (2+e.getSize()); i++ )
					b1[e.getRowf()][i] = 1;
				
		}



		if((e.getColf() == 'c' || e.getColf() == 'C'))
		{
			if(e.getColf() == e.getColb())
				for(i = e.getRowf(); i < (e.getRowf()+e.getSize()); i++ )
					b1[i][3] = 1;
				
			if(e.getRowf() == e.getRowb())
				for(i = 3; i < (3+e.getSize()); i++ )
					b1[e.getRowf()][i] = 1;
				
		}

		if((e.getColf() == 'd' || e.getColf() == 'D'))
		{
			if(e.getColf() == e.getColb())
				for(i = e.getRowf(); i < (e.getRowf()+e.getSize()); i++ )
					b1[i][4] = 1;
				
			if(e.getRowf() == e.getRowb())
				for(i = 4; i < (4+e.getSize()); i++ )
					b1[e.getRowf()][i] = 1;
				
		}  

		if((e.getColf() == 'e' || e.getColf() == 'E'))
		{
			if(e.getColf() == e.getColb())
				for(i = e.getRowf(); i < (e.getRowf()+e.getSize()); i++ )
					b1[i][5] = 1;
				
			if(e.getRowf() == e.getRowb())
				for(i = 5; i < (5+e.getSize()); i++ )
					b1[e.getRowf()][i] = 1;
				
		}   

		if((e.getColf() == 'f' || e.getColf() == 'F'))
		{
			if(e.getColf() == e.getColb())
				for(i = e.getRowf(); i < (e.getRowf()+e.getSize()); i++ )
					b1[i][6] = 1;
				
			if(e.getRowf() == e.getRowb())
				for(i = 6; i < (6+e.getSize()); i++ )
					b1[e.getRowf()][i] = 1;
				
		}   

		if((e.getColf() == 'g' || e.getColf() == 'G'))
		{
			if(e.getColf() == e.getColb())
				for(i = e.getRowf(); i < (e.getRowf()+e.getSize()); i++ )
					b1[i][7] = 1;
				
			if(e.getRowf() == e.getRowb())
				for(i = 7; i < (7+e.getSize()); i++ )
					b1[e.getRowf()][i] = 1;
				
		}  

		if((e.getColf() == 'h' || e.getColf() == 'H'))
		{
			if(e.getColf() == e.getColb())
				for(i = e.getRowf(); j < (e.getRowf()+e.getSize()); i++ )
					b1[i][8] = 1;
				
			if(e.getRowf() == e.getRowb())
				for(i = 8; i < (8+e.getSize()); i++ )
					b1[e.getRowf()][i] = 1;
				
		}   

		if((e.getColf() == 'i' || e.getColf() == 'I'))
		{
			if(e.getColf() == e.getColb())
				for(i = e.getRowf(); j < (e.getRowf()+e.getSize()); i++ )
					b1[i][9] = 1;
				
			if(e.getRowf() == e.getRowb())
				for(i = 9; i < (9+e.getSize()); i++ )
					b1[e.getRowf()][i] = 1;
				
		}   

		if((e.getColf() == 'j' || e.getColf() == 'J'))
		{
			if(e.getColf() == e.getColb())
				for(i = e.getRowf(); j < (e.getRowf()+e.getSize()); i++ )
					b1[i][10] = 1;
				
			if(e.getRowf() == e.getRowb())
				for(i = 10; i < (10+e.getSize()); i++ )
					b1[e.getRowf()][i] = 1;
			
		}       

               
	}



	while((count1 < 17) || (count2 < 17))
	{



		
		


		System.out.println("\n\n\nPlayer: " + player + "'s turn:\n"); 
		if(player == 1)
		{
			b= 0;


			for(i = 1; i <= 10; i++)
			{
				for(j = 1; j <= 10; j++)
				{
					if(g1[i][j] == 3)
						System.out.print("* ");
					if(g1[i][j] == 1)
						System.out.print("X ");
					if(g1[i][j] == 0)
						System.out.print(g1[i][j] + " "); 
				}

				System.out.print("\n");
			}

			System.out.print("\nEnter a charactor from A - k for column and and number from 1 - 10 \nrespectively for the quardents of your shot: ");

			c = in.next().charAt(0);
			inrow  = in.nextInt();
		


			for(i = 1; i <= 10; i++)
				for(j = 1; j <= 10; j++)
					f1[i][j] = 5;




			if(c == 'A' || c == 'a')
				f1[inrow][1] = 1;
			if(c == 'B' || c == 'b')
				f1[inrow][2] = 1;
			if(c == 'C' || c == 'c')
				f1[inrow][3] = 1;
			if(c == 'D' || c == 'd')
				f1[inrow][4] = 1;
			if(c == 'E' || c == 'e')
				f1[inrow][5] = 1;
			if(c == 'F' || c == 'f')
				f1[inrow][6] = 1;
			if(c == 'G' || c == 'g')
				f1[inrow][7] = 1;
			if(c == 'H' || c == 'h')
				f1[inrow][8] = 1;
			if(c == 'I' || c == 'i')
				f1[inrow][9] = 1;
			if(c == 'J' || c == 'j')
				f1[inrow][10] = 1;




		


			for(i = 1; i <= 10; i++)
				for(j = 1; j <= 10; j++)
					if(  (f1[i][j] == 1) && (g1[i][j] == 3))
						b = 1;


	





			if( b == 0)
			{

				if(c == 'A' || c == 'a')
					g1[inrow][1] = 1;
				if(c == 'B' || c == 'b')
					g1[inrow][2] = 1;
				if(c == 'C' || c == 'c')
					g1[inrow][3] = 1;
				if(c == 'D' || c == 'd')
					g1[inrow][4] = 1;
				if(c == 'E' || c == 'e')
					g1[inrow][5] = 1;
				if(c == 'F' || c == 'f')
					g1[inrow][6] = 1;
				if(c == 'G' || c == 'g')
					g1[inrow][7] = 1;
				if(c == 'H' || c == 'h')
					g1[inrow][8] = 1;
				if(c == 'I' || c == 'i')
					g1[inrow][9] = 1;
				if(c == 'J' || c == 'j')
					g1[inrow][10] = 1;




				for(i = 1; i <= 10; i++)
					for(j = 1; j <= 10; j++)
					{
						if( b1[i][j] == 1 && g1[i][j] == 1)
						{
							for(Ship e : s1)
							{			
		
								for(k = 0; k <= 10; k++) 
								{
									for(l = 0; l <= 10; l++)
									{
										a1[k][l] = 0;
									}
								}


								if((e.getColf() == 'a' || e.getColf() == 'A'))
 									for(k = 1; k <= 10; k++)
									{

										if(e.getColf() == e.getColb() && (k == e.getRowf()))
											for(l = k; l < (k+e.getSize()); l++ )
												a1[l][1] = 1;



										if(  (e.getRowf() == e.getRowb() ) && (k == e.getRowf()) )
											for(m = 1; m < 1+e.getSize(); m++)
											{
												a1[k][m] = 1;
											}

									}


		
								if((e.getColf() == 'b' || e.getColf() == 'B'))
 									for(k = 1; k <= 10; k++)
									{

										if(e.getColf() == e.getColb() && (k == e.getRowf()))
											for(l = k; l < (k+e.getSize()); l++ )
												a1[l][2] = 1;
		


										if(  (e.getRowf() == e.getRowb() ) && (k == e.getRowf()) )
											for(m = 2; m < 2+e.getSize(); m++)
											{
												a1[k][m] = 1;
											}

					
	
									}


	
								if((e.getColf() == 'c' || e.getColf() == 'C'))
 									for(k = 1; k <= 10; k++)
									{
										if(e.getColf() == e.getColb() && (k == e.getRowf()))
											for(l = k; l < (k+e.getSize()); l++ )
												a1[l][3] = 1;



										if(  (e.getRowf() == e.getRowb() ) && (k == e.getRowf()) )
											for(m = 3; m < 3+e.getSize(); m++)
											{
												a1[k][m] = 1;
											}


					
	
									}

								if((e.getColf() == 'd' || e.getColf() == 'D'))
 									for(k = 1; k <= 10; k++)
									{
										if(e.getColf() == e.getColb() && (k == e.getRowf()))
											for(l = k; l < (k+e.getSize()); l++ )
												a1[l][4] = 1;



										if(  (e.getRowf() == e.getRowb() ) && (k == e.getRowf()) )
											for(m = 4; m < 4+e.getSize(); m++)
											{
												a1[k][m] = 1;
											}


					
	
									}   

								if((e.getColf() == 'e' || e.getColf() == 'E'))
 									for(k = 1; k <= 10; k++)
									{
										if(e.getColf() == e.getColb() && (k == e.getRowf()))
											for(l = k; l < (k+e.getSize()); l++ )
												a1[l][5] = 1;



										if(  (e.getRowf() == e.getRowb() ) && (k == e.getRowf()) )
											for(m = 5; m < 5+e.getSize(); m++)
											{
												a1[k][m] = 1;
											}


					
	
									} 

								if((e.getColf() == 'f' || e.getColf() == 'F'))
 									for(k = 1; k <= 10; k++)
									{
										if(e.getColf() == e.getColb() && (k == e.getRowf()))
											for(l = k; l < (k+e.getSize()); l++ )
												a1[l][6] = 1;



										if(  (e.getRowf() == e.getRowb() ) && (k == e.getRowf()) )
											for(m = 6; m < 6+e.getSize(); m++)
											{
												a1[k][m] = 1;
											}


					
	
									}  
								if((e.getColf() == 'g' || e.getColf() == 'G'))
 									for(k = 1; k <= 10; k++)
									{
										if(e.getColf() == e.getColb() && (k == e.getRowf()))
											for(l = k; l < (k+e.getSize()); l++ )
												a1[l][7] = 1;



									if(  (e.getRowf() == e.getRowb() ) && (k == e.getRowf()) )
										for(m = 7; m < 7+e.getSize(); m++)
										{
											a1[k][m] = 1;
										}


					
		
									} 
								if((e.getColf() == 'h' || e.getColf() == 'H'))
 									for(k = 1; k <= 10; k++)
									{
										if(e.getColf() == e.getColb() && (k == e.getRowf()))
											for(l = k; l < (k+e.getSize()); l++ )
												a1[l][8] = 1;



										if(  (e.getRowf() == e.getRowb() ) && (k == e.getRowf()) )
											for(m = 8; m < 8+e.getSize(); m++)
											{
												a1[k][m] = 1;
											}


					
	
								}	   

								if((e.getColf() == 'i' || e.getColf() == 'I'))
 									for(k = 1; k <= 10; k++)
									{
										if(e.getColf() == e.getColb() && (k == e.getRowf()))
											for(l = k; l < (k+e.getSize()); l++ )
												a1[l][9] = 1;



										if(  (e.getRowf() == e.getRowb() ) && (k == e.getRowf()) )
											for(m = 9; m < 9+e.getSize(); m++)
											{
												a1[k][m] = 1;
											}


					
	
									}  

								if((e.getColf() == 'j' || e.getColf() == 'J'))
 									for(k = 1; k <= 10; k++)
									{
										if(e.getColf() == e.getColb() && (k == e.getRowf()))
											for(l = k; l < (k+e.getSize()); l++ )
												a1[l][10] = 1;
	

										if(  (e.getRowf() == e.getRowb() ) && (k == e.getRowf()) )
											for(m = 10; m < 10+e.getSize(); m++)
											{
												a1[k][m] = 1;
											}
									}


								for(k = 1; k<=10; k++)
									for(l = 1; l<=10; l++)
										if((a1[k][l] == 1) && (g1[k][l] ==1))
											g1[k][l] = 2;
									
												 
							
								for(k = 1; k<=10; k++)
									for(l = 1; l<=10; l++)
									{
										if((a1[k][l] == 1) && (g1[k][l] ==2))
										{
											e.setHit();
											count1++;	
											if(e.getHit() == e.getSize())
												System.out.print("you sunk my : " + e.getName() + "\n");
											else
												System.out.print("\n\nPlayer 1 hit a ship\n");
									
											g1[k][l] = 3;
										}		
									}	
							}	

						}
						//else
							//System.out.print("miss");
					}
	

			}
			else
				System.out.println("Guess already made");

		}
	


		if(player == 2)
		{
			b= 0;

			
			System.out.print("\n");

			for(i = 1; i <= 10; i++)
			{
				for(j = 1; j <= 10; j++)
				{
					if(g2[i][j] == 3)
						System.out.print("* ");
					if(g2[i][j] == 1)
						System.out.print("X ");
					if(g2[i][j] == 0)
						System.out.print(g2[i][j] + " "); 
				}

				System.out.print("\n");
			}

			System.out.print("\nEnter a charactor from A - k for column and and number from 1 - 10 \nrespectively for the quardents of your shot: ");
			c = in.next().charAt(0);
			inrow  = in.nextInt();



			for(i = 1; i <= 10; i++)
				for(j = 1; j <= 10; j++)
					f2[i][j] = 5;


			if(c == 'A' || c == 'a')
				f2[inrow][1] = 1;
			if(c == 'B' || c == 'b')
				f2[inrow][2] = 1;
			if(c == 'C' || c == 'c')
				f2[inrow][3] = 1;
			if(c == 'D' || c == 'd')
				f2[inrow][4] = 1;
			if(c == 'E' || c == 'e')
				f2[inrow][5] = 1;
			if(c == 'F' || c == 'f')
				f2[inrow][6] = 1;
			if(c == 'G' || c == 'g')
				f2[inrow][7] = 1;
			if(c == 'H' || c == 'h')
				f2[inrow][8] = 1;
			if(c == 'I' || c == 'i')
				f2[inrow][9] = 1;
			if(c == 'J' || c == 'j')
				f2[inrow][10] = 1;




		


			for(i = 1; i <= 10; i++)
				for(j = 1; j <= 10; j++)
					if(  (f2[i][j] == 1) && (g2[i][j] == 3))
						b = 1;


	
				

			System.out.print("\n");





			if( b == 0)
			{

				if(c == 'A' || c == 'a')
					g2[inrow][1] = 1;
				if(c == 'B' || c == 'b')
					g2[inrow][2] = 1;
				if(c == 'C' || c == 'c')
					g2[inrow][3] = 1;
				if(c == 'D' || c == 'd')
					g2[inrow][4] = 1;
				if(c == 'E' || c == 'e')
					g2[inrow][5] = 1;
				if(c == 'F' || c == 'f')
					g2[inrow][6] = 1;
				if(c == 'G' || c == 'g')
					g2[inrow][7] = 1;
				if(c == 'H' || c == 'h')
					g2[inrow][8] = 1;
				if(c == 'I' || c == 'i')
					g2[inrow][9] = 1;
				if(c == 'J' || c == 'j')
					g2[inrow][10] = 1;






				for(i = 1; i <= 10; i++)
					for(j = 1; j <= 10; j++)
					{
						if( b2[i][j] == 1 && g2[i][j] == 1)
						{
							for(Ship e : s2)
							{	


						
		
								for(k = 0; k <= 10; k++) 
								{
									for(l = 0; l <= 10; l++)
									{
										a2[k][l] = 0;
									}
								}


								if((e.getColf() == 'a' || e.getColf() == 'A'))
 									for(k = 1; k <= 10; k++)
									{

										if(e.getColf() == e.getColb() && (k == e.getRowf()))
											for(l = k; l < (k+e.getSize()); l++ )
												a2[l][1] = 1;



										if(  (e.getRowf() == e.getRowb() ) && (k == e.getRowf()) )
											for(m = 1; m < 1+e.getSize(); m++)
											{
												a2[k][m] = 1;
											}

									}


		
								if((e.getColf() == 'b' || e.getColf() == 'B'))
 									for(k = 1; k <= 10; k++)
									{

										if(e.getColf() == e.getColb() && (k == e.getRowf()))
											for(l = k; l < (k+e.getSize()); l++ )
												a2[l][2] = 1;
		


										if(  (e.getRowf() == e.getRowb() ) && (k == e.getRowf()) )
											for(m = 2; m < 2+e.getSize(); m++)
											{
												a2[k][m] = 1;
											}

					
	
									}


	
								if((e.getColf() == 'c' || e.getColf() == 'C'))
 									for(k = 1; k <= 10; k++)
									{
										if(e.getColf() == e.getColb() && (k == e.getRowf()))
											for(l = k; l < (k+e.getSize()); l++ )
												a2[l][3] = 1;



										if(  (e.getRowf() == e.getRowb() ) && (k == e.getRowf()) )
											for(m = 3; m < 3+e.getSize(); m++)
											{
												a2[k][m] = 1;
											}


					
	
									}

								if((e.getColf() == 'd' || e.getColf() == 'D'))
 									for(k = 1; k <= 10; k++)
									{
										if(e.getColf() == e.getColb() && (k == e.getRowf()))
											for(l = k; l < (k+e.getSize()); l++ )
												a2[l][4] = 1;



										if(  (e.getRowf() == e.getRowb() ) && (k == e.getRowf()) )
											for(m = 4; m < 4+e.getSize(); m++)
											{
												a2[k][m] = 1;
											}


					
	
									}   

								if((e.getColf() == 'e' || e.getColf() == 'E'))
 									for(k = 1; k <= 10; k++)
									{
										if(e.getColf() == e.getColb() && (k == e.getRowf()))
											for(l = k; l < (k+e.getSize()); l++ )
												a2[l][5] = 1;



										if(  (e.getRowf() == e.getRowb() ) && (k == e.getRowf()) )
											for(m = 5; m < 5+e.getSize(); m++)
											{
												a2[k][m] = 1;
											}


					
	
									} 

								if((e.getColf() == 'f' || e.getColf() == 'F'))
 									for(k = 1; k <= 10; k++)
									{
										if(e.getColf() == e.getColb() && (k == e.getRowf()))
											for(l = k; l < (k+e.getSize()); l++ )
												a2[l][6] = 1;



										if(  (e.getRowf() == e.getRowb() ) && (k == e.getRowf()) )
											for(m = 6; m < 6+e.getSize(); m++)
											{
												a2[k][m] = 1;
											}


					
	
									}  
								if((e.getColf() == 'g' || e.getColf() == 'G'))
 									for(k = 1; k <= 10; k++)
									{
										if(e.getColf() == e.getColb() && (k == e.getRowf()))
											for(l = k; l < (k+e.getSize()); l++ )
												a2[l][7] = 1;



									if(  (e.getRowf() == e.getRowb() ) && (k == e.getRowf()) )
										for(m = 7; m < 7+e.getSize(); m++)
										{
											a2[k][m] = 1;
										}


					
		
									} 
								if((e.getColf() == 'h' || e.getColf() == 'H'))
 									for(k = 1; k <= 10; k++)
									{
										if(e.getColf() == e.getColb() && (k == e.getRowf()))
											for(l = k; l < (k+e.getSize()); l++ )
												a2[l][8] = 1;



										if(  (e.getRowf() == e.getRowb() ) && (k == e.getRowf()) )
											for(m = 8; m < 8+e.getSize(); m++)
											{
												a2[k][m] = 1;
											}


					
	
								}	   

								if((e.getColf() == 'i' || e.getColf() == 'I'))
 									for(k = 1; k <= 10; k++)
									{
										if(e.getColf() == e.getColb() && (k == e.getRowf()))
											for(l = k; l < (k+e.getSize()); l++ )
												a2[l][9] = 1;



										if(  (e.getRowf() == e.getRowb() ) && (k == e.getRowf()) )
											for(m = 9; m < 9+e.getSize(); m++)
											{
												a2[k][m] = 1;
											}


					
	
									}  

								if((e.getColf() == 'j' || e.getColf() == 'J'))
 									for(k = 1; k <= 10; k++)
									{
										if(e.getColf() == e.getColb() && (k == e.getRowf()))
											for(l = k; l < (k+e.getSize()); l++ )
												a2[l][10] = 1;
	


										if(  (e.getRowf() == e.getRowb() ) && (k == e.getRowf()) )
											for(m = 10; m < 10+e.getSize(); m++)
											{
												a2[k][m] = 1;
											}


					
	
									}

	


								for(k = 1; k<=10; k++)
									for(l = 1; l<=10; l++)
										if((a2[k][l] == 1) && (g2[k][l] ==1))
											g2[k][l] = 2;
									
								

							
								for(k = 1; k<=10; k++)
									for(l = 1; l<=10; l++)
									{
										if((a2[k][l] == 1) && (g2[k][l] ==2))
										{
											e.setHit();
											count2++;	
											if(e.getHit() == e.getSize())
												System.out.print("you sunk my : " + e.getName() + "\n");
											else
												System.out.print("\n\nPlayer 2 hit a ship\n");
									

											
											g2[k][l] = 3;
										}		
									}

							}	
	
					



						}
						//else
							//System.out.print("miss");
					}







			}
			else
				System.out.println("Guess already made");

		}

		if(player == 1)
			player = 2;
		else if(player == 2)
			player = 1;

	}

	
  }
}

class Ship
{
	public Ship(int p, String s, int z, int rf, char cf, int rb, char cb, int h)
 	{
		player = p;
		name   = s;		
 		size   = z; 		
		rowf   = rf; 
 		colf   = cf;
 		rowb   = rb; 
 		colb   = cb;
 		hit    = h;
 	}

	public String getName()
	{
		return name;
	}

	public int getSize()
	{
		return size;
	}

	public int getRowf()
	{
		return rowf;
	}

	public int getRowb()
	{
		return rowb;
	}


	public char getColf()
	{
		return colf;
	}


	public char getColb()
	{
		return colb;
	}


	public int getPlayer()
	{
		return player;
	}
	public int getHit()
	{
		return hit;
	}
	
	public void setHit()
	{
		hit = hit +1;
	}




			
	
	private String name;		
 	private int size; 		    //size of ship
	private int rowf; 
 	private char colf;		    //column front char
 	private int rowb; 
 	private char colb;		    //column back char
 	private int player;
	private int hit;
} 


