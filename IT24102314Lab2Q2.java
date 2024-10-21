public class IT24102314Lab2Q2{ 
        public static void  main(string[] args) {
             
             // Given side length of the square fence 
             double sideLength =10.0;

             // calculate the perimeter of the square fence 
             double perimeterSquare 4 * sideLength;//4 * length 

             // calculate the radius of the circulate fence using the same using perimeter 
             // 4 * length = 2 * PI * radius
             // radius =(4 * length / 2 *PI)
             double radius = perimeterSquare / (2 * 3.14);

             // output the calculated radius
             System.out.println("Radius of the circular fence: " + radius);
}
}
              