
package reviewer_requiem_v2;


class History extends Utilities{
    private int historyId;
    private String challengeName;
    private String dateCompleted;
    private int score;
    private int maxItems;
    private double percentage;
    private String rating;
    
    public History(int id, String name ,String dateCompleted, int score,int maxItems, double percentage, String rating){
        this.historyId = id;
        this.dateCompleted = dateCompleted;
        this.challengeName = name;
        this.score = score;
        this.maxItems = maxItems;
        this.percentage = percentage;
        this.rating = rating;

    }


    public int getID(){
        return historyId;
    }
    public String getName(){
        return challengeName;
    }
    public String getDate(){
        return dateCompleted;
    }
    public int getScore(){
        return score;

    }
    public double getPercentage(){
        return percentage;
    }
    public String getRating(){
        return rating;
    }
    public int getMaxItems(){
        return maxItems;
    }
    

}