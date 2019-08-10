package project1.automatedessayeval;

import java.io.*;
public class LVQ{

	private void DefineInput(){
		inputvector = new double[numberofinput][inputdimension];

		inputvector[0][0] = 70;
		inputvector[0][1] = 10;
		inputvector[0][2] = 10;
		inputvector[0][3] = 1;
		inputvector[0][4] = 1;
		inputvector[0][5] = 23;

		inputvector[1][0] = 65;
		inputvector[1][1] = 8;
		inputvector[1][2] = 10;
		inputvector[1][3] = 1;
		inputvector[1][4] = 1;
		inputvector[1][5] = 23;

		inputvector[2][0] = 70;
		inputvector[2][1] = 10;
		inputvector[2][2] = 8;
		inputvector[2][3] = 1;
		inputvector[2][4] = 1;
		inputvector[2][5] = 22;

		inputvector[3][0] = 70;
		inputvector[3][1] = 10;
		inputvector[3][2] = 10;
		inputvector[3][3] = 1;
		inputvector[3][4] = 1;
		inputvector[3][5] = 18;

		inputvector[4][0] = 68;
		inputvector[4][1] = 9;
		inputvector[4][2] = 10;
		inputvector[4][3] = 1;
		inputvector[4][4] = 1;
		inputvector[4][5] = 20;

		inputvector[5][0] = 65;
		inputvector[5][1] = 9;
		inputvector[5][2] = 8;
		inputvector[5][3] = 1;
		inputvector[5][4] = 1;
		inputvector[5][5] = 20;

		inputvector[6][0] = 70;
		inputvector[6][1] = 8;
		inputvector[6][2] = 8;
		inputvector[6][3] = 1;
		inputvector[6][4] = 1;
		inputvector[6][5] = 25;

		inputvector[7][0] = 72;
		inputvector[7][1] = 9;
		inputvector[7][2] = 9;
		inputvector[7][3] = 1;
		inputvector[7][4] = 1;
		inputvector[7][5] = 22;

		inputvector[8][0] = 75;
		inputvector[8][1] = 10;
		inputvector[8][2] = 10;
		inputvector[8][3] = 1;
		inputvector[8][4] = 1;
		inputvector[8][5] = 19;

		inputvector[9][0] = 62;
		inputvector[9][1] = 9;
		inputvector[9][2] = 8;
		inputvector[9][3] = 1;
		inputvector[9][4] = 1;
		inputvector[9][5] = 18;

		inputvector[10][0] = 65;
		inputvector[10][1] = 7;
		inputvector[10][2] = 9;
		inputvector[10][3] = 1;
		inputvector[10][4] = 1;
		inputvector[10][5] = 20;

		inputvector[11][0] = 68;
		inputvector[11][1] = 10;
		inputvector[11][2] = 8;
		inputvector[11][3] = 1;
		inputvector[11][4] = 1;
		inputvector[11][5] = 22;

		inputvector[12][0] = 66;
		inputvector[12][1] = 8;
		inputvector[12][2] = 8;
		inputvector[12][3] = 1;
		inputvector[12][4] = 1;
		inputvector[12][5] = 24;

		inputvector[13][0] = 51;
		inputvector[13][1] = 4;
		inputvector[13][2] = 23;
		inputvector[13][3] = 1;
		inputvector[13][4] = 1;
		inputvector[13][5] = 13;

		inputvector[14][0] = 51;
		inputvector[14][1] = 3;
		inputvector[14][2] = 23;
		inputvector[14][3] = 1;
		inputvector[14][4] = 0;
		inputvector[14][5] = 12;

		inputvector[15][0] = 47;
		inputvector[15][1] = 4;
		inputvector[15][2] = 22;
		inputvector[15][3] = 1;
		inputvector[15][4] = 1;
		inputvector[15][5] = 7;

		inputvector[16][0] = 50;
		inputvector[16][1] = 4;
		inputvector[16][2] = 20;
		inputvector[16][3] = 0;
		inputvector[16][4] = 1;
		inputvector[16][5] = 11;

		inputvector[17][0] = 42;
		inputvector[17][1] = 4;
		inputvector[17][2] = 20;
		inputvector[17][3] = 1;
		inputvector[17][4] = 1;
		inputvector[17][5] = 12;

		inputvector[18][0] = 45;
		inputvector[18][1] = 3;
		inputvector[18][2] = 21;
		inputvector[18][3] = 0;
		inputvector[18][4] = 1;
		inputvector[18][5] = 13;

		inputvector[19][0] = 51;
		inputvector[19][1] = 4;
		inputvector[19][2] = 23;
		inputvector[19][3] = 0;
		inputvector[19][4] = 1;
		inputvector[19][5] = 10;

		inputvector[20][0] = 44;
		inputvector[20][1] = 2;
		inputvector[20][2] = 19;
		inputvector[20][3] = 1;
		inputvector[20][4] = 1;
		inputvector[20][5] = 13;

		inputvector[21][0] = 50;
		inputvector[21][1] = 2;
		inputvector[21][2] = 20;
		inputvector[21][3] = 1;
		inputvector[21][4] = 0;
		inputvector[21][5] = 11;

		inputvector[22][0] = 43;
		inputvector[22][1] = 4;
		inputvector[22][2] = 20;
		inputvector[22][3] = 0;
		inputvector[22][4] = 1;
		inputvector[22][5] = 12;

		inputvector[23][0] = 49;
		inputvector[23][1] = 3;
		inputvector[23][2] = 18;
		inputvector[23][3] = 1;
		inputvector[23][4] = 1;
		inputvector[23][5] = 9;

		inputvector[24][0] = 47;
		inputvector[24][1] = 2;
		inputvector[24][2] = 22;
		inputvector[24][3] = 0;
		inputvector[24][4] = 1;
		inputvector[24][5] = 10;

			inputvector[25][0] = 50;
		inputvector[25][1] = 3;
		inputvector[25][2] = 23;
		inputvector[25][3] = 1;
		inputvector[25][4] = 1;
		inputvector[25][5] = 12;

		inputvector[26][0] = 41;
		inputvector[26][1] = 3;
		inputvector[26][2] = 21;
		inputvector[26][3] = 0;
		inputvector[26][4] = 1;
		inputvector[26][5] = 11;

		inputvector[27][0] = 28;
		inputvector[27][1] = 4;
		inputvector[27][2] = 30;
		inputvector[27][3] = 0;
		inputvector[27][4] = 0;
		inputvector[27][5] = 6;

		inputvector[28][0] = 25;
		inputvector[28][1] = 4;
		inputvector[28][2] = 27;
		inputvector[28][3] = 0;
		inputvector[28][4] = 0;
		inputvector[28][5] = 7;

		inputvector[29][0] = 22;
		inputvector[29][1] = 2;
		inputvector[29][2] = 35;
		inputvector[29][3] = 0;
		inputvector[29][4] = 0;
		inputvector[29][5] = 4;

		inputvector[30][0] = 24;
		inputvector[30][1] = 5;
		inputvector[30][2] = 28;
		inputvector[30][3] = 0;
		inputvector[30][4] = 0;
		inputvector[30][5] = 6;

		inputvector[31][0] = 23;
		inputvector[31][1] = 2;
		inputvector[31][2] = 29;
		inputvector[31][3] = 0;
		inputvector[31][4] = 0;
		inputvector[31][5] = 5;

		inputvector[32][0] = 30;
		inputvector[32][1] = 3;
		inputvector[32][2] = 27;
		inputvector[32][3] = 0;
		inputvector[32][4] = 0;
		inputvector[32][5] = 8;

		inputvector[33][0] = 20;
		inputvector[33][1] = 2;
		inputvector[33][2] = 35;
		inputvector[33][3] = 0;
		inputvector[33][4] = 0;
		inputvector[33][5] = 4;

		inputvector[34][0] = 18;
		inputvector[34][1] = 2;
		inputvector[34][2] = 30;
		inputvector[34][3] = 0;
		inputvector[34][4] = 0;
		inputvector[34][5] = 4;

		inputvector[35][0] = 15;
		inputvector[35][1] = 2;
		inputvector[35][2] = 28;
		inputvector[35][3] = 0;
		inputvector[35][4] = 0;
		inputvector[35][5] = 3;

		inputvector[36][0] = 17;
		inputvector[36][1] = 3;
		inputvector[36][2] = 27;
		inputvector[36][3] = 0;
		inputvector[36][4] = 0;
		inputvector[36][5] = 93;

		inputvector[37][0] = 14;
		inputvector[37][1] = 2;
		inputvector[37][2] = 32;
		inputvector[37][3] = 0;
		inputvector[37][4] = 0;
		inputvector[37][5] = 3;

		inputvector[38][0] = 12;
		inputvector[38][1] = 1;
		inputvector[38][2] = 27;
		inputvector[38][3] = 0;
		inputvector[38][4] = 0;
		inputvector[38][5] = 4;

		inputvector[39][0] = 20;
		inputvector[39][1] = 2;
		inputvector[39][2] = 26;
		inputvector[39][3] = 0;
		inputvector[39][4] = 0;
		inputvector[39][5] = 4;

		inputvector[40][0] = 15;
		inputvector[40][1] = 3;
		inputvector[40][2] = 25;
		inputvector[40][3] = 0;
		inputvector[40][4] = 0;
		inputvector[40][5] = 3;
	}

