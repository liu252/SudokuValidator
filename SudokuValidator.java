import java.io.PrintStream;

class SudokuValidator extends Thread { SudokuValidator() {}

  public static int[][] array = new char[9][9];
  public static int count = 0;
  public static char[][] rowRepeat = new char[9][9];
  public static char[][] colRepeat = new char[9][9];
  public static char[][] boxRepeat = new char[9][9];
  public static boolean[] rowResults = new boolean[9];
  public static int[][] rowMissing = new int[9][9];
  public static boolean[] columnResults = new boolean[9];
  public static int[][] columnMissing = new int[9][9];
  public static boolean[] boxResults = new boolean[9];
  public static int[][] boxMissing = new int[9][9];

  public void run() { int i;
    int[] arrayOfInt1; int k; int m; int n; int i1; if (count == 0)
    {
      count += 1;
      for (i = 0; i < 9; i++)
      {
        arrayOfInt1 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        for (k = 0; k < 9; k++)
        {
          if (array[i][k] == 1)
          {
            arrayOfInt1[0] += 1;
          }
          else if (array[i][k] == 2)
          {
            arrayOfInt1[1] += 1;
          }
          else if (array[i][k] == '3')
          {
            arrayOfInt1[2] += 1;
          }
          else if (array[i][k] == '4')
          {
            arrayOfInt1[3] += 1;
          }
          else if (array[i][k] == '5')
          {
            arrayOfInt1[4] += 1;
          }
          else if (array[i][k] == '6')
          {
            arrayOfInt1[5] += 1;
          }
          else if (array[i][k] == '7')
          {
            arrayOfInt1[6] += 1;
          }
          else if (array[i][k] == '8')
          {
            arrayOfInt1[7] += 1;
          }
          else if (array[i][k] == '9')
          {
            arrayOfInt1[8] += 1;
          }
        }
        k = 0;
        for (m = 0; m < 9; m++)
        {
          if (arrayOfInt1[m] == 1)
          {
            k++;
          }
          else if (arrayOfInt1[m] == 0)
          {
            n = m + 1;
            rowMissing[i][m] = n;
          }
          else
          {
            n = (char)(m + 49);
            for (i1 = 0; i1 < 9; i1++)
            {
              if (array[i][i1] == n)
              {
                rowRepeat[i][i1] = n;
              }
            }
          }
        }
        if (k == 9)
        {
          rowResults[i] = true;
        }
      }
      System.out.println("Rows Done");
    }
    else if (count == 1)
    {
      count += 1;
      for (i = 0; i < 9; i++)
      {
        arrayOfInt1 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        for (k = 0; k < 9; k++)
        {
          if (array[k][i] == '1')
          {
            arrayOfInt1[0] += 1;
          }
          else if (array[k][i] == '2')
          {
            arrayOfInt1[1] += 1;
          }
          else if (array[k][i] == '3')
          {
            arrayOfInt1[2] += 1;
          }
          else if (array[k][i] == '4')
          {
            arrayOfInt1[3] += 1;
          }
          else if (array[k][i] == '5')
          {
            arrayOfInt1[4] += 1;
          }
          else if (array[k][i] == '6')
          {
            arrayOfInt1[5] += 1;
          }
          else if (array[k][i] == '7')
          {
            arrayOfInt1[6] += 1;
          }
          else if (array[k][i] == '8')
          {
            arrayOfInt1[7] += 1;
          }
          else if (array[k][i] == '9')
          {
            arrayOfInt1[8] += 1;
          }
        }
        k = 0;
        for (m = 0; m < 9; m++)
        {
          if (arrayOfInt1[m] == 1)
          {
            k++;
          }
          else if (arrayOfInt1[m] == 0)
          {
            n = m + 1;
            columnMissing[i][m] = n;
          }
          else
          {
            n = (char)(m + 49);
            for (i1 = 0; i1 < 9; i1++)
            {
              if (array[i1][i] == n)
              {
                colRepeat[i1][i] = n;
              }
            }
          }
        }
        if (k == 9)
        {
          columnResults[i] = true;
        }
      }
      System.out.println("Columns Done");
    }
    else if (count == 2)
    {
      i = 0;
      int j = 0;
      k = 0;
      m = 0;
      for (n = 0; n < 9; n++)
      {
        int[] arrayOfInt2 = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        for (int i2 = 0; i2 < 9; i2++)
        {
          if (array[i][j] == '1')
          {
            arrayOfInt2[0] += 1;
          }
          else if (array[i][j] == '2')
          {
            arrayOfInt2[1] += 1;
          }
          else if (array[i][j] == '3')
          {
            arrayOfInt2[2] += 1;
          }
          else if (array[i][j] == '4')
          {
            arrayOfInt2[3] += 1;
          }
          else if (array[i][j] == '5')
          {
            arrayOfInt2[4] += 1;
          }
          else if (array[i][j] == '6')
          {
            arrayOfInt2[5] += 1;
          }
          else if (array[i][j] == '7')
          {
            arrayOfInt2[6] += 1;
          }
          else if (array[i][j] == '8')
          {
            arrayOfInt2[7] += 1;
          }
          else if (array[i][j] == '9')
          {
            arrayOfInt2[8] += 1;
          }
          if ((i2 == 2) || (i2 == 5))
          {
            i++;
            j -= 2;
          }
          else
          {
            j++;
          }
        }
        if ((n == 0) || (n == 1) || (n == 3) || (n == 4) || (n == 6) || (n == 7))
        {
          i -= 2;
        }
        else if ((n == 2) || (n == 5))
        {
          j = 0;
          i++;
        }
        i2 = 0;
        for (int i3 = 0; i3 < 9; i3++)
        {
          if (arrayOfInt2[i3] == 1)
          {
            i2++;
          } else { int i4;
            if (arrayOfInt2[i3] == 0)
            {
              i4 = i3 + 1;
              boxMissing[n][i3] = i4;
            }
            else
            {
              i4 = (char)(i3 + 49);
              for (int i5 = 0; i5 < 9; i5++)
              {
                if (array[k][m] == i4)
                {

                  boxRepeat[k][m] = i4;
                }
                if ((i5 == 2) || (i5 == 5))
                {
                  k++;
                  m -= 2;
                }
                else
                {
                  m++;
                }
              }
            }
          } }
        if (n == 0)
        {
          k = 0;
          m = 3;
        }
        else if (n == 1)
        {
          k = 0;
          m = 6;
        }
        else if (n == 2)
        {
          k = 3;
          m = 0;
        }
        else if (n == 3)
        {
          k = 3;
          m = 3;
        }
        else if (n == 4)
        {
          k = 3;
          m = 6;
        }
        else if (n == 5)
        {
          k = 6;
          m = 0;
        }
        else if (n == 6)
        {
          k = 6;
          m = 3;
        }
        else if (n == 7)
        {
          k = 6;
          m = 6;
        }


        if (i2 == 9)
        {
          boxResults[n] = true;
        }
      }
      System.out.println("Box Done");
    }
    try
    {
      Thread.sleep(100L);
    }
    catch (InterruptedException localInterruptedException)
    {
      localInterruptedException.printStackTrace();
    }
  }

