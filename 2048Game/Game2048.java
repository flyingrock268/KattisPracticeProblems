import java.util.Scanner;

public class Game2048{

    public static void main(String args[]){

        int[][] matrix = new int[4][4];
        boolean [][] checks = new boolean[4][4];

        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 4; i++){

            for(int j = 0; j < 4; j++){
             
                matrix[i][j] = in.nextInt();
                checks[i][j] = false;

            }

        }

        int direction = in.nextInt();

        //0 = left
        if(direction == 0){

            for(int i = 0; i < 4; i++){

                for(int j = 1; j < 4; j++){

                    for(int k = j; k >=1; k--){
                    
                        if(matrix[i][k] == matrix[i][k-1] && !checks[i][k-1] && !checks[i][k]){

                            matrix[i][k-1] *=2;
                            checks[i][k-1] = true;
                            matrix[i][k] = 0;

                        }

                        else if(matrix[i][k-1] == 0){

                            matrix[i][k-1] = matrix[i][k];
                            checks[i][k-1] = checks[i][k];
                            matrix[i][k] = 0;

                        }

                    }
    
                }
    
            }

        }

        //up = 1
        else if(direction == 1){

            for(int i = 0; i < 4; i++){

                for(int j = 1; j < 4; j++){

                    for(int k = j; k >=1; k--){

                        if(matrix[k][i] == matrix[k-1][i] && !checks[k-1][i] && !checks[k][i]){

                            matrix[k-1][i] *=2;
                            checks[k-1][i] = true;
                            matrix[k][i] = 0;

                        }

                        else if(matrix[k-1][i] == 0){

                            matrix[k-1][i] = matrix[k][i];
                            checks[k-1][i] = checks[k][i];
                            matrix[k][i] = 0;

                        }

                    }

                }

            }

        }

        //right = 2
        else if(direction == 2){

            for(int i = 0; i < 4; i++){

                for(int j = 3; j >= 0; j--){

                    for(int k = j; k <3; k++){
                    
                        if(matrix[i][k] == matrix[i][k+1] && !checks[i][k+1] && !checks[i][k]){

                            matrix[i][k+1] *=2;
                            checks[i][k+1] = true;
                            matrix[i][k] = 0;

                        }

                        else if(matrix[i][k+1] == 0){

                            matrix[i][k+1] = matrix[i][k];
                            checks[i][k+1] = checks[i][k];
                            matrix[i][k] = 0;

                        }

                    }
    
                }
    
            }

        }

        //down = 3
        else if(direction == 3){

            for(int i = 0; i < 4; i++){

                for(int j = 3; j >= 0; j--){

                    for(int k = j; k <3; k++){

                        if(matrix[k][i] == matrix[k+1][i] && !checks[k+1][i] && !checks[k][i]){

                            matrix[k+1][i] *=2;
                            checks[k+1][i] = true;
                            matrix[k][i] = 0;

                        }

                        else if(matrix[k+1][i] == 0){

                            matrix[k+1][i] = matrix[k][i];
                            checks[k+1][i] = checks[k][i];
                            matrix[k][i] = 0;

                        }

                    }

                }

            }

        }

        for(int i = 0; i < 4; i++){

            for(int j = 0; j < 4; j++){
             
                System.out.print(matrix[i][j]);
                System.out.print(" ");

            }

            System.out.println();

        }

    }

}