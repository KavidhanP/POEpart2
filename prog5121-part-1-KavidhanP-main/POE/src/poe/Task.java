
package poe;

import javax.swing.JOptionPane;

/**
 *
 * @author kanda
 */
public class Task {
    private String TaskUserName;
    public int sum = 0;
    public String TaskName;
    public int TaskDuration = 0;
     public int TaskNumber = 0;
    private String TaskDescription;
    public String DeveloperDetails;
    public String TaskID;
    private String TaskStatus;
    public int con; // short for confirm
    public int statuscon;
    public int NumberTask; // counting how many tasks have been added
    
    public boolean CheckDescription(String Descrip){
    if(Descrip.length()<50){
        TaskDescription = Descrip;
    return true;
    }
    else{
    return false;
    }

    }
    
    
    public void AddTask(){
        
    //when not equal to quit
    while(!( con == 3))
    {
    con = Integer.parseInt(JOptionPane.showInputDialog(null, "Please choose between the 3 options\n 1. Add Tasks\n 2.Show Report(coming soon)\n 3. Quit"));
     
    
    //Giving Task Number a value
    if(con == 1){
     NumberTask = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of Tasks"));
     
     
     //when the Task Number value given is valid
     while(NumberTask > 0){ 
         TaskName = JOptionPane.showInputDialog(null, "Enter the name of task");
         
      //Setting a condition for task description 
      //Making the loop for as many times as the user enters for number of tasks
     for(; TaskNumber < NumberTask; ) {
         
     TaskDescription = JOptionPane.showInputDialog(null, "Please Give the task a description");
        if(CheckDescription(TaskDescription)){
            JOptionPane.showMessageDialog(null, "Task Description captured");
         
           }
        
        else if(!(CheckDescription(TaskDescription))){
            JOptionPane.showMessageDialog(null, "Please enter a Description less than 50 chracters");
           continue;
           }
        
        
     //Inputting values for Developer Details & Task Duration
     
     TaskDuration = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the duration of the task(Hours)"));
     
     
     DeveloperDetails = JOptionPane.showInputDialog(null, "Enter the name and surname of the developer");
     break;
        
     }
     
     
     //Calling Task ID method
     CreateTaskID(TaskID);
     
     
     
     JOptionPane.showMessageDialog(null, "Task sucessfully captured");
     
     
     
     //Calling Task Status method
     Status(TaskStatus);
     
     
     
     DisplayTask();
    
     //Calculating Total hours after task has been displayed
     returnTotalHours(sum);
     
     TaskNumber++;// Incrementing TaskNumber
     
     // The loop has repeated for all tasks
     if(TaskNumber == NumberTask){
     NumberTask = 0;
     break;
     }
     
     
     }
     JOptionPane.showMessageDialog(null, "Total Hours of All Tasks: " + sum);
     
    }
    
     
   
     
     
     if(con == 2){
      JOptionPane.showMessageDialog(null, "Coming soon");
      continue;
     }
     
    }
    if(con == 3){
    System.exit(0);
    }
    }
    
    
    
    
    
    public void Status(String TaskStat){
        
        
        statuscon = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the status of the task: \n1. To Do\n2. Done\n3. Doing"));
       
    while(true){
        switch (statuscon) {
            case 1:
                TaskStatus = "To Do";
                break;
            case 2:
                TaskStatus = "Done";
                break;
            case 3:
                TaskStatus = "Doing";
                break;
            default:
                JOptionPane.showMessageDialog(null,"Value is not correct please enter another value");
                statuscon = Integer.parseInt(JOptionPane.showInputDialog(null,  "Please enter the status of the task: \n1. To Do\n2. Done\n3. Doing"));
                continue;
        }
        break;
        
       }
    }
    
    public String CreateTaskID(String TaskID){
    while(true){
    String out;
    if(DeveloperDetails.contains(" ")&& DeveloperDetails.length()>3){
    int space = DeveloperDetails.indexOf(" ");
    String devID = DeveloperDetails.substring(space-3,space);
    out = TaskName.substring(0, 2).toUpperCase() + ":" + TaskNumber + ":" + devID.toUpperCase();
    this.TaskID = out;
    return out;
    
   
    }
    else
    {
     JOptionPane.showMessageDialog(null, "Developer name does not include a space and is less than 3 characters");
     DeveloperDetails = JOptionPane.showInputDialog("Please enter developer's name and surname");
     continue;
    }
    
    }
   
    }
    
    public int returnTotalHours(int duration){
        duration = TaskDuration;
        sum = sum + TaskDuration;
     return sum;
     
    }
    
    public void DisplayTask()
    {
      JOptionPane.showMessageDialog(null, "Status : " + TaskStatus + "\nTask Name : " + TaskName + "\nTask Description: " + TaskDescription + "\nTask Duration: " + TaskDuration + "\nDeveloper Name: " + DeveloperDetails + "\n TaskID: " + TaskID );
     
    }

    
    
    
   
    
}