  public static void main(String[] paramArrayOfString)
    throws Exception
  {
    java.io.BufferedReader localBufferedReader1 = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

    System.out.print("File Name: ");
    String str1 = localBufferedReader1.readLine();
    java.io.FileReader localFileReader = new java.io.FileReader(str1);
    java.io.BufferedReader localBufferedReader2 = new java.io.BufferedReader(localFileReader);

    int i = 0;
    String str2; int k; while ((str2 = localBufferedReader2.readLine()) != null)
    {
      char[] arrayOfChar = str2.toCharArray();
      k = 0;
      for (int m = 0; m < str2.length(); m++)
      {
        if (arrayOfChar[m] != ',')
        {
          array[i][k] = arrayOfChar[m];
          k++;
        }
      }
      i++;
    }

    for (int j = 0; j < 9; j++)
    {
      for (k = 0; k < 9; k++)
      {
        rowRepeat[j][k] = 48;
        colRepeat[j][k] = 48;
        boxRepeat[j][k] = 48;
        rowMissing[j][k] = 0;
        columnMissing[j][k] = 0;
        boxMissing[j][k] = 0;
      }
    }
    SudokuValidator localSudokuValidator1 = new SudokuValidator();
    SudokuValidator localSudokuValidator2 = new SudokuValidator();
    SudokuValidator localSudokuValidator3 = new SudokuValidator();

    localSudokuValidator1.start();
    localSudokuValidator2.start();
    localSudokuValidator3.start();

    localSudokuValidator1.join();
    localSudokuValidator2.join();
    localSudokuValidator3.join();

    int[] arrayOfInt1 = new int[2];
    int[] arrayOfInt2 = new int[2];
    int n = 0;
    int[] arrayOfInt3 = new int[2];
    int[] arrayOfInt4 = new int[2];
    int i1 = 0;
    int[] arrayOfInt5 = new int[2];
    int[] arrayOfInt6 = new int[2];
    int i2 = 0;
    int i3 = 0;

    for (int i4 = 0; i4 < 2; i4++)
    {
      arrayOfInt1[i4] = 0;
      arrayOfInt2[i4] = 0;
      arrayOfInt3[i4] = 0;
      arrayOfInt4[i4] = 0;
      arrayOfInt5[i4] = 0;
      arrayOfInt6[i4] = 0;
    }

    System.out.println("-----Rows-----");

    i4 = 1;
    for (int i5 = 0; i5 < 9; i5++)
    {
      System.out.println("Row " + i4 + ": " + rowResults[i5]);
      i4++;
    }
    for (i5 = 0; i5 < 9; i5++)
    {
      for (i6 = 0; i6 < 9; i6++)
      {
        if (rowRepeat[i5][i6] != '0')
        {
          System.out.println("Repeated Number, " + rowRepeat[i5][i6] + ", on row " + (i5 + 1) + " and column " + (i6 + 1));
          if (n == 0)
          {
            arrayOfInt1[n] = (i5 + 1);
            arrayOfInt2[n] = (i6 + 1);
            n++;
          }
          else if (n == 1)
          {
            arrayOfInt1[n] = (i5 + 1);
            arrayOfInt2[n] = (i6 + 1);
          }
        }
      }
    }
    for (i5 = 0; i5 < 9; i5++)
    {
      for (i6 = 0; i6 < 9; i6++)
      {
        if (rowMissing[i5][i6] != 0)
        {
          i7 = i5 + 1;
          System.out.println("There is a missing number, " + rowMissing[i5][i6] + " on row " + i7);
          i3 = rowMissing[i5][i6];
        }
      }
    }


    System.out.println("----Columns---");

    i5 = 1;
    for (int i6 = 0; i6 < 9; i6++)
    {
      System.out.println("Column " + i5 + ": " + columnResults[i6]);
      i5++;
    }
    for (i6 = 0; i6 < 9; i6++)
    {
      for (i7 = 0; i7 < 9; i7++)
      {
        if (colRepeat[i6][i7] != '0')
        {
          System.out.println("Repeated Number, " + colRepeat[i6][i7] + ", on row " + (i6 + 1) + " and column " + (i7 + 1));
          if (i1 == 0)
          {
            arrayOfInt3[i1] = (i6 + 1);
            arrayOfInt4[i1] = (i7 + 1);
            i1++;
          }
          else if (i1 == 1)
          {
            arrayOfInt3[i1] = (i6 + 1);
            arrayOfInt4[i1] = (i7 + 1);
          }
        } }
    }
    int i8;
    for (i6 = 0; i6 < 9; i6++)
    {
      for (i7 = 0; i7 < 9; i7++)
      {
        if (columnMissing[i6][i7] != 0)
        {
          i8 = i6 + 1;
          System.out.println("There is a missing number, " + columnMissing[i6][i7] + " on column " + i8);
        }
      }
    }


    System.out.println("-----Boxes-----");

    i6 = 1;
    for (int i7 = 0; i7 < 9; i7++)
    {
      System.out.println("Box " + i6 + ": " + boxResults[i7]);
      i6++;
    }
    for (i7 = 0; i7 < 9; i7++)
    {
      for (i8 = 0; i8 < 9; i8++)
      {
        if (boxRepeat[i7][i8] != '0')
        {
          System.out.println("Repeated Number, " + boxRepeat[i7][i8] + ", on row " + (i7 + 1) + " and column " + (i8 + 1));
          if (i2 == 0)
          {
            arrayOfInt5[i2] = (i7 + 1);
            arrayOfInt6[i2] = (i8 + 1);
            i2++;
          }
          else if (i2 == 1)
          {
            arrayOfInt5[i2] = (i7 + 1);
            arrayOfInt6[i2] = (i8 + 1);
          }
        }
      }
    }
    for (i7 = 0; i7 < 9; i7++)
    {
      for (i8 = 0; i8 < 9; i8++)
      {
        if (boxMissing[i7][i8] != 0)
        {
          int i9 = i7 + 1;
          System.out.println("There is a missing number, " + boxMissing[i7][i8] + " on box " + i9);
        }
      }
    }
    if (arrayOfInt1[0] != 0)
    {
      System.out.println("-----Fix-----");
      if ((arrayOfInt1[0] == arrayOfInt3[0]) && (arrayOfInt2[0] == arrayOfInt4[0]))
      {
        if ((arrayOfInt1[0] == arrayOfInt5[0]) && (arrayOfInt2[0] == arrayOfInt6[0]))
        {
          System.out.println("Replace missing number " + i3 + " with number at row " + arrayOfInt1[0] + " column " + arrayOfInt2[0]);
        }
        else if ((arrayOfInt1[0] == arrayOfInt5[1]) && (arrayOfInt2[0] == arrayOfInt6[1]))
        {
          System.out.println("Replace missing number " + i3 + " with number at row " + arrayOfInt1[0] + " column " + arrayOfInt2[0]);
        }
      }
      if ((arrayOfInt1[0] == arrayOfInt3[1]) && (arrayOfInt2[0] == arrayOfInt4[1]))
      {
        if ((arrayOfInt1[0] == arrayOfInt5[0]) && (arrayOfInt2[0] == arrayOfInt6[0]))
        {
          System.out.println("Replace missing number " + i3 + " with number at row " + arrayOfInt1[0] + " column " + arrayOfInt2[0]);
        }
        else if ((arrayOfInt1[0] == arrayOfInt5[1]) && (arrayOfInt2[0] == arrayOfInt6[1]))
        {
          System.out.println("Replace missing number " + i3 + " with number at row " + arrayOfInt1[0] + " column " + arrayOfInt2[0]);
        }
      }
      if ((arrayOfInt1[1] == arrayOfInt3[0]) && (arrayOfInt2[1] == arrayOfInt4[0]))
      {
        if ((arrayOfInt1[1] == arrayOfInt5[0]) && (arrayOfInt2[1] == arrayOfInt6[0]))
        {
          System.out.println("Replace missing number " + i3 + " with number at row " + arrayOfInt1[1] + " column " + arrayOfInt2[1]);
        }
        else if ((arrayOfInt1[0] == arrayOfInt5[1]) && (arrayOfInt2[0] == arrayOfInt6[1]))
        {
          System.out.println("Replace missing number " + i3 + " with number at row " + arrayOfInt1[1] + " column " + arrayOfInt2[1]);
        }
      }
      if ((arrayOfInt1[1] == arrayOfInt3[1]) && (arrayOfInt2[1] == arrayOfInt4[1]))
      {
        if ((arrayOfInt1[1] == arrayOfInt5[0]) && (arrayOfInt2[1] == arrayOfInt6[0]))
        {
          System.out.println("Replace missing number " + i3 + " with number at row " + arrayOfInt1[1] + " column " + arrayOfInt2[1]);
        }

        if ((arrayOfInt1[1] == arrayOfInt5[1]) && (arrayOfInt2[1] == arrayOfInt6[1]))
        {
          System.out.println("Replace missing number " + i3 + " with number at row " + arrayOfInt1[1] + " column " + arrayOfInt2[1]);
        }
      }
    }
  }
}
