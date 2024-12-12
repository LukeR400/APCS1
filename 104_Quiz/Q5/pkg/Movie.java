package pkg;

public class Movie{
    String UserMovie;
    double Rating;
    int RateNum;
    int Revenue;
    double NewRate;
    public Movie(){
        UserMovie = "Avengers";
        Rating = 8.0;
        RateNum = 33;
        Revenue = 623357910;
    }
    public Movie(String movie2, double rate2, int ratenum2, int revenue2){
        UserMovie = movie2;
        Rating = rate2;
        RateNum=ratenum2;
        Revenue=revenue2;

    }
    public void movieToString(){
        System.out.println("Movie: "+UserMovie);
        System.out.println("Rating: "+Rating);
        System.out.println("Number of Ratings: "+RateNum);
        System.out.println("Revenue: "+Revenue);
        System.out.println(" ");
    }
    public String getMovieName(){
        return UserMovie;
    }
    public int getRevenue(){
        return Revenue;
    }
    public double addRating(double addRate){
        NewRate=addRate;
        Rating = (NewRate+(Rating*RateNum))/(RateNum+1);
        RateNum=RateNum+1;
        return Rating;
    }
}