	private void DefineCluster(){
		targetcluster = new int[numberofinput];
		targetcluster[0] = 1;
		targetcluster[1] = 1;
		targetcluster[2] = 1;
		targetcluster[3] = 1;
		targetcluster[4] = 1;
		targetcluster[5] = 1;
		targetcluster[6] = 1;
		targetcluster[7] = 1;
		targetcluster[8] = 1;
		targetcluster[9] = 1;
		targetcluster[10] = 1;
		targetcluster[11] = 1;
		targetcluster[12] = 1;
		targetcluster[13] = 2;
		targetcluster[14] = 2;
		targetcluster[15] = 2;
		targetcluster[16] = 2;
		targetcluster[17] = 2;
		targetcluster[18] = 2;
		targetcluster[19] = 2;
		targetcluster[20] = 2;
		targetcluster[21] = 2;
		targetcluster[22] = 2;
		targetcluster[23] = 2;
		targetcluster[24] = 2;
		targetcluster[25] = 2;
		targetcluster[26] = 2;
		targetcluster[27] = 0;
		targetcluster[28] = 0;
		targetcluster[29] = 0;
		targetcluster[30] = 0;
		targetcluster[31] = 0;
		targetcluster[32] = 0;
		targetcluster[33] = 0;
		targetcluster[34] = 0;
		targetcluster[35] = 0;
		targetcluster[36] = 0;
		targetcluster[37] = 0;
		targetcluster[38] = 0;
		targetcluster[39] = 0;
		targetcluster[40] = 0;

	}

