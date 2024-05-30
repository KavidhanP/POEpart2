/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe;

import javax.swing.JOptionPane;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author kanda
 */
public class TaskTest {
          
   @Test   
       public void Testingdescriptiontrue(){
   Task task = new Task();
   assertEquals(true, task.CheckDescription("Create Login to authentcate user"));
     JOptionPane.showMessageDialog(null, "Task Description captured");
   
   
   
   }
       
       
    @Test   
       public void Testingdescriptionfalse(){
   Task task = new Task();
   assertEquals(false, task.CheckDescription("Create Login to authentcate user and to enchance security of the program by not allowing users without a password to login"));
    JOptionPane.showMessageDialog(null, "Please enter a Description less than 50 chracters");
   
   
   
   }   
       
       
       
       
       

      
       @Test
    public void testReturnTotalHours() {
     
        // Initialize Task object
        Task task = new Task();
        
        // Set duration values
        int[] durations = {10, 12, 55, 11, 1};
        
        // Call the method for each duration value
       for (int duration : durations) {
            task.TaskDuration = duration; // Set TaskDuration to the current duration
            task.returnTotalHours(duration); // Call the method without passing any arguments
        }
        
        // Expected total duration
        int expectedTotalHours = 89;
        
        // Assert the result
        assertEquals(expectedTotalHours, task.sum);
    }
    
    
      
       @Test
    public void testReturnTotalHours2() {
     
        // Initialize Task object
        Task task = new Task();
        
        // Set duration values
        int[] durations = {8, 10};
        
        // Call the method for each duration value
       for (int duration : durations) {
            task.TaskDuration = duration; // Set TaskDuration to the current duration
            task.returnTotalHours(duration); // Call the method without passing any arguments
        }
        
        // Expected total duration
        int expectedTotalHours = 18;
        
        // Assert the result
        assertEquals(expectedTotalHours, task.sum);
    }
    
   @Test
  public void testCreateTaskID1() {
    // Initialize Task object
    Task task = new Task();
    
    // Set task name
    task.TaskName = "add task";
    
    // Set developer details
    task.DeveloperDetails = "Robyn Harrison";
    
    // Set task number
    task.TaskNumber = 1;
    
    // Initialize TaskID
    task.TaskID = ""; // Initialize TaskID before passing it to CreateTaskID
    
    // Call the method to be tested
    String taskId = task.CreateTaskID(task.TaskID);
    
    // Expected task ID
    String expectedTaskId = "AD:1:BYN";
    
    // Assert the result
    assertEquals(expectedTaskId, taskId);
}
  
  
  
  
     @Test
  public void testCreateTaskID2() {
    // Initialize Task object
    Task task = new Task();
    
    // Set task name
    task.TaskName = "Create add task feature to add task users";
    
    // Set developer details
    task.DeveloperDetails = "Mike Smith";
    
    // Set task number
    task.TaskNumber = 2;
    
    // Initialize TaskID
    task.TaskID = ""; // Initialize TaskID before passing it to CreateTaskID
    
    // Call the method to be tested
    String taskId = task.CreateTaskID(task.TaskID);
    
    // Expected task ID
    String expectedTaskId = "CR:2:IKE";
    
    // Assert the result
    assertEquals(expectedTaskId, taskId);
}
}
    