package timeclass;

public class Time4 {
    private int hour;
    private int minute;
    private int second;
    
    public Time4(){
        this(0,0,0);
    }
    
    public Time4(int h){
        this(h,0,0);
    }
    
    public Time4(int h, int m){
        this(h,m,0);
    }
    
    public Time4(int h, int m, int s){
        setTime(h,m,s);
    }
    
    public void setTime( int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    
    public void setHour(int h){
        hour = ((h>=0 && h<24)? h: 0);
    }
    
    public void setMinute(int m){
        minute = ((m>=0 && m<24)? m: 0);
    }
    
    public void setSecond(int s){
        second = ((s>=0 && s<24)? s: 0);
    }
}
