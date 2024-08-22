class Task 
{
    int taskId;
    String taskName;
    boolean status;

    public Task(int taskId, String taskName) 
    {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = false; 
    }
}

class TaskNode 
{
    Task task;
    TaskNode next;
    public TaskNode(Task task) 
    {
        this.task = task;
        this.next = null;
    }
}

class TaskLinkedList 
{
    private TaskNode head;
    public TaskLinkedList() 
    {
        this.head = null;
    }

    // Add a task to the end of the list
    public void addTask(Task task) 
    {
        TaskNode newNode = new TaskNode(task);
        if (head == null) 
        {
            head = newNode;
        } 
        else 
        {
            TaskNode current = head;
            while (current.next != null) 
            {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search for a task by taskId
    public Task findTask(int taskId) 
    {
        TaskNode current = head;
        while (current != null) {
            if (current.task.taskId == taskId) 
            {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Traverse and print all tasks
    public void printTasks() 
    {
        TaskNode current = head;
        while (current != null) 
        {
            System.out.println("Task ID: " + current.task.taskId + ", Name: " + current.task.taskName);
            current = current.next;
        }
    }

    // Delete a task by taskId
    public void deleteTask(int taskId) 
    {
        if (head == null) 
        {
            return; // Empty list
        }
        if (head.task.taskId == taskId) 
        {
            head = head.next;
            return;
        }
        TaskNode prev = head;
        TaskNode current = head.next;
        while (current != null) 
        {
            if (current.task.taskId == taskId) 
            {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }
}
