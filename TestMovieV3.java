
 /**
 * This class demonstrates the selection sort algorithm.
 *
 * @author Briana Berger
 * @version 06/17/17
 */

public class TestMovieV3
{
    public static void main(String[] args)
    {
        Movie[] movies = new Movie[10];
        Movie[] sorted = new Movie[10];

        movies[0] = new Movie("La La Land", 2016, "Summit Entertainment");
        movies[1] = new Movie("The Big Sick", 2017,"Lionsgate");
        movies[2] = new Movie("Gifted", 2017, "Fox Searchlight Pictures");
        movies[3] = new Movie("Hidden Figures", 2016, "20th Century Fox");
        movies[4] = new Movie("Mulan", 1988, "Walt Disney");
        movies[5] = new Movie("One Day", 2011, "Random House Films");
        movies[6] = new Movie("Becoming Jane", 2007, "HanWay Films");
        movies[7] = new Movie("Brooklyn", 2015, "BBC Films");
        movies[8] = new Movie("Divergent", 2014, "Lionsgate");
        movies[9] = new Movie("Harry Potter", 2001, "Warner Bros");
        
        System.out.println("    <<<< Before Sorting >>>> \n");
        printArray(movies);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by title ascending - passing an array and order >>>>\n");
        sorted = selectionTitle(movies, 1);
        printArray(sorted);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by title descending - passing an array and order >>>>\n");
        sorted = selectionTitle(movies, 2);
        printArray(sorted);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by year ascending - passing an array and order >>>>\n");
        sorted = selectionYear(movies, 1);
        printArray(sorted);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by year descending - passing an array and order >>>>\n");
        sorted = selectionYear(movies, 2);
        printArray(sorted);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by studio ascending - passing an array and order >>>>\n");
        sorted = selectionStudio(movies, 1);
        printArray(sorted);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by studio descending - passing an array and order >>>>\n");
        sorted = selectionStudio(movies, 2);
        printArray(sorted);
    }
    
    public static void printArray(Movie[] source)
    {
        for(int i = 0; i < source.length; i++)
            System.out.println(source[i]);
            
        System.out.println();
    }
    
    public static Movie[] selectionTitle(Movie[] source, int order)
    { 
        for (int i = source.length - 1 ; i >= 0 ; i-- )
        {
            int posmax = 0;

            for (int k = 0 ; k <= i ; k++ )
            {
                if(order == 1)
                {
                    if (source[k].getTitle().compareTo(source[posmax].getTitle()) > 0)
                    {
                        posmax = k;
                    }
                }
                else if(order == 2)
                {
                    if (source[k].getTitle().compareTo(source[posmax].getTitle()) < 0)
                    {
                        posmax = k;
                    }
                }
            }
            String title = source[i].getTitle();
            source[i].setTitle(source[posmax].getTitle());;
            source[posmax].setTitle(title);
        }
        return source;
    }
    
    public static Movie[] selectionYear(Movie[] source, int order)
    {
        for (int i = source.length - 1 ; i >= 0 ; i-- )
        {
            int posmax = 0;

            for (int k = 0 ; k <= i ; k++ )
            {
                if(order == 1)
                {
                    if (source[k].getYear() > source[posmax].getYear())
                    {
                        posmax = k;
                    }
                }
                else if(order == 2)
                {
                    if (source[k].getYear() < source[posmax].getYear())
                    {
                        posmax = k;
                    }
                }
            }
            int year = source[i].getYear();
            source[i].setYear(source[posmax].getYear());;
            source[posmax].setYear(year);
        }
        return source;
    }
    
    public static Movie[] selectionStudio(Movie[] source, int order)
    {
        for (int i = source.length - 1 ; i >= 0 ; i-- )
        {
            int posmax = 0;

            for (int k = 0 ; k <= i ; k++ )
            {
                if(order == 1)
                {
                    if (source[k].getStudio().compareTo(source[posmax].getStudio()) > 0)
                    {
                        posmax = k;
                    }
                }
                else if(order == 2)
                {
                    if (source[k].getStudio().compareTo(source[posmax].getStudio()) < 0)
                    {
                        posmax = k;
                    }
                }
            }
            String studio = source[i].getStudio();
            source[i].setStudio(source[posmax].getStudio());;
            source[posmax].setStudio(studio);
        }
        return source;
    }
} // end of class
