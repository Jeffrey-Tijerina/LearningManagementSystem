package LMS_Project;

public class course {
    
    private int test1, test2, test3, credit, courseNumber;
    private double total;
    
    
    private String name;
    private char letterGrade;
    
    public course()
    {
        this.test1 = 0;
        this.test2 = 0;
        this.test3 = 0;
        this.credit = 0;
        this.total = 0;
        
        this.name = "-";
        this.letterGrade = '-';
        this.courseNumber = 0;
    }
    
    public course(String name, int courseNum, int t1, int t2, int t3, int credit)
    {
        this.name = name;
        this.test1 = t1;
        this.test2 = t2;
        this.test3 = t3;
        this.credit = credit;
        this.courseNumber = courseNum;
        this.total = total();
        this.letterGrade = letterG();
    }
    
    
    public double total()
    {
        return (test1 + test2 + test3)/3;
    }
    
    public char letterG()
    {
        if(total != 0)
        {
        if(total >= 90 && total <= 100)
        {
            return'A';
        }
        
        else if(total >= 80 && total <= 89)
        {
            return 'B';
        }
        else if(total >= 70 && total <= 79)
        {
            return 'C';
        }
        else if(total >= 60 && total <= 69)
        {
            return 'D';
        }
        else
            return 'F';
        }
        else
        {
            return '-';
        }
    }
    
    public double getTotal()
    {
        return total;
    }
    
    public int getCredit()
    {
        
        if(total >= 90 && total <= 100)
        {
            return 4;
        }
        
        else if(total >= 80 && total <= 89)
        {
            return 3;
        }
        else if(total >= 70 && total <= 79)
        {
            return 2;
        }
        else if(total >= 60 && total <= 69)
        {
            return 1;
        }
        else
            return 0;
     
    }
    
    public int getClassNumber()
    {
        return courseNumber;
    }
    
    public String getClassName()
    {
        return name;
    }
}