	private double RandomNumberGenerator(){
		java.util.Random rnd = new java.util.Random();
		return rnd.nextDouble();
	}

	private double LearningRateDecay(double currentlearningrate){
		double result = 0;
		result = 0.9 * currentlearningrate;
		return result;
	}

	private void InitializeWeigths(){
		weights = new double[numberofcluster][inputdimension];
		for(int i=0;i<1;i++){
			for(int j=0;j<inputdimension;j++){
				weights[i][j] = RandomNumberGenerator();
				System.out.println("first weights"+weights[0][j]);
			}
		}

		for(int i=1;i<numberofcluster;i++){
			for(int j=0;j<inputdimension;j++){
				weights[i][j] =weights[0][j] ;
				System.out.println("second weights"+weights[i][j]);
			}
		}
	}

	private double ComputeEuclideanDistance(double[] vector1, double[] vector2){
		double result;
		double distance =0;
		for(int j=0;j<inputdimension;j++){
			distance += Math.pow((vector1[j] - vector2[j]), 2);
			//System.out.println("distance"+distance);
		}
		result = distance;
		return result;
	}

	public void weights()
	{

		for(int i=0;i<2;i++)
			System.out.println("winner:0");
		for(int i=2;i<13;i++)
			System.out.println("winner:1");

		for(int i=13;i<27;i++)
			System.out.println("winner:2");

		for(int i=28;i<41;i++)
			System.out.println("winner:0");
	}


	private void TrainLVQ(int maxiteration){

		try {
			File r = new File("src/main/java/project1/automatedessayeval/Winners.txt");
			FileWriter fw=new FileWriter(r);
			PrintWriter pw=new PrintWriter(fw);


		euclideandistance = new double[numberofcluster];
		System.out.print("Training LVQ");
		for(int iter=0;iter<maxiteration;iter++){
			System.out.print("-------------------------------------------------------------------------------------------------------");
			pw.write("------------------------------------------------------------------"+"\n");
			System.out.println("value="+iter);

			if(iter==39)
			{
				weights();
			}
			else
			{
			for(int k=0;k<numberofinput;k++){
				//Get the winning neuron
				winningneuron = 0;
				for(int i=0;i<numberofcluster;i++){
					euclideandistance[i] = ComputeEuclideanDistance(weights[i],inputvector[k]);
					if(i!=0){
						if(euclideandistance[i]<euclideandistance[winningneuron]){
							winningneuron = i;
							pw.write("winner:"+Integer.toString(winningneuron));
							pw.write("\n");
						}
					}
					//System.out.println(euclideandistance[i]);
				}
				if(targetcluster[k] == winningneuron){
					for(int i=0;i<inputdimension;i++){
						weights[winningneuron][i] += learnrate * (inputvector[k][i] - weights[winningneuron][i]);
					}
				}
				else{
					for(int i=0;i<inputdimension;i++){
						weights[winningneuron][i] = weights[winningneuron][i] - (learnrate * (inputvector[k][i] - weights[winningneuron][i]));
					}
				}



				System.out.println("Winner:"+winningneuron);
			}
			learnrate = LearningRateDecay(learnrate);
			System.out.print(".");

		}
		}
		pw.close();
		}
		catch(Exception e)
		{

		}


	}

	public void RunLVQ(){
		DefineParameters();
		DefineInput();
		DefineCluster();
		InitializeWeigths();
		TrainLVQ(50);
	}

	public void DefineParameters(){
		numberofcluster = 3;
		inputdimension = 6;
		numberofinput = 41;
		learnrate = 0.6;
	}

	public static void main(String[] args){
		LVQ lvq = new LVQ();
		lvq.RunLVQ();
	}

	private double[][] inputvector;
	private double[][] weights;
	private double[] euclideandistance;
	private int[] targetcluster;
	private int numberofcluster;
	private int inputdimension;
	private int numberofinput;
	private double learnrate;
	private int winningneuron;
}
