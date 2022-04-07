package ObjectOrientedConcepts;

public class PrintJob {
        PrioritySettings prioritySettings;
        PullJob pullJob;

        public void pullJob() {
                prioritySettings.changePriority();
        }

        public void changePriority() {
                pullJob.pullJob();
        }
}
