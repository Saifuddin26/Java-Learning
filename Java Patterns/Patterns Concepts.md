... pattern 1 solid rectangle
for (int i = 1; i<=n; i++)
        {
            for(int j = 1; j <= m; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
see the first loop is actually not printing any asteriks 
its a counter working for second loop, and first loop is taking 
it everytime to new line when the inner for loop is finished.

if in nested loop j was to be decremented
it will cause infinite loop 
because the loop will become 
for( int j = 0; j < = m; j--);
so the condtion will remain always true.



...pattern 2 hollow rectangle 
rows - outer loop 
columns - inner loop
.. apply conditional statemetns 
.. check for mathematical connections
.. test for small cases 
.. first make it then optimize it 
.. identify common elements 









